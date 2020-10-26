package designpatterns.singleton;

public class UseSingleton {

	public static void main(String[] args) {
		
		//Singleton s1 = new Singleton(); -- cannot do this for our singleton, the constructor is private so this gives error
		//Singleton s2 = new Singleton();
		
		Singleton s1 = Singleton.getInstance(); // this is the correct way to use our singleton class
		
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1 == s2); // compares the references
		
		
		// Aside: remember how equality comparison works
		Integer a = new Integer(3);
		Integer b = new Integer(3);
		System.out.println(a == b);  // compares the reference
		System.out.println(a.equals(b)); // compares the value
		
	}
}
