package JAVA.设计模式._3抽象工厂模式.HumanAbstract;

import JAVA.设计模式._3抽象工厂模式.HumanInterface.Human;
/**
 * 黄种人抽象类
 * @author Administrator
 */
public abstract class AbstractYellowHuman implements Human {

	//肤色
	@Override
	public String getColor() {
		return "黄色";
	}

}
