package sol;

import java.util.ArrayList;

public class Observable {
	private ArrayList<Observer> observers = new ArrayList<Observer>();

	public void attach(Observer o) {
		this.observers.add(o);
	}

	public void detach(Observer o) {
		this.observers.remove(o);
	}

	/** Pull communication method 
	public void notifyObservers() {
		for (Observer o : this.observers) {
			o.update();
		}
	}**/

	// Push communication method
	public void notifyObservers() {
		for (Observer o : this.observers) {
			o.update(this, null);
		}
	}

	public void notifyObservers(String msg) {
		for (Observer o : this.observers) {
			o.update(this, msg);
		}
	}
}

