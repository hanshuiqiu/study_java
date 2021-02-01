package JAVA.设计模式._4建设者模式.builderImplements;

import java.util.ArrayList;

import JAVA.设计模式._4建设者模式.ProductAbstract.CarModel;
import JAVA.设计模式._4建设者模式.ProductImplements.BMWModel;
import JAVA.设计模式._4建设者模式.builderAbstract.CarBuilder;
/**
 * 宝马建造者类
 * @author Administrator
 */
public class BMWBuilder extends CarBuilder {
	private BMWModel bmw = new BMWModel();

	@Override
	public CarModel getCarModel() {
		return this.bmw;
	}

	@Override
	public void setSteps(ArrayList<String> stepsList) {
		this.bmw.setSteps(stepsList);
	}
	
}
