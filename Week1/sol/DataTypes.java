package sol;


public class DataTypes {

	public static void main(String[] args) {
        
		/**
		 * Q1: What's the difference between the variables below?
		 * 
		 * Your answer here:
		 * 
		 * num is primitive int
		 * num2 is an Integer object
		 */
		int num = 456;
		Integer num2 = 456;
		
		/**
		 * Q2.1: What's wrong with the following line? Explain. 
		 * 
		 * Your answer here:
		 * 
		 * we didn't specify the data type for i
		 */

		// Q2.2: Fix the line below.
		int i = 345;
		
		/** 
		 * Q3.1: What's wrong with the following line? Explain.
		 * 
		 * Your answer here: 
		 * 
		 * Must convert to float or make it double
		 */

		// Q3.2: Fix the line below.
		float f = 3222.45f;
		// Alternatives: double f = 3222.45, or float f = (float)3222.45;
		
		/**
		 * Q4.
		 * 
		 * Write code that creates a new double variable (with any decimal 
		 * number value that you want), and then prints it
		 * converted to an integer.
		 * 
		 */
		// Your code here:
		double d = 45.76; // can be any number
		System.out.println((int) d);

		/**
		 * Q5.
		 * 
		 * Write code that creates a new integer variable (with any integer 
		 * number value that you want), and then stores that value as a float
		 * in a new float variable named f2.
		 * 
		 */
		// Your code here: 
		
		int i2 = 3;
		float f2 = i2; // type casting is unnecessary here
		
		
		/**
		 * Q6: What is happening in the lines of code below? Explain.
		 * 
		 * Your answer here:
		 * c automatically gets converted into an integer (the ascii code
		 * associated with 'A' in this case), and then we print that int out
		 * 
		 */
		char c = 'A';
		int c_as_int = c;
		System.out.println(c_as_int);
		

		/**
		 * Q7: Fix the code below so it prints A.
		 */
		int j = 65;
		char c2 = (char) j;
		System.out.println(c2);
		
		
		/**
		 * Q8: What are all the type conversions happening below?
		 * 
		 * Your answer here:
		 * - when we divide 1.0/2, to avoid loss of data the 
		 *   result will be a double
		 * - we're adding this to another double when we type cast 1/2
		 *   (which would have usually resulted in an integer 0, but with
		 *   the type cast to double it becomes 0.5)
		 * - adding two doubles = a double: 0.5+0.5= 1.0
		 * - and then we turn that double into an int (1)
		 */
		j = (int)((1.0/2) + ((double)1/2));
		System.out.println("j = " + j);
		
		
		/**
		 * Q9: Write code to:
		 * - Make two different strings stored in two different string variables.
		 * - Make a third string variable whose value is the two above strings concatenated.
		 * - Use any 2 string methods of your choice and print out the results of each.
		 */
		// Your code here
		
		String s1 = "hello";
		String s2 = "cat";
		String s3 = s1 + s2;
		System.out.println(s1.charAt(2));
		System.out.println(s3.substring(1));
						
		
	}
}
