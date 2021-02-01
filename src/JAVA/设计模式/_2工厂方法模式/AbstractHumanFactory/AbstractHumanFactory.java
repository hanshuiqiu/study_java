package JAVA.设计模式._2工厂方法模式.AbstractHumanFactory;

import JAVA.设计模式._2工厂方法模式.HumanInterface.Human;
/**
 * 抽象人类工厂类
 * @author Administrator
 */
public abstract class AbstractHumanFactory {
	
	//使用泛型，减少对象间转换，传入参数必须为Human的实现类且为class类型
	public abstract <T extends Human> T createHuman(Class<T> c);
	
}
