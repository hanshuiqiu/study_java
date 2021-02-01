package JAVA.设计模式._1单例模式;
/**
 * 单例模式定义：保证一个类只有一个实例，并提供一个访问它的全局访问点
 * 臣子类
 * @author Administrator
 */
public class Test {
	
	public static void main(String[] args) {
		
		//测试饿汉式单例模式
//		for (int i = 0; i < 3; i++) {
//			HungryEmperor emperor = HungryEmperor.getInstance();
//			emperor.say();
//		}
		
		//测试懒汉式单例模式
//		for (int i = 0; i < 3; i++) {
//			LazyEmperor emperor = LazyEmperor.getInstance();
//			emperor.say();
//		}

		//测试有上限的多例模式
		ExtendEmperor emperor = ExtendEmperor.getInstance();
		emperor.say();
		
	}
	
}
