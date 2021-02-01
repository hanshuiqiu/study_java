package JAVA.流.ObjectStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) throws Exception {

		// 实现存储Emp的序列化和反序列化
//		testOOS();
//		testOIS();

		// 实现集合的序列化和反序列化
		testWiter();
		testRead();

	}

	public static void testWiter() throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emplist.obj"));
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee("张三", 33, "男", 9000));
		emps.add(new Employee("李四", 26, "男", 5000));
		emps.add(new Employee("王五", 48, "男", 34000));
		oos.writeObject(emps);
		System.out.println("序列化完毕\n");
		oos.close();
	}

	public static void testRead() throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emplist.obj"));
		List<?> emps = (List<?>) ois.readObject();
		System.out.println("反序列化完毕");
		System.out.println(emps);
		ois.close();
	}

	public static void testOOS() throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.obj"));
		oos.writeObject(new Employee("张三", 15, "男", 4000));
		System.out.println("-- 序列化完毕 --");
		oos.close();
	}

	public static void testOIS() throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.obj"));
		System.out.println("\n-- 反序列化完毕 --");
		System.out.println((Employee) ois.readObject()); // 对象的反序列化
		ois.close();
	}

}
