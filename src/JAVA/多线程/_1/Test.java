package JAVA.多线程._1;

import java.awt.Color;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test {

	public static void main(String[] args) {
		// 创建两个线程，分别输出1~10
		// testThread1();

		// 编写一个线程改变窗体的颜色
		// testThread2();

		// 编写一个线程改变窗体的颜色 (使用内部类的方式创建线程)
		// testThread3();

		// 测试currentThread方法
		// testThread4();

		// 测试getName方法和getId方法
		// testThread5();

		// 测试守护线程
		// testDaemonThread();

		// 测试join方法,使用两个线程模拟图片下载过程
		// testJoin();

		// 测试线程安全API与非线程安全API
		// testSafeThreadAPI();

	}

	private static void testSafeThreadAPI() {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list = Collections.synchronizedList(list);// 将ArrayList转换为线程安全的集合
		System.out.println(list);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("a", "apple");
		map.put("b", "banana");
		map = Collections.synchronizedMap(map);
		System.out.println(map);

	}

	private static void testJoin() {
		final Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i <= 10; i++) {
					System.out.println("t1:正在下载图片:" + i * 10 + "%");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("t1:图片下载完成");
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				System.out.println("t2:等待图片下载完毕");
				try {
					t1.join(); // 等待t1线程执行结束，再执行t2线程。
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("t2:显示图片");
			}
		};
		t1.start();
		t2.start();
	}

	private static void testDaemonThread() {
		Thread d = new Thread() {
			public void run() {
				while (true) {
					System.out.println("后台线程");
					try {
						Thread.sleep(100); // 0.1秒
					} catch (InterruptedException e) {
					}
				}
			}
		};
		d.setDaemon(true); // 设置为守护线程
		d.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		// 进程中所有前台线程结束后，后台线程即守护线程被强制结束
		System.out.println("main线程结束了");
	}

	private static void testThread1() {
		Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		t1.start();
		t2.start();
	}

	private static void testThread2() {
		TestRunnable r = new TestRunnable();
		r.setSize(300, 300);
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Thread t = new Thread(r);
		t.start();
	}

	private static void testThread3() {
		JFrame frame = new JFrame();
		frame.setSize(300, 300);
		final JPanel panel = new JPanel();
		panel.setSize(300, 300);
		frame.setContentPane(panel);
		frame.setVisible(true);
		Thread t = new Thread() {
			public void run() {
				int i = 0;
				while (true) {
					i = i == 0 ? 1 : 0;
					if (i == 0) {
						panel.setBackground(Color.BLACK);
					} else {
						panel.setBackground(Color.WHITE);
					}
					// 实现每隔1秒窗体的颜色在黑色和白色之间切换
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t.start();
	}

	private static void testThread4() {
		// Thread[main,5,main] : 当前线程的名字为main、优先级为5、当前线程的组线程为main
		System.out.println("运行main方法的线程:" + Thread.currentThread());
		testCurrent();
		Thread t = new Thread() {
			@Override
			public void run() {
				System.out.println("线程t:" + Thread.currentThread());
				testCurrent();
			}
		};
		t.start();
	}

	/**
	 * 测试不同线程调用该方法时，获取这个线程
	 */
	private static void testCurrent() {
		System.out.println("运行testCurrent方法的线程是:" + Thread.currentThread());
	}

	private static void testThread5() {
		// 默认的线程名字为“Thread-数字”的形式；ID为从数字9开始的，因为9之前的数字被虚拟机的线程占用掉
		Thread t = new Thread();
		System.out.println(t.getName());
		System.out.println(t.getId());

		Thread t1 = new Thread();
		System.out.println(t1.getName());
		System.out.println(t1.getId());

		Thread t2 = new Thread("自定义名字的Thread"); // 自定义线程的名字
		System.out.println(t2.getName());
		System.out.println(t2.getId());
		t2.start();
	}

}

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
}

class TestRunnable extends JFrame implements Runnable {
	@Override
	public void run() {
		int i = 0;
		JPanel panel = new JPanel();
		panel.setSize(300, 300);
		this.setContentPane(panel);
		while (true) {
			i = i == 0 ? 1 : 0;
			if (i == 0) {
				panel.setBackground(Color.BLACK);
			} else {
				panel.setBackground(Color.WHITE);
			}
		}
	}
}


