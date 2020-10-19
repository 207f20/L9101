package mvcdemo;

//EXERCISE 3: Complete this code to create a GUI controller -- do NOT modify the TextView or Balloon files at all

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GUIApp1 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage stage) throws Exception {
		// Create and hook up the Model, View and the controller

		// TODO: Create a TextView instance called "view"

		
		
		// TODO: Create two Balloon objects:
		//			a Red balloon with 100 capacity called model_b1
		//			a Green balloon with 200 capacity called model_b2

		

		// TODO: Make the "view" an observer of the two balloons above
		
		
		
		// Create the GUI controller to control the Model
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(10));

		// TODO: Create two buttons -- the labels for the button should be "Inflate" followed by model_b1.getColor()
		//			for one button, and "Inflate" followed by model_b2.getColor() for the other button

		

		// TODO: Add the two buttons to the "grid" layout pane at position (0, 0) for the first button and (0, 1) for the second

		
		
		// TODO: Hook up each button to an instance of ButtonInflateActionListener(model_b1) 
		//			and ButtonInflateActionListener(model_b2) respectively

		
		

		// SCENE
		Scene scene = new Scene(grid, 250, 100);

		// STAGE
		stage.setTitle("Balloons");
		stage.setScene(scene);
		stage.show();
	}
}

