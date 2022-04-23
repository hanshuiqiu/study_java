package test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, 
			IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException  {
//		Class<?> c = Class.forName(Test1.class.getName());
//		Object obj = c.newInstance();
//		Method m = c.getMethod("call",int.class);  //Integer.class,编译报错
//		m.invoke(obj, 123);

		
		
		
	}

}

class Test1{
	
	public static void call(int str){
		System.out.println(str);
//		System.out.println("call");
//		System.out.println("call");
//		System.out.println("call");
	}
	
}