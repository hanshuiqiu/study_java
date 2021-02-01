package JAVA.流;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Test {
	
	public static void main(String[] args) throws IOException {
		
		/*
		//******************** 写入文件 **********************
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("test1"));
			bw.write("w3cschool菜鸟教程");
			bw.close();
			System.out.println("文件创建成功!\n");
		} catch (IOException e) {}
		
		
		//******************** 读取文件 **********************
		try {
			BufferedReader br = new BufferedReader(new FileReader("test1"));
			String str;
			while ((str = br.readLine()) != null) { //读取一个文本行，末尾则返回null
				System.out.println(str);
			}
			br.close();
			System.out.println(str+"\n");
		} catch (IOException e) {}
		
		
        
		
		
		//******************** 复制内容 **********************
		//向文件写内容
		BufferedWriter bw = new BufferedWriter(new FileWriter("test3"));
		bw.write("hello world\nhello world\nhello world\nhello world\n");
		bw.close();
		//读取文件内容并向另一文件写出
		InputStream fis = new FileInputStream(new File("test3"));
		OutputStream fos = new FileOutputStream(new File("test3_copy"));
		byte[] buf = new byte[1024];
		int length;
		while ((length = fis.read(buf)) > 0) {
			fos.write(buf, 0, length);
		}
		fis.close();
		fos.close();
		//读取另一文件的内容
		BufferedReader br = new BufferedReader(new FileReader("test3_copy"));
		String str;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		br.close();
		
		
		//******************** 文件追加数据 **********************
		bw = new BufferedWriter(new FileWriter("test3_copy", true));
		bw.write("append data\n");
		bw.close();
		br = new BufferedReader(new FileReader("test3_copy"));
		String str1;
		while ((str1 = br.readLine()) != null) {
			System.out.println(str1);
		}
		br.close();
		
		
		//******************** 临时文件 **********************
		f = File.createTempFile("pattern", ".suffix");
		f.deleteOnExit();
		BufferedWriter bw2 = new BufferedWriter(new FileWriter(f));
		bw2.write("hello World");
		bw2.close();
		System.out.println("\n临时文件已创建!\n");
		
		
		//******************** 文件修改时间 **********************
		System.out.println("文件修改时间为："+new Date(new File("test1").lastModified())+"\n");
		
		
		//******************** 修改文件最后修改日期 **********************
		f = new File("test3");
		f.createNewFile();
		System.out.println("上次最后修改日期："+new Date(f.lastModified()).toString());
		f.setLastModified(System.currentTimeMillis());
		System.out.println( "修改最后修改日期："+new Date(f.lastModified()).toString()+"\n");

		
		//******************** 文件是否存在 **********************
		System.out.println("文件是否存在："+new File("test3").exists()+"\n");
		
		
		//******************** 文件大小 **********************
		System.out.println("文件的大小为："+getFileSize("test3"));
		
		
		//******************** 文件重命名 **********************
		if (new File("test3").renameTo(new File("test3_rename"))) { //已存在返回false
			System.out.println("\n已重命名\n");
		} else {
			System.out.println("\n重命名不成功\n");
		}
		
		
		//******************** 文件只读 **********************
		f = new File("test3");
		f.setReadOnly();
		System.out.println("test3是否能读取："+f.canWrite()+"\n");
		//设置回文件可读
		f.setWritable(true);
		
		
		//******************** 指定目录中创建文件 **********************
		File dir = new File("F:\\workplace\\java\\7_文件流和目录");
		f = File.createTempFile("Java_", "._java", dir);
		System.out.println("文件的路径："+f.getPath()+"\n");
		
		
		//******************** 文件路径是否同一个目录 **********************
		File f1 = new File("F:\\workplace\\java\\7_文件流和目录\\file1\\file.txt");
		File f2 = new File("F:\\workplace\\java\\7_文件流和目录\\file2\\file.txt");
		if (f1.compareTo(f2) == 0) {
			System.out.println("两个文件的路径一致！\n");
		} else {
			System.out.println("两个文件路径不一致！\n");
		}
		
		
		//******************** 递归创建目录 **********************
		File file = new File("F:\\workplace\\java\\7_文件流和目录\\a\\b\\c\\d\\e");
		System.out.println("递归创建目录：" + file.mkdirs()+"\n");  //不存在返回ture
		
		
		//******************** 删除目录 **********************
		deleteDir(new File("./file3"));
		
		
		//******************** 目录是否为空 **********************
		f = new File("./file2");
		if (f.isDirectory()) {
			String[] files = f.list();
			if (files.length > 0) {
				System.out.println("\n目录 " + f.getPath() + " 不为空！\n");
			}
		}
		
		
		//******************** 文件是否隐藏 **********************
		System.out.println("文件是否隐藏："+new File(".test2").isHidden()+"\n");
		
		 
		//******************** 目录大小 **********************
		// org.apache.commons.io.FileUtils;
		System.out.println("目录大小：" + FileUtils.sizeOfDirectory(new File("./file1")) + " bytes\n"); 
		
		
		//******************** 指定目录中查找文件 **********************
		dir = new File("F:\\workplace\\java\\7_文件流和目录\\file6");
		String[] children = dir.list();
		if (children == null) {
			System.out.println("该目录不存在");
		} else {
			for (int i = 0; i < children.length; i++) {
				String filename = children[i];
				System.out.println(filename);
			}
		}
		
		
		//******************** 文件的上级目录 **********************
		f = new File("F:\\workplace\\java\\7_文件流和目录\\test1");
		System.out.println("\n文件的上级目录为 : " + f.getParent()+"\n");
		
		
		//******************** 目录结构 **********************
		showDir(1, new File("F:\\workplace\\java\\7_文件流和目录"));
		
		
		//******************** 遍历指定目录下所有目录 **********************
		showDir();
		
		
		//******************** 当前工作目录 **********************
		System.out.println("\n当前的工作目录为 :" + System.getProperty("user.dir"));
		
		
		//******************** 系统所有根目录 **********************
		System.out.println("\n系统所有根目录：");
		for (int i = 0; i < File.listRoots().length; i++) {
			System.out.println(File.listRoots()[i].toString());
		}
		
		
	*/}

	/**
	 * 获取文件的大小
	 * @param filename
	 * @return
	 */
	public static long getFileSize(String filename) {
		File file = new File(filename);
		if (!file.exists() || !file.isFile()) {
			System.out.println("文件不存在");
			return -1;
		}
		return file.length();
	}
	
	/**
	 * 删除目录, 删除文件后删除目录
	 * @param dir
	 * @return
	 */
	public static boolean deleteDir(File dir) {
		if (dir.isDirectory()) {
			String[] children = dir.list();
			for (int i = 0; i < children.length; i++) {
				boolean success = deleteDir(new File(dir, children[i]));
				if (!success) {
					return false;
				}
			}
		}
		if (dir.delete()) {
			System.out.println("目录已被删除！");
			return true;
		} else {
			System.out.println("目录删除失败！");
			return false;
		}
	}
	
	/**
	 * 打印目录结构
	 * @param indent
	 * @param file
	 * @throws IOException
	 */
	public static void showDir(int indent, File file) throws IOException {
		for (int i = 0; i < indent; i++)
			System.out.print("-");
		System.out.println(file.getName());
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (int i = 0; i < files.length; i++)
				showDir(indent + 4, files[i]);
		}
	}
	
	/**
	 * 遍历指定目录下所有目录
	 */
	public static void showDir() {
		File dir = new File(".");
		FileFilter fileFilter = new FileFilter() {
			public boolean accept(File file) {
				return file.isDirectory();
			}
		};
		File[] files = dir.listFiles(fileFilter);
		if (files.length == 0) {
			System.out.println("\n目录不存在或它不是一个目录");
		} else {
			System.out.println("\n指定目录下的目录个数："+files.length);
			for (int i = 0; i < files.length; i++) {
				File filename = files[i];
				System.out.println(filename.toString());
			}
		}
	}
	
	

}
