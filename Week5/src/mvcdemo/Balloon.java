package mvcdemo;

// EXERCISE 1:
// Modify the class below to act as an Observable (import and extend the appropriate class)
// Balloon should notify its observers anytime it is inflated or popped
//	Hint: Update the inflate and pop methods; call "setChanged" and "notifyObservers(...)" where
//			... is a message stating what just happened
//			The message should be "inflated by [amount]" when the balloon is inflated.
//			and "popped" when the balloon is popped
// If you need more help: read this simple example in Section 3 here https://www.baeldung.com/java-observer-pattern#observer-interface

/**
 * A Balloon to which we can add air.
 * A Balloon has an amount and capacity. Amount is at most capacity and at least 0.
 * A Balloon is popped if we add air that is beyond the capacity.
 * We can add air to the balloon only if it is not popped.
 */
public class Balloon {

	// See http://www.dofactory.com/net/observer-design-pattern
	// https://docs.oracle.com/javase/8/docs/api/

	private static int numBalloons = 0; // total number of balloons created
	private static int numPopped = 0;

	/**
	 * Returns the total number of balloon instances created.
	 * 
	 * @return the total number of balloons created
	 */
	public static int getNumBalloons() {
		return numBalloons;
	}
	
	// the instance variables get declared outside of any method
	private int amount;
	private int capacity;
	private boolean isPopped;
	private String color;

	/**
	 * Create a Balloon with the given color and a default capacity of 100.
	 *
	 * @param color		The colour of this balloon
	 */
	public Balloon(String color) {
		// "this" is like Python's "self"
		this(color, 100); // call the other OVERLOADED constructor
	}

	/**
	 * Create a Balloon with the given color and capacity.
	 *
	 * @param color		The color of this balloon
	 * @param capacity	The capacity of this balloon as an integer
	 */
	public Balloon(String color, int capacity) {
		this.color = color;
		if (this.capacity >= 0) {
			this.capacity = capacity;
		} else {
			this.capacity = 100;
		}
		this.isPopped = false;
		numBalloons++;
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
		return this.isPopped;
	}

	/**
	 * Add amount a to this so long as the total is at most capacity if the total is
	 * larger that capacity, than this is popped
	 * 
	 * @param a the amount to be added to this, must be positive
	 */
	public void inflate(int amount) {
		if (amount < 0 || this.isPopped()) {
			return;
		}
		this.amount = this.amount + amount;

		if (this.amount > this.capacity) {
			this.pop();
		}
	}
	
	/**
	 * Pop this balloon (capacity and amount becomes 0).
	 *
	 * Note: we made this private because user is not supposed to call pop() directly
	 */
	private void pop() {
		if (this.isPopped)
			return; // can't pop this twice
		this.amount = 0;
		this.capacity = 0;
		this.isPopped = true;
		numPopped++; // remember numPopped is static, associated with the class, not the instance
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
				 ", Popped: " + this.isPopped;
		return s;
	}

}
