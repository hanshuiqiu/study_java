package JAVA.设计模式._3抽象工厂模式.HumanImplements;

import JAVA.设计模式._3抽象工厂模式.HumanAbstract.AbstractYellowHuman;
/**
 * 男性黄种人类
 * @author Administrator
 */
public class MaleYellowHuman extends AbstractYellowHuman {
	
	//性别
	@Override
	public String getSex() {
		return "男性";
	}
	
	//说话
	@Override
	public void talk() {
		System.out.println("我是"+getSex()+"黄种人，肤色是"+super.getColor());
	}
	
}
