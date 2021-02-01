package JAVA.设计模式._5适配器模式.classAdater.sourseInterface;

import java.util.Map;
/**
 * 源接口：系统外部用户的接口
 * @author Administrator
 */
public interface IOuterUser {
	
	// 个人基本信息
	public Map<String,String> getUserBaseInfo();

	// 个人工作信息
	public Map<String,String> getUserOfficeInfo();

	// 个人家庭信息
	public Map<String,String> getUserHomeInfo();
	
}
