package JAVA.设计模式._12命令模式.commandConcrete;

import JAVA.设计模式._12命令模式.commandInterface.Command;
import JAVA.设计模式._12命令模式.reciever.CompanyArmy;
/**
 * 具体命令
 * @author Administrator
 */
public class ConcreteCommand implements Command {
	CompanyArmy army;  //存放接收者的引用

	public ConcreteCommand(CompanyArmy army) {
		this.army = army;
	}

	public void execute() { 
		army.attack(); 
	}
}
