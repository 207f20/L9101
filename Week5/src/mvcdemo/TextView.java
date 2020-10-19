package mvcdemo;

import java.util.*;

/**
 * Present a text view of Balloons
 */
public class TextView implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Message: " + o.toString() + " has been " + arg);
	}
}
