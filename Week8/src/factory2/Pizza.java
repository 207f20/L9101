package factory2;

public class Pizza extends Food {

	private int calories;
	private String name;

	public Pizza() {
		this.name = "Pizza";
		this.calories = 300;
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
