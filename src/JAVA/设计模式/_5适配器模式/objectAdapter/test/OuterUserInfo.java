package JAVA.设计模式._5适配器模式.objectAdapter.test;

import java.util.Map;
import JAVA.设计模式._5适配器模式.classAdater.targetInterface.IUserInfo;
import JAVA.设计模式._5适配器模式.objectAdapter.sourceInterface.IOuterUserBaseInfo;
import JAVA.设计模式._5适配器模式.objectAdapter.sourceInterface.IOuterUserHomeInfo;
import JAVA.设计模式._5适配器模式.objectAdapter.sourceInterface.IOuterUserOfficeInfo;
/**
 * 适配器类：对象适配器(关联(聚合)源接口的实现类，实现目标接口，重写目标接口的方法)
 * @author Administrator
 */
public class OuterUserInfo implements IUserInfo {
	// 源目标对象
	private IOuterUserBaseInfo baseInfo = null; // 个人基本信息
	private IOuterUserHomeInfo homeInfo = null; // 个人家庭信息
	private IOuterUserOfficeInfo officeInfo = null; // 个人工作信息

	// 获取系统外部用户类的数据
	private Map<String, String> baseMap = null;
	private Map<String, String> homeMap = null;
	private Map<String, String> officeMap = null;

	//通过关联关系(聚合关系)耦合
	public OuterUserInfo(IOuterUserBaseInfo _baseInfo,IOuterUserHomeInfo _homeInfo, IOuterUserOfficeInfo _officeInfo) {
		this.baseInfo = _baseInfo;
		this.homeInfo = _homeInfo;
		this.officeInfo = _officeInfo;
		this.baseMap = this.baseInfo.getUserBaseInfo();
		this.homeMap = this.homeInfo.getUserHomeInfo();
		this.officeMap = this.officeInfo.getUserOfficeInfo();
	}

	/**
	 * 重写父类各个方法
	 */
	@Override
	public String getUserName() {
		return this.baseMap.get("userName");
	}

	@Override
	public String getHomeAddress() {
		return this.homeMap.get("homeAddress");
	}

	@Override
	public String getMobileNumber() {
		return this.baseMap.get("mobileNumber");
	}

	@Override
	public String getOfficeTelNumber() {
		return this.officeMap.get("officeTelNumber");
	}

	@Override
	public String getJobPosition() {
		return this.officeMap.get("jobPosition");
	}

	@Override
	public String getHomeTelNumber() {
		return this.homeMap.get("homeTelNumbner");
	}

}