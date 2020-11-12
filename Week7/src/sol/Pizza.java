package sol;

public class Pizza {
	
	private String name;
	private boolean extraCheese, extraSauce, pepperoni, tomatoes, pineapple;

	public Pizza(String name) {
		this.name = name;
		this.extraCheese = false;
		this.extraSauce = false;
		this.pepperoni = false;
		this.tomatoes = false;
		this.pineapple = false;
	}

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
	}
	
	public String toString() {
		return name + ": " + "extraCheese=" + extraCheese + 
				" extraSauce=" + extraSauce + " pepperoni=" + pepperoni + 
				" tomatoes=" + tomatoes + " pineapple=" + pineapple;
	}
}
