package guifx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class LayoutComplex extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		initUI(stage);
	}

	private void initUI(Stage stage) {

		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(10));
		
		Button btn1 = new Button("NORTH");
		Button btn2 = new Button("SOUTH");
		
		pane.setTop(btn1);
		BorderPane.setAlignment(btn1, Pos.CENTER);

		pane.setBottom(btn2);
		BorderPane.setAlignment(btn2, Pos.CENTER);
		
		Button btn3 = new Button("WEST");
		Button btn4 = new Button("EAST");
		
		pane.setLeft(btn3);
		BorderPane.setAlignment(btn3, Pos.CENTER_LEFT);
		
		pane.setRight(btn4);
		BorderPane.setAlignment(btn4, Pos.CENTER_RIGHT);
		
		GridPane cpane = new GridPane();
		for (int i = 0; i < 9; i++) {
			cpane.add(new Button("Centre " + i), i % 3, i / 3);
		}
		// put the grid pane at the center of the border pane
		pane.setCenter(cpane);
		cpane.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(pane);
		stage.setTitle("Complex Layout JavaFX");
		stage.setScene(scene);
		stage.show();

	}
}
