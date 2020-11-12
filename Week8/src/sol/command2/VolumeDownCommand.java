package sol.command2;

public class VolumeDownCommand implements Command {
	  SoundSystem receiver;

	  public VolumeDownCommand(SoundSystem soundSystem) {
	    receiver = soundSystem;
	  }

	  public void execute() {
	    receiver.volumeDown();
	  }
}
