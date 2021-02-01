package JAVA.设计模式._3抽象工厂模式.FactoryImplements;

import JAVA.设计模式._3抽象工厂模式.FactoryInterface.HumanFactoryInterface;
import JAVA.设计模式._3抽象工厂模式.HumanImplements.MaleBlackHuman;
import JAVA.设计模式._3抽象工厂模式.HumanImplements.MaleWhiteHuman;
import JAVA.设计模式._3抽象工厂模式.HumanImplements.MaleYellowHuman;
import JAVA.设计模式._3抽象工厂模式.HumanInterface.Human;
/**
 * 男性人类工厂类
 * @author Administrator
 */
public class MaleHumanFactory implements HumanFactoryInterface{
	
	// 生产男性黑种人
	@Override
	public Human createBlackHuman() {
		return new MaleBlackHuman();
	}

	// 生产男性白种人
	@Override
	public Human createWhiteHuman() {
		return new MaleWhiteHuman();
	}

	// 生产男性黄种人
	@Override
	public Human createYellowHuman() {
		return new MaleYellowHuman();
	}

}
