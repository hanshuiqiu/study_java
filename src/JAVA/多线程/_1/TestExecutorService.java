package JAVA.多线程._1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 线程池每次启动两个线程来执行任务。由于要求执行5次任务，所以线程池分三次执行，
 * 前两次各执行2个任务，最后一次执行一个任务。
 */
public class TestExecutorService {

	public static void main(String[] args) {

		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		//要执行5次该任务，那么循环5次即可
		for (int i = 0; i < 5; i++) {
			Handler handler = new Handler();
			threadPool.execute(handler); //设置线程池要执行的任务
		}
	}

}

class Handler implements Runnable {
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("执行当前任务的线程为:" + name);
		for (int i = 0; i < 10; i++) {
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + ":任务完毕");
	}
}