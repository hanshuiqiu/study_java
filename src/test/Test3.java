package test;

import java.lang.reflect.Constructor;
import java.util.ArrayList;


public class Test3 {
	
	public static void main(String[] args) {
		
		Class c = Test4.class;
		Constructor[] con = c.getDeclaredConstructors();
		
		
		
		
	}


	private static ArrayList<Integer> findIndex(String arr) {
		ArrayList<Integer> indexs = new ArrayList<Integer>();
		for (int i = 0; i < arr.length()-3; i++) {
			if (arr.charAt(i)=='A') {
				if (arr.charAt(i+1)=='B' && arr.charAt(i+2)=='C') {
					indexs.add(i);
				}
			}
		}
		return indexs;
	}
	
	
}

class Test4{
	
	
	
}