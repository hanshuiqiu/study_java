package JAVA.设计模式._2工厂方法模式.test;

import JAVA.设计模式._2工厂方法模式.AbstractHumanFactory.AbstractHumanFactory;
import JAVA.设计模式._2工厂方法模式.HumanFactoryImplements.HumanFactory;
import JAVA.设计模式._2工厂方法模式.HumanImplements.BlackHuman;
import JAVA.设计模式._2工厂方法模式.HumanImplements.WhiteHuman;
import JAVA.设计模式._2工厂方法模式.HumanImplements.YellowHuman;
import JAVA.设计模式._2工厂方法模式.HumanInterface.Human;

public class Test {
	
	public static void main(String[] args) {
		//阴阳八卦炉
		AbstractHumanFactory f = new HumanFactory();
		
		//白种人
		Human whiteHuman = f.createHuman(WhiteHuman.class);
		whiteHuman.talk();
		
		//黑种人
		Human blackHuman = f.createHuman(BlackHuman.class);
		blackHuman.talk();
		
		//黄种人
		Human yellowHuman = f.createHuman(YellowHuman.class);
		yellowHuman.talk();
	}
	
}
