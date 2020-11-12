package sol.command2;

public class TurnOnCommand implements Command {
	  SoundSystem receiver;

	  public TurnOnCommand(SoundSystem soundSystem) {
	    receiver = soundSystem;
	  }

	  public void execute() {
	    receiver.turnOn();
	  }
}
