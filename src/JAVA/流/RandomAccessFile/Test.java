package JAVA.流.RandomAccessFile;

import java.io.RandomAccessFile;

public class Test {

	public static void main(String[] args) throws Exception {
		
//		writeInt();
		
//		writeArray();
		
//		read();

//		readArray();
		
		//复制文件
//		copyFile();

		//测试文件指针的相关方法
//		testPointer();
		
	}
	
	public static void testPointer() throws Exception {
        RandomAccessFile raf = new RandomAccessFile("./raf.txt", "r");
        System.out.println("指针位置:" + raf.getFilePointer()); //指针位置默认从0开始
        
        raf.skipBytes(5);
        System.out.println("指针位置:" + raf.getFilePointer());
        
        byte[] buf = new byte[5]; // 读取world这5个字节
        raf.read(buf);
        System.out.println(new String(buf));
        System.out.println("指针位置:" + raf.getFilePointer());
        
        raf.seek(0);  // 将游标移动到文件开始
        System.out.println("指针位置:" + raf.getFilePointer());
        
        raf.close();
    }

	public static void writeInt() throws Exception {
		RandomAccessFile raf = new RandomAccessFile("./raf.txt", "rw");
		raf.write(1); // 写出int值的低8位(即1字节)
		raf.close();
	}
	
	public static void writeArray() throws Exception {
		RandomAccessFile raf = new RandomAccessFile("./raf.txt", "rw");
		byte[] buf = "HelloWorld".getBytes(); // 将字符串按照默认编码转换为字节
		raf.write(buf); // 所有字节一次性写出
		raf.close();
	}

	public static void read() throws Exception {
		RandomAccessFile raf = new RandomAccessFile("./raf.txt", "rw");
		System.out.println(raf.read()); // 读取1字节
		raf.close();
	}

	public static void readArray() throws Exception { // 测试批量读取
		RandomAccessFile raf = new RandomAccessFile("./raf.txt", "rw");
		byte[] buf = new byte[10];
		int len = raf.read(buf); // 读取10字节存入数组，返回值为读取的字节量
		System.out.println("读取到了:" + len + "个字节");
		System.out.println(new String(buf)); 
		raf.close();
	}

	public static void copyFile() throws Exception {
		RandomAccessFile read = new RandomAccessFile("./raf.txt", "rw");
		RandomAccessFile write = new RandomAccessFile("./raf_copy.txt", "rw");

		int len = -1;
		byte[] buf = new byte[1024];
		while ((len = read.read(buf)) != -1) {
			write.write(buf, 0, len);
		}
		System.out.println("复制完毕");
		read.close();
		write.close();
	}

}
