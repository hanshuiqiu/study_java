package JAVA.算法;

/**
 * 递归：通常都是从上而下的思维问题，而递归趋势从下往上的进行思维。
 * 栈主要存放栈帧,每一次方法调用均产生一个栈帧，压入到方法栈，所以递归产生栈帧比较多时，非常消耗内存
 * 递归算法代码显得很简洁，但递归算法解题的运行效率较低。所以不提倡用递归设计程序。
 * 在做递归算法的时候，一定把握出口，也就是做递归算法必须要有一个明确的递归结束条件。
 * 当满足这个条件时则不再递归，否则造成死循环。
 * 
* @author     韩水球
* @createDate 2017年9月4日 下午2:40:20
* @version    v1.0
 */
public class _1递归 {
	
	public static void main(String[] args) {
		
		//99乘法表
//		test_1(9);
		
		//n的阶乘
//		System.out.println(test_2(5));
		
		//求第n个斐波那契数
//		System.out.println(test_3(45)); 
		
		//十进制数转换成二进制数
//		decimalToBinary(7);
		
		//求 1+2+...+n 的和
//		System.out.println(sum(100));
		
		//
		
		
	}

	/**
	 * 99乘法表
	 */
	public static void test_1(int i) {
		
		//传统写法：
//		for (int k = 1; k <= 9; k++) {
//			for (int j = 1; j <= k; j++) {
//				System.out.print(j + " * " + k + " = " + (k * j) + " ");
//			}
//		}
		
		//使用递归实现
		if (i == 1) {
			System.out.println("1*1=1 ");
		} else {
			test_1(i - 1); //递归回调
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + j * i + "  ");
			}
			System.out.println();
		}
	}
	
	/**
	 * 求n的阶乘，如 1 * 2 * 3  * 4... * (n-2) * (n-1) * n
	 * @param n
	 * @return
	 */
	public static long test_2(int n) {
		if (n == 0)
			return 1;
		return n * test_2(n - 1);
	}
	
	/**
	 * 求第n个斐波那契数(1、1、2、3、5、8、13、21、34、...)
	 * @param n
	 * @return
	 */
	private static long test_3(int n) {
		
		//不使用递归，效率很高
		int a = 1;
		int b = 1;
		for (int i = 3; i <= n; i++) {
			b = a + b;
			a = b - a;
		}
		return b;
		
		//使用递归求斐波那契数，效率很低
//		if (n <= 2)
//			return 1;
//		return test_3(n - 1) + test_3(n - 2);
	}
	
	/**
	 * 十进制数转换成二进制数
	 * @param num
	 */
	public static void decimalToBinary(int num) {
		if (num == 0) { // 当num=0时，循环结束
			return;
		} else {
			decimalToBinary(num / 2); // 调用递归方法
			System.out.print(num % 2);
		}
	}
	
	/**
	 * 求 1+2+...+n 的和
	 * @param num
	 * @return
	 */
	public static int sum(int num) {
		if (num <= 0) {
			return 0; // 当num=0时，循环结束
		} else {
			return num + sum(num - 1); // 调用递归方法
		}
	}
	
	/**
	 * 求
	 * @param num
	 * @return
	 */
	public static int delete(int num) {
		if (num <= 0) {
			return 0; // 当num=0时，循环结束
		} else {
			return num + sum(num - 1); // 调用递归方法
		}
	}
	
	
}
