package JAVA.设计模式._6桥接模式.implementorConcrete;

import JAVA.设计模式._6桥接模式.implementor.Product;
/**
 * 衣服类：具体实现者
 * @author Administrator
 */
public class Clothes extends Product {
	
	// 生产衣服
	public void beProducted() {
		System.out.println("生产衣服");
	}

	// 销售衣服
	public void beSelled() {
		System.out.println("销售衣服");
	}
	
}
