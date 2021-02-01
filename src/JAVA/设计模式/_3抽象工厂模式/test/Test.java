package JAVA.设计模式._3抽象工厂模式.test;

import JAVA.设计模式._3抽象工厂模式.FactoryImplements.FemaleHumanFactory;
import JAVA.设计模式._3抽象工厂模式.FactoryImplements.MaleHumanFactory;
import JAVA.设计模式._3抽象工厂模式.FactoryInterface.HumanFactoryInterface;
import JAVA.设计模式._3抽象工厂模式.HumanInterface.Human;

public class Test {

	public static void main(String[] args) {
		
		//生产女白种人、女黄种人、女黑种人
		HumanFactoryInterface femaleFactory = new FemaleHumanFactory();
		Human whiteFemale = femaleFactory.createWhiteHuman();
		Human yellowFemale = femaleFactory.createYellowHuman();
		Human blackFemale = femaleFactory.createBlackHuman();
		whiteFemale.talk();
		yellowFemale.talk();
		blackFemale.talk();
		
		//生产男白种人、男黄种人、男黑种人
		HumanFactoryInterface maleFactory = new MaleHumanFactory();
		Human whitemale = maleFactory.createWhiteHuman();
		Human yellowmale = maleFactory.createYellowHuman();
		Human blackmale = maleFactory.createBlackHuman();
		whitemale.talk();
		yellowmale.talk();
		blackmale.talk();
	}
	
}
