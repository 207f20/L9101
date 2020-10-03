package sol;

public class Square extends Shape {

	private int sideLength;
	
	public Square(int x, int y, int l) {
		super(x, y);
		this.sideLength = l;
	}

	@Override
	public double getArea() {
		return sideLength * sideLength;
	}

	@Override
	public double getPerimeter() {
		return sideLength * 4;
	}

	public void setSideLength(int s) {
		this.sideLength = s;
	}
	
	@Override
	public String toString() {
		return "A Square at (" + this.getX() + ", " + this.getY() + ") with side length " + this.sideLength;
	}
	
}
