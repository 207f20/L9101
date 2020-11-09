package command1;

public class RemoteControl {

	private Command currentCmd;
	
	public void setCommand(Command cmd) {
		currentCmd = cmd;
	}
	
	public void pressButton() {
		this.currentCmd.execute();
	}
}
