package JAVA.网络.chat_v1_发一条信息;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
/**
 * 客户端：向服务端发送一条消息
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
		try {
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
			pw.println("你好！服务器");
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

	public static void main(String[] args) {
		Client client = new Client();
		client.start();
	}

}