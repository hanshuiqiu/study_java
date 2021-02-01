package JAVA.设计模式._6桥接模式.abstractionRefined;

import JAVA.设计模式._6桥接模式.abstraction.Corp;
import JAVA.设计模式._6桥接模式.implementor.Product;
/**
 * 山寨公司类
 * @author Administrator
 */
public class ShanZhaiCorp extends Corp {

	//山寨公司生产不定的产品
	public ShanZhaiCorp(Product product) {
		super(product);
	}

	// 山寨公司产品盈利
	public void makeMoney() {
		super.makeMoney();
		System.out.println("山寨公司盈利\n");
	}
}
