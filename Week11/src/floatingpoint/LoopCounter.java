package floatingpoint;

public class LoopCounter {

	public static void main(String[] args) {

		// Attempt 1
		for (float x = 0.1f; x != 1.0f; x += 0.1f) {
			System.out.println(x);
		}
		
		// Attempt 2
		for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		} 

		System.out.println("====");
		// Attempt 3
		for (int count = 1; count <= 10; count += 1) {
			float x = count / 10.0f;
			System.out.println(x);
		}
	}
}