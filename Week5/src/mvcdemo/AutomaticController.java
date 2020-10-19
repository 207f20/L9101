package mvcdemo;

// EXERCISE 2
// Complete the TODOs below and try running this code to see this simple MVC implementation in action
// Discuss in a group how this code works -- which classes are interacting with which, and how the final output is produced

public class AutomaticController {

	public static void main(String[] args) {
		// Create and hook up the Model, View and this controller

		// View
		TextView view = new TextView(); // Implements Observer

		// Model
		// TODO: Complete Ex1 in Balloon.java
		Balloon model_b1 = new Balloon("Red", 50); // IS-A Observable
		Balloon model_b2 = new Balloon("Green", 100);

		// Hook everything up
		// TODO: Add "view" as an observer for both model_b1 and model_b2
		//			Hint: Use the "addObserver" method


		// Now we control the model
		model_b1.inflate(5);
		model_b1.inflate(5);
		model_b2.inflate(30);
		model_b1.inflate(100);
	}
}
