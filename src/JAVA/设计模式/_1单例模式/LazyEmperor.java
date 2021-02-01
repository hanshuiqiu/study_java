package JAVA.设计模式._1单例模式;
/**
 * 单例模式定义：某一个类只有一个实例，并提供全局访问点
 * 懒汉式单例模式
 * 皇上类
 * @author Administrator
 */
public class LazyEmperor {
	private static LazyEmperor emperor = null;
			
	//私有化，防止外部类创建
	private LazyEmperor(){}
	
	public static LazyEmperor getInstance(){
		/**
		 * 不考虑线程安全，高并发情况下存在线程同步问题即出现多个对象。
		 * 假如线程A执行到没完成创建对象时，而线程B执行到判断emperor
		 * == null为真时，则结果会创建两个对象。
		 */
		
		//最优的线程同步的策略：双重锁定，当为空才考虑线程同步
		if (emperor == null) {
			synchronized (LazyEmperor.class) {
				if (emperor == null) {
					emperor = new LazyEmperor();
				}
			}
		}
		return emperor;
	}
	
	public void say(){
		System.out.println("我是皇上...");
	}
	
}
