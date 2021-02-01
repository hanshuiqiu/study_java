package JAVA.设计模式._3抽象工厂模式.FactoryInterface;

import JAVA.设计模式._3抽象工厂模式.HumanInterface.Human;
/**
 * 人类工厂接口
 * @author Administrator
 */
public interface HumanFactoryInterface {
	// 生产黄色人种
	public Human createYellowHuman();

	// 生产白色人种
	public Human createWhiteHuman();

	// 生产黑色人种
	public Human createBlackHuman();
}
