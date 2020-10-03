package sol;

/** 
 * Abstract class for Shape objects.
 */
// This abstract class tells me everything that any Shape object should have
public abstract class Shape {

	// we could have these as protected
	// if we want our children to be able to do things like
	// this.x, or else children must use the getters/setters to access these
	private int x;
	private int y;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// these are abstract methods: methods that do not have a body
	public abstract double getArea(); // no {} 
	public abstract double getPerimeter();
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return "Area: " + this.getArea() + ", Per: " + this.getPerimeter();
	}
}

