package designpatterns.singleton;

// Another Singleton example
public class Singleton2 {

	private static Singleton2 instance = null;
	
	private String colour;

	// Note: constructor is private!
	private Singleton2() {
		this.colour = "red";
	}

	public static Singleton2 getInstance() {
		if (instance == null)
			instance = new Singleton2();
		
		return instance;
	}

	public String getColour() {
		return this.colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
}
