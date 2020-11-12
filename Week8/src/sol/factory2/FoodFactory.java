package sol.factory2;

// http://www.oodesign.com/factory-pattern.html
public class FoodFactory {
	
	public Food createProduct(String product) {
		if (product.equals("Burger"))
			return new Burger();
		if (product.equals("Fries"))
			return new Fries();
		if (product.equals("Pizza"))
			return new Pizza();
		if (product.equals("Salad"))
			return new Salad();
		if (product.equals("Coke") || product.equals("RootBeer"))
			return new Soda(product);
		return null;
	}
}
