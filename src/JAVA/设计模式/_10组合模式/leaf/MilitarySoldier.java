package JAVA.设计模式._10组合模式.leaf;

import java.util.Iterator;

import JAVA.设计模式._10组合模式.abstractComponent.MilitaryPerson;
/**
 * 士兵类：叶节点
 * @author Administrator
 */
public class MilitarySoldier implements MilitaryPerson {
	private String name;   // 军衔
	private double salary; // 工资

	public MilitarySoldier(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public void add(MilitaryPerson person) {}

	public void remove(MilitaryPerson person) {}

	public MilitaryPerson getChild(int index) {
		return null;
	}

	public Iterator<MilitaryPerson> getAllChildren() {
		return null;
	}

	public boolean isLeaf() {
		return true;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}