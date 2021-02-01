package JAVA.设计模式._6桥接模式.implementorConcrete;

import JAVA.设计模式._6桥接模式.implementor.Product;
/**
 * IPod类：具体实现者
 * @author Administrator
 */
public class IPod extends Product {
	
	// 生产IPod
	public void beProducted() {
		System.out.println("生产IPod");
	}

	// 销售IPod
	public void beSelled() {
		System.out.println("销售IPod");
	}
	
}
