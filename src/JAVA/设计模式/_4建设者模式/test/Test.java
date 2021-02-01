package JAVA.设计模式._4建设者模式.test;

import JAVA.设计模式._4建设者模式.director.Director;
/**
 * 场景类
 * @author Administrator
 */
public class Test {

	public static void main(String[] args) {

		Director director = new Director();
		
		// 生产1辆A类奔驰车：先start，然后stop
//		director.getBenzModelA().control();
		
		// 生产1辆B类奔驰车：先发动引擎，然后行驶，然后停止
//		director.getBenzModelB().control();
		
		// 生产1辆C类宝马车：先鸣喇叭，然后行驶，然后停止
		director.getBMWModelC().control();

	}
	
}
