package factory2;

import java.util.Scanner;

/**
 * In this example, we are NOT using the Factory design pattern
 * We are leaving it up to the client to instantiate the class they want -- this is not good encapsulation practice
 * We often want to hide implementation details from the client
 * 
 * EXERCISE 2:
 * Modify the code in this package to do the following:
 * 2.1 Update Burger, Pizza and Food to reduce the repetition of code within the classes
 * 2.2 Complete the FoodFactory class to use the Factory design pattern, and then update the code appropriately in this
 *    client class below
 * 2.3 Add two new types of food: fries (make a Fries.java) and salad (make a Salad.java). 
 * 			(If you implemented Factory design pattern correctly, notice how the client
 * 	  		class needs no modification to work with these new food items)
 */
public class ClientMain {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("\nWhat food would like to order?");
			String order = scan.nextLine();

			Food food = null;
			if (order.equalsIgnoreCase("burger")) {
				food = new Burger();
			} else if (order.equalsIgnoreCase("pizza")) {
				food = new Pizza();
			}
			
			if (food != null) {
				System.out.println("Here you go: " + food.getName() + ", " + food.getCalories() + " calories.");
				System.out.println("Eating: " + food.eat());
			}
			else {
				System.out.println("Sorry, we don't have this on our menu.");
			}
		}
		
	}
}