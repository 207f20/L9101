package guifx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LayoutFlow extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		initUI(stage);
	}

	private void initUI(Stage stage) {

		FlowPane pane = new FlowPane(5, 10);
		Scene scene = new Scene(pane, 600, 480);

		pane.getChildren().add(new Button("North"));
		pane.getChildren().add(new Button("South"));
		pane.getChildren().add(new Button("West"));
		pane.getChildren().add(new Button("East"));
		pane.getChildren().add(new TextField("Centre"));

		stage.setTitle("Flow Layout JavaFX");
		stage.setScene(scene);
		stage.show();

	}
}
