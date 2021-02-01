package JAVA.设计模式._7装饰者模式.conponentConcrete;

import JAVA.设计模式._7装饰者模式.conponentAbstract.Bird;
/**
 * 具体组件：麻雀类
 * @author Administrator
 */
public class Sparrow extends Bird {

	@Override
	public int fly() {
		return 100;
	}

}

