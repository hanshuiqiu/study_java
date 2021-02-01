package JAVA.设计模式._13观察者模式.test;

import JAVA.设计模式._13观察者模式.observerConcrete.HaiGui;
import JAVA.设计模式._13观察者模式.observerConcrete.UniverStudent;
import JAVA.设计模式._13观察者模式.subjectConcrete.SeekJobCenter;

public class Test{
	
	public static void main(String args[]) {

		SeekJobCenter center = new SeekJobCenter();
		//有参构造函数里添加具体观察者到具体主题的集合
		UniverStudent zhangLin = new UniverStudent(center, "A.txt"); 
		HaiGui wangHao = new HaiGui(center, "B.txt");
		
		center.giveNewMess("腾辉公司需要10个java程序员。");
		center.notifyObservers();
		
		center.giveNewMess("海景公司需要8个动画设计师。");
		center.notifyObservers();
		
		center.giveNewMess("仁海公司需要9个电工。");
		center.notifyObservers();
		
		center.giveNewMess("仁海公司需要9个电工。");
		center.notifyObservers();
	}
}
