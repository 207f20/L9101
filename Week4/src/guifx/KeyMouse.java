package guifx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;

public class KeyMouse extends Application {

	private double x = 50, y = 200;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		initUI(stage);
	}

	void initUI(Stage stage) {

		StackPane pane = new StackPane();

		// Learn more about Canvas and GraphicContext: 
		// https://docs.oracle.com/javase/8/javafx/api/javafx/scene/canvas/Canvas.html
		Canvas canvas = new Canvas(600, 480);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		paint(gc);
		pane.getChildren().add(canvas);

		Scene scene = new Scene(pane);

		// Hook up the handler using anonymous inner class
		// Set what happens when a key is typed
		scene.setOnKeyTyped(new EventHandler<KeyEvent>() {

			public void handle(KeyEvent event) {
				
				// Note how to get which key is pressed
				System.out.println("key pressed: " + event.getCharacter());
				switch (event.getCharacter()) {
				case "w":
					y = y - 5;
					break;
				case "a":
					x = x - 5;
					break;
				case "s":
					y = y + 5;
					break;
				case "d":
					x = x + 5;
					break;
				default:

				}
				// Why call paint() here?
				paint(gc);
			}
		});
		
		// What happens when the mouse is clicked.
		scene.setOnMouseClicked(new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent e) {
				
				// Note how to get the location of the mouse click
			    System.out.println("mouse clicked: "+ e.getSceneX()+" "+e.getSceneY());
			    x = e.getSceneX();
			    y = e.getSceneY();
			    
				// Why call paint() here? Try seeing what happens if you comment this out.
				paint(gc);
			}
		});

		stage.setTitle("Key Mouse JavaFX");
		stage.setScene(scene);
		stage.show();

	}

	void paint(GraphicsContext gc) {

		// Clear the canvas
		gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
		
		// paint a green rectangle at the location (this.x, this.y)
		gc.setFill(Color.GREEN);
		gc.fillRect(this.x, this.y, 15, 30);
	}
}