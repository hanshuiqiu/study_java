package JAVA.设计模式._12命令模式.invoker;

import JAVA.设计模式._12命令模式.commandInterface.Command;
/**
 * 指挥官：请求者
 * @author Administrator
 */
public class ArmySuperior {
	private Command command; //存放命令的引用

	public void setCommand(Command command) {
		this.command = command;
	}

	//下达命令指挥三连攻击敌人
	public void direct() {
		command.execute();
	}
	
}
