package sol;

import java.util.ArrayList;

public class PizzaDirector {

	private PizzaBuilder builder;
	private ArrayList<Pizza> pizzas = new ArrayList<Pizza>();

	public void construct() {
		
		builder = new HawaiianPizzaBuilder();
		builder.addExtraCheese();
		pizzas.add(builder.getPizza());
		pizzas.add(builder.getPizza());
		builder = new DeluxePizzaBuilder();
		pizzas.add(builder.getPizza());
		pizzas.add(builder.getPizza());
		pizzas.add(builder.getPizza());
	}
	
	public ArrayList<Pizza> getPizzas() {
		return this.pizzas;
	}
}
