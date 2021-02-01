package JAVA.设计模式._8策略模式.strategyConcrete;

import JAVA.设计模式._8策略模式.strategy.ComputableStrategy;
/**
 * 具体策略二类
 * @author Administrator
 */
public class StrategyTwo implements ComputableStrategy {
	
	@Override
	public double computeScore(double[] a) {
		double multi = 1;
		for (int i = 0; i < a.length; i++) {
			multi = multi * a[i];
		}
		//求几何平均值
		return Math.pow(multi, 1.0 / a.length);//multi的(1.0 / a.length)次幂
	}
	
}