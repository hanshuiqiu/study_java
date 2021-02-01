package JAVA.设计模式._1单例模式;
/**
 * 饿汉式单例模式：推荐使用此方式
 * 皇上类
 * @author Administrator
 */
public class HungryEmperor {
	private static final HungryEmperor emperor = new HungryEmperor();
	
	//私有化，防止外部类创建
	private HungryEmperor(){}
	
	public static HungryEmperor getInstance(){
		return emperor;
	}
	
	public void say(){
		System.out.println("我是皇上...");
	}
	
}
