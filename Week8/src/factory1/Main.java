package factory1;

public class Main {

	public static void main(String[] args) {
		Fruit fruit;
		FruitFactory fruitFactory = new FruitFactory();
		
		fruit = fruitFactory.makeFruit("Apple");
		System.out.println("The fruit is an " + fruit.getType());

		fruit = fruitFactory.makeFruit("Orange");
		System.out.println("The fruit is an " + fruit.getType());
	}
}
