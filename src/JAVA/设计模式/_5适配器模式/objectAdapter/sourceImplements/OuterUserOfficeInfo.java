package JAVA.设计模式._5适配器模式.objectAdapter.sourceImplements;

import java.util.HashMap;
import java.util.Map;

import JAVA.设计模式._5适配器模式.objectAdapter.sourceInterface.IOuterUserOfficeInfo;

public class OuterUserOfficeInfo implements IOuterUserOfficeInfo{

	@Override
	public Map<String, String> getUserOfficeInfo() {
		HashMap<String,String> officeInfoMap = new HashMap<String,String>();
		officeInfoMap.put("jobPosition", "PHP工程师");
		officeInfoMap.put("officeTelNumber", "020-88888888");
		
		return officeInfoMap;
	}

}
