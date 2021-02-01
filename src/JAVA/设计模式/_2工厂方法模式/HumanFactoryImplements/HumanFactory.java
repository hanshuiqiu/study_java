package JAVA.设计模式._2工厂方法模式.HumanFactoryImplements;

import JAVA.设计模式._2工厂方法模式.AbstractHumanFactory.AbstractHumanFactory;
import JAVA.设计模式._2工厂方法模式.HumanInterface.Human;
/**
 * 人类工厂类
 * @author Administrator
 */
public class HumanFactory extends AbstractHumanFactory{
	
	@SuppressWarnings("unchecked")
	public <T extends Human> T createHuman(Class<T> c) {
		Human h = null;
		try {
			h = (T) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("人种生成错误！");
		}
		return (T) h;
	}
	
}
