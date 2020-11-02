package builder2;

public class HawaiianPizzaBuilder extends PizzaBuilder {
	
	public HawaiianPizzaBuilder() {
		super("Hawaiian");
		this.addPineapple();
		this.addPepperoni();
	}
}
