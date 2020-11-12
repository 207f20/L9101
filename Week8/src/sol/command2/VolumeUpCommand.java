package sol.command2;

public class VolumeUpCommand implements Command {
	  SoundSystem receiver;

	  public VolumeUpCommand(SoundSystem soundSystem) {
	    receiver = soundSystem;
	  }

	  public void execute() {
	    receiver.volumeUp();
	  }
}
