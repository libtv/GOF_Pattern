package command;

public class NoCommand implements Command {
	public void execute() {}

	@Override
	public void undo() {}
}
