package sol;

public class PizzaBuilder {
	
	private String name;
	private boolean extraSauce = false;
	private boolean extraCheese = false;
	private boolean pepperoni = false;
	private boolean tomatoes = false;
	private boolean pineapple = false;
	
	public PizzaBuilder(String name) {
		this.name = name;
	}

	public void addExtraSauce() {
		this.extraSauce = true;
	}

	public void addExtraCheese() {
		this.extraCheese = true;
	}

	public void addPepperoni() {
		this.pepperoni = true;
	}

	public void addTomato() {
		this.tomatoes = true;
	}

	public void addPineapple() {
		this.pineapple = true;
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
