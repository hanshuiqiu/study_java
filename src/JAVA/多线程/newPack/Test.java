package JAVA.多线程.newPack;

public class Test {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		t.flag = false;  //结束线程
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) { }
		
		
	}
}

class MyThread extends Thread{
	boolean flag=true;
	
	@Override
	public void run() {
		while (flag) { }
	}
}