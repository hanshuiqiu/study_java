package JAVA.集合;

import java.util.ArrayList;
import java.util.Collection;
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

public class Test2_各类集合 {
	
	public static void main(String[] args) {
		// LinkedList集合：可重复
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("LinkedList0");
		linkedList.add("LinkedList1");
		linkedList.add("LinkedList2");
		display(linkedList);

		//ArrayList集合：可重复
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("ArrayList0");
		arrayList.add("ArrayList1");
		arrayList.add("ArrayList2");
		display(arrayList);
		
		//HashSet集合：不可重复且无序
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("HashSet0");
		hashSet.add("HashSet2");
		hashSet.add("HashSet1");
		display(hashSet);
		
		//TreeSet集合：不可重复且有序
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("TreeSet0");
		treeSet.add("TreeSet2");
		treeSet.add("TreeSet1");
		display(treeSet);
		
		// LinkedHashSet集合
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("LinkedHashSet2");
		linkedHashSet.add("LinkedHashSet1");
		linkedHashSet.add("LinkedHashSet0");
		display(linkedHashSet);
		
		//HashMap集合：键不可重复且无序
		Map<String, String> hashMap = new HashMap<String,String>();
		hashMap.put("0", "HashMap0");
		hashMap.put("2", "HashMap2");
		hashMap.put("1", "HashMap1");
		display(hashMap.keySet());
		display(hashMap.values());
		
		//TreeMap集合：键不可重复且有序
		Map<String, String> treeMap = new TreeMap<String,String>();
		treeMap.put("4", "TreeMap4");
		treeMap.put("6", "TreeMap6");
		treeMap.put("5", "TreeMap5");
		display(treeMap.keySet());
		display(treeMap.values());
		
		//LinkedHashMap：
		Map<String, String> linkedHashMap = new LinkedHashMap<String,String>();
		linkedHashMap.put("2", "LinkedHashMap2");
		linkedHashMap.put("1", "LinkedHashMap1");
		linkedHashMap.put("0", "LinkedHashMap0");
		display(linkedHashMap.keySet());
		display(linkedHashMap.values());
		
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











