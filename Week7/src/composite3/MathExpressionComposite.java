package composite3;

// A composite expression component is something like (x+y) or (x/y)
// with two operands and an operator. The operator can be +, -, * or /
public class MathExpressionComposite {
	
	// Exercise: TODO – Complete this class
	
	public String toString() {
		return "(" + this.left.toString() + operator + this.right.toString() + ")";
	}
}
