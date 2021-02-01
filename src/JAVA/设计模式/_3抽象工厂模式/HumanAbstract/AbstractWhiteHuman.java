package JAVA.设计模式._3抽象工厂模式.HumanAbstract;

import JAVA.设计模式._3抽象工厂模式.HumanInterface.Human;
/**
 * 白种人抽象类
 * @author Administrator
 */
public abstract class AbstractWhiteHuman implements Human {

	//肤色
	@Override
	public String getColor() {
		return "白色";
	}

}