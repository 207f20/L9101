package sol;

/**
 * An implementation of the Stack data structure based on SimpleLinkedList.
 */
public class LLStack<T> implements Stack<T> {

    private SimpleLinkedList<T> stack;
    int size = 0;

    /**
     * Constructs an empty LLStack which uses a SimpleLinkedList.
     */
    // The front of the SimpleLinkedList represents the top of the stack.
    public LLStack()
    {
        stack = new SimpleLinkedList<T>();
    }

    /**
     * Pushes obj onto stack.
     * @param obj is pushed onto stack.
     */
	@Override
    public void push(T obj){
        Node<T> node = new Node<>();
        node.value = obj;
        node.next = stack.getFirst();
        stack.setFirst(node);
        this.size++;
    }

    /**
     * Pops the top object on stack.
     * @return the top object on stack.
     */
	@Override
    public T pop(){
        Node<T> node;
        if (isEmpty() ){
            return null;
        }
        else
            node = stack.getFirst();
        this.size--;
        stack.setFirst(node.next);
        return node.value;
    }

    /**
     * Returns true when the stack is empty, false otherwise.
     * @return
     */
	@Override
    public boolean isEmpty(){
        return (stack.getFirst() == null);
    }

     // Exercise: Complete the two methods below, including the documentation!
	@Override
	/**
	 * Return the top element of this stack.
	 * @return top element of this stack
	 */
	public T top() {
		return stack.getFirst().value;
	}

	@Override
	/**
	 * Return the size of this stack.
	 */
	public int size() {
		return this.size;
	}
}

/**
 * A node class - each node has some value and has a next
 * attribute which refers to null or another Node object.
 */
class Node<T> {
    public T value;
    public Node<T> next;
}


/**
 * A minimal implementation of LinkedList.
 */
class SimpleLinkedList<T> {
    private Node<T> first;

    /**
     * Constructor for SimpleLinkedList.
     * @param elements a list of elements to build the LinkedList from
     */
    public SimpleLinkedList() {
        first = null;
    }

    /**
     * Returns the Node of the first element in the LinkedList.
     * @return the Node of the first element.
     */
    public Node<T> getFirst() {
        return first;
    }

    /**
     * Sets the first element to first.
     * @param first the Node to set the first element to
     */
    public void setFirst(Node<T> first) {
        this.first = first;
    }
}

