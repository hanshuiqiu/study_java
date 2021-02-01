package JAVA.设计模式._11模板方法模式.concreteTemplate;

import JAVA.设计模式._11模板方法模式.abstractTemplate.HummerModel;
/**
 * H1型号悍马车类：具体模板
 * @author Administrator
 */
public class HummerH1Model extends HummerModel {

	//鸣喇叭
	public void alarm() {
		System.out.println("H1悍马鸣喇叭");
	}

	// 发动引擎
	public void engineBoom() {
		System.out.println("H1悍马发动引擎");
	}

	// 启动
	public void start() {
		System.out.println("H1悍马启动");
	}

	// 停车
	public void stop() {
		System.out.println("H1悍马停车\n");
	}

}