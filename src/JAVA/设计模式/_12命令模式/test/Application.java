package JAVA.设计模式._12命令模式.test;

import JAVA.设计模式._12命令模式.commandConcrete.ConcreteCommand;
import JAVA.设计模式._12命令模式.commandInterface.Command;
import JAVA.设计模式._12命令模式.invoker.ArmySuperior;
import JAVA.设计模式._12命令模式.reciever.CompanyArmy;

public class Application {
	
	public static void main(String args[]) {
		
		CompanyArmy sanLian = new CompanyArmy(); //三连
		Command command = new ConcreteCommand(sanLian);
		
		//指挥官下达命令攻击敌人
		ArmySuperior director = new ArmySuperior(); 
		director.setCommand(command);
		director.direct();
	}
	
}
