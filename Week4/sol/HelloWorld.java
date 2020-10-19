package sol;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.geometry.Insets;

// EXERCISE 1: Add in a second label that says anything you want and make it appear
// 				on the stage underneath the "Hello World!!" label we already added in
public class HelloWorld extends Application {

	private void initUI(Stage stage) {

		/**
		 * A stage is the top level GUI window. 
		 * A stage has a scene. 
		 * A scene is a tree/graph of nodes (visual UI elements).
		 */

		// Making a text label
		Label label = new Label("Hello World!!");
		Label label2 = new Label("Let's live in the moment!!");

		// We choose a layout to organize elements
		// More layout examples: https://docs.oracle.com/javafx/2/layout/builtin_layouts.htm
		VBox root = new VBox();
		root.setPadding(new Insets(5));
		
		// We add the text label to our layout pane
		root.getChildren().add(label);
		root.getChildren().add(label2);
		
		// Create a scene object; add the layout pane to it; set the width and height
		Scene scene = new Scene(root, 280, 200);
		
		// Make the main window; set its title; place scene on this stage; display the stage
		stage.setTitle("Hello World JavaFX");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		
		/**
		 * static method of Application
		 * Creates an instance of Application, 
		 * starts the GUI thread and calls
		 * Application.start(stage) where stage is the window
		 */
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		initUI(stage);
	}
}