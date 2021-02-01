package JAVA.流.字符流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Test {

	public static void main(String[] args) throws Exception {

		//指定编码将文本写入文件
		outputStreamWriter();
		
		//读出指定编码的文本文件
		inputStreamReader();
		
		//将日志信息写入文本文件
		printWriter();
		
		//读取日志信息输出到控制台
		bufferedReader();
		
		
	}
	
	public static void bufferedReader()throws Exception{
//		BufferedReader br = new BufferedReader(new FileReader("log.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("br.txt")));
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
    }
	
	public static void bufferedWriter()throws Exception{
		BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("bw.txt")));
		bw.write("w3cschool菜鸟教程");
		bw.close();
    }
	
	public static void printWriter()throws Exception{
		PrintWriter pw = new PrintWriter("pw.txt");
		//记录多行日志信息
		pw.println("信息: Starting ProtocolHandler [\"ajp-bio-8009\"]");
		pw.println("四月 24, 2017 10:41:30 下午 org.apache.catalina.startup.Catalina start");
		pw.println("信息: Server startup in 4645 ms");
		pw.close();
    }

	public static void outputStreamWriter() throws Exception {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"), "GBK"); //编码名称忽略大小写
		osw.write("Mr范");
		osw.close();
	}
	
	public static void inputStreamReader()throws Exception{
        InputStreamReader isr = new InputStreamReader(new FileInputStream("osw.txt"),"GBK");
		int chs = -1;
		while ((chs = isr.read()) != -1) {
			System.out.print((char) chs+" ");
		}
        isr.close();
    }
	
	
}
