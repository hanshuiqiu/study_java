package JAVA.设计模式._10组合模式.test;

import java.util.Iterator;

import JAVA.设计模式._10组合模式.abstractComponent.MilitaryPerson;
/**
 * 计算工资的工具类
 * @author Administrator
 */
public class ComputerSalary {
	
	public static double computerSalary(MilitaryPerson person) throws NoSuchMethodException {
		double sum = 0;
		
		//遍历士兵的工资
		if (person.isLeaf() == true) {
			sum = sum + person.getSalary();
		}
		
		//遍历包括军官和以下的工资
		if (person.isLeaf() == false) {
			sum = sum + person.getSalary();
			Iterator<MilitaryPerson> iterator = person.getAllChildren();
			while (iterator.hasNext()) {
				MilitaryPerson p = iterator.next();
				sum = sum + computerSalary(p);
			}
		}
		return sum;
	}
}