package JAVA.设计模式._5适配器模式.objectAdapter.test;

import JAVA.设计模式._5适配器模式.objectAdapter.sourceImplements.OuterUserBaseInfo;
import JAVA.设计模式._5适配器模式.objectAdapter.sourceImplements.OuterUserHomeInfo;
import JAVA.设计模式._5适配器模式.objectAdapter.sourceImplements.OuterUserOfficeInfo;
import JAVA.设计模式._5适配器模式.objectAdapter.sourceInterface.IOuterUserBaseInfo;
import JAVA.设计模式._5适配器模式.objectAdapter.sourceInterface.IOuterUserHomeInfo;
import JAVA.设计模式._5适配器模式.objectAdapter.sourceInterface.IOuterUserOfficeInfo;

public class Test {

	public static void main(String[] args) {
		
		//系统外部用户的相关信息
		IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
		IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
		IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();
		
		//对象适配器：通过关联关系耦合
		OuterUserInfo oui = new OuterUserInfo(baseInfo,homeInfo,officeInfo);
		
		System.out.println("userName -- "+oui.getUserName()+"\n");
		System.out.println("mobileNumber -- "+oui.getMobileNumber()+"\n");
		
		System.out.println("homeAddress -- "+oui.getHomeAddress()+"\n");
		System.out.println("homeTelNumbner -- "+oui.getHomeTelNumber()+"\n");
		
		System.out.println("jobPosition -- "+oui.getJobPosition()+"\n");
		System.out.println("officeTelNumber -- "+oui.getOfficeTelNumber()+"\n");
		
	}
	
}
