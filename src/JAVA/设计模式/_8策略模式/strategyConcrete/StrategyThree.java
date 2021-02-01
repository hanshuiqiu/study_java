package JAVA.设计模式._8策略模式.strategyConcrete;

import java.util.Arrays;

import JAVA.设计模式._8策略模式.strategy.ComputableStrategy;
/**
 * 具体策略三类
 * @author Administrator
 */
public class StrategyThree implements ComputableStrategy{
	
	@Override
	public double computeScore(double[] a) {
		//不考虑只有两个元素的数组
		if (a.length <= 2)
			return 0;
		
		double sum = 0;
		Arrays.sort(a); //默认从小到大排序
		for (int i = 1; i < a.length - 1; i++) { //去掉数组最小值和最大值后再求代数平均值
			sum = sum + a[i];
		}
		
		return sum / (a.length - 2);
	}
	
}