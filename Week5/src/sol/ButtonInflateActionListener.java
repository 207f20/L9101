package sol;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class ButtonInflateActionListener implements EventHandler<ActionEvent> {

	private Balloon balloon;

	ButtonInflateActionListener(Balloon balloon) {
		this.balloon = balloon;
	}

	public void handle(ActionEvent e) {

		balloon.inflate(10);
		if (balloon.isPopped()) {
			Button jb = (Button) e.getSource();
			jb.setDisable(true);
		}
	}
}
