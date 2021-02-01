package JAVA.多线程;

/**
 * 生产者/消费者问题：
 * 一：操作协调
 * 生产者和消费者在同一时间段内共用同一个存储空间，生产者向空间
 * 里存放数据，而消费者取用数据
 * 
 * 二：操作不协调
 * 存储空间已满，而生产者占用着它，消费者等着生产者让出空间从而
 * 去除产品，生产者等着消费者消费产品，从而向空间中添加产品。互
 * 相等待，从而发生死锁。
 * @author hsq
 *
 */
public class Thread7 {
	
	public static void main(String[] args) {
		CommonSpace c = new CommonSpace();
		Producer p1 = new Producer(c, 1);
		Consumer c1 = new Consumer(c, 1);
		p1.start();
		c1.start();
	}
	
}

/**
 * 共用的存储空间
 * @author Administrator
 */
class CommonSpace {
	private int contents;  //内容
	private boolean available = false;  //存储空间是否有内容

	public synchronized int get() {
		while (available == false) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		available = false;
		notifyAll();
		return contents;
	}

	public synchronized void put(int value) {
		while (available == true) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		contents = value;
		available = true;
		notifyAll();
	}
}

/**消费者
 * @author Administrator
 */
class Consumer extends Thread {
	private CommonSpace cs;
	private int number;

	public Consumer(CommonSpace cs, int number) {
		this.cs = cs;
		this.number = number;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("消费者#" + this.number + " got：" + cs.get()+"\n");
		}
	}
}

/**
 * 生产者
 * @author Administrator
 */
class Producer extends Thread {
	private CommonSpace cs;
	private int number;

	public Producer(CommonSpace cs, int number) {
		this.cs = cs;
		this.number = number;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			cs.put(i);
			System.out.println("生产者#" + this.number + " put：" + i);
			try {
				sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) { }
		}
	}
}










