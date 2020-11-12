package sol;

public class PizzaChainBuilder {
	
	private String name;
	private boolean extraSauce = false;
	private boolean extraCheese = false;
	private boolean pepperoni = false;
	private boolean tomatoes = false;
	private boolean pineapple = false;
	
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
		Pizza p = new Pizza(this.name);
		p.setExtraCheese(extraCheese);
		p.setExtraSauce(extraSauce);
		p.setPepperoni(pepperoni);
		p.setPineapple(pineapple);
		p.setTomatoes(tomatoes);
		return p;
	}
}
