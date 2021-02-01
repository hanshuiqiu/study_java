package JAVA.设计模式._5适配器模式.classAdater.targetImplements;

import JAVA.设计模式._5适配器模式.classAdater.targetInterface.IUserInfo;
/**
 * 系统内部的用户类
 * @author Administrator
 */
public class UserInfo implements IUserInfo {

	@Override
	public String getUserName() {
		return "张三";
	}

	@Override
	public String getHomeAddress() {
		return "天河北路888号高科大厦";
	}

	@Override
	public String getMobileNumber() {
		return "1358888888";
	}

	@Override
	public String getOfficeTelNumber() {
		return "020-88888888";
	}

	@Override
	public String getJobPosition() {
		return "Java工程师";
	}

	@Override
	public String getHomeTelNumber() {
		return "020-88889999";
	}
	
	
}
