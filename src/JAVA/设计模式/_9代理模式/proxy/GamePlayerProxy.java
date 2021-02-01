package JAVA.设计模式._9代理模式.proxy;

import JAVA.设计模式._9代理模式.subject.IGamePlayer;
/**
 * 玩家代练者类：代理
 * @author Administrator
 */
public class GamePlayerProxy implements IGamePlayer {
	private IGamePlayer gamePlayer = null;

	public GamePlayerProxy(IGamePlayer _gamePlayer) {
		this.gamePlayer = _gamePlayer;
	}

	// 代理杀怪
	public void killBoss() {
		this.gamePlayer.killBoss();
	}

	// 代理登录
	public void login(String user, String password) {
		this.gamePlayer.login(user, password);
	}

	// 代理升级
	public void upgrade() {
		this.gamePlayer.upgrade();
	}
	
}
