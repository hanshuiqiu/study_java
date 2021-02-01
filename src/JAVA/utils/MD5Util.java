package JAVA.utils;

import java.security.MessageDigest;

/**
 * MD5工具类
 * @author     韩水球
 * @createDate 2017年6月21日 下午6:32:58
 * @version    v1.0
 */
public class MD5Util {
	public final static String[] hexDigits = { "0", "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };
	
	public static void main(String[] args) {
		
		System.out.println(getMD5("14804862047007"));
		
	}

	public static String getMD5(String inputString) {
		return encodeByMD5(inputString);
	}

	public static boolean compare(String sourceStr, String targetStr) {
		if (sourceStr.equals(encodeByMD5(targetStr))) {
			return true;
		} else {
			return false;
		}
	}

	private static String encodeByMD5(String originString) {
		if (originString != null) {
			try {
				MessageDigest md = MessageDigest.getInstance("MD5");
				byte[] results = md.digest(originString.getBytes("utf-8"));
				String resultString = byteArrayToHexString(results);
				return resultString.toUpperCase();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return null;
	}

	public static String byteArrayToHexString(byte[] b) {
		StringBuffer resultSb = new StringBuffer();
		for (int i = 0; i < b.length; i++) {
			resultSb.append(byteToHexString(b[i]));
		}
		return resultSb.toString();
	}

	public static String byteToHexString(byte b) {
		int n = b;
		if (n < 0)
			n = 256 + n;
		int d1 = n / 16;
		int d2 = n % 16;
		return hexDigits[d1] + hexDigits[d2];
	}

}
