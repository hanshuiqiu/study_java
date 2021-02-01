package JAVA.多线程._1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class TestBlockingQueue {

	public static void main(String[] args) {

		//测试入队
//		testOffer();
		
		//测试出队
		testPull();
		
	}
	
	public static void testOffer() {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
        //双缓冲队列的大小为10，入队10个元素后，则不能再入元素
        for(int i=0;i<20;i++){
            try {
                boolean b = queue.offer(i,2,TimeUnit.SECONDS); //设2秒内元素仍没入队列则返false
                System.out.println("存入是否成功:"+b);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }    
    }
	
	public static void testPull() {
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
		for (int i = 0; i < 10; i++) {
			queue.offer(i);
		}
		//双缓冲队列只有10个元素，全部取出后再取则返回null
		for (int i = 0; i < 20; i++) {
			
			try {
				Integer num = queue.poll(2, TimeUnit.SECONDS); //设置2秒内还没取出元素则返回null
				System.out.println("元素:" + num);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
