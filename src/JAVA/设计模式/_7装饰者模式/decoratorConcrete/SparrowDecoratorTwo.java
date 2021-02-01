package JAVA.设计模式._7装饰者模式.decoratorConcrete;

import JAVA.设计模式._7装饰者模式.conponentAbstract.Bird;
import JAVA.设计模式._7装饰者模式.decoratorAbstract.Decorator;
/**
 * 具体装饰者：麻雀装饰者SparrowDecoratorTwo
 * @author Administrator
 */
public class SparrowDecoratorTwo extends Decorator {

	public SparrowDecoratorTwo(Bird bird) {
		super(bird);
	}

	// 重写父类方法
	@Override
	public int fly() {
		// 委托被装饰者bird调用fly()，然后再调用eleFly()
		return super.bird.fly() + eleFly();
	}

	// private,设置客户通过fly()才能调用eleFly()
	private int eleFly() { // 装饰者新添加的方法
		return 20;
	}
}