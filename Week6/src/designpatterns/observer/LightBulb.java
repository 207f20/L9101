package designpatterns.observer;

//Complete your custom Observable class in Observable.java to get this code to work
public class LightBulb extends Observable {
	
	public final static boolean ON = true;
	public final static boolean OFF = false;

	private boolean bulbStatus = OFF;

	public void turnOn() {
		if (this.bulbStatus != ON) {
			this.bulbStatus = ON;
			this.notifyObservers("bulb turned on");
		}
	}

	public void turnOff() {
		if (this.bulbStatus != OFF) {
			this.bulbStatus = OFF;
			this.notifyObservers("bulb turned off");
		}
	}

	public void flip() {
		this.bulbStatus = !this.bulbStatus;
		this.notifyObservers("bulb turned " + this.bulbStatus);
	}
}
