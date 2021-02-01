package JAVA.设计模式._10组合模式.test;

import JAVA.设计模式._10组合模式.abstractComponent.MilitaryPerson;
import JAVA.设计模式._10组合模式.composite.MilitaryOfficer;
import JAVA.设计模式._10组合模式.leaf.MilitarySoldier;

public class Test{
	
	public static void main(String args[]) throws NoSuchMethodException {
		
		//1个连长带2个排长
		MilitaryPerson lianZhang = new MilitaryOfficer("连长", 5000);
		MilitaryPerson paiZhang1 = new MilitaryOfficer("一排长", 4000);
		MilitaryPerson paiZhang2 = new MilitaryOfficer("二排长", 4000);
		lianZhang.add(paiZhang1);
		lianZhang.add(paiZhang2);
		
		//1个排长带3个班长
		MilitaryPerson banZhang1 = new MilitaryOfficer("一班长", 2000);
		MilitaryPerson banZhang2 = new MilitaryOfficer("二班长", 2000);
		MilitaryPerson banZhang3 = new MilitaryOfficer("三班长", 2000);
		MilitaryPerson banZhang4 = new MilitaryOfficer("四班长", 2000);
		MilitaryPerson banZhang5 = new MilitaryOfficer("五班长", 2000);
		MilitaryPerson banZhang6 = new MilitaryOfficer("六班长", 2000);
		paiZhang1.add(banZhang1);
		paiZhang1.add(banZhang2);
		paiZhang1.add(banZhang3);
		paiZhang2.add(banZhang4);
		paiZhang2.add(banZhang5);
		paiZhang2.add(banZhang6);
		
		//1个班长带10个小兵
		MilitaryPerson[] soldier = new MilitarySoldier[60];
		for (int i = 0; i < soldier.length; i++) {
			soldier[i] = new MilitarySoldier("小兵", 1000);
		}
		for (int i = 0; i <= 9; i++) {
			banZhang1.add(soldier[i]);
			banZhang2.add(soldier[i + 10]);
			banZhang3.add(soldier[i + 20]);
			banZhang4.add(soldier[i + 30]);
			banZhang5.add(soldier[i + 40]);
			banZhang6.add(soldier[i + 50]);
		}
		
		System.out.println("一班的军饷:" + ComputerSalary.computerSalary(banZhang1));
		System.out.println("一排的军饷:" + ComputerSalary.computerSalary(paiZhang1));
		System.out.println("全连的军饷:" + ComputerSalary.computerSalary(lianZhang));
		
	}
	
}
