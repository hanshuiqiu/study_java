package JAVA.网络;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Map;
import java.util.Set;

public class Test {
	
	public static void main(String[] args) throws Exception {

//		testSocket();
		
//		testInetSocket();
		
//		getHostIP("www.baidu.com");
		
//		portIsUsed();
		
//		getNetworkFileSize();
		
//		getLocalHostAndAddress();
		
//		showLastModifyTimeOfFile();
		
//		connectHostWithSocket();
		
//		grabWebpage();
		
//		parseURL("http://www.w3cschool.cc/html/html-tutorial.html");
		
	}
	
	private static void testSocket() throws Exception {
		Socket socket = new Socket("localhost", 8088);
		InetAddress add = socket.getLocalAddress();  //获取本地地址信息
		
		System.out.println(add.getCanonicalHostName());
		System.out.println(add.getHostAddress());
		System.out.println(socket.getLocalPort());
		
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		
		socket.close();
		is.close();
		os.close();
	}
	
	private static void testInetSocket() throws Exception {
		Socket socket = new Socket("localhost", 8088);
		InetAddress addr = socket.getInetAddress();
		
		System.out.println(addr.getCanonicalHostName());
		System.out.println(addr.getHostAddress());
		System.out.println(socket.getPort());
		
		socket.close();
	} 
	
	/**
	 * 获取指定主机IP
	 */
	private static void getHostIP(String hostName) {
		InetAddress address = null;
		try {
			address = InetAddress.getByName(hostName);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println("\n"+address.getHostName() + " = "+ address.getHostAddress());
	}
	
	/**
	 * 端口是否已使用
	 * @throws IOException 
	 */
	private static void portIsUsed() throws IOException {
		Socket socket = null;
		try {
			for (int i = 0; i < 1024; i++) {
				System.out.println("查看 " + i);
				socket = new Socket("localhost", i);
				System.out.println("localhost" + i + " 已被使用");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if (socket != null) {
				socket.close();
			}
		}
	}
	
	/**
	 * 获取远程文件大小
	 * @throws IOException
	 */
	private static void getNetworkFileSize() throws IOException {
		URL url = new URL("http://www.w3cschool.cc/wp-content/themes/w3cschool.cc/assets/img/newlogo.png");
		URLConnection conn = url.openConnection();
		int size = conn.getContentLength();
		if (size < 0) {
			System.out.println("\n无法获取远程文件大小！\n");
		} else {
			System.out.println("\n远程文件大小为：" + +size + " bytes\n");
		}
		conn.getInputStream().close();
	}
	
	/**
	 * 本机IP和主机名
	 * @throws IOException
	 */
	private static void getLocalHostAndAddress() throws IOException {
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println("\n本地主机IP：" + addr.getHostAddress());
		System.out.println("本地主机名：" + addr.getHostName() + "\n");
	}
	
	/**
	 * 查看主机指定文件的最后修改时间
	 */
	private static void showLastModifyTimeOfFile() throws IOException {
		URL url = new URL("http://www.runoob.com/wp-content/themes/w3cschool.cc/assets/img/newlogo.png");  //???
		URLConnection conn = url.openConnection();
		conn.setUseCaches(false);
		System.out.println("image.jpg文件最后修改时间 :" + new Date(conn.getLastModified())+"\n");
	}
	
	/**
	 * 使用Socket连接到指定主机
	 * @throws IOException
	 */
	private static void connectHostWithSocket() throws IOException {
		try {
			Socket socket = new Socket("www.w3cschool.cc", 80);
			InetAddress addr = socket.getInetAddress();
			System.out.println("连接到： " + addr + "\n");
			socket.close();
		} catch (IOException e) {
			System.out.println("无法连接");
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 网页抓取
	 * @throws IOException
	 */
	private static void grabWebpage() throws IOException {
		URL url = new URL("http://www.w3cschool.cc");
		//查看响应头信息
		URLConnection conn = url.openConnection();
		Map<String, ?> headers = conn.getHeaderFields();
		Set<String> set = headers.keySet();
		for (String key : set) {
			String val = conn.getHeaderField(key);
			System.out.println(key + " : " + val);
		}
		
		//读取网页内容并写入文件
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("data.html"));
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(new String(line.getBytes(),"utf-8"));
			bw.write(new String(line.getBytes(),"utf-8"));
			bw.newLine();
		}
		br.close();
		bw.close();
	}

	/**
	 * 解析 URL  
	 * @throws IOException
	 */
	private static void parseURL(String Url) throws IOException {
		URL url = new URL(Url);
		System.out.println("\nURL 是 " + url.toString());
		System.out.println("协议是 " + url.getProtocol());
		System.out.println("文件名是 " + url.getFile());
		System.out.println("主机是 " + url.getHost());
		System.out.println("路径是 " + url.getPath());
		System.out.println("端口号是 " + url.getPort());
		System.out.println("默认端口号是 " + url.getDefaultPort()+"\n");
	}
	
	

}