package JAVA.设计模式._2工厂方法模式.HumanImplements;

import JAVA.设计模式._2工厂方法模式.HumanInterface.Human;
/**
 * 黑种人类
 * @author Administrator
 */
public class BlackHuman implements Human {
	
	public String getColor() {
		return "黑色";
	}

	public void talk() {
		System.out.println("我是黑种人,皮肤是"+getColor());
	}
	
}
