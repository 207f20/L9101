package command2;

/**
 * EXERCISE 1:
 * 
 * DO NOT MODIFY THIS FILE.
 * Complete the relevant files in this package so that the output of this file is: 
 * 
 * ON!
 * Sound is at 1
 * Sound is at 2
 * Sound is at 3
 * Sound is at 2
 * OFF!
 *
 */
public class SoundSystemClient {
	  public static void main(String[] args) {
	    SoundSystem soundSystem = new SoundSystem(); // create receiver
	    Button button = new Button(); // create invoker

	    // Create some concrete commands
	    Command turnOnCommand = new TurnOnCommand(soundSystem);
	    Command turnOffCommand = new TurnOffCommand(soundSystem);
	    Command volumeUpCommand = new VolumeUpCommand(soundSystem);
	    Command volumeDownCommand = new VolumeDownCommand(soundSystem);

	    // Assign an action to the button
	    button.setCommand(turnOnCommand);
	    button.press();

	    // Change the button's action
	    button.setCommand(volumeUpCommand);
	    button.press();
	    button.press();
	    button.press();

	    button.setCommand(volumeDownCommand);
	    button.press();

	    // Turn off after usage to save electric energy!
	    button.setCommand(turnOffCommand);
	    button.press();
	  }
	}