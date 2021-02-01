package JAVA.设计模式._4建设者模式.builderAbstract;

import java.util.ArrayList;

import JAVA.设计模式._4建设者模式.ProductAbstract.CarModel;
/**
 * 建造者抽象类
 * @author Administrator
 */
public abstract class CarBuilder {
	
	//设置创建车模的不同驾驶顺序
	public abstract void setSteps(ArrayList<String> stepsList);

	// 返回创建好的车模
	public abstract CarModel getCarModel();
	
}
