package JAVA.字符串;

import java.text.DecimalFormat;

public class 数字格式化 {
	
	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("###,###.##");    
		System.out.println(df.format(Double.parseDouble("2.1262")));;  //浮点数的千分位会四舍五入

	}
	
}
