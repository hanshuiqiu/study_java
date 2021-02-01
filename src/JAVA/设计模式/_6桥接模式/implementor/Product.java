package JAVA.设计模式._6桥接模式.implementor;

/**
 * 实现者：接口或抽象类
 * @author Administrator
 */
public abstract class Product {
	
	//生产产品
	public abstract void beProducted();

	//销售产品
	public abstract void beSelled();
	
}
