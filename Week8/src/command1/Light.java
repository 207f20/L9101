package command1;

public class Light {

	private boolean on = false;
	
	public void switchOn() {
		on = true;
		System.out.println("Turned on");
	}
	
	public void switchOff() {
		on = false;
		System.out.println("Turned off");
	}
}
