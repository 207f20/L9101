package sol;

public class HawaiianPizzaBuilder extends PizzaBuilder {
	
	public HawaiianPizzaBuilder() {
		super("Hawaiian");
		this.addPineapple();
		this.addPepperoni();
	}
}
