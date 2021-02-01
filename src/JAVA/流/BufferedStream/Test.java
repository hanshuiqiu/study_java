package JAVA.流.BufferedStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws Exception {
		
//		testBufferedOutputStream("./bos.txt", "近来，世界正呈现出新的力量格局变化。中国目前是世界上最大的发展中国家，亚洲第一大国，其先锋是领导人习近平。");
		
		// 实现基于缓存区的文件复制
//		copyFile("./bos.txt", "./bis.txt");
		
//		testBufferedInputStream("./bis.txt");
		
	}
	
	public static void copyFile(String sourceFile, String targetFile) throws Exception {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));   
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFile)); 
		
//		int d = -1;
//		while ((d = bis.read()) != -1) {
//			bos.write(d);
//		}
		
		byte[] buff = new byte[1024];
		int len = -1;
		while ((len = bis.read(buff)) != -1) {
			bos.write(buff, 0, len);
		}
		
		System.out.println("\n文件复制完毕");
		bis.close();
		bos.close();
	}

	/**
	 * 缓冲区字节输出流的写出
	 * @throws IOException
	 */
	public static void testBufferedOutputStream(String fileName, String content) throws IOException {
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(fileName), false));
		bos.write(content.getBytes());  //所有字节全部存入缓冲区，等待溢满一次性写出
		System.out.println("\nwrite finished");
		bos.close();
	}
	
	/**
	 * 缓冲区字节输入流的读取
	 * @throws IOException
	 */
	public static void testBufferedInputStream(String fileName) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName));
		
		byte[] buff = new byte[1024];
		int len = -1;
		while ((len = bis.read(buff)) != -1) { //缓冲读入，并非逐个字节读取
			System.out.print(new String(buff, "utf-8"));
		}
		
		//以下方式输出控制台，则出现乱码
//		int d = 0;
//		while ((d = bis.read()) != -1) { 
//			System.out.print((char)d);
//		}
		
		System.out.println("\nread finished");
		bis.close();
	}
	
}
