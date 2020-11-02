package composite3;

public class MathExpressionClient {

	public static void main(String[] args) {

		// Create simple expressions
		MathExpressionSimple s1 = new MathExpressionSimple(1);
		MathExpressionSimple s2 = new MathExpressionSimple(2);
		MathExpressionSimple s3 = new MathExpressionSimple(3);
		MathExpressionSimple s4 = new MathExpressionSimple(4);
		MathExpressionSimple s5 = new MathExpressionSimple(5);

		// Make composite expressions
		MathExpressionComposite c1 = new MathExpressionComposite(s1, "+", s2);
		MathExpressionComposite c2 = new MathExpressionComposite(s3, "*", s4);
		MathExpressionComposite c3 = new MathExpressionComposite(c2, "-", s5);
		MathExpressionComposite c4 = new MathExpressionComposite(c1, "+", c3);
		
		// c4 is the whole expression
		System.out.println("The expression is: " + c4.toString());
		System.out.println("It's value is: " + c4.evaluate());

	}
}
