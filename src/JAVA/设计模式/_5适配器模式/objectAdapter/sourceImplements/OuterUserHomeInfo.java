package JAVA.设计模式._5适配器模式.objectAdapter.sourceImplements;

import java.util.HashMap;
import java.util.Map;

import JAVA.设计模式._5适配器模式.objectAdapter.sourceInterface.IOuterUserHomeInfo;

public class OuterUserHomeInfo implements IOuterUserHomeInfo{

	@Override
	public Map<String, String> getUserHomeInfo() {
		HashMap<String,String> homeInfoMap = new HashMap<String,String>();
		homeInfoMap.put("homeTelNumbner", "020-66666666");
		homeInfoMap.put("homeAddress", "天河北路666号");
		
		return homeInfoMap;
	}

}
