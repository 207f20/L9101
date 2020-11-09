package command1;

public class TurnOnCommand implements Command {

	Light light;
	
	public TurnOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		this.light.switchOn();
	}

	
}
