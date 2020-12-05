package sol;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExercises {

	public static void main(String[] args) {

	    /**
	     * Exercise 3.1: Rewrite the pattern below be more concise
	     */
	    Pattern p = Pattern.compile("CSC([0-9]{3})H1([FSY])"); // Rewrite the regex here 
	    Matcher m = p.matcher("CSC207H1S");
	    System.out.println(m.matches());
	    System.out.println(m.group(0));  // the entire string
	    System.out.println(m.group(1));  // the first group: 207
	    System.out.println(m.group(2) + "\n");  // the second group: S
	
		/**
		 * Exercise 3.2
		 * 
		 * Fill in a regex below that will match lines in a CSV file with format
		 * 	
		 * 		Name,StudentNumber,mark
		 * 
		 * Examples:
		 * 		sid smith,111111111,23
		 * 		jane samantha doe,0123456789,100
		 */
		
	    /**
	     * possible attempts (the last two are "best" - most specific):
	     	(.*),(.*),(.*)
			(.*),(\\d*),(.*)
			(.*),(\\d{9}|\\d{10}),(.*)
			(.*),(\\d{9}\d?),(.*)
			(.*),(\\d{9}\d?),((100)|([1-9]?\\d))
			(.*),(\\d{9,10}),((100)|([1-9]?\\d))
	     */
		String regex2 = "(.*),(\\d{9,10}),((100)|([1-9]?\\d))"; // Assign this "regex" string to be your solution for 2.2	
	    Pattern p2 = Pattern.compile(regex2);
	    Matcher m2 = p2.matcher("sid smith,111111111,23");
	    System.out.println("Does sid smith,111111111,23 match " + p2 + " ?");
	    System.out.println(m2.matches());
	    System.out.println("Does jane samantha doe,0123456789,100 match " + p2 + " ?");
	    System.out.println(p2.matcher("jane samantha doe,0123456789,100").matches() + "\n");
	

		/**
		 * Exercise 3.3
		 * 
		 * Fill in a regex below that will match phone numbers in either of the following formats:
		 * 	
		 * 		###-###-####
		 * 		(###)-###-####
		 * 		###-####
		 * 
		 * Examples:
		 * 		416-123-4567
		 * 		(416)-123-4567
		 * 		123-4567
		 */	
		String regex3 = "(\\(?\\d{3}\\)?-)?\\d{3}-\\d{4}"; // Assign this "regex" string to be your solution for 2.3
	    // The above does match some incorrect things though, e.g. it would match "416)-123-4567"
		// So, let's fix that:
		regex3 = "(((\\(\\d{3}\\))|(\\d{3}))-)?\\d{3}-\\d{4}"; 
		Pattern p3 = Pattern.compile(regex3);
	    Matcher m3 = p3.matcher("416-123-4567");
	    System.out.println("Does 416-123-4567 match " + p3 + " ?");
	    System.out.println(m3.matches());
	    System.out.println("Does (416)-123-4567 match " + p3 + " ?");
	    System.out.println(p3.matcher("(416)-123-4567").matches());
	    System.out.println("Does 123-4567 match " + p3 + " ?");
	    System.out.println(p3.matcher("123-4567").matches() + "\n");
	    System.out.println("Does 416)-123-4567 match " + p3 + " ?");
	    System.out.println(p3.matcher("416)-123-4567").matches() + "\n");	    
	}

}