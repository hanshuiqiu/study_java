package JAVA.设计模式._2工厂方法模式.HumanImplements;

import JAVA.设计模式._2工厂方法模式.HumanInterface.Human;

/**
 * 黄种人类
 * @author Administrator
 */
public class YellowHuman implements Human {
	
	public String getColor() {
		return "黄色";
	}

	public void talk() {
		System.out.println("我是黄种人,皮肤是"+getColor());
	}
	
}
