package sol;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExercises {

	/**
	 * Return the number of elements in the given array arr1
	 * which also occur in the given ArrayList arr2.
	 * 
	 * @param arr1	an array of elements
	 * @param arr2	an ArrayList of elements
	 * 
	 * @return	the number of elements in arr1 that occur in arr2
	 */
	public static int countSimilar(int[] arr1, ArrayList<Integer> arr2) {
		
		int n = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr2.contains(arr1[i])) {
				n++;
			}
		}
		
		return n;
		
	}

	public static void main(String[] args) {

		/**
		 * Write code below that creates an array of elements
		 * and an ArrayList of elements, and prints out the result
		 * of calling the above function with these values.
		 */
		
		int[] arr1 = {4, 5, 6, 8};
		ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5, 5, 5));
		System.out.println(countSimilar(arr1,arr2));
		
	}

}
