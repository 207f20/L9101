package mvcdemo;

import java.util.Scanner;

/**
 * Interact with the user and, as a result, play with the Model.
 * 
 * @author arnold
 *
 */
public class KeyboardController {
	public static void main(String[] args) {
		// Create and hook up the Model, View and this controller

		// View
		TextView view = new TextView();

		// Model
		Balloon[] balloons = new Balloon[10];
		for (int i = 0; i < balloons.length; i++) {
			balloons[i] = new Balloon("Red", 100 + i * 10);
		}

		// Hook everything up, we already have a link to the model.
		for (int i = 0; i < balloons.length; i++) {
			balloons[i].addObserver(view);
		}

		// Now we control the model
		// in this case, the user input tells us what to do with the model
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String line;
			System.out.print("Which balloon [0-" + (balloons.length - 1) + "]: ");
			line = scanner.nextLine();
			int whichBalloon = Integer.parseInt(line);
			if (whichBalloon < 0)
				break;

			System.out.print("Amount to inflate: ");
			line = scanner.nextLine();
			int amount = Integer.parseInt(line);

			balloons[whichBalloon].inflate(amount);
		}
		scanner.close();
	}
}
