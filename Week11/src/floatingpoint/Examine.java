package floatingpoint;

public class Examine {

	public static void main(String[] args) {

		float x;

		// Compute the single precision IEEE floating-point approximation
		// to 4/5
		// You need to say "f" to get single precision (i.e. float)
		// constants rather than double precision (i.e double) constants.
		x = 4.0f / 5.0f;

		// print the value of x to 5 decimal places
		System.out.println(String.format("x = %.5f  \n", x));

		// to 16 decimal places
		System.out.println(String.format("x = %.16f \n", x));

		// Some binary to float conversion
		System.out.println("FloatToBinary: " + floatToBinary(-0.8f));
		System.out.println("BinaryToFloat: " + binaryToFloat("10111111010011001100110011001101"));

	}

	static String floatToBinary(float x) {
		int intBits = Float.floatToRawIntBits(x);
		String s = Integer.toBinaryString(intBits);
		return String.format("%32s", s).replace(' ', '0');
	}

	static float binaryToFloat(String s) {
		if (s.length() != 32) {
			System.out.println("Not a valid binary string for float, must be 32-bit");
			return Float.NaN;
		}
		// Use long integer first then cast down to int
		long intBits = Long.parseLong(s, 2);
		return Float.intBitsToFloat((int)intBits);
	}
}