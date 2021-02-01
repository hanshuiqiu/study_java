package JAVA.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitTest {
	
	@Before
	public  void befor1() {
		System.out.println("before()");
	}
	@After
	public  void after1() {
		System.out.println("after()");
	}
	
	/**
	 * 如果有多个@Test,运行时每个@Test方法前后都会执行@Before方法 和 @After方法，运行结果跟@Test方法定义顺序无关
	 */
	@Test
	public  void test1() {
		System.out.println("test1()");
	}
	@Test
	public  void test3() {
		System.out.println("test3()");
	}
	@Test
	public  void test2() {
		System.out.println("test2()");
	}
	
}
