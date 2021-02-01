package JAVA.集合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test1 {
	
	public static void main(String[] args) {

		
		//************************ 数组转List集合 ****************************
//		String[] str1 = new String[5];
//		for (int i = 0; i < str1.length; i++) {
//			str1[i] = String.valueOf(i);
//		}
//		List<String> list = Arrays.asList(str1);
		
		//************************ 集合比较 ****************************
//		String[] str2 = { "Penny", "nickel", "dime","Quarter", "dollar" };
//		Set set = new TreeSet<String>();
//		for (int i = 0; i < str2.length; i++) {
//			set.add(str2[i]);
//		}
//		System.out.println(Collections.min(set));
//		System.out.println(Collections.min(set, String.CASE_INSENSITIVE_ORDER));
//		System.out.println(Collections.max(set));
//		System.out.println(Collections.max(set, String.CASE_INSENSITIVE_ORDER));
		
		
		//************************ Map遍历 ****************************
//		Map<String,String> map = new HashMap<String,String>();
//		map.put("1", "星期一");
//		map.put("2", "星期二");
//		map.put("3", "星期三");
		//只遍历value列的值
//		Collection c = map.values();
//		Iterator iter1 = c.iterator();
//		while(iter1.hasNext()){
//			System.out.println(iter1.next());
//		}
		//只遍历key列的值
//		Set set = map.keySet();
//		Iterator iter2 = set.iterator();
//		while(iter2.hasNext()){
//			System.out.println(iter2.next());
//		}
		//用keySet的迭代器遍历map键值对
//		Set<String> set = map.keySet();
//		Iterator<String> iter2 = set.iterator();
//		while (iter2.hasNext()) {
//			String key = iter2.next();
//			System.out.println(key + " : " + map.get(key));
//		}
		//用keySet的for增强型循环遍历map键值对
//		Set<String> set = map.keySet();
//		for(String key : set){
//			System.out.println(key+" : "+map.get(key));
//		}
		//用entrySet的迭代器遍历map键值对
//		Set<Entry<String, String>> entrySet = map.entrySet();
//		Iterator<Entry<String, String>> iter3 = entrySet.iterator();
//		Entry<String, String> entry = null;
//		while(iter3.hasNext()){
//			entry = iter3.next();
//			System.out.println(entry.getKey()+" : "+entry.getValue());
//		}
		//用entrySet的for增强型循环遍历map键值对
//		Set<Entry<String, String>> entrySet = map.entrySet();
//		for(Entry<String, String> e : entrySet){
//			System.out.println(e.getKey()+" : "+e.getValue());
//		}
		
		
		//************************ Set遍历 ****************************
//		Set<String> set1 = new HashSet<String>();
//		set1.add("banana");
//		set1.add("apple");
//		set1.add("pear");
//		set1.add("banana");  //插入重复数据失败
//		Iterator iter3 = set1.iterator();
//		//迭代器遍历
//		while (iter3.hasNext()) {
//			System.out.println(iter3.next());
//		}
//		//增强型for循环遍历， 无get()方法，不能用传统for循环
//		for (String s : set1) {
//			System.out.println(s);
//		}
//		//集合长度
//		if (set1.isEmpty()) {
//			System.out.println("集合set1的长度为0");
//		}else {
//			System.out.println("集合set1的长度："+set1.size());
//		}
		
		
		//************************ List遍历 ****************************
//		List<String> list = new ArrayList<String>();
//		list.add("banana");
//		list.add("apple");
//		list.add("pear");
//		//迭代器遍历
//		Iterator<String> iter = list.iterator();
//		while(iter.hasNext()){
//			System.out.println(iter.next());
//		}
//		//for循环遍历
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		//增强型for循环遍历
//		for(String s : list){
//			System.out.println(s);
//		}
		
		
		//************************ 打乱ArrayList集合顺序 ****************************
//		List<Integer> list = new ArrayList<Integer>();
//		for (int i = 1; i <= 5; i++) {
//			list.add(i);
//		}
//		System.out.println("集合被打乱前："+list);
//		for (int i = 0; i < list.size(); i++) {
//			Collections.shuffle(list);
//			System.out.println("集合第"+i+"打乱："+list);
//		}
		
		
		//************************ List反转 ****************************
//		List<String> list  = new ArrayList<String>();
//		list.add("A");
//		list.add("B");
//		list.add("C");
//		System.out.print("List反转前：");
//		ListIterator<String> iter = list.listIterator();
//		while(iter.hasNext()){
//			System.out.print(iter.next()+"\t");
//		}
//		System.out.print("\nList反转后：");
//		Collections.reverse(list);
//		iter = list.listIterator();
//		while(iter.hasNext()){
//			System.out.print(iter.next()+"\t");
//		}
//		//删除指定元素
//		System.out.print("\nList删除元素后：");
//		//list.remove("A");
//		list.remove(0);
//		iter = list.listIterator();
//		while(iter.hasNext()){
//			System.out.print(iter.next()+"\t");
//		}
		
		
		//************************ 只读模式的集合不可修改 ****************************
//		List<String> stuffList = Arrays.asList(new String[]{"A","B","C"});
//		List<String> list = new ArrayList<String>(stuffList);
//		list = Collections.unmodifiableList(list);
//		try {
//			list.set(1, "D");
//		} catch (UnsupportedOperationException e) {
//			System.out.println("被设置只读模式的集合不可修改");
//		}
//		//
//		Set<String> set = new HashSet<String>(stuffList);
//		set = Collections.unmodifiableSet(set);
//		//
//		Map<String, String> map = new HashMap<String,String>();
//		map.put("1", "A");
//		map.put("2", "B");
//		map = Collections.unmodifiableMap(map);
		
		
		//************************  TreeMap集合输出****************************
//		TreeMap<Integer,String> tMap = new TreeMap<Integer,String>();
//		tMap.put(1, "Sunday");
//		tMap.put(3, "Monday");
//		tMap.put(2, "Tuesday");
//		tMap.put(4, "Wednesday");
//		tMap.put(5, "Thursday");
//		tMap.put(6, "Friday");
//		tMap.put(7, "Saturday");
//		System.out.println("TreeMap的key列的值："+tMap.keySet());
//		System.out.println("TreeMap的value列的值："+tMap.values());
//		System.out.println("TreeMap的第一个键值对："+tMap.firstKey()+" : "+tMap.get(tMap.firstKey()));
//		System.out.println("TreeMap的第二个键值对："+"2 : "+tMap.get(2));
//		//
//		tMap.remove(tMap.firstKey());
//		System.out.println("TreeMap的key列的值："+tMap.keySet());
//		System.out.println("TreeMap的value列的值："+tMap.values());
//		//
//		tMap.remove(5);
//		System.out.println("TreeMap的key列的值："+tMap.keySet());
//		System.out.println("TreeMap的value列的值："+tMap.values());
		
		
		//************************ 集合转数组****************************
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		Integer[] s1 = list.toArray(new Integer[0]);  //数组元素类型与集合元素的一致
//		for (int i = 0; i < s1.length; i++) {
//			System.out.print(s1[i]+"\t");
//		}
		
			
		//************************ Collections的常用方法****************************
		List<String> list = Arrays.asList("One,Two,Three,Four,Five".split(","));
		
		//集合元素循环向后移动n位
//		System.out.println("集合元素循环前："+list);
//		System.out.println("集合元素循环后："+Collections.rotate(list, 1));
		
		//集合的最大和最小元素
//		System.out.println("集合的最大元素："+ Collections.max(list));
//		System.out.println("集合的最小元素："+Collections.min(list));

		
		//************************ HashTable ****************************
//		Hashtable<String, String> hashTable = new Hashtable<String,String>();
//		hashTable.put("1", "apple");
//		hashTable.put("2", "orange");
//		hashTable.put("3", "pear");
//		//遍历HashTable的键值
//		Enumeration<String> e = hashTable.keys();
//		while(e.hasMoreElements()){
//			System.out.print(e.nextElement()+"\t");
//		}
//		//遍历HashTable的键的值
//		e = hashTable.elements();
//		while (e.hasMoreElements()) {
//			System.out.print(e.nextElement() + "  ");
//		}
	}
	
}











