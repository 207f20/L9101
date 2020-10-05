package guifx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.geometry.Insets;

public class LayoutGrid extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		initUI(stage);
	}

	private void initUI(Stage stage) {

		GridPane pane = new GridPane();
		Scene scene = new Scene(pane);

		// set up the gap and padding between the grid cells
		pane.setHgap(10);
		pane.setVgap(10);
		pane.setPadding(new Insets(10));

		pane.add(new Button("1"), 0, 0);
		pane.add(new Button("2"), 1, 0);
		pane.add(new Button("3"), 2, 0);
		pane.add(new Button("4"), 0, 1);
		pane.add(new Button("5"), 1, 1);
		pane.add(new Button("6"), 2, 1);
		pane.add(new Button("7"), 0, 2);
		pane.add(new Button("8"), 1, 2);
		pane.add(new Button("9"), 2, 2);

		stage.setTitle("Grid Layout JavaFX");
		stage.setScene(scene);
		stage.show();

	}
}
