package factory1;

public abstract class Fruit {

	String type;
	
	public Fruit(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
}
