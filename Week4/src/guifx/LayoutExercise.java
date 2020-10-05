package guifx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class LayoutExercise extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		initUI(stage);
	}

	private TextField tfDisplay; // display textfield
	private Button[] btns; // 16 buttons
	private String[] btnLabels = { // Labels of 16 buttons
			"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "x", "C", "0", "=", "/" };

	private void initUI(Stage stage) {

		// TODO: Complete this code to look something like the JavaFXCalculator.png
		// image included in this repo
		
		// It's okay if it's not exact, as long as the main structure -- a long
		// textfield at the top, followed by a grid of buttons - is there

		// To get it to look closer to the picture though, try playing around with the
		// padding, and use ColumnConstraints:
		// 		http://www-acad.sheridanc.on.ca/~jollymor/prog24178/javafx3b.html
		
		// Setup the Display TextField
		tfDisplay = new TextField("0");
		tfDisplay.setEditable(false);


		// YOUR CODE HERE (Use LayoutComplex.java and the other layout pane resources as reference)
		

		stage.setTitle("Calculator Layout Exercise");
		stage.show();

	}
}
