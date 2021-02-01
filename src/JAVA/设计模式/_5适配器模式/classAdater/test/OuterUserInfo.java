package JAVA.设计模式._5适配器模式.classAdater.test;

import java.util.Map;

import JAVA.设计模式._5适配器模式.classAdater.sourceImplements.OuterUser;
import JAVA.设计模式._5适配器模式.classAdater.targetInterface.IUserInfo;
/**
 * 适配器类：类适配器(继承源接口的实现类，再实现目标接口，重写目标接口的方法)
 * @author Administrator
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {
	// 获取系统外部用户类的数据
	private Map<String, String> baseInfo = super.getUserBaseInfo(); // 个人基本信息
	private Map<String, String> homeInfo = super.getUserHomeInfo(); // 个人家庭信息
	private Map<String, String> officeInfo = super.getUserOfficeInfo(); // 个人工作信息

	/**
	 *重写父类各个方法
	 */
	@Override
	public String getUserName() {
		return this.baseInfo.get("userName");
	}

	@Override
	public String getHomeAddress() {
		return this.homeInfo.get("homeAddress");
	}

	@Override
	public String getMobileNumber() {
		return this.baseInfo.get("mobileNumber");
	}

	@Override
	public String getOfficeTelNumber() {
		return this.officeInfo.get("officeTelNumber");
	}

	@Override
	public String getJobPosition() {
		return this.officeInfo .get("jobPosition");
	}

	@Override
	public String getHomeTelNumber() {
		return this.homeInfo .get("homeTelNumbner");
	}

}