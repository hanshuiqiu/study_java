package JAVA.设计模式._9代理模式.test;

import JAVA.设计模式._9代理模式.proxy.GamePlayerProxy;
import JAVA.设计模式._9代理模式.realSubject.GamePlayer;
import JAVA.设计模式._9代理模式.subject.IGamePlayer;

public class Test {
	
	public static void main(String[] args) {
		
		IGamePlayer player = new GamePlayer("张三");
		IGamePlayer proxy = new GamePlayerProxy(player); //代练者
		proxy.login("zhangSan", "123456");
		proxy.killBoss();
		proxy.upgrade();
		
	}
	
}
