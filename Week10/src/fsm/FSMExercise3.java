package fsm;

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

				boolean matches = recognizeSomethingRegex(line);
				System.out.println("SomethingRegex " + FSMResult(matches) + ": " + line);

				matches = recognizeSomethingFSM(line);
				System.out.println("SomethingFSM " + FSMResult(matches) + ": " + line);
				
				System.out.print("\nEnter a string: ");
			}
		} catch (IOException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Come up with some strings so that recogniseSomethingRegex returns true
	// TODO: Exercise 3.1 - Write a javadoc for the function below that describes what this recognizes 
	public static boolean recognizeSomethingRegex(String s) {
		
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
	// TODO: Exercise 3.2 - Write a javadoc for the function below that describes what this recognizes 
	public static boolean recognizeSomethingFSM(String s) {
		
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
