package JAVA.设计模式._5适配器模式.objectAdapter.sourceInterface;

import java.util.Map;

/**
 * 个人家庭信息的接口
 * @author Administrator
 */
public interface IOuterUserHomeInfo {
	
	// 个人家庭信息
	public Map<String,String> getUserHomeInfo();
	
}