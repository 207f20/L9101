package fsm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FSMExercise2 {

	public static String FSMResult(boolean b) {
		return b ? "ACCEPTS" : "REJECTS";
	}
	
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String line;
		System.out.print("\nEnter a string: ");
		try {
			while ((line = in.readLine()) != null) {
								
				boolean matches = recognize5Regex(line);
				System.out.println("5Regex " + FSMResult(matches) + ": " + line);
				
				matches = recognize5FSM(line);
				System.out.println("5FSM " + FSMResult(matches) + ": " + line);
				
				System.out.print("\nEnter a string: ");
			}
		} catch (IOException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// TODO: EXERCISE 2.1 - Complete the regex below
	/**
	 * This recognizer uses a regular expression to determine whether s represents a
	 * multiple of 5
	 * 
	 * @param s
	 * @return whether s is the string representation of a multiple of 5
	 */
	public static boolean recognize5Regex(String s) {
		Pattern p = Pattern.compile(""); // TODO: Fill in a regex string here that matches numerical strings that are a multiple of 5
		Matcher m = p.matcher(s);
		return m.matches();
	}


	// TODO EXERCISE 2.2 - Complete the code for this function to have an FSM that matches what is described.
	// You can use FSMExample as an example of how to structure FSM code.
	/**
	 * This recognizer uses a Finite State Machine to determine whether s represents
	 * a multiple of 5
	 * 
	 * @param s
	 * @return whether s is the string representation of a multiple of 5
	 */
	public static boolean recognize5FSM(String s) {

		char[] c = s.toCharArray(); // so you can get a char by c[i]
		int len = s.length();

		int n = 0; 
		int state = 0; // Start out in the initial state
		while (n < len) { 
			// TODO: YOUR CODE HERE
		}
		return false; // TODO: Fix this return statement
	}

}
