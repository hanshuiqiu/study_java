package JAVA.jvm;

/**
 * @author hanshuiqiu
 * @date 2019-01-15
 */
public class Test {

	public static void main(String[] args) {
//		Object static varible
//		Object static block
//		SubObject static varible
//		SubObject static block
//		Object varible
//		Object block
//		Object construction method
//		SubObject varible
//		SubObject block
//		SubObject construction method
		new SubObject(); // 创建一个对象
	}

}

class Object {

	C s1 = new C("Object varible");

	static C s2 = new C("Object static varible");

	public Object() {
		System.out.println("Object construction method");
	}

	{
		System.out.println("Object block");
	}

	static {
		System.out.println("Object static block");
	}

}

class SubObject extends Object {

	C s3 = new C("SubObject varible");

	static C s4 = new C("SubObject static varible");

	public SubObject() {
		System.out.println("SubObject construction method");
	}

	{
		System.out.println("SubObject block");
	}

	static {
		System.out.println("SubObject static block");
	}

}

class C {
	public C(String val) {
		System.out.println(val);
	}
}
