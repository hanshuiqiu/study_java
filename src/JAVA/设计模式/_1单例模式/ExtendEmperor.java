package JAVA.设计模式._1单例模式;

import java.util.ArrayList;
import java.util.Random;

/**
 * 皇帝类
 * 有上限的多例模式：单例模式的扩展，决定内存的对象数量
 * 注意：两个ArrayList分别存储实例的名字和实例，若考虑
 *      线程安全问题可使用Vector代替
 * @author Administrator
 */
public class ExtendEmperor {
	// 设置创建对象上线个数
	private static int maxCount = 3;
	// 存放皇帝的名字
	private static ArrayList<String> nameList = new ArrayList<String>();
	// 存放皇帝实例
	private static ArrayList<ExtendEmperor> emperorList = new ArrayList<ExtendEmperor>();
	// 当前皇帝的号数
	private static int Num = 0;
	
	//创建若干个对象
	static {
		for (int i = 0; i < maxCount; i++) {
			emperorList.add(new ExtendEmperor("皇帝"+i));
		}
	}

	//私有化
	private ExtendEmperor() {}

	private ExtendEmperor(String name) {
		nameList.add(name);
	}

	public static ExtendEmperor getInstance() {
		Num = new Random().nextInt(maxCount);
		return emperorList.get(Num);
	}

	// 皇帝说话
	public void say() {
		System.out.println("朕是"+nameList.get(Num));
	}
	
}
