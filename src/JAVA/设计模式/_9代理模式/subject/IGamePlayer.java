package JAVA.设计模式._9代理模式.subject;
/**
 * 玩家接口：抽象主题
 * @author Administrator
 */
public interface IGamePlayer {
	
	// 登录游戏
	public void login(String user, String password);

	// 杀怪
	public void killBoss();

	// 升级
	public void upgrade();
	
}
