package JAVA.网络.chat_v3_服务器并发处理多个客户端;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
/**
 * 客户端：通过控制台不断向服务端发送信息
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

	public void start() {
		Scanner scanner = null;
		try {
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
			
			//即时向服务端发送消息
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

	public static void main(String[] args) {
		Client client = new Client();
		client.start();
	}

}