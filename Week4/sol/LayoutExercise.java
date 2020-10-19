package sol;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

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

		// Setup a GridPane for 4x4 Buttons
		int numCols = 4;
		int numRows = 4;
		GridPane paneButton = new GridPane();

		// Setting the padding
	    paneButton.setPadding(new Insets(15, 0, 15, 0));  // top, right, bottom, left
	    paneButton.setVgap(5);  // Vertical gap between nodes
	    paneButton.setHgap(5);  // Horizontal gap between nodes
	    
	    // Setup 4 columns of equal width, fill parent
	    ColumnConstraints[] columns = new ColumnConstraints[numCols];
	    for (int i = 0; i < numCols; ++i) {
	       columns[i] = new ColumnConstraints();
	       columns[i].setHgrow(Priority.ALWAYS) ;  // Allow column to grow
	       columns[i].setFillWidth(true);  // Ask nodes to fill space for column
	       paneButton.getColumnConstraints().add(columns[i]);
	    }
	      
		// Setup 16 Buttons and add to GridPane; and event handler
		btns = new Button[16];
		for (int i = 0; i < btns.length; ++i) {
			btns[i] = new Button(btnLabels[i]);
			btns[i].setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE); // full-width
			paneButton.add(btns[i], i % numCols, i / numCols); // control, col, row
		}

		// Setup up the scene graph rooted at a BorderPane (of 5 zones)
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(15, 15, 15, 15)); // top, right, bottom, left
		root.setTop(tfDisplay); // Top zone contains the TextField
		root.setCenter(paneButton); // Center zone contains the GridPane of Buttons

		// Set up scene and stage
		stage.setScene(new Scene(root, 300, 300));
		stage.setTitle("JavaFX Calculator");
		stage.show();

	}
}
