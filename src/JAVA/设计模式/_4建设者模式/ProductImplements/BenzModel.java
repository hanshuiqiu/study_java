package JAVA.设计模式._4建设者模式.ProductImplements;

import JAVA.设计模式._4建设者模式.ProductAbstract.CarModel;
/**
 * 奔驰车类
 * @author Administrator
 */
public class BenzModel extends CarModel{
	
	@Override
	protected void alarm() {
		System.out.println("奔驰车鸣喇叭...");
	}

	@Override
	protected void engineBoom() {
		System.out.println("奔驰车发动引擎...");
	}

	@Override
	protected void stop() {
		System.out.println("奔驰车停车...");
	}

	@Override
	protected void run() {
		System.out.println("奔驰车行驶...");
	}
	
}
