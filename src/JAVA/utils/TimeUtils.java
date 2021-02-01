package JAVA.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TimeUtils {
	
	public static void main(String[] args) {
		
//		System.out.println(getDefaultLocale());
		
	}
	
	/**
	 * 获取精确到毫秒的当前日期时间
	 * @return
	 */
	public static String getCurrentTimeWithMillisecond(String dateSeparator,String interval, String timeSeparator) {
		if (dateSeparator == null || interval == null || timeSeparator == null ) {
			throw new RuntimeException("指定的时间分隔字符不能为null");
		} 
		dateSeparator = dateSeparator.trim();
		timeSeparator = timeSeparator.trim();
		return new SimpleDateFormat(
				new StringBuilder("yyyy").append(dateSeparator)
				.append("MM").append(dateSeparator)
				.append("dd").append(interval)
				.append("HH").append(timeSeparator)
				.append("mm").append(timeSeparator)
				.append("ss").append(timeSeparator)
				.append("SSS").toString()).format(new Date());
	}
	
	/**
	 * 返回"本地语言环境的语言代码_本地语言环境的国家/地区代码"
	 * @return
	 */
	public static String getDefaultLocale() {
		Locale loc = Locale.getDefault();
		return loc.getLanguage() + "_"+ loc.getCountry();
	}
	
	/**
	 * 获取当前时间的年份
	 * @return
	 */
	public static String getYears() {
		return new SimpleDateFormat("yyyy").format(new Date());
	}
	
	/**
	 *  获取当前时间的年月
	 * @param separator  指定分隔符
	 * @return
	 */
	public static String getYearMonth(String separator) {
		if (separator == null) {
			throw new RuntimeException("指定的时间分隔字符不能为null");
		}
		separator = separator.trim();
		return new SimpleDateFormat(new StringBuilder("yyyy").append(separator).append("MM").toString()).format(new Date());
	}
	
	/**
	 *  获取当前时间的年月日
	 * @param separator  指定分隔符
	 * @return
	 */
	public static String getYearMonthDay(String separator) {
		if (separator == null) {
			throw new RuntimeException("指定的时间分隔字符不能为null");
		}
		separator = separator.trim();
		return new SimpleDateFormat(new StringBuilder("yyyy").append(separator).append("MM").append(separator).append("dd").toString()).format(new Date());
	}
	
	/**
	 * 当前时间上增减若干日
	 * @param days
	 * @return
	 */
	public static String addDays(int days) {
		String time = null;
		try {
			Calendar c = Calendar.getInstance();
			c.add(Calendar.DAY_OF_MONTH, days);
			time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return time;
	}

	/**
	 * 当前时间上增减若干月
	 * @param monthes
	 * @return
	 */
	public static String addMonthes(int monthes) {
		String time = null;
		try {
			Calendar c = Calendar.getInstance();
			c.add(Calendar.MONTH, monthes);
			time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return time;
	}
	
	/**
	 * 当前时间上增减若干年
	 * @param years
	 * @return
	 */
	public static String addYears(int years) {
		String time = null;
		try {
			Calendar c = Calendar.getInstance();
			c.add(Calendar.YEAR, years);
			time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return time;
	}
	

}

