package JAVA.设计模式._5适配器模式.objectAdapter.sourceInterface;

import java.util.Map;

/**
 * 个人基本信息的接口
 * @author Administrator
 */
public interface IOuterUserBaseInfo {
	
	// 个人基本信息
	public Map<String,String> getUserBaseInfo();
	
}