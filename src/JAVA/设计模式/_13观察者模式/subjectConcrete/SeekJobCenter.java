package JAVA.设计模式._13观察者模式.subjectConcrete;

import java.util.ArrayList;

import JAVA.设计模式._13观察者模式.observer.Observer;
import JAVA.设计模式._13观察者模式.subject.Subject;
/**
 * 招聘中心
 * @author Administrator
 */
public class SeekJobCenter implements Subject {
	private String mess;      //招聘信息
	private boolean changed;  //标记招聘信息是否更新
	private ArrayList<Observer> observerList;

	public SeekJobCenter() {
		observerList = new ArrayList<Observer>();
		mess = "";
		changed = false;
	}

	@Override
	public void addObserver(Observer o) {
		if (!observerList.contains(o)){
			observerList.add(o);
		}
	}

	@Override
	public void deleteObserver(Observer o) {
		if (observerList.contains(o)){
			observerList.remove(o);
		}
	}

	@Override
	public void notifyObservers() {
		//内容有更新则通知找工作的人
		if (changed) {
			for (int i = 0; i < observerList.size(); i++) {
				Observer observer = observerList.get(i);
				observer.hearTelephone(mess);
			}
			changed = false;
		}
	}

	public void giveNewMess(String str) {
		//判断招聘信息是否有更新
		if (str.equals(mess))
			changed = false;
		else {
			mess = str;
			changed = true;
		}
	}

}
