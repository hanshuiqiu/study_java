package JAVA.设计模式._5适配器模式.classAdater.sourceImplements;

import java.util.HashMap;
import java.util.Map;

import JAVA.设计模式._5适配器模式.classAdater.sourseInterface.IOuterUser;
/**
 * 系统外部用户类
 * @author Administrator
 */
public class OuterUser implements IOuterUser{

	@Override
	public Map<String,String> getUserBaseInfo() {
		HashMap<String,String> baseInfoMap = new HashMap<String,String>();
		baseInfoMap.put("userName", "李四");
		baseInfoMap.put("mobileNumber", "13966666666");
		return baseInfoMap;
	}

	@Override
	public Map<String,String> getUserOfficeInfo() {
		HashMap<String,String> officeInfoMap = new HashMap<String,String>();
		officeInfoMap.put("jobPosition", "PHP工程师");
		officeInfoMap.put("officeTelNumber", "020-88888888");
		return officeInfoMap;
	}

	@Override
	public Map<String,String> getUserHomeInfo() {
		HashMap<String,String> homeInfoMap = new HashMap<String,String>();
		homeInfoMap.put("homeTelNumbner", "020-66666666");
		homeInfoMap.put("homeAddress", "天河北路666号");
		return homeInfoMap;
	}

}
