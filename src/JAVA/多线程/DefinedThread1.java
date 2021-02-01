package JAVA.多线程;

/**
 * 查看线程是否存活
 * @author Administrator
 */
public class DefinedThread1 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			printMsg();
		}
	}

	private void printMsg() {
		//获取当前线程名称
		System.out.println("threadName: " + Thread.currentThread().getName());
	}
	
	
	public static void main(String[] args) {  //主线程，名称为：main
		DefinedThread1 t = new DefinedThread1();
		t.setName("MyThread");
		
		//工作线程启动前的状态
		System.out.println("before start(), t.isAlive()： "+ t.isAlive());
		
		//工作线程启动前的状态
		t.start();
		System.out.println("after start(), t.isAlive()："+ t.isAlive());
		
		for (int i = 0; i < 5; i++) {
			t.printMsg();
		}
		
		//主线程运行后工作线程的状态
		System.out.println("end of main(), t.isAlive()："+ t.isAlive());
		
		/*
		随机某次的运行结果：
		before start(), t.isAlive()： false
		after start(), t.isAlive()：true
		threadName: MyThread
		threadName: main
		threadName: main
		threadName: MyThread
		threadName: main
		threadName: MyThread
		threadName: main
		threadName: MyThread
		threadName: main
		threadName: MyThread
		end of main(), t.isAlive()：true
		 */
	}

}
