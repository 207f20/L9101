package sol;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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

		// View
		TextView view = new TextView();

		// Model
		Balloon model_b1 = new Balloon("Red", 100);
		Balloon model_b2 = new Balloon("Green", 200);

		// Hook the model to the view.
		model_b1.addObserver(view);
		model_b2.addObserver(view);

		// Create the GUI controller to control the Model
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(10));

		Button b1, b2; // Two reference to JButton, no buttons exist yet!!

		// Create the buttons
		b1 = new Button("Inflate " + model_b1.getColor());
		b2 = new Button("Inflate " + model_b2.getColor());

		// add them to the contentPane
		grid.add(b1, 0, 0);
		grid.add(b2, 0, 1);

		// Tell the buttons who they should call when they are pressed.
		// That is, hook up the controller to the Model.
		b1.setOnAction(new ButtonInflateActionListener(model_b1));
		b2.setOnAction(new ButtonInflateActionListener(model_b2));
		
		// SCENE
		Scene scene = new Scene(grid, 250, 100);

		// STAGE
		stage.setTitle("Balloons");
		stage.setScene(scene);
		stage.show();
	}
}

