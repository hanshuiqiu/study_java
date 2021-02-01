package JAVA.字符串;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class 日期时间 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");  // a为am/pm的标记，
																				// 等同以下写法
		// SimpleDateFormat sdf2 = new SimpleDateFormat();
		// sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");

		System.out.println(sdf1.format(new Date())); // 2016-10-20 22:55:03
		System.out.println(sdf2.format(new Date())); // 2016-10-20 22:55:03 下午

		// Calendar
		Calendar c = Calendar.getInstance();
		System.out.println("\n\n当前时间：" + c.getTime());  // 当前时间
		System.out.println("哪日：" + c.get(Calendar.DATE)); // 某日
		System.out.println("哪月：" + (c.get(Calendar.MONTH) + 1)); // 某月，1月以0开始
		System.out.println("哪年：" + c.get(Calendar.YEAR));        // 某年
		System.out.println("一周的第几天：" + c.get(Calendar.DAY_OF_WEEK));   // 当周的第几天，周日以1算起
		System.out.println("一个月的第几天：" + c.get(Calendar.DAY_OF_MONTH));// 当月的第几天
		System.out.println("一年的第几天：" + c.get(Calendar.DAY_OF_YEAR));   // 当年的第几天

	}

}
