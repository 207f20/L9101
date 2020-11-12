package sol.builder2_alt;

public class PizzaChainBuilder {
	
	final String name;
	boolean extraSauce = false;
	boolean extraCheese = false;
	boolean pepperoni = false;
	boolean tomatoes = false;
	boolean pineapple = false;
	
	public PizzaChainBuilder(String name) {
		this.name = name;
	}

	// return the builder itself rather than void
	public PizzaChainBuilder addExtraSauce() {
		this.extraSauce = true;
		return this;
	}

	// return the builder itself rather than void
	public PizzaChainBuilder addExtraCheese() {
		this.extraCheese = true;
		return this;
	}

	// return the builder itself rather than void
	public PizzaChainBuilder addPepperoni() {
		this.pepperoni = true;
		return this;
	}
	
	// return the builder itself rather than void
	public PizzaChainBuilder addTomato() {
		this.tomatoes = true;
		return this;
	}

	// return the builder itself rather than void
	public PizzaChainBuilder addPineapple() {
		this.pineapple = true;
		return this;
	}

	public Pizza getPizza() {
		Pizza p = new Pizza(this);
		return p;
	}
}
