/**
 * A Balloon to which we can add air.
 * A Balloon has an amount and capacity. Amount is at most capacity and at least 0.
 * A Balloon is popped if we add air that is beyond the capacity.
 * We can add air to the balloon only if it is not popped.
 */
public class Balloon {

	// the instance variables get declared outside of any method
	private int amount;
	private int capacity;
	private boolean popped;
	private String color;

	/**
	 * Create a Balloon with the given color.
	 *
	 * Note: the constructor has the same name as the class
	 * no return type; not even void
	 *
	 * @param color		The colour of this balloon
	 */
	public Balloon(String color) {
		// "this" is like Python's "self"
		this.amount = 0;
		this.capacity = 100;
		this.popped = false;
		this.color = color;
	}

	/**
	 * Create a Balloon with the given color and capacity.
	 *
	 * Note: This is another constructor with a different type signature
	 *
	 * @param color		The color of this balloon
	 * @param capacity	The capacity of this balloon
	 */
	public Balloon(String color, int capacity) {
		// "this" is like Python's "self"
		this.amount = 0;
		this.capacity = capacity;
		this.popped = false;
		this.color = color;
	}

	/**
	 * Get the colour of this balloon
	 *
	 * @return	The color of this balloon
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * Get the amount of air in this balloon
	 *
	 * @return	The amount of air in this balloon
	 */
	public int getAmount() {
		return this.amount;
	}

	/**
	 * Set the amount of air in this balloon
	 *
	 * Note: we made this private because user is not supposed to set the amount
	 */
	private void setAmount(int amnt) {
		this.amount = amnt;
	}

	/**
	 * Set the air capacity of this balloon
	 *
	 * Note: we made this private because user is not supposed to set the amount
	 */
	private void setCapacity(int amnt) {
		this.capacity = amnt;
	}

	/**
	 * Get the air capacity of this balloon
	 *
	 * @return	The air capacity of this balloon
	 */
	public int getCapacity() {
		return this.capacity;
	}

	/**
	 * Return True if this balloon is popped and false otherwise.
	 *
	 * @return	Whether or not this balloon is popped
	 */
	public boolean isPopped() {
		return this.popped;
	}

	/**
	 * Pop this balloon (capacity and amount becomes 0).
	 *
	 * Note: we made this private because user is not supposed to call pop() directly
	 */
	private void pop() {
		this.setAmount(0);
		this.setCapacity(0);
		this.popped = true;
		System.out.println("BOOM!");
	}

	/**
	 * Add the given amount of air to this balloon.
	 * If this inflation exceeds capacity, pop the balloon.
	 * If a is a negative number or the balloon is already popped,
	 * nothing happens.
	 *
	 * @param a  The amount of air to add to this balloon
	 */
	public void addAir(int a) {
		if (!this.isPopped() && a > 0) {
			this.amount += a;
			if (this.amount > this.capacity) {
				this.pop();
			}
		}
	}

	/**
	 * Return string representation of this balloon
	 *
	 * @return s	The string representation of this balloon
	 */
	public String toString() {
		// complete this
		String s = "Colour: " + this.color +
				 ", Amount: " + this.amount +
				 ", Capacity: " + this.capacity +
				 ", Popped: " + this.popped;
		return s;
	}
}
