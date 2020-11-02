package builder2;

import java.util.ArrayList;

public class ClientMain {

	public static void main(String[] args) {

		// TODO: Use PizzaBuilder to build a pizza with pepperoni, pineapple and extra cheese
		// Store this Pizza that you built in variable "p0"
		PizzaBuilder builder = new PizzaBuilder("Pineroni");

		
		System.out.println(p0); // Should print "Pineroni: extraCheese=true extraSauce=false pepperoni=true tomatoes=false pineapple=true"
		
		// TODO: Create a new HawaiianPizza using the appropriate PizzaBuilder
		// Store this Pizza in variable "h0"
		PizzaBuilder hawaiianBuilder;
		
		
		System.out.println(h0); // Should print "Hawaiian: extraCheese=false extraSauce=false pepperoni=true tomatoes=false pineapple=true"
		
	
		
		// Example of using the director to construct a bunch of pizzas
		PizzaDirector director = new PizzaDirector();
		director.construct();
		ArrayList<Pizza> pizzas = director.getPizzas();

		for (Pizza p : pizzas) {
			System.out.println(p);
		}

		// Example of free-style using the chain builder
		Pizza p1 = new PizzaChainBuilder("Original")
				.getPizza();
		System.out.println(p1);
		
		Pizza p2 = new PizzaChainBuilder("TheLarry")
				.addExtraCheese()
				.addExtraSauce()
				.addPepperoni()
				.getPizza();
		System.out.println(p2);

		Pizza p3 = new PizzaChainBuilder("TheSadia")
				.addTomato()
				.addExtraCheese()
				.getPizza();
		System.out.println(p3);

	}
}