package JAVA.设计模式._13观察者模式.subject;

import JAVA.设计模式._13观察者模式.observer.Observer;
/**
 * 主题：接口
 * @author Administrator
 */
public interface Subject {

	//添加观察者
	public void addObserver(Observer o);

	//删除观察者
	public void deleteObserver(Observer o);

	//通知观察者
	public void notifyObservers();

}
