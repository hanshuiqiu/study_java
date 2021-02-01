package JAVA.设计模式._13观察者模式.observerConcrete;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import JAVA.设计模式._13观察者模式.observer.Observer;
import JAVA.设计模式._13观察者模式.subject.Subject;

public class UniverStudent implements Observer {
	private Subject subject;
	private File myFile;

	public UniverStudent(Subject subject, String fileName) {
		this.subject = subject;
		subject.addObserver(this);
		myFile = new File(fileName);
	}

	public void hearTelephone(String heardMess) {
		try {
			RandomAccessFile out = new RandomAccessFile(myFile, "rw");
			out.seek(out.length()); //将下标定位到指定位置
			byte[] b = heardMess.getBytes();
			out.write(b); 
			out.close();
			
			System.out.print("我是一个大学生,");
			System.out.println("我向文件" + myFile.getName() + "写入如下内容:");
			System.out.println(heardMess);
		} catch (IOException exp) {
			System.out.println(exp.toString());
		}
	}
}
