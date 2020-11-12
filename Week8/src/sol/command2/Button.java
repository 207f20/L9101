package sol.command2;

public class Button {
	  Command activeCommand;

	  public Button() { }

	  public void setCommand(Command command) {
	    activeCommand = command;
	  }

	  public void press() {
	    activeCommand.execute();
	  }
	}
