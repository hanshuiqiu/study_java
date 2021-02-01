package JAVA.设计模式._7装饰者模式.test;

import JAVA.设计模式._7装饰者模式.conponentAbstract.Bird;
import JAVA.设计模式._7装饰者模式.conponentConcrete.Sparrow;
import JAVA.设计模式._7装饰者模式.decoratorConcrete.SparrowDecoratorOne;
import JAVA.设计模式._7装饰者模式.decoratorConcrete.SparrowDecoratorTwo;

public class Test {

	public static void main(String args[]) {
		
		Bird sparrow = new Sparrow();
		System.out.println("麻雀我能飞"+sparrow.fly()+"米\n");
		
		Bird decorator1 = new SparrowDecoratorOne(sparrow);
		System.out.println("麻雀我能飞"+decorator1.fly()+"米\n");
		
		Bird decorator2 = new SparrowDecoratorOne(decorator1);
		System.out.println("麻雀我能飞"+decorator2.fly()+"米\n");
		
		//多重装饰：装饰者是被装饰者的子类，则也可作为被装饰者
		Bird decorator3 = new SparrowDecoratorTwo(sparrow);
		System.out.println("麻雀我能飞"+decorator3.fly()+"米\n");
		
		Bird decorator4= new SparrowDecoratorOne(decorator3);
		System.out.println("麻雀我能飞"+decorator4.fly()+"米\n");
		
		Bird decorator5= new SparrowDecoratorOne(decorator4);
		System.out.println("麻雀我能飞"+decorator5.fly()+"米\n");
		
		Bird decorator6= new SparrowDecoratorTwo(decorator5);
		System.out.println("麻雀我能飞"+decorator6.fly()+"米\n");
		
	}
	
}
