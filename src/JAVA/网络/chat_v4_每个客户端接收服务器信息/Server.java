package JAVA.网络.chat_v4_每个客户端接收服务器信息;

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
/**
 * 服务器端：服务端可以将用户的信息转发给所有客户端，并在每个客户端控制台上显示
 * 
 * 实现服务端对某个客户端发送的信息进行广播(转发给所有客户端)的工作，并且使客户
 * 端在接收到服务端转发的信息后输出到控制台。
 * 
 * 实现：首先需要在服务器端定义一个集合类型的属性，用于存储所有客户端的输出流。
 * 然后在Server的内部类中run方法的最开始处将客户端的输出流存入该集合。之后，
 * 每当客户端发送信息后就遍历集合，将信息写入集合中所有的输出流中(相当于将信息
 * 转发给所有的客户端)
 */
public class Server {
	private ServerSocket serverSocket;
	private List<PrintWriter> allOut; // 所有客户端输出流

	public Server() {
		try {
			serverSocket = new ServerSocket(8088);
			allOut = new ArrayList<PrintWriter>();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void start() {
		try {
			// 循环监听客户端的连接
			while (true) {
				System.out.println("等待客户端连接...");
				Socket socket = serverSocket.accept(); // 监听客户端的连接
				System.out.println(socket.getInetAddress().getLocalHost()+"客户端已连接!");

				// 启动一个线程来完成针对该客户端的交互
				ClientHandler handler = new ClientHandler(socket);
				new Thread(handler).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}

	/**
	 * 线程体：并发处理不同客户端的交互
	 */
	private class ClientHandler implements Runnable {
		private Socket socket; // 该线程用于处理的客户端

		public ClientHandler(Socket socket) {
			this.socket = socket;
		}

		@Override
		public void run() {
			PrintWriter pw = null;
			try {
				// 将客户端的输出流存入共享集合，以便广播给其他客户端消息
				OutputStream out = socket.getOutputStream();
				pw = new PrintWriter(new OutputStreamWriter(out, "UTF-8"), true);
				allOut.add(pw);

				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in, "UTF-8");
				BufferedReader br = new BufferedReader(isr);

				String message = null;
				// 循环读取客户端发送的信息
				while ((message = br.readLine()) != null) {
					// 遍历所有输出流，将该客户端发送的信息转发给所有客户端
					for (PrintWriter o : allOut) {
						o.println(message);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				allOut.remove(pw); //当客户端断线，要将输出流从共享集合中删除
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