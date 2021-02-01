package JAVA.基础语法;

public class 值_引用传递 {

	public static void main(String[] args) {
		// 基本类型：值传递，传递的是实际参数的一个副本
		int a = 10;
		changeVal1(a);
		System.out.println(a);

		// 引用传递：本质为值传递，传递的是实际参数的地址的一个副本。main方法和changeVal2方法的sb都指向同一块内存即同一个对象
		StringBuilder sb = new StringBuilder("hello");
		changeVal2(sb);
		System.out.println(sb);
		
		//特殊的引用传递：changeVal3方法运算后，字符串常量池新增一个字符串"hello world"，而该方法的str指向它
		String str = "hello";
		changeVal3(str);
		System.out.println(str);

	}

	public static void changeVal1(int a) {
		a += 10;
	}

	public static void changeVal2(StringBuilder sb) {
		sb.append(" world");
	}

	public static void changeVal3(String str) {
		str += " world";
	}

}
