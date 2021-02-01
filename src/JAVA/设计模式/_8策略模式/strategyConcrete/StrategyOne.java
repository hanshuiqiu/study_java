package JAVA.设计模式._8策略模式.strategyConcrete;

import JAVA.设计模式._8策略模式.strategy.ComputableStrategy;
/**
 * 具体策略一类
 * @author Administrator
 */
public class StrategyOne implements ComputableStrategy{
	
	@Override
	public double computeScore(double[] a) { //求代数平均值
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum / a.length;
	}
}