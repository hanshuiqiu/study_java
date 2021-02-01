package JAVA.流.File;

import java.io.File;
import java.io.FileFilter;

public class Test {

	public static void main(String[] args) throws Exception {
		
		File f = new File("./file.txt");
		
		//创建文件s
//		System.out.println("文件创建是否成功："+f.createNewFile());;
		
		//重命名
//		System.out.println("文件命名是否成功："+f.renameTo(new File("./file_rename.txt")));
		
		
		
		
		//删除文件
//		f.delete();

		//输出当前项目目录下所有文件
//		listFiles(new File("."));

		//输出当前项目目录下扩展名为.txt的文件
//		filterSuffix(new File("."),".txt");
		
		//输出当前项目目录下所有文件夹
		filterNonDirectory(new File("."));

	}

	public static void listFiles(File f) {
		File[] files = f.listFiles();
		if (files != null) {
			for (File _f : files) {
				System.out.println(_f.getName());
			}
		}
	}

	public static void filterSuffix(File file, final String suffix) {
		File[] files = file.listFiles(new FileFilter() {
			public boolean accept(File file) {
				return file.getName().endsWith(suffix);
			}
		});
		for (File f : files) {
			System.out.println(f.getName());
		}
	}
	
	public static void filterNonDirectory(File file) {
		File[] files = file.listFiles(new FileFilter() {
			public boolean accept(File f) {
				return !f.isDirectory();
			}
		});
		for (File f : files) {
			System.out.println(f.getName());
		}
	}

}
