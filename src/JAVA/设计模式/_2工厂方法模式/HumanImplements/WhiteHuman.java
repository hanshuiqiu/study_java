package JAVA.设计模式._2工厂方法模式.HumanImplements;

import JAVA.设计模式._2工厂方法模式.HumanInterface.Human;
/**
 * 白种人类	
 * @author Administrator
 */
public class WhiteHuman implements Human {
	
	public String getColor() {
		return "白色";
	}

	public void talk() {
		System.out.println("我是白种人,皮肤是"+getColor());
	}
	
}
