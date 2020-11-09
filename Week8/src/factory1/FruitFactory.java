package factory1;

public class FruitFactory {

	public Fruit makeFruit(String type) {
		
		Fruit fruit = null;
		
		if (type.equals("Apple")) {
			fruit = new Apple();
		} else if (type.equals("Orange")) {
			fruit = new Orange();
		}
		
		return fruit;
		
	}
}
