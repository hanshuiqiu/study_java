package JAVA.网络.chat_v5_线程池解决服务端多线程问题;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
/**
 * 客户端：通过控制台不断向服务端发送信息，并接受服务器发过来其他客户端的消息
 */
public class Client {
	private Socket socket;

	public Client() {
		try {
			socket = new Socket("localhost", 8088);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Client client = new Client();
		client.start();
	}

	public void start() {
		Scanner scanner = null;
		try {
			// 将接收服务端信息的线程启动
			ServerHander handler = new ServerHander();
			Thread t = new Thread(handler);
			t.setDaemon(true);
			t.start();

			OutputStream out = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out,"UTF-8"), true);

			// 创建Scanner读取用户输入内容
			scanner = new Scanner(System.in);
			while (true) {
				pw.println(scanner.nextLine());
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
			scanner.close();
		}
	}
	
	/**
     * 该线程用于接收服务端发送过来的信息
     */
	private class ServerHander implements Runnable {
		@Override
		public void run() {
			try {
				InputStream in = socket.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(in, "UTF-8"));
				while (true) {
					System.out.println(br.readLine());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}