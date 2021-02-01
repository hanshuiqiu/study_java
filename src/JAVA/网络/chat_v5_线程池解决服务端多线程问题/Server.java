package JAVA.网络.chat_v5_线程池解决服务端多线程问题;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 服务器端：线程池解决服务端多线程问题
 * 
 * 问题：现有的聊天室功能虽然已经完成，但是由于客户端的频繁连接与断开，会使得服
 * 务端频繁的创建及销毁线程。随着客户端的增加，服务端的线程也在增加，这无疑会对
 * 服务端的资源造成浪费，并且由于过多的线程导致的过度切换也会为服务端带来崩溃的
 * 风险。与此同时，多个线程会共享服务端的集合属性allOut，这里还存在着多线程并
 * 发的安全问题。为此，需要重构聊天室案例，使用线程池技术来解决服务端多线程问题，
 * 并解决多线程并发的安全问题。现在需要对程序进行优化，使程序更加健壮。需要重构
 * 聊天室案例，使用线程池技术来解决服务端多线程问题，并解决多线程并发的安全问题。
 * 
 * 实现：首先需要在服务器端定义一个线程池类型的属性,用于管理服务端的线程创建及管理。
 */
public class Server {
	private ServerSocket serverSocket;  // 服务端Socket
	private List<PrintWriter> allOut;   // 所有客户端输出流
	private ExecutorService threadPool; // 线程池
 
	public Server() {
		try {
			serverSocket = new ServerSocket(8088);
			allOut = new ArrayList<PrintWriter>();
			threadPool = Executors.newFixedThreadPool(40);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}

	public void start() { //服务端开启方法
		try {
			// 循环监听客户端的连接
			while (true) {
				System.out.println("等待客户端连接...");
				Socket socket = serverSocket.accept(); // 监听客户端的连接
				System.out.println(socket.getInetAddress().getLocalHost()+"客户端已连接!");

				// 启动一个线程来完成针对该客户端的交互
				ClientHandler handler = new ClientHandler(socket);
				threadPool.execute(handler);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 将输出流存入共享集合，与下面两个方法互斥，保证同步安全
	 * @param out
	 */
	private synchronized void addOut(PrintWriter out) {
		allOut.add(out);
	}

	/**
	 * 将给定输出流从共享集合删除
	 * @param out
	 */
	private synchronized void removeOut(PrintWriter out) {
		allOut.remove(out);
	}

	/**
	 * 将消息转发给所有客户端
	 * @param message
	 */
	private synchronized void sendMessage(String message) {
		for (PrintWriter o : allOut) {
			o.println(message);
		}
	}

	/**
	 * 线程体，用于并发处理不同客户端的交互
	 */
	private class ClientHandler implements Runnable {
		private Socket socket; 

		public ClientHandler(Socket socket) {
			this.socket = socket;
		}

		@Override
		public void run() {
			PrintWriter pw = null;
			try {
				// 将客户端的输出流存入共享集合，以便广播消息
				OutputStream out = socket.getOutputStream();
				pw = new PrintWriter(new OutputStreamWriter(out, "UTF-8"), true);
				addOut(pw);

				InputStream in = socket.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF-8"));

				// 循环读取客户端发送的信息
				String message = null;
				while ((message = br.readLine()) != null) { 
					sendMessage(message); //遍历所有输出流，将该客户端发送的信息转发给所有客户端,需要同步
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				removeOut(pw); //当客户端断线，要将输出流从共享集合中删除，需要同步
				if (socket != null) {
					try {
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}