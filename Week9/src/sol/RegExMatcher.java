package sol;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/*
 * 
 * You can run this file's regex matcher and try out some strings with the above regular expression to
 * test out your answer.
 * 
 * EXERCISE 2.1
 * Describe in simple, plain English what sorts of strings the following regex will match:

		^[a-zA-Z]\d[a-zA-Z]\s?\d[a-zA-Z]\d$

 * Put your answer as a comment below:
 * 
 * 	Matches Canadian postal code, with or without postal code in the middle.
 * 	"A Canadian postal code is in the format A1A 1A1, 
 * 	where A is a letter and 1 is a digit, with an optional space separating 
 * 	the third and fourth characters."
 * 
 * 
 * 
 * EXERCISE 2.2
 * Describe in simple, plain English what sorts of strings the following regex will match:

	^[\w\.]+@([\w]+\.)+[\w]{2,4}$

 * Put your answer as a comment below:
 * 
 * 	Matches a simple email address where the email username consists of alphanumeric characters (or
 * 	underscores or periods) followed by the "@" symbol, and then a domain name that also consists of
 * 	alphanumeric or underscore/period characters, followed by a "." and then 2-4 more alphanumeric
 * 	characters.
 * 
 * 
 * EXERCISE 2.3
 * Describe in simple, plain English what sorts of strings the following regex will match:

	^-?\d+(,\d+)*(\.\d+)?$

 * Put your answer as a comment below:
 * 
 * 	Matches a number that could be a negative or positive number, could include commas (e.g. 100,000)
 * 	and could include a decimal (e.g. 7.8)
 * 
 * 
*/

public class RegExMatcher {

    /**
     * Prompts the user to enter a regular expression and a string, 
     * and reports whether that regular expression matches the string.
     * The user types quit to exit.
     * @throws IOException 
     */
    public static void doMatching() throws IOException {
    	
    	try {
			BufferedReader lineInput = new BufferedReader(new InputStreamReader(System.in));
			String oldRe = "", re = "";
	        
	        while (!re.equals("quit")) {
		        System.out.print("Regular expression: ");
		        re = lineInput.readLine();
	        	if (re.equals(""))
					re = oldRe;
				if (re.equals("quit"))
					return;
				oldRe = re;
				System.out.print("String: ");
				String line = lineInput.readLine();
				System.out.println(Pattern.matches(re, line));
	        }
	
	        lineInput.close();
    	} catch (Exception e) {
    		System.out.println("IOException occured");
		}
    }
    
    public static void main(String[] args) throws IOException {
    	doMatching();
    }
}
