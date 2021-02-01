package JAVA.设计模式._4建设者模式.director;

import java.util.ArrayList;

import JAVA.设计模式._4建设者模式.ProductImplements.BMWModel;
import JAVA.设计模式._4建设者模式.ProductImplements.BenzModel;
import JAVA.设计模式._4建设者模式.builderImplements.BMWBuilder;
import JAVA.设计模式._4建设者模式.builderImplements.BenzBuilder;
/**
 * 指挥者类：指挥建造者生产什么样的车模
 * @author Administrator
 */
public class Director {
	private ArrayList<String> stepsList = new ArrayList<String>(); //存放车模的行驶步骤
	private BenzBuilder benzBuilder = new BenzBuilder();  //奔驰建造者类
	private BMWBuilder bmwBuilder = new BMWBuilder();     //宝马建造者类

	//A类奔驰车：先run，然后stop
	public BenzModel getBenzModelA() {
		this.stepsList.add("start");
		this.stepsList.add("run");
		this.benzBuilder.setSteps(this.stepsList);
		return (BenzModel) this.benzBuilder.getCarModel();
	}

	//B类奔驰车：先发动引擎，然后行驶，然后停止
	public BenzModel getBenzModelB() {
		this.stepsList.clear();  //清除无关数据
		this.stepsList.add("engine boom");
		this.stepsList.add("run");
		this.stepsList.add("stop");
		this.benzBuilder.setSteps(this.stepsList);
		return (BenzModel) this.benzBuilder.getCarModel();
	}

	//C类宝马车：先鸣喇叭，然后行驶，然后停止
	public BMWModel getBMWModelC() {
		this.stepsList.clear();
		this.stepsList.add("alarm");
		this.stepsList.add("run");
		this.stepsList.add("stop");
		this.bmwBuilder.setSteps(this.stepsList);
		return (BMWModel) this.bmwBuilder.getCarModel();
	}

	//D类宝马车：启动
	public BMWModel getBMWModelD() {
		this.stepsList.clear();
		this.stepsList.add("start");
		this.bmwBuilder.setSteps(this.stepsList);
		return (BMWModel) this.bmwBuilder.getCarModel();
	}
	
	//不同组合的行驶功能，则不同的车模

}
