package JAVA.utils;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.UUID;

public class Utils {

	public static void main(String[] args) {
		
		
//		System.out.println(getUUID());
		
	}
	
	/**
	 * 获取UUID字符串
	 * @return
	 */
	public static String getUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
	/**
	 * double浮点数的精确运算
	 * @param d1  double型操作数
	 * @param d2  double型被操作数
	 * @param arithmeticFlag  指定哪种运算，如“add”(相加)
	 * @param scale  精确位数
	 * @return 返回精确运算后的double浮点数
	 */
	public static double accurateDealForDouble(double d1,double d2,String arithmeticFlag,int scale){
		arithmeticFlag = arithmeticFlag.trim();
		double result = 0;
		if (arithmeticFlag.equals("add")) { //精确加法
			result = new BigDecimal(Double.toString(d1)).add(new BigDecimal(Double.toString(d2))).doubleValue();
		}else if (arithmeticFlag.equals("sub")) {  //精确减法
			result = new BigDecimal(Double.toString(d1)).subtract(new BigDecimal(Double.toString(d2))).doubleValue();
		}else if (arithmeticFlag.equals("mul")) {  //精确乘法
			result = new BigDecimal(Double.toString(d1)).multiply(new BigDecimal(Double.toString(d2))).doubleValue();
		}else if (arithmeticFlag.equals("div")) {  //精确除法，scale指定精确小数位数，四舍五入
			if (scale < 0) {
				throw new IllegalArgumentException("The scale must be a positive integer or zero");   
			}
			result = new BigDecimal(Double.toString(d1)).divide(new BigDecimal(Double.toString(d2)),scale,BigDecimal.ROUND_HALF_UP).doubleValue();
		}else {
			throw new IllegalArgumentException("\n--- 传递的参数有错误! ---\n");
		}
		return result;
	}
	
}
