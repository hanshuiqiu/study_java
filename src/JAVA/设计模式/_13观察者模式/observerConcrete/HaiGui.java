package JAVA.设计模式._13观察者模式.observerConcrete;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import JAVA.设计模式._13观察者模式.observer.Observer;
import JAVA.设计模式._13观察者模式.subject.Subject;
/**
 * 留学生类：具体观察者
 * @author Administrator
 */
public class HaiGui implements Observer {
	private Subject subject;
	private File myFile;

	public HaiGui(Subject subject, String fileName) {
		this.subject = subject;
		subject.addObserver(this);
		myFile = new File(fileName);
	}

	public void hearTelephone(String heardMess) {
		try {
			boolean boo = heardMess.contains("java程序员") || heardMess.contains("软件");
			if (boo) {
				RandomAccessFile out = new RandomAccessFile(myFile, "rw");
				out.seek(out.length());  //将下标定位到指定位置
				byte[] b = heardMess.getBytes();
				out.write(b);
				out.close();
				
				System.out.print("我是一个海归,");
				System.out.println("我向文件" + myFile.getName() + "写入如下内容:");
				System.out.println(heardMess);
			} else {
				System.out.println("我是海归,这次的信息中没有我需要的信息");
			}
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
