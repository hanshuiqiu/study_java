package JAVA.设计模式._10组合模式.abstractComponent;

import java.util.*;
/**
 * 军人接口：抽象组件
 * @author Administrator
 */
public interface MilitaryPerson {
	
	//添加节点
	public void add(MilitaryPerson person) throws NoSuchMethodException;

	//删除节点
	public void remove(MilitaryPerson person) throws NoSuchMethodException;

	//获取单个节点
	public MilitaryPerson getChild(int index) throws NoSuchMethodException;

	//获取全部节点
	public Iterator<MilitaryPerson> getAllChildren() throws NoSuchMethodException;

	//是否叶节点
	public boolean isLeaf();
	
	//获取工资
	public double getSalary();

	//设置工资
	public void setSalary(double salary);

	public String toString();
	
}