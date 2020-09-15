package sol;

/** 
 * Some practice functions for basic Java syntax.
 * 
 * @author sadiasharmin
 *
 */
public class PracticeFunctions {

	/**
	 * Returns double the given number if the number is odd,
	 * -1 if it's 0, or the same number back if it's even.
	 * 
	 * @param i	an integer input
	 * @return -1 if the given int is 0, double the number if it's odd,
	 * 			or return the same number back
	 */
	public static int get_num(int i) {
		
		if (i % 2 == 1) {
			return i * 2;
		} else if (i == 0) {
			return -1;
		} else {
			return i;
		}
	}
	
	/**
	 * Returns the sum of all even numbers up to the given integer.
	 * 
	 * @param n	any integer
	 * @return the sum of all even integers up to n
	 */
	public static int add_evens(int n) {
		
		int s = 0;
		int i = 2;
		
		while (i <= n) {
			s += i;
			i = i + 2;
		}
		
		return s;
	}
	
	/**
	 * Returns the sum of all odd numbers up to the given integer.
	 * 
	 * @param n	any integer
	 * @return the sum of all odd integers up to n
	 */
	public static int add_odds(int n) {
		
		int s = 0;
		
		for (int i = 1; i < n; i += 2) {
			s += i;
		}
		
		return s;
	}
	
	public static void main(String[] args) {
		
		System.out.println(get_num(5));
		System.out.println(add_odds(8));

	}
}
