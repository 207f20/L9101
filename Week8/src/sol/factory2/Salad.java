package sol.factory2;

// this is a concrete product
public class Salad extends Food {
	
	public Salad() {
		super("Salad", 100);
	}

	@Override
	public String eat() {
		return "bite crunch crunch crunch";
	}
}
