package command;

import java.util.Scanner;

import scanner.Scanner_IO;

public class QuitOnCommand implements Command {
	Scanner_IO instance;
	
	public QuitOnCommand(Scanner_IO instance) {
		this.instance = instance;
	}

	@Override
	public void execute() {
		instance.l_Scan();
		System.out.println("종료");
	}

	@Override
	public void undo() {
		//
	}
}
