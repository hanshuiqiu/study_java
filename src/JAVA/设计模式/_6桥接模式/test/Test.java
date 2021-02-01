package JAVA.设计模式._6桥接模式.test;

import JAVA.设计模式._6桥接模式.abstraction.Corp;
import JAVA.设计模式._6桥接模式.abstractionRefined.HouseCorp;
import JAVA.设计模式._6桥接模式.abstractionRefined.ShanZhaiCorp;
import JAVA.设计模式._6桥接模式.implementorConcrete.Clothes;
import JAVA.设计模式._6桥接模式.implementorConcrete.House;
import JAVA.设计模式._6桥接模式.implementorConcrete.IPod;

public class Test {

	public static void main(String[] args) {
		
		//山寨公司卖衣服
		Corp shanZhaiCorp = new ShanZhaiCorp(new Clothes());
		shanZhaiCorp.makeMoney();
		
		//山寨公司改为卖IPod
		shanZhaiCorp = new ShanZhaiCorp(new IPod());
		shanZhaiCorp.makeMoney();
		
		//房地产公司卖房子
		Corp houseCorp = new HouseCorp(new House());
		houseCorp.makeMoney();
	}
	
}
