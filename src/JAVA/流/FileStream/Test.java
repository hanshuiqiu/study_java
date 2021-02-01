package JAVA.流.FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test {

	public static void main(String[] args) throws Exception {

		//文件字节输出流
		tesFileOutputStream("./fos.txt","会议审议通过了《中央军民融合发展委员会工作规则》《中央军委融合发展委员会办公室工作规则》《中央军民融合发展委员会近期工作要点》和《省（区、市）军民融合发展领导机构和工作机构设置的意见》");
		
		//文件复制
		copyFile("fos.txt","fis.txt");
		
		//文件字节输入流
		testFileInputStream("./fis.txt");
		
	}
	
	public static void copyFile(String sourcefileName, String targetFileName) throws Exception {
		FileInputStream fis = new FileInputStream(sourcefileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);

		//使用字节数组形式复制文件
		int len = -1;
		byte[] buf = new byte[1024];  //自定义缓存区
		while ((len = fis.read(buf)) != -1) {
			fos.write(buf, 0, len);
		}
		
		//使用字节形式复制文件
//		int d = -1;
//		while ((d = fis.read()) != -1) {
//			fos.write(d);
//		}
        
		System.out.println("\n复制完毕");
		fis.close();
		fos.close();
	}

	public static void tesFileOutputStream(String fileName, String content) throws Exception {
		FileOutputStream fos = new FileOutputStream(new File(fileName));        //覆盖写方式
//		FileOutputStream fos = new FileOutputStream(new File(fileName), true);  //追加写的方式
		fos.write(content.getBytes());
		fos.close();
		System.out.println("\nwrite finished");
	}
	
	public static void testFileInputStream(String fileName) throws Exception {
		FileInputStream fis = new FileInputStream(new File(fileName));        //覆盖写方式
		int len = -1;
		byte[] buf = new byte[32];  //自定义缓存区
		while ((len = fis.read(buf)) != -1) {
			System.out.println(new String(buf, "utf-8"));
		}
		fis.close();
		System.out.println("\nread finished");
	}

}
