package JAVA.字符串;


public class 正则表达式 {

	public static void main(String[] args) {
		
		System.out.println("123()434".replaceAll("\\(", "").replaceAll("\\)", "")); //正确
//		System.out.println("123()434".replaceAll("(", "").replaceAll(")", ""));  //报错
		
	}
	
	
}
