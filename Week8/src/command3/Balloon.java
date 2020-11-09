package command3;

/**
 * We capture a Balloon which can be inflated, deflated and popped. A Balloon
 * has an amount and capacity. At all times, 0<=amount<=capacity. A Balloon can
 * be inflated only if it is not popped.
 * 
 * @author arnold
 */
public class Balloon {

	private static int numBalloons = 0; // total number of balloons created

	/**
	 * @return the total number of balloons created
	 */
	public static int getNumBalloons() {
		return numBalloons;
	}

	private String color;
	private int amount; // 0<=amount<=capacity
	private int capacity; // 0<=capacity
	private boolean isPopped; // balloons can only be popped once and can never be unpopped
	// if isPopped then capacity and amount should be 0

	/**
	 * Construct a new Balloon with the specified color and non-negative capacity
	 * 
	 * @param color
	 *            the color of the new balloon
	 * @param capacity
	 *            positive, or else balloon constructed with default capacity
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
	 * @return the color of this
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * @return the current amount in this
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * Add amount a to this so long as the total is at most capacity if the total is
	 * larger that capacity, than this is popped
	 * 
	 * @param a : the amount to be added to this, must be positive
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
	 * Remove amount from this so long as this has at least 0 Truing to remove more
	 * than this has leaves this with 0
	 * 
	 * @param a
	 *            the amount to be removed from this, must be positive
	 */
	public void deflate(int amount) {
		if (amount <= 0 || this.isPopped()) {
			return;
		}
		this.amount = this.amount - amount;

		if (this.amount < 0) {
			this.amount = 0;
		}
	}

	/**
	 * pop this, setting amount=capacity=0, this can no longer be inflated.
	 */
	public void pop() {
		if (this.isPopped)
			return; // can't pop this twice
		this.amount = 0;
		this.capacity = 0;
		this.isPopped = true;
	}

	/**
	 * @return the capacity of this
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @return whether this is popped
	 */
	public boolean isPopped() {
		return isPopped;
	}

	/**
	 * @return A string representation of this
	 */
	public String toString() {
		String s = "";
		s = s + "amount=" + this.amount;
		s = s + " capacity=" + this.capacity;
		s = s + " color=" + this.color;
		s = s + " popped=" + this.isPopped;
		return s;
	}
}
