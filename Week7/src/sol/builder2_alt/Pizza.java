package sol.builder2_alt;

public class Pizza {
	
	private String name;
	private boolean extraCheese, extraSauce, pepperoni, tomatoes, pineapple;

	public Pizza(PizzaChainBuilder builder) {
		this.name = builder.name;
		this.extraCheese = builder.extraCheese;
		this.extraSauce = builder.extraSauce;
		this.pepperoni = builder.pepperoni;
		this.tomatoes = builder.tomatoes;
		this.pineapple = builder.pineapple;
	}

	/**
	public void setExtraCheese(boolean extraCheese) {
		this.extraCheese = extraCheese;
	}

	public void setExtraSauce(boolean extraSauce) {
		this.extraSauce = extraSauce;
	}

	public void setPepperoni(boolean pepperoni) {
		this.pepperoni = pepperoni;
	}

	public void setTomatoes(boolean tomatoes) {
		this.tomatoes = tomatoes;
	}

	public void setPineapple(boolean pineapple) {
		this.pineapple = pineapple;
	}**/
	
	public String toString() {
		return name + ": " + "extraCheese=" + extraCheese + 
				" extraSauce=" + extraSauce + " pepperoni=" + pepperoni + 
				" tomatoes=" + tomatoes + " pineapple=" + pineapple;
	}
}
