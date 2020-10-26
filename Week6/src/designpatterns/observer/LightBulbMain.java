package designpatterns.observer;

public class LightBulbMain {

	public static void main(String[] args) {

		// Complete the given Observable.java and Observer.java files
		// Then run this code to see them in action
		
		// You can use references like http://www.oodesign.com/observer-pattern.html as you complete the above classes
		
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
