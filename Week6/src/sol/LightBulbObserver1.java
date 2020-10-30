package sol;

public class LightBulbObserver1 implements Observer {
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println(((LightBulb) o).toString() + " has changed: " + arg);
	}
}

/** Alternative version of update was:

	public void update() {
		System.out.println("Something has changed");
	}
**/