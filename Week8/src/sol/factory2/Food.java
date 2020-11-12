package sol.factory2;

// http://www.mcdonalds.ca/ca/en/food/nutrition_centre.html#/
// This is the 'Product' interface in the design pattern
public class Food {
	
	private String name;
	private int calories;

	public Food(String name, int calories) {
		this.name = name;
		this.calories = calories;
	}

	public String eat() {
		return "bite chew chew";
	}

	public int getCalories() {
		return calories;
	}

	public String getName() {
		return name;
	}	
}
