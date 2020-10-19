package mvcdemo;

import java.util.Observable;
import java.util.Observer;

import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

/**
 * We extend JLabel as a view on a Balloon
 * 
 * @author arnold
 *
 */

public class GUIView2 extends Rectangle implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		
		Balloon balloon = (Balloon) o;
		if (balloon.getCapacity() != 0) {
			this.setWidth((int) (100 * balloon.getAmount() / balloon.getCapacity()));
			this.setHeight(20);
			this.setFill(Color.GREEN);
		} 
		else {
			this.setWidth(100);
			this.setHeight(5);
			this.setFill(Color.GREY);
		}
	}
}
