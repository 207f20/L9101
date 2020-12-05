package sol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FSMExercise3 {

	public static String FSMResult(boolean b) {
		return b ? "ACCEPTS" : "REJECTS";
	}
	
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String line;
		System.out.print("\nEnter a string: ");
		try {
			while ((line = in.readLine()) != null) {
				
				boolean matches = recogniseSomethingRegex(line);
				System.out.println("SomethingRegex " + FSMResult(matches) + ": " + line);

				matches = recogniseSomethingFSM(line);
				System.out.println("SomethingFSM " + FSMResult(matches) + ": " + line);
				
				System.out.print("\nEnter a string: ");
			}
		} catch (IOException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Come up with some strings so that recogniseSomethingRegex returns true
	// Describe what this recognises.
	/**
	 * Return true iff the given string matches the following language:
	 * 	All starts that start with "ababab" and ends with a ":" symbol, followed by
	 *  a combination of 2s, 3s and 4s, followed by one or more occurrences of "end".
	 * 
	 * @param s String to check
	 * @return true if the string matches, false otherwise
	 */
	public static boolean recogniseSomethingRegex(String s) {
		
		Pattern p = Pattern.compile("^(ab){3}(.*):(2|3|4)+(end)+$");
		Matcher m = p.matcher(s);
		if (m.matches()) {
			System.out.println("Groupcount: " + m.groupCount());
			System.out.println("Group 1: " + m.group(1));
			System.out.println("Group 2: " + m.group(2));
			System.out.println("Group 3: " + m.group(3));
			System.out.println("Group 4: " + m.group(4));
			return true;
		} else {
			return false;
		}
	}

	// Come up with some strings so that recogniseSomethingFSM returns true
	// Describe what this recognises.
	/**
	 * Return true iff the given string matches the following language:
	 * 	All strings that have 0 or more lowercase alphabetical characters followed by 0 or more digits.
	 * 
	 * alternative description from a student during L9101:
	 * "alphanumeric string where any letters are lowercase and precede any numbers in the string"
	 * 
	 * @param s String to check
	 * @return true if the string matches, false otherwise
	 */
	public static boolean recogniseSomethingFSM(String s) {
		
		char[] c = s.toCharArray();
		int len = s.length();
		// We can now access the characters of s one at a time via c[0], c[1], ...,
		// c[len-1]

		int n = 0;
		int state = 0; // Start out in the initial state
		while (n < len) {
			switch (state) {
			case 0:
				if ('a' <= c[n] && c[n] <= 'z')
					state = 0;
				else if ('0' <= c[n] && c[n] <= '9')
					state = 1;
				else
					state = 2;
				break;
			case 1:
				if ('0' <= c[n] && c[n] <= '9')
					state = 1;
				else
					state = 2;
				break;
			case 2:
				break;
			}
			n = n + 1;
		}
		return state == 0 || state == 1;
	}
}
