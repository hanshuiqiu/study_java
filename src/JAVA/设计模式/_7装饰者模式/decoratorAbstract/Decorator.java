package JAVA.设计模式._7装饰者模式.decoratorAbstract;

import JAVA.设计模式._7装饰者模式.conponentAbstract.Bird;
/**
 * 抽象的装饰者：抽象类或非抽象类,抽象组件Bird的子类
 * @author Administrator
 */
public abstract class Decorator extends Bird {
	protected Bird bird;  //存放被装饰者

	public Decorator() {}

	public Decorator(Bird bird) {
		this.bird = bird;
	}
	
}