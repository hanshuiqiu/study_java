package JAVA.设计模式._5适配器模式.objectAdapter.targetInterface;
/**
 * 目标接口：系统内部用户的接口
 * @author Administrator
 */
public interface IUserInfo {
	
	// 获取用户姓名
	public String getUserName();

	// 获取家庭地址
	public String getHomeAddress();

	// 获取手机号码
	public String getMobileNumber();

	// 获取办公电话
	public String getOfficeTelNumber();

	// 获取公司职位
	public String getJobPosition();

	// 获取家庭电话
	public String getHomeTelNumber();
	
}