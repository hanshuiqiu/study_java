package JAVA.utils;


public class Test {
	
	public static void main(String[] args) {
		int year = 2013;
		String reason = null;
		for (;;) {
			makeElectronic();
			year++;
			if (year == 2015) {
				reason = "changing";
				System.out.println(reason);
				break;
			}
		}
		year++;
		while (year >= 2016) {
			beCodeMan();
			System.out.println("helloword is bitter");
		}
	}

	private static void beCodeMan() {
		// TODO Auto-generated method stub
		
	}

	private static void makeElectronic() {
		// TODO Auto-generated method stub
		
	}
	
}
