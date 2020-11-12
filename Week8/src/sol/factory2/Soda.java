package sol.factory2;

// this is a concrete product
public class Soda extends Food {
	
	public Soda(String type) {
		super(type, 780);
	}

	@Override
	public String eat() {
		return "sip";
	}
}
