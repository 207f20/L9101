package sol;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
//import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;

// EXERCISE 2: Follow the instructions below to complete this program
public class HiByeFX extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		initUI(stage);
	}

	private void initUI(Stage stage) {

		// TODO: Create a layout pane object (use any layout pane of your choice)
		// TODO: Create two buttons - one labeled "Hi" with variable name hi_btn, 
		//			one labeled "Bye" with variable name bye_btn
		// TODO: Add the two buttons to the pane

		HBox pane = new HBox(5);
		pane.setPadding(new Insets(10));

		Button hi_btn = new Button("Hi");
		Button bye_btn = new Button("Bye");

		pane.getChildren().add(hi_btn);
		pane.getChildren().add(bye_btn);
		
		TextField txt = new TextField();
		txt.setPrefColumnCount(20);
		// TODO: Add the above text field to the pane
		pane.getChildren().add(txt);

		// Note: Another way to hook up the event handler: using instances of an existing handler class
		hi_btn.setOnAction(new HiByeEventHandler(txt));
		bye_btn.setOnAction(new HiByeEventHandler(txt));
		
		// TODO: Make the scene at whatever size makes sense, add your pane to the scene
		Scene scene = new Scene(pane, 500, 300);

		stage.setTitle("Hi Bye JavaFX");
		stage.setScene(scene);
		stage.show();	
	}
}

// Once you complete the above TODOs, you can run this file and test out the buttons
// Then, take a look at the handler below and figure out what the handler does and how it works.
// Explain this to us in a comment here:
// PUT YOUR EXPLANATION OF HOW HiByeEventHandler WORKS HERE
//
//
//
//
class HiByeEventHandler implements EventHandler<ActionEvent> {

	private TextField txt;
	private int count;

	public HiByeEventHandler() {
		this.count = 0;
	}

	// Why passing and remembering the reference to the text field?
	public HiByeEventHandler(TextField txt) {
		this.txt = txt;
		this.count = 0;
	}

	public void handle(ActionEvent event) {
		
		++this.count;
		
		// Note how to get the button's text from the event object.
		String msg = ((Button) (event.getSource())).getText() + " pressed " + this.count + " times";
		
		// The handler can manipulate the text field 
		// because it keeps the reference to it
		this.txt.setText(msg);
		return;
	}
}

