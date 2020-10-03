package sol;
/*
 * This is an example of an interface: a structure that defines a set of method
 * signatures which a class must implement. If a class implements the interface,
 * it may be referred to using the interface's type. For example, an ArrayStack
 * may be referred to as a Stack, since it implements the Stack interface.
 *
 * This interface also demonstrates the use of generics. The <T> following the 
 * interface name means that the class is parameterized by a type. This allows
 * us to implement Integer Stacks, Double Stacks, or even Balloon Stacks. 
 * When an instance of an implementing class is created, the user must specify 
 * what the type T is for that instance.
 */

/**
 * A generic stack that provides push, pop, top, and isEmpty
 * functionality.
 */
public interface Stack<T> {

   /**
    * Make value my new top value.
    * @param value the new top value.
    */
   public void push(T value);

   /**
    * Return the top value.
    * @return the top value.
    */
   public T top();

   /**
    * Remove and return the top value.
    * @return the top value.
    */
   public T pop();

   /**
    * Return whether there are any items in this stack.
    * @return whether there are any items in this stack.
    */
   public boolean isEmpty();

   /**
    * Return the number of items in this Stack.
    * @return the number of items in this Stack.
    */
   public int size();
}
