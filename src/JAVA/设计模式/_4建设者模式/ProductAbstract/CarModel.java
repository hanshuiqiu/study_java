package JAVA.设计模式._4建设者模式.ProductAbstract;

import java.util.ArrayList;

/**
 * 车模的抽象类
 * @author Administrator
 */
public abstract class CarModel {
	// 存放车模的行驶步骤
	private ArrayList<String> stepsList = new ArrayList<String>();

	// 行驶
	protected abstract void run();

	// 停车
	protected abstract void stop();

	// 鸣喇叭
	protected abstract void alarm();

	// 发动引擎
	protected abstract void engineBoom();

	final public void control() {
		for (int i = 0; i < this.stepsList.size(); i++) {
			String step = this.stepsList.get(i);
			
			if (step.equalsIgnoreCase("start")) {
				this.run();
			} else if (step.equalsIgnoreCase("run")) {
				this.stop();
			} else if (step.equalsIgnoreCase("alarm")) {
				this.alarm();
			} else if (step.equalsIgnoreCase("engine boom")) {
				this.engineBoom();
			}
		}
	}

	// 把传递过来的值传递到类内
	final public void setSteps(ArrayList<String> stepsList) {
		this.stepsList = stepsList;
	}
	
}
