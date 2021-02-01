package JAVA.字符串;

import java.util.Arrays;

public class 字符串 {
	
	public static void main(String[] args) {
		
		//compareTo，按字典顺序比较ASCII值，之前:负数   相等:0  之后:正数  
		System.out.println("\n"+"ab".compareTo("ac"));  
		
		//compareToIgnoreCase
		System.out.println("\n"+"ab".compareToIgnoreCase("aC"));  // 忽略大小写
		
		//substring
		System.out.println("\n"+"hello world".substring(6));

		//indexOf
		System.out.println("\n"+"hello world".indexOf("e"));
		
		//replace
		String str = "头【】()（）&©尾"
				.replace("(", "").replace(")", "")
				.replace("（", "").replace("）", "")
				.replace("【", "").replace("】", "")
				.replace("&", "").replace("©", "");
		System.out.println("\n‘头【】()（）&©尾’替换后："+str);
		
		//replaceAll
		str = "头【】()（）&©尾"
				.replaceAll("\\(", "").replaceAll("\\)", "")
				.replaceAll("\\（", "").replaceAll("\\）", "")
				.replaceAll("\\【", "").replaceAll("\\】", "")
				.replaceAll("\\&", "").replaceAll("\\©", "");
		System.out.println("\n‘头【】()（）&©尾’ 替换后："+str);
		
		//replaceFirst
		System.out.println("\n‘hello’替换开头字符串he后："+"hello".replaceFirst("he", "aa"));

		//split，字符串切割
		System.out.print("\n"+Arrays.toString("www-runoob-com".split("\\-")));
		
		//toUpperCase
		System.out.println("\nabc转成大写："+"abc".toUpperCase());
		
		//toLowerCase
		System.out.println("\nABC转成大写："+"ABC".toLowerCase());
		
		//字符串子串比较
		System.out.println("\n字符串区分大小写子串比较："+"aBcdef".regionMatches(1, "abcdefg", 1, 5));
		System.out.println("\n字符串不区分大小写子串比较："+"aBcdef".regionMatches(true,1, "abcdefg", 1, 5));  //true表示不区分大小写
		
		
		//字符串反转
		System.out.println("\nabcde反转后："+new StringBuilder("abcde").reverse().toString()+"\n");
		
		//字符串连接性能比较
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			str = "ab" + i;
		}
		System.out.println("使用+操作符连接字符串："+ (System.currentTimeMillis() - startTime) + " ms");

		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			str = new StringBuffer("ab").append("cd").append("ef").toString();
		}
		System.out.println("使用StringBuffer连接字符串"+ (System.currentTimeMillis() - startTime) + " ms");
		
		
	}
	
}
