package JAVA.基础语法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 数组 {

	public static void main(String[] args) {

		int arr[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };

		//测试数组
//		testArray(arr);

		//测试Arrays工具类
//		testArrays(arr);
		
		//冒泡排序
//		bubblingSort(arr);
		
		//直接排序
//		selectSort(arr);
		
	    //二分法查找
//		System.out.println(binarySearch(arr, 1));;
		
		//反转排序
		reverseSort(arr);

	}

	public static void testArrays(int[] arr){

		//正序排序
		System.out.println("\n数组排序前："+Arrays.toString(arr));
		Arrays.sort(arr); 
		System.out.println("数组排序后："+Arrays.toString(arr));

		//二分查找
		System.out.println("\n2在数组的索引位置："+Arrays.binarySearch(arr, 2));


	}

	public static void testArray(int[] arr){

		//数组长度
		String[][] data = new String[2][5];
		System.out.println("\n第一维数组长度: " + data.length);
		System.out.println("第二维数组长度: " + data[0].length);

		//数组反转：转化成List后再反转，然后转化成数组
		Integer[] _arr = new Integer[] { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		List<Integer> list = Arrays.asList(_arr);
		System.out.println("\n数组反转前："+list.toString());
		Collections.reverse(list);
		System.out.println("数组反转后："+Arrays.toString(list.toArray()));

		//数组遍历输出
		System.out.println("\n数组遍历输出");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}

		//数组最大值和最小值
		System.out.println("\n\n数组最大值和最小值:");
		System.out.println("最大值:"+ Collections.max(Arrays.asList(_arr)));
		System.out.println("最小值:"+ Collections.min(Arrays.asList(_arr)));
		//		或者
		Arrays.sort(_arr);
		System.out.println("最大值:"+ _arr[_arr.length-1]);
		System.out.println("最小值:"+ _arr[0]);

		//数组合并
		String[] arr1 = new String[]{"I","L","O","V","E"};
		String[] arr2 = new String[]{"Y","O","U"};
		List<String> list1 = new ArrayList<String>(Arrays.asList(arr1));
		list1.addAll(Arrays.asList(arr2));
		System.out.println("\n两个数组合并后："+Arrays.toString(list1.toArray()));

		//数组填充
		int[] array4 = new int[6];
		Arrays.fill(array4, 100);
		System.out.println("\n全部填充后的数组："+Arrays.toString(array4));
		Arrays.fill(array4, 3, 5, 50);  //覆盖
		System.out.println("指定填充3到5的索引位置后的数组："+Arrays.toString(array4));

		//数组扩容
		String[] arr3 = new String[] { "A", "B", "C" };
		String[] arr4 = new String[2 * arr3.length];  //扩容2倍
		System.arraycopy(arr3, 0, arr4, 0, arr3.length);
		System.out.println("\n数组扩容1倍后："+Arrays.toString(arr4));
		//		或者
		System.out.println(Arrays.toString(Arrays.copyOf(arr3, arr3.length*2)));

		//数组比较
		int[] arr5 = { 1, 2, 3 };
		int[] arr6 = { 1, 2, 3 };
		System.out.println("\n两个数组是否相等："+Arrays.equals(arr5, arr6));

	}

	/**
	 * 冒泡排序：比较相邻元素值，若满足比较条件（大于或小于）交换位置，（较大或较小）元素移动到最后面，
	 * 			（较小或较大）元素移动到最前面，类似气泡现象
	 * 由两层循环实现，外层循环控制排序次数，一般为数组长度减1（最后一个元素不需排序），内层循环用于元素
	 * 交换对比,交换次数（即范围）随排序次数增加而减少（如第一轮排序后就不需考虑那个元素）。
	 * @param arr
	 */
	public static void bubblingSort(int[] arr) {
		// 2, 5, -2, 6, -3, 8, 0, -7, -9, 4
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tem = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tem;
				}
			}
			System.out.println(i + " -- " + Arrays.toString(arr));
		}

		// 方法二：排序步骤更少
//		for (int i = 0; i < arr.length; i++) {
//			boolean jiaoHuan = false;
//			for (int j = arr.length - 1; j > i; j--) {
//				if (arr[j] < arr[j - 1]) {
//					int t = arr[j];
//					arr[j] = arr[j - 1];
//					arr[j - 1] = t;
//					jiaoHuan = true;
//				}
//			}
//			System.out.println(Arrays.toString(arr));
//			if (!jiaoHuan) { // 当次循环中没交换则中断整个循环
//				break;
//			}
//		}

	}

	/**
	 * (选择排序)直接排序：将该范围（随排序轮数缩小范围）选出的最大或最小值排到指定排列位置。相对冒泡排序，交换次数少很多，故速度要快
	 * @param arr
	 */
	public static void selectSort(int[] arr) {

		// 方法一：正序排序，从最后面开始
		for (int i = 1; i < arr.length; i++) {
			int index = 0;
			for (int j = 1; j <= arr.length - i; j++) {
				if (arr[j] > arr[index]) {
					index = j;  //标记为临时最大值
				}
			}
			//将该范围最大值排到指定排列位置
			int tem = arr[arr.length - i];
			arr[arr.length - i] = arr[index];
			arr[index] = tem;
		}

		// 方法二：正序排序，从最前面开始（待修改）
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int t = arr[i];
			arr[i] = arr[min];
			arr[min] = t;
			System.out.println(Arrays.toString(arr));
		}

	}

	/**
	 * 二分法查找
	 * @param arr
	 * @param t
	 * @return
	 */
	public static int binarySearch(int[] arr, int t) {
		int lo = 0; 		   // 低位下标
		int hi = arr.length - 1; // 高位下标
		int mid; 			   // 中间下标
		while (lo <= hi) {     // 两个下标不能交叉
			mid = (lo + hi) / 2;
			if (arr[mid] > t) {
				hi = mid - 1;
			} else if (arr[mid] < t) {
				lo = mid + 1;
			} else {
				return mid;
			}
		}
		return -(lo + 1);	 // 找不到，返回一个无意义的值
	}

	/**
	 * 反转排序：最后一个元素和第一个元素交换位置，最后倒数第二个元素和第二个的元素交换位置，以此类推。
	 * @param a
	 * @param t
	 * @return
	 */
	public static void reverseSort(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int tem = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = arr[i];
			arr[i] = tem;
		}
		//[4, -9, -7, 0, 8, -3, 6, -2, 5, 2]
		System.out.println(Arrays.toString(arr));;
	}

}
