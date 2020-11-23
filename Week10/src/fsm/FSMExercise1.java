package fsm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FSMExercise1 {
 
	// Come up with some strings so that recogniseSomethingFSM returns true
	// TODO EXERCISE 1: Describe what this recognizes by filling in the javadoc below.
	// You can run this file to test out your answer by trying out different strings and seeing if the fsm matches them.
	/**
	 * This function represents an FSM that matches strings which ...
	 * 
	 * @param s	String to check for match with
	 * @return true iff the fsm in this function matches the given String s, false otherwise
	 */
	public static boolean recogniseSomethingFSM(String s) {
		
		char[] c = s.toCharArray();
		
		int len = s.length();
		// We can now access the characters of s one at a time via c[0], c[1],
		// ..., c[len-1]

		boolean retVal = true; // return value signifies whether or not we accept or reject the given s

		int n = 0;
		int state = 0; // Start out in the initial state
		while (n < len) {
			switch (state) {
			case 0: // We are in state 0
				if ('A' <= c[n] && c[n] <= 'Z')
					state = 0; // Reading a capital letter between A-Z keeps us at state 0
				else if ('a' <= c[n] && c[n] <= 'z')
					state = 1; // Move to state 1
				else
					state = 2; // Move to state 2
				break;
			case 1:
				if ('a' <= c[n] && c[n] <= 'z')
					state = 1;
				else
					state = 2;
				break;
			case 2: // State 2 is our trap state that will never be accepted
				break;
			}
			n = n + 1;
		}
		
		if (state == 2) 
			retVal = false;
		
		// Which are our accepting state(s) in this fsm?
		return retVal;
	}
	

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		System.out.println("Give me a string: ");
		try {
			while ((line = in.readLine()) != null) {
				
				if (recogniseSomethingFSM(line)) {
					System.out.println("recogniseSomethingFSM accepts " + line);
				} else {
					System.out.println("recogniseSomethingFSM rejects " + line);
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
