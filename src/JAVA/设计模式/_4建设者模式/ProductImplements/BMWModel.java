package JAVA.设计模式._4建设者模式.ProductImplements;

import JAVA.设计模式._4建设者模式.ProductAbstract.CarModel;

/**
 * 宝马车类
 * @author Administrator
 */
public class BMWModel extends CarModel{
	
	@Override
	protected void alarm() {
		System.out.println("宝马车鸣喇叭...");
	}

	@Override
	protected void engineBoom() {
		System.out.println("宝马车发动引擎...");
	}

	@Override
	protected void stop() {
		System.out.println("宝马车停车...");
	}

	@Override
	protected void run() {
		System.out.println("宝马车行驶...");
	}
	
}
