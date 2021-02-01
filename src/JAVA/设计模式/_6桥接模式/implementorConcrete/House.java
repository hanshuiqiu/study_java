package JAVA.设计模式._6桥接模式.implementorConcrete;

import JAVA.设计模式._6桥接模式.implementor.Product;
/**
 * 房子类：具体实现者
 * @author Administrator
 */
public class House extends Product {
	
	// 生产房子
	public void beProducted() {
		System.out.println("生产房子");
	}

	// 销售房子
	public void beSelled() {
		System.out.println("销售房子");
	}
	
}
