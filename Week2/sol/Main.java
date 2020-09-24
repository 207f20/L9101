class Main {

  public static void main(String[] args) {
    
    Circle c = new Circle(12);
    System.out.println(c);
    System.out.println(Circle.getNumCircles());

    Circle c2 = new Circle(34, "red");
    System.out.println(c2);
    System.out.println(Circle.getNumCircles());

    Circle c3 = new Circle(304, "pink");
    System.out.println(c3);
    System.out.println(Circle.getNumCircles());
  }

}