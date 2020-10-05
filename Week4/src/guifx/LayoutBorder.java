package guifx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class LayoutBorder extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		initUI(stage);
	}

	private void initUI(Stage stage) {

		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 600, 480);

		Label btop = new Label("Here is top");
		Label bleft = new Label("Here is left");
		Label bbottom = new Label("Here is bottom");
		Label bright = new Label("Here is right");
		
		// put the labels at different locations
		root.setTop(btop);
		root.setLeft(bleft);
		root.setRight(bright);
		root.setBottom(bbottom);

		stage.setTitle("Border Layout JavaFX");
		stage.setScene(scene);
		stage.show();
	}
}