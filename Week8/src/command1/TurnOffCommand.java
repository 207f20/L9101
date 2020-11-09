package command1;

public class TurnOffCommand implements Command {

	Light light; // this is the receiver
	
	public TurnOffCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		this.light.switchOff(); // modify the receiver
	}

	
}
