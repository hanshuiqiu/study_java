package JAVA.网络.chat_v3_服务器并发处理多个客户端;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * 服务器端：使用线程来实现一个服务器端可以同时接收多个客户端的信息
 * 
 * 实现多个客户端连接同一个服务器，则需要服务器端循环等待多个客户端发送的请求。
 * 实现：首先需要在服务器端定义内部类，并在该内部类中设置线程要执行的任务。此案
 * 例中，线程要执行的任务即为接收对应的客户端的消息并打印显示。
 */
public class Server {
	private ServerSocket serverSocket;

	public Server() {
		try {
			serverSocket = new ServerSocket(8088);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void start() {
		try {
			// 循环监听客户端的连接
			while (true) {
				System.out.println("等待客户端连接...");
				// 监听客户端的连接
				Socket socket = serverSocket.accept();
				System.out.println(socket.getInetAddress().getLocalHost()+"客户端已连接!");

				// 启动一个线程来完成针对该客户端的交互
				ClientHandler handler = new ClientHandler(socket);
				new Thread(handler).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
     * 线程体：并发处理不同客户端的交互
     */
	private class ClientHandler implements Runnable {
		private Socket socket;

		public ClientHandler(Socket socket) {
			this.socket = socket;
		}

		@Override
		public void run() {
			try {
				InputStream in = socket.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF-8"));
				// 循环读取客户端发送的信息
				while (true) {
					System.out.println("客户端说:" + br.readLine());
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
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

	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}

}