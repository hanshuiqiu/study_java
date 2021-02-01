package JAVA.设计模式._9代理模式.realSubject;

import JAVA.设计模式._9代理模式.subject.IGamePlayer;
/**
 * 玩家：实际主题
 * @author Administrator
 */
public class GamePlayer implements IGamePlayer {
	private String name = "";

	public GamePlayer(String _name) {
		this.name = _name;
	}

	// 打怪
	public void killBoss() {
		System.out.println(this.name + "正在打怪");
	}

	// 登录youxi
	public void login(String user, String password) {
		System.out.println(this.name + "登录成功");
	}

	// 升级
	public void upgrade() {
		System.out.println(this.name + "成功升级");
	}
}
