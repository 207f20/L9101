package abstractClassDemo;

public class Rectangle extends Shape {
	
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return this.width * this.height;
	}
	
	@Override
	public double getPerimeter () {
		return 2 * (this.width + this.height);
	}
	
	public void setWidth(int w) {
		this.width = w;
	}
	
	public void setHeight(int h) {
		this.height = h;
	}
	
	@Override
	public String toString() {
		return "A Rectangle at (" + this.getX() + ", " + this.getY() + 
				") with width " + this.width + " and height " + this.height;
	}
}
