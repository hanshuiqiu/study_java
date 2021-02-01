package JAVA.设计模式._6桥接模式.abstractionRefined;

import JAVA.设计模式._6桥接模式.abstraction.Corp;
import JAVA.设计模式._6桥接模式.implementorConcrete.House;
/**
 * 房地产公司类
 * @author Administrator
 */
public class HouseCorp extends Corp {
	
	//房地产公司只涉及房子业务
	public HouseCorp(House house) {
		super(house);
	}

	// 房子盈利
	public void makeMoney() {
		super.makeMoney();
		System.out.println("房地产公司盈利\n");
	}
}
