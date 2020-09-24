/**
  Exercise:
  
  Create a Circle class below, according to the following specifications:

  - A Circle has a radius and a color
  - A Circle instance can be created by providing a radius (which would make the default color 'white'), or by providing both a radius and a custom color
  - When we use System.out.print to print a Circle instance, the resulting string states the circle's radius and color

  Hints:
    - your first line in this file should be "public class Circle"
    - this Circle class should have two separate constructors (one that takes in radius, one that takes in both radius and color)
    - use @Override and toString to override the default string representation of this class
    - refer to course notes for examples (e.g. https://axiom.utm.utoronto.ca/~207/20f/slides/3/intro-classes.html#/2/1)
*/

public class Circle {

  private int radius;
  private String color;

  private static int numCircles;

  public Circle(int radius) {
    //this.radius = radius;
    //this.color = "white";
    this(radius, "white"); // this calls the constructor below
  }
  
  public Circle(int radius, String color) {
    this.radius = radius;
    this.color = color;
    numCircles++;
  }

  public static int getNumCircles() {
    return numCircles;
  }

  public String toString() {
    return this.radius +  ", " + this.color;
  }
}