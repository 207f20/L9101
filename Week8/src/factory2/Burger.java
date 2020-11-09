package factory2;

public class Burger extends Food {
	
	private int calories;
	private String name;

	public Burger() {
		this.name = "Burger";
		this.calories = 780;
	}

	@Override
	public String eat() {
		return "bite chew chew";
	}

	@Override
	public int getCalories() {
		return this.calories;
	}

	@Override
	public String getName() {
		return this.name;
	}
}
