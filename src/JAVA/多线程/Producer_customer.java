package JAVA.多线程;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
/**
 * 生产消费者模型
* @author     韩水球
* @createDate 2017年6月19日 上午9:55:29
* @version    v1.0
 */
public class Producer_customer {
	
	public static void main(String[] args) {
		
		//典型的生产者消费者模型的案例是流媒体在线播放。流媒体下载是生产者，流媒体播放是消费者，
		//BlockingQueue对象是缓冲区，保证下载器和播放器使用相同缓冲区。使用BlockingQueue实现生产者和消费者模型。
		BlockingQueue<Object> q = new ArrayBlockingQueue<Object>(10);
		new Thread(new Donwload(q)).start();
		new Thread(new Player(q)).start();
		new Thread(new Player(q)).start();
		
		/*结果分析：
		只有下载数据完成后该数据才能播放，这是因为，BlockingQueue内部使用两条队列，可允许两个
		线程同时向队列一个做存储，一个做取出操作。如果BlockingQueue对象是空的，则从BlockingQueue
		对象取数据的操作将会被阻塞进入等待状态，直到BlockingQueue对象有数据进入则被唤醒。同样，
		如果BlockingQueue对象是满的,任何试图向其存数据的操作也会被阻塞进入等待状态，直到
		BlockingQueue对象内有空间则会被唤醒继续操作，这样，BlockingQueue对象保证并发安全的同
		时提高了队列的存取效率。*/
	}
	
}

/**
 * 流媒体下载：生产者
 * @author Administrator
 */
class Donwload implements Runnable {
	private final BlockingQueue<Object> queue;
	int index = 0;

	public Donwload(BlockingQueue<Object> q) {
		queue = q;
	}

	public void run() {
		try {
			while (true) {
				System.out.println("下载视频数据" + index);
				queue.put(produce());
			}
		} catch (InterruptedException ex) {
		}
	}

	private Object produce() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "视频数据" + index++;
	}
}

/**
 * 流媒体播放：消费者
 * @author Administrator
 */
class Player implements Runnable {
	private final BlockingQueue<Object> queue;

	public Player(BlockingQueue<Object> q) {
		queue = q;
	}

	public void run() {
		try {
			while (true) {
				consume(queue.take());
			}
		} catch (InterruptedException ex) {}
	}

	void consume(Object x) {
		System.out.println("播放" + x);
	}
}



