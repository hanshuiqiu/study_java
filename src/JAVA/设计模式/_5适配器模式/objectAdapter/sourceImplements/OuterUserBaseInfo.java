package JAVA.设计模式._5适配器模式.objectAdapter.sourceImplements;

import java.util.HashMap;
import java.util.Map;
import JAVA.设计模式._5适配器模式.objectAdapter.sourceInterface.IOuterUserBaseInfo;

public class OuterUserBaseInfo implements IOuterUserBaseInfo{

	@Override
	public Map<String, String> getUserBaseInfo() {
		HashMap<String,String> baseInfoMap = new HashMap<String,String>();
		baseInfoMap.put("userName", "李四");
		baseInfoMap.put("mobileNumber", "13966666666");
		
		return baseInfoMap;
	}

}
