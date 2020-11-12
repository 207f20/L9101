package sol;

/**
 * For the Composite Design Pattern:
 * - You have an object A that supports some operations and
 *   then you have another object B that is an aggregation of objects of type A.
 * - You want to be able to treat them both with the same interface, ignoring their differences  
 *
 * TO DO THIS:
 * 1. Create an abstract class (the component) that includes shared operations
 * 2. Both the individual (the leaf) and the aggregate (the composite) object will extend this abstract class
 * 
 * SOURCE: https://iluxonchik.github.io/design-patterns-notes/
 */

public abstract class SheepComponent {
	  public abstract void sheer();
}
