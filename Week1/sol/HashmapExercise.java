package sol;

import java.util.HashMap;

public class HashmapExercise {

	/**
	 * Return a HashMap that includes each unique element in the given
	 * array as a key, and the number of times that element occurs in the
	 * array as the value.
	 * 
	 * @param arr1	an array of elements
	 * 
	 * @return a hashmap that shows frequency count of elements in given array
	 */
	public static HashMap<Integer, Integer> countFrequencies(int[] arr1) {
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr1.length; i++) {
						
			hm.put(arr1[i], hm.getOrDefault(arr1[i], 0)+1);
			
			/* alternatives:
			if (hm.containsKey(arr1[i])) {
				hm.put(i, hm.get(arr1[i])+1);
			} else {
				hm.put(arr1[i], 1);		
			}
			*/
			
		}
		
		return hm;
		
	}

	public static void main(String[] args) {

		/**
		 * Write code below that creates an array of integers
		 * and prints out the result of calling the above function
		 * on it.
		 */
		
		int[] arr = {1, 2, 3, 4, 1, 1, 3, 3, 3, 5};
		System.out.println(countFrequencies(arr));
	}
	
}
