package JAVA.多线程._1;

public class TestSynchronized implements Runnable{

	public static void main(String[] args) {
		
		//不是线程同步，两个不同的TestSynchronized对象，创建两个不同线程
//		Runnable r1 = new TestSynchronized();
//		Runnable r2 = new TestSynchronized();
//		Thread t1 = new Thread(r1);
//		Thread t2 = new Thread(r2);
//		t1.start();
//		t2.start();
		
		//线程同步，相同的TestSynchronized对象，创建两个不同线程
		Runnable r3 = new TestSynchronized();
		Thread t3 = new Thread(r3);
		Thread t4 = new Thread(r3);
		t3.start();
		t4.start();
		
	}

	@Override
	public synchronized void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(" " + i);
		}
	}

	
}