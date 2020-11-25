package main;

import java.util.ArrayList;
import java.util.Scanner;

import command.*;
import scanner.Scanner_IO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Control control = new Control();
		Command command = null;
		String str;
		int count = 0;
		int input = 0;
		
		while(Scanner_IO.INSTANCE.f_Scan() != null && count < 7) {
			control.println();
			str = Scanner_IO.INSTANCE.n_Scan();
			switch (str) {
				case "undo":
					control.undoButton(--count);
					break;
				case "cut": 
					command = new CutOnCommand(Scanner_IO.INSTANCE, input-1);
					control.setCommand(command, count);
					control.onExecute(count);
					count++;
					break;
				case "paste": 
					command = new PasteOnCommand(Scanner_IO.INSTANCE, input);
					control.setCommand(command, count);
					control.onExecute(count);
					input++;
					count++;
					break;
				case "quit": 
					command = new QuitOnCommand(Scanner_IO.INSTANCE);
					control.setCommand(command, count);
					control.onExecute(count);
					input++;
					count++;
					break;
			}

		}
	}

}
