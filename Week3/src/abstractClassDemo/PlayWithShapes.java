package abstractClassDemo;

import java.util.ArrayList;

public class PlayWithShapes {
	
	public static void main(String args[]) {
		
		// Q1: What's wrong with the line below?
		Shape s = new Shape(1, 2);

		Circle c = new Circle(0, 0, 5);
		System.out.println(c); // Q2: Whose toString is called in this line?
		
		// Q3: What's happening in the line below?
		Shape c2 = new Circle(1, 1, 5);
		
		// Q4: What's wrong with the line below, and how can I make minimal
		//		changes to it to access setRadius?
		c2.setRadius(6);
		
		System.out.println(c2); // Q5: Whose toString is called in this line?
		
		
		Rectangle r = new Rectangle(3, 4, 5, 6);
		Square s = new Square(5, 6, 8);
				
		// Check out this example of "Polymorphism": one object has many forms
		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(c); // adding a Circle
		shapes.add(c2); // adding a Circle disguised as a Shape
		shapes.add(r); // adding a Rectangle
		shapes.add(s);
		// I can add in all of these different types but because they all come from
		// "Shape", I can just declare <Shape> as this list's datatype and it's all good!
		// Each entry of the list can be any subclass of Shape.
		
		// Q6: Explain what is happening in the code below. What toString methods are getting 
		//		called with each iteration of the loop in drawShapes?
		drawShapes(shapes);
		
		
		ArrayList<Circle> circle_array = new ArrayList<Circle>();
		
		circle_array.add(new Circle(1, 2, 3));
		circle_array.add(new Circle(4, 5, 6));
		
		// Q7: What's wrong with the code below?
		drawShapes(circle_array);
		
		// Q8: This works, what's the difference?
		drawShapesGeneric(circle_array);
		
	}
	
	static void drawShapes(ArrayList<Shape> lst) {
		
		for (Shape s: lst) {
			System.out.println(s);
		}
	}
	
	static void drawShapesGeneric(ArrayList<? extends Shape> lst) {
		
		for (Shape s: lst) {
			System.out.println(s);
		}
	}
	
	
}
