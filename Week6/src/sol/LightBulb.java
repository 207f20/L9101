package sol;

public class LightBulb extends Observable {
	
	public final static boolean ON = true;
	public final static boolean OFF = false;

	private boolean bulbStatus = OFF;

	public void turnOn() {
		if (this.bulbStatus != ON) {
			this.bulbStatus = ON;
			this.notifyObservers("turned on"); // alternative version did not have any arguments -- this.notifyObservers()
		}
	}

	public void turnOff() {
		if (this.bulbStatus != OFF) {
			this.bulbStatus = OFF;
			this.notifyObservers("turned off"); // alternative: this.notifyObservers()
		}
	}

	public void flip() {
		this.bulbStatus = !this.bulbStatus;
		this.notifyObservers("changed status: " + this.bulbStatus); // alternative: this.notifyObservers()
	}
}
