package main;

import java.util.Scanner;

import command.Command;
import command.NoCommand;

public class Control {
	Command[] onCommand;
	Command[] undoCommand;
	
	public Control() {
		onCommand = new Command[7];
		undoCommand = new Command[7];
		Command noCommand = new NoCommand();
		
		for(int i=0; i<7; i++) {
			onCommand[i] = noCommand;
			undoCommand[i] = noCommand;
		}
		
	}
	
	public void println() {
		System.out.println("pick from one of the following: \r\n undo \r\n paste \r\n quit \r\n cut");
	}
	
	public void setCommand(Command command, int slot) {
		this.onCommand[slot] = command;
	}
	
	public void onExecute(int slot) {
		onCommand[slot].execute();
		undoCommand[slot] = onCommand[slot];
	}
	
	public void undoButton(int slot) {
		undoCommand[slot].undo();
	}
	
}
