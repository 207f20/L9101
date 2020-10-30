package sol;

// http://www.oodesign.com/observer-pattern.html
public class LightBulbMain {

	public static void main(String[] args) {

		// Question: What if I would like to know who told me
		// to update? In this case, we would do something like
		// Java's Observer/Observable. See push/pull discussion
		// in the online notes.
		
		LightBulb lb1 = new LightBulb();
		LightBulb lb2 = new LightBulb();
		LightBulb lb3 = new LightBulb();

		LightBulbObserver1 lbo1 = new LightBulbObserver1();
		LightBulbObserver2 lbo2 = new LightBulbObserver2();

		lb1.attach(lbo1);
		lb1.attach(lbo2);

		lb2.attach(lbo2);

		lb1.turnOff();
		lb1.turnOn();
		lb2.flip();
		lb3.flip();

	}

}
