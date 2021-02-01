package JAVA.设计模式._5适配器模式.classAdater.test;

public class Test {

	public static void main(String[] args) {
		
		OuterUserInfo oui = new OuterUserInfo();
		
		System.out.println("userName -- "+oui.getUserName()+"\n");
		System.out.println("mobileNumber -- "+oui.getMobileNumber()+"\n");
		
		System.out.println("homeAddress -- "+oui.getHomeAddress()+"\n");
		System.out.println("homeTelNumbner -- "+oui.getHomeTelNumber()+"\n");
		
		System.out.println("jobPosition -- "+oui.getJobPosition()+"\n");
		System.out.println("officeTelNumber -- "+oui.getOfficeTelNumber()+"\n");
		
	}
	
}
