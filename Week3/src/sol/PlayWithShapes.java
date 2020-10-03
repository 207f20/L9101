package sol;

import java.util.ArrayList;

public class PlayWithShapes {
	
	public static void main(String args[]) {
		
		// Q1: What's wrong with the line below?
		// Shape s = new Shape(1, 2);
		// You cannot instantiate an abstract class!
		// How would toString work?? getArea does not have a body yet!
		
		Circle c = new Circle(0, 0, 5);
		System.out.println(c); // Q2: Whose toString is called in this line?
		// Circle.toString is being called - method overriding
		
		// Q3: What's happening in the line below?
		Shape c2 = new Circle(1, 1, 5);
		// A Circle object is constructed, and auto-converted to be of type Shape.
		
		// Q4: What's wrong with the line below, and how can I make minimal
		//		changes to it to access setRadius?
		// Because I am acting like a parent,
		// I can only do things my parent can do!
		// c2.setRadius(6);

		// If I cast to Circle it works now:
		((Circle)c2).setRadius(6);
		// The casting is safe only if you know that c2 is indeed a Circle
		
		System.out.println(c2); // Q5: Whose toString is called in this line?
		// Circle.toString is being called - method overriding occurs despite 
		// being converted to parent type
		
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
		// Java determines the right method to call based on the object and method overriding
		
		ArrayList<Circle> circle_array = new ArrayList<Circle>();
		
		circle_array.add(new Circle(1, 2, 3));
		circle_array.add(new Circle(4, 5, 6));
		
		// Q7: What's wrong with the code below?
		// The following line causes compiler error because ArrayList<Circle> is NOT 
		// a sub-type of ArrayList<Shape>, therefore auto-conversion cannot happen
		//drawShapes(circle_array);

		
		// Q8: This works, what's the difference?
		drawShapesGeneric(circle_array);
		
	}
	
	static void drawShapes(ArrayList<Shape> lst) {
		
		for (Shape s: lst) {
			System.out.println(s);
		}
	}

	// Use wildcard "?", this function takes an ArrayList of unknown type 
	// that is a sub-type of Shape
	static void drawShapesGeneric(ArrayList<? extends Shape> lst) {
		
		for (Shape s: lst) {
			System.out.println(s);
		}
	}
	
	
}
