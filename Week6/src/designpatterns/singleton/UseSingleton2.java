package designpatterns.singleton;

public class UseSingleton2 {
	
	public static void main(String[] args) {
		
		// Singleton s1 = new Singleton(); -- cannot do this for our singleton, the constructor is private so this gives error
		
		Singleton2 s1 = Singleton2.getInstance(); // this is the correct way to use our singleton class
		System.out.println("s1's colour is " + s1.getColour());
		
		Singleton2 s2 = Singleton2.getInstance();
		s2.setColour("green");
		System.out.println("s2's colour is " + s2.getColour());
		System.out.println("s1's colour is " + s1.getColour());
		
		// compare if the two references are the same
		System.out.println("s1 == s2: " + (s1 == s2));
	
	}
}