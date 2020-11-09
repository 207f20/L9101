package command1;

public class Client {

	public static void main(String[] args) {
		
		Light light = new Light();
		
		RemoteControl control = new RemoteControl();
		
		Command lightsOn = new TurnOnCommand(light);
		Command lightsOff = new TurnOffCommand(light);
		
		// switch on
		control.setCommand(lightsOn);
		control.pressButton();
		
		// switch off
		control.setCommand(lightsOff);
		control.pressButton();
	}
}
