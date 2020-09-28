package genericsInterfaceDemo;

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
public class ArrayListStack {

    /**
     * The contents of this Stack.  
     */
	// The top item is at the end of the list.
    private ArrayList contents;

    /**
     * Constructs an empty ArrayListStack.
     */
    public ArrayListStack() {
        contents = new ArrayList<>();
    }

}
