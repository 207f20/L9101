package sol.command2;

public class TurnOffCommand implements Command {
	  SoundSystem receiver;

	  public TurnOffCommand(SoundSystem soundSystem) {
	    receiver = soundSystem;
	  }

	  public void execute() {
	    receiver.turnOff();
	  }
}
