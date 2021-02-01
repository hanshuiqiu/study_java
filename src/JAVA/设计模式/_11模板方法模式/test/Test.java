package JAVA.设计模式._11模板方法模式.test;

import JAVA.设计模式._11模板方法模式.abstractTemplate.HummerModel;
import JAVA.设计模式._11模板方法模式.concreteTemplate.HummerH1Model;
import JAVA.设计模式._11模板方法模式.concreteTemplate.HummerH2Model;

public class Test {
	
	public static void main(String[] args) {

		//H1型号悍马车
		HummerModel H1Hummer = new HummerH1Model();
		H1Hummer.run();
		
		//H2型号悍马车
		HummerModel H2Hummer = new HummerH2Model();
		H2Hummer.run();
	}
	
}
