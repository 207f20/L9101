package sol;

public class AutomaticController {

	public static void main(String[] args) {
		// Create and hook up the Model, View and this controller

		// View
		TextView view = new TextView(); // Implements Observer

		// Model
		Balloon model_b1 = new Balloon("Red", 50); // IS-A Observable
		Balloon model_b2 = new Balloon("Green", 100);

		// Hook everything up, we already have a link to the model.
		model_b1.addObserver(view);
		model_b2.addObserver(view);

		// Now we control the model
		model_b1.inflate(5);
		model_b1.inflate(5);
		model_b2.inflate(30);
		model_b1.inflate(100);
	}
}
