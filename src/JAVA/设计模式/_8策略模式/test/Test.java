package JAVA.设计模式._8策略模式.test;

import JAVA.设计模式._8策略模式.context.GymnasticsGame;
import JAVA.设计模式._8策略模式.strategyConcrete.StrategyOne;
import JAVA.设计模式._8策略模式.strategyConcrete.StrategyThree;
import JAVA.设计模式._8策略模式.strategyConcrete.StrategyTwo;

public class Test {
	
	public static void main(String[] args) {
		double[] a = { 9.15, 9.26, 8.97, 9.89, 6.97, 7.89 };

		GymnasticsGame game = new GymnasticsGame(); // 上下文对象
		
		game.setStrategy(new StrategyOne());   //策略一
		System.out.println("代数平均值的结果：" + game.getPersonScore(a)+"\n");

		game.setStrategy(new StrategyTwo()); // 策略二
		System.out.println("几何平均值的结果：" + game.getPersonScore(a)+"\n");

		game.setStrategy(new StrategyThree()); // 策略三
		System.out.println("(去掉最高、最低)代数平均值的结果：" + game.getPersonScore(a)+"\n");

	}
	
}
