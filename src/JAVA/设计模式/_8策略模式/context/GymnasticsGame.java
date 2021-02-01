package JAVA.设计模式._8策略模式.context;

import JAVA.设计模式._8策略模式.strategy.ComputableStrategy;
/**
 * 体育游戏类：上下文
 * @author hanshuiqiu
 */
public class GymnasticsGame {
	ComputableStrategy strategy;  //包含策略接口引用

	public void setStrategy(ComputableStrategy strategy) {
		this.strategy = strategy;
	}

	//定义一个委托抽象策略变量调用具体策略实现策略接口定义方法的方法
	public double getPersonScore(double[] a) {
		if (strategy != null)
			return strategy.computeScore(a);
		else
			return 0;
	}
}