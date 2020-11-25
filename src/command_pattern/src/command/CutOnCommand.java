package command;

import java.util.Scanner;

import scanner.Scanner_IO;

public class CutOnCommand implements Command {
	Scanner_IO instance;
	int x, input;
	char save;
	String str;
	
	public CutOnCommand(Scanner_IO instance, int input) {
		this.instance = instance;
		this.input = input;
	}

	@Override
	public void execute() {
		System.out.println("Please specify index where the cut must start: ");
		x = Integer.parseInt(instance.n_Scan());
		System.out.println("You Chose " + x);
		
		save = instance.cut_Char(input, x);
	}

	@Override
	public void undo() {
		instance.insert_Char(input, x, save);
	}
}
