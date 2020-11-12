package sol.factory2;

import java.util.Scanner;

public class ClientMain {
	
	public static void main(String[] args) {
		
		FoodFactory factory = new FoodFactory();
		
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("\nWhat food would like to order?");
			String order = scan.nextLine();
			Food food = factory.createProduct(order);
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