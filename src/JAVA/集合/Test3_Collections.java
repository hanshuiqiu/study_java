package JAVA.集合;

import java.lang.Character.Subset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test3_Collections {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("L");
		list.add("O");
		list.add("V");
		list.add("E");
		list.add("O");
		list.add("V");
		List<String> subList = Arrays.asList("O V".split(" "));
		
		System.out.println("list.get(2)："+list.get(2));
		
		
		//子集合在集合首次出现的位置
		System.out.println("子集合首次出现的位置："+Collections.indexOfSubList(list, subList)+"\n");
		
		//子集合在集合末次出现的位置
		System.out.println("子集合末次出现的位置："+Collections.lastIndexOfSubList(list, subList)+"\n");
		
		//替换集合所有指定元素
		Collections.replaceAll(list, "E", "AB"); 
		System.out.println("指定元素被替换后的集合："+ list+"\n");
		
		//二分法查找指定元素(需先自然排序即升序)，如无则返回-(插入点)-1
		Collections.sort(list);
		System.out.println("查找的元素在集合的位置："+Collections.binarySearch(list, "M")+"\n");
		
		//反转
		System.out.println("反转前的集合："+list);
		Collections.reverse(list);
		System.out.println("反转后的集合："+list+"\n");
		
		//排序
		System.out.println("集合排序前："+list);
		Collections.sort(list);
		System.out.println("集合排序后："+list+"\n");
		
		//随机排序
		System.out.println("集合随机排序前："+list);
		Collections.shuffle(list);
		System.out.println("集合第一次随机排序后："+list);
		Collections.shuffle(list);
		System.out.println("集合第二次随机排序后："+list+"\n");
		
		//元素循环移动
		System.out.println("循环移动前的集合"+list);
		Collections.rotate(list, 2);
		System.out.println("循环移动后的集合"+list+"\n");
		
		//复制（覆盖相应索引元素）
		System.out.println("复制前的集合："+list);
		Collections.copy(list, subList);
		System.out.println("复制后的集合："+list+"\n");
		
		//复制？？？
		System.out.println("元素被复制n次后的集合："+Collections.nCopies(3, 5)+"\n");
		
		//交换
		System.out.println("交换元素前的集合："+list);
		Collections.swap(list, 2, 4);
		System.out.println("交换元素后的集合："+list+"\n");
		
		//填充
		System.out.println("填充元素前的集合："+list);
		Collections.fill(list, "fill");
		System.out.println("填充元素后的集合："+list+"\n");
		
		//集合的枚举
		Enumeration<String> e = Collections.enumeration(list);
		//枚举的数组集合,用于转化老代码
//		System.out.println("枚举的数组集合："+Collections.list(e)+"\n");
		while(e.hasMoreElements()){
			System.out.print(e.nextElement()+"  ");
		}
		System.out.println("\n");
		
		
		
		
		
		
		
		
		
		
		
		
		//最大值  ???
		System.out.println("集合的最大元素："+Collections.max(list)+"\n");  //自然排序
//		System.out.println("集合的最大元素："+Collections.max(list));
		
		//最小值  ??
		System.out.println("集合的最小元素："+Collections.min(list)+"\n");   //自然排序
//		System.out.println("集合的最小元素："+Collections.min(list, comp));
		
		
		
		
		
		
		
		
	}

	
	//输出
	private static void display(Collection<String> c) {
		Iterator<String> iter = c.iterator();
		System.out.println();
		while(iter.hasNext()){
			System.out.print(iter.next()+"  ");
		}
	}
	
}











