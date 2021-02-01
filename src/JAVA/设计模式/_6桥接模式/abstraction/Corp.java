package JAVA.设计模式._6桥接模式.abstraction;

import JAVA.设计模式._6桥接模式.implementor.Product;
/**
 * 公司抽象类：抽象者，抽象类，关联实现者的引用
 * @author Administrator
 */
public abstract class Corp {
	private Product product;

	// 关联耦合实现者的实现类
	public Corp(Product product) {
		this.product = product;
	}

	// 产品盈利
	public void makeMoney() {
		this.product.beProducted();
		this.product.beSelled();
	}
}
