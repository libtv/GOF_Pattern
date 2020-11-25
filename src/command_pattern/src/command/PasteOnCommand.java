package command;

import java.util.Scanner;

import scanner.Scanner_IO;

public class PasteOnCommand implements Command {
	Scanner_IO instance;
	int x, input;
	String str;
	
	public PasteOnCommand(Scanner_IO instance, int input) {
		this.instance = instance;
		this.input = input;
	}

	@Override
	public void execute() {
		System.out.println("Please specify index where the paste must start[MAX256] : ");
		x = Integer.parseInt(instance.n_Scan());
		System.out.println("You Chose " + x);
		
		System.out.println("Please specify text to be inserted: ");
		str = instance.n_Scan();
		
		instance.c_Char(str, x, input);
		instance.r_Char(input);
	}

	@Override
	public void undo() {
		instance.remove_Char(input);
	}
}
