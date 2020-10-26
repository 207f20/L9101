package designpatterns.singleton;

/**
 * 
 * The Singleton Pattern ensures that there is only one instance of the class and 
 * provides a global point to access that instance.
 * 
 * - includes a private constructor (so new Singleton() can't be called by other classes) 
 * - includes a static variable which this class uses to keep track of its sole instance
 * - includes a static method which returns this
 * 
 * Why have a getInstance?
 * - instead of calling “new”, we ask the class itself to provide an instance
 * 
 * Why static?
 * - since we never directly instantiate this class, the method has to be static 
 * 
 * Note: We use "lazy initialization" (the instance of the class isn’t created until getInstance() is actually called).
 * 
 * > Source: https://iluxonchik.github.io/design-patterns-notes/
 * 
 */

public class Singleton {

	private static Singleton instance = null;
	
	// Make the constructor private
	private Singleton() { }
	
	public static Singleton getInstance() {
		// lazy initialization
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}

