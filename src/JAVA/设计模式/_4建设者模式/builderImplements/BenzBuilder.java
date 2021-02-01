package JAVA.设计模式._4建设者模式.builderImplements;

import java.util.ArrayList;

import JAVA.设计模式._4建设者模式.ProductAbstract.CarModel;
import JAVA.设计模式._4建设者模式.ProductImplements.BenzModel;
import JAVA.设计模式._4建设者模式.builderAbstract.CarBuilder;
/**
 * 奔驰建造者类
 * @author Administrator
 */
public class BenzBuilder extends CarBuilder {
	private BenzModel benz = new BenzModel();

	@Override
	public CarModel getCarModel() {
		return this.benz;
	}

	@Override
	public void setSteps(ArrayList<String> stepsList) {
		this.benz.setSteps(stepsList);
	}
	
}
