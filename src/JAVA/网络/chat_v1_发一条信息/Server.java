package JAVA.网络.chat_v1_发一条信息;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * 服务器端
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
			System.out.println("等待客户端连接...");
			Socket socket = serverSocket.accept(); // 监听客户端的连接
			System.out.println(socket.getInetAddress().getLocalHost()+"客户端已连接!");
			InputStreamReader isr = new InputStreamReader(socket.getInputStream(), "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			System.out.println("客户端说:" + br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (serverSocket != null) {
				try {
					serverSocket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}

}