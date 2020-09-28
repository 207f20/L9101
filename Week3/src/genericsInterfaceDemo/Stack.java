package genericsInterfaceDemo;
/*
 * This is an example of an interface: a structure that defines a set of method
 * signatures which a class must implement. If a class implements the interface,
 * it may be referred to using the interface's type. For example, an ArrayStack
 * may be referred to as a Stack, since it implements the Stack interface.
 */

/**
 * A generic stack that provides push, pop, top, and isEmpty
 * functionality.
 */
public interface Stack {

   /**
    * Make value my new top value.
    * @param value the new top value.
    */
   public void push(Object value);

   /**
    * Return the top value.
    * @return the top value.
    */
   public Object top();

   /**
    * Remove and return the top value.
    * @return the top value.
    */
   public Object pop();

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
