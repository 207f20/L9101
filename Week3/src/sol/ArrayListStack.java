package sol;

import java.util.ArrayList;

/**
 * An implementation of the Stack data structure using an ArrayList.
 * 
 * Note: 
 * Complete this class so it implements the Stack interface.
 * It must also use generics so that the ArrayList can be constrained 
 * 		to hold objects of type T, where the type is set when an
 * 		ArrayListStack instance is declared.
 * You can use built-in ArrayList methods (like add and remove) within your code.
 */
public class ArrayListStack<T> implements Stack<T> {

    /**
     * The contents of this Stack.  The top item is at the end of the list.
     */
    private ArrayList<T> contents;

    /**
     * Constructs an empty ArrayListStack.
     */
    public ArrayListStack() {
        contents = new ArrayList<>();
    }

    /**
     * Pushes obj onto stack.
     * @param obj is pushed onto stack.
     */
    public void push(T value) {
        contents.add(value);
    }

    /**
     * Return the top value of the stack
     * @return the top value of the stack
     */
    public T top() {
        return contents.get(contents.size()-1);
    }

    /**
     * Remove and return the top value
     * @return the top value
     */
    public T pop() {
        return contents.remove(contents.size()-1);
    }

    /**
     * Return whether there are any items in this stack
     * @return true when the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return contents.size() == 0;
    }

    /**
     * Return the number of items in this Stack
     * @return the number of items in this Stack
     */
    public int size() {
        return contents.size();
    }

}

