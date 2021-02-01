package JAVA.设计模式._11模板方法模式.abstractTemplate;
/**
 * 悍马抽象类：抽象模板
 * @author Administrator
 */
public abstract class HummerModel {
	/**
	 * 基本方法,由子类实现
	 */
	
	//启动
	public abstract void start();

	//停车
	public abstract void stop();

	//鸣喇叭
	public abstract void alarm();

	//发动引擎
	public abstract void engineBoom();

	//行驶
	public final void run(){  //一般一个模板方法，final防止被重写
		//调用基本方法
		start();
		engineBoom();
		alarm();
		stop();
	}
	
}