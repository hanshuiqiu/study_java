package JAVA.类与对象;
/**
 * 外部类
 * @author hanshuiqiu
 */
public class 内部类 {
	innerClass inner = new innerClass();  //外部类内创建内部类对象
	private int a = 1;
	
	private void outerf2(){}
	
	//成员内部类
	class innerClass{
		int y = 0;
		
		public void innerf1(){
			System.out.println("innerf()");
		}
		
		public void innerf2(){
			//内部类内可以直接访问外部类的成员
			a++;
			outerf2();
		}
	}
	
	public void outerf(){
		inner.innerf1();  //外部类方法中调用内部类方法
	}
	
	public innerClass makeInnerObject(){
		//内部类内可以直接访问外部类的成员，内部类成员对外部类不可被调用，
		//只有创建内部类对象才可调用其成员
//		innerf();
//		y = 1;  //不可直接调用内部类的成员
		inner.y = 1;
		return new innerClass();
	}
	
	//此处主方法是OuterClass的静态方法
	public static void main(String[] args) {
		内部类 outer = new 内部类();
		//内部类对象的创建必须在外部类或外部类非静态方法中实现
		内部类.innerClass inner1 = outer.makeInnerObject();
		//内部类对象的创建若在外部类或外部类非静态方法之外实现则需要外部类对象
		内部类.innerClass inner2 = outer.new innerClass();
		
	}
	
}
