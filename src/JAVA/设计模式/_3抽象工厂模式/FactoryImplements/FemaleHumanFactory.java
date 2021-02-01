package JAVA.设计模式._3抽象工厂模式.FactoryImplements;

import JAVA.设计模式._3抽象工厂模式.FactoryInterface.HumanFactoryInterface;
import JAVA.设计模式._3抽象工厂模式.HumanImplements.FemaleBlackHuman;
import JAVA.设计模式._3抽象工厂模式.HumanImplements.FemaleWhiteHuman;
import JAVA.设计模式._3抽象工厂模式.HumanImplements.FemaleYellowHuman;
import JAVA.设计模式._3抽象工厂模式.HumanInterface.Human;
/**
 * 女性人类工厂类
 * @author Administrator
 */
public class FemaleHumanFactory implements HumanFactoryInterface{
	
	// 生产女性黑种人
	@Override
	public Human createBlackHuman() {
		return new FemaleBlackHuman();
	}

	// 生产女性白种人
	@Override
	public Human createWhiteHuman() {
		return new FemaleWhiteHuman();
	}

	// 生产女性黄种人
	@Override
	public Human createYellowHuman() {
		return new FemaleYellowHuman();
	}

}
