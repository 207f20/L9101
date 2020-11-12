package sol.builder2_alt;

public class ClientMain {

	public static void main(String[] args) {

		Pizza p1 = new PizzaChainBuilder("Original")
				.getPizza();
		System.out.println(p1);
		
		Pizza p2 = new PizzaChainBuilder("TheLarry")
				.addExtraCheese()
				.addExtraSauce()
				.addPepperoni()
				.getPizza();
		System.out.println(p2);

		Pizza p3 = new PizzaChainBuilder("TheSadia")
				.addTomato()
				.addExtraCheese()
				.getPizza();
		System.out.println(p3);

	}
}