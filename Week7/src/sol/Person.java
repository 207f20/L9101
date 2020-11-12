package sol;

public class Person {

	private String name, loc;
	
	public Person(String name, String loc) {
		this.name = name;
		this.loc = loc;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getLocation() {
		return this.loc;
	}
	
	public void setLocation(String loc) {
		this.loc = loc;
	}
	
	@Override
	public String toString() {
		return ("I am " + this.name + " at " + this.loc);
	}
}
