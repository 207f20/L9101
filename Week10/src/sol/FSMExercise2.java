package sol;

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
				
				boolean matches = recognise5Regex(line);
				System.out.println("5Regex " + FSMResult(matches) + ": " + line);
				
				matches = recognise5FSM(line);
				System.out.println("5FSM " + FSMResult(matches) + ": " + line);
	
				System.out.print("\nEnter a string: ");
			}
		} catch (IOException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * This recogniser uses a regular expression to determine whether s represents a
	 * multiple of 5
	 * 
	 * @param s
	 * @return whether s is the string representation of a multiple of 5
	 */
	public static boolean recognise5Regex(String s) {
		Pattern p = Pattern.compile("^\\d*(0|5)$");
		Matcher m = p.matcher(s);
		return m.matches();
	}

	/**
	 * This recogniser uses a Finite State Machine to determine whether s represents
	 * a multiple of 5
	 * 
	 * @param s
	 * @return whether s is the string representation of a multiple of 5
	 */
	public static boolean recognise5FSM(String s) {

		char[] c = s.toCharArray(); // so you can get a char by c[i]
		int len = s.length();

		int n = 0; 
		int state = 0; // Start out in the initial state
		while (n < len) {
			switch (state) {
			case 0:
				if (c[n] == '0' || c[n] == '5')
					state = 1;
				else if ('0' < c[n] && c[n] <= '9')
					state = 0;
				else
					state = 2;
				break;
			case 1:
				if (c[n] == '0' || c[n] == '5')
					state = 1;
				else if ('0' < c[n] && c[n] <= '9')
					state = 0;
				else
					state = 2;
				break;
			case 2:
				break;
			}
			n = n + 1;
		}
		return state == 1;
	}
}
