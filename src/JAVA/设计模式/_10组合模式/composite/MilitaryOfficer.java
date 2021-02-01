package JAVA.设计模式._10组合模式.composite;

import java.util.Iterator;
import java.util.LinkedList;

import JAVA.设计模式._10组合模式.abstractComponent.MilitaryPerson;
/**
 * 军官类：树枝节点
 * @author Administrator
 */
public class MilitaryOfficer implements MilitaryPerson {
	private LinkedList<MilitaryPerson> list;
	private String name;   // 军衔
	private double salary; // 工资

	public MilitaryOfficer(String name, double salary) {
		this.name = name;
		this.salary = salary;
		list = new LinkedList<MilitaryPerson>();
	}

	public void add(MilitaryPerson person) {
		list.add(person);
	}

	public void remove(MilitaryPerson person) {
		list.remove(person);
	}

	public MilitaryPerson getChild(int index) {
		return list.get(index);
	}

	public Iterator<MilitaryPerson> getAllChildren() {
		return list.iterator();
	}

	public boolean isLeaf() {
		return false;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}