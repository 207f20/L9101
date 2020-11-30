package bonus;
/**
 * Bonus Exercise: you do not have to hand this in as part of the post-lecture submission this week,
 * but it is highly recommended practice
 */
public class IEEE754Single {
	// See https://docs.oracle.com/javase/8/docs/api/java/lang/Float.html
	// as well as the course notes including additional resources (https://axiom.utm.utoronto.ca/~207/20f/slides/11/float.html#/27)

	private static final int SIGN_MASK= 0x80000000;
	private static final int SIGN_START=31;
	private static final int SIGN_END=31;
	private static final int SIGN_WIDTH=1+SIGN_START-SIGN_END;

    private static final int EXPONENT_MASK=0x7f800000;
	private static final int EXPONENT_START=30;
	private static final int EXPONENT_END=23;
	private static final int EXPONENT_WIDTH=1+EXPONENT_START-EXPONENT_END;

	private static final int MANTISSA_MASK=0x007fffff;
	private static final int MANTISSA_START=22;
	private static final int MANTISSA_END=0;
	private static final int MANTISSA_WIDTH=1+MANTISSA_START-MANTISSA_END;

	// https://en.wikipedia.org/wiki/Exponent_bias
	public static final int BIAS=127; // The bias for IEEE float (exponents in range -126 to +127)
	
	/**
	 * Complete the code below, so that when executed, the output should exactly match 
	 * IEEE754SingleOut.txt included in this project. Do not modify main in any way. 
	 * Implement the methods below so that they perform as expected. You can add additional
	 * static constants as well as static helper methods if it helps.
	 */
	public static void main(String[] args) {
		System.out.println("0 to 10");
		for (float i = 0.0f; i <= 10.0f; i++) {
			System.out.println(binRep(i));
		}
		System.out.println("misc");
		System.out.println(binRep(-6.8f));
		System.out.println(binRep(23.1f));
		System.out.println(binRep(14.625f));
		System.out.println(binRep(.1f));
		System.out.println(binRep(5.75f));
		System.out.println(binRep(1.0f / 3.0f));

		System.out.println("Machine Epsilon");
		float me = machineEpsilon();
		System.out.println("Machine Epsilon = " + binRep(me));
		System.out.println("1+machine epsilon = " + binRep(1.0f + me));
		System.out.println("Underflow");
		System.out.println("Underflow = " + binRep(underflow()));

		// System.out.println("rounds by");
		System.out.println("Overflow");
		System.out.println("Overflow = " + binRep(overflow()));
		System.out.println("MAX_VALUE = " + binRep(Float.MAX_VALUE));
	}
	/**
	 * Search for machine epsilon (eps), that is, the smallest
	 * float such that 1+eps>1. 
	 * Print out progress along the way.
	 * 
	 * @return machine epsilon
	 */
	public static float machineEpsilon() {
		// TODO: FIX THIS CODE
		float one = 1.0f, me = 1.0f, meNew = 1.0f;
		System.out.println(binRep(one + meNew));
		return (me);
	}

	/**
	 * Search for underflow, that is the smallest float
	 * number that is greater than 0. 
	 * Print out progress along the way.
	 * @return underflow
	 */
	public static float underflow() {
		// TODO: FIX THIS CODE
		float ufl = 1.0f, uflNew = 1.0f;
		System.out.println(binRep(uflNew));
		return ufl;
	}

	/**
	 * Search for overflow, the largest float, 
	 * by first finding the largest exponent, and
	 * then finding the largest mantissa. 
	 * Print out progress along the way.
	 * @return overflow
	 */
	
	public static float overflow() {
		// TODO: FIX THIS CODE
		/*
		 * Algorithm: First find the maximum exponent and then the mantissa.
		 */
		System.out.println("Maximum Exponent");
		float ofl = 1.0f, oflNew = 1.0f;
		System.out.println(binRep(ofl));

		/*
		 * Add more (lower order) bits to the mantissa. We rely on round to even here to
		 * stop us.
		 */
		System.out.println("Maximum Mantissa");
		oflNew = ofl;
		float add = ofl;
		System.out.println(binRep(ofl));
		return ofl;
	}

	/**
	 * Take apart a floating point number and return a string representation of it.
	 * @param d the floating point number to investigate
	 * @return By example, this method returns strings like...
	 * 
	 * binRep(0.0f) returns "0[00000000]00000000000000000000000=+0.00000000000000000000000x2^(0)=0.0"
	 * binRep(1.0f) returns "0[01111111]00000000000000000000000=+1.00000000000000000000000x2^(0)=1.0"
	 * binRep(2.0f) returns "0[10000000]00000000000000000000000=+1.00000000000000000000000x2^(1)=2.0"
	 * binRep(14.625f) returns "0[10000010]11010100000000000000000=+1.11010100000000000000000x2^(3)=14.625"
	 * binRep(0.1f) returns "0[01111011]10011001100110011001101=+1.10011001100110011001101x2^(-4)=0.1"
	 */
	// Return information about the representation of floating point number d 
	public static String binRep(float d){
		// Numbers to check: normalized large, near 0, denormalized 
		/*Doc below is from Float.floatToRawIntBits

		Returns a representation of the specified floating-point value according 
		to the IEEE 754 floating-point "single format" bit layout, preserving Not-a-Number (NaN) values.

		Bit 31 (the bit that is selected by the mask 0x80000000) represents the 
		sign of the floating-point number. 

		Bits 30-23 (the bits that are selected by the mask 0x7f800000) represent the exponent. 

		Bits 22-0 (the bits that are selected by the mask 0x007fffff) 
		represent the significand (sometimes called the mantissa) of the floating-point number.

		If the argument is positive infinity, the result is 0x7f800000.

		If the argument is negative infinity, the result is 0xff800000.

		If the argument is NaN, the result is the integer representing the actual NaN value. 
		Unlike the floatToIntBits method, floatToRawIntBits does not collapse all the bit 
		patterns encoding a NaN to a single "canonical" NaN value.

		In all cases, the result is an integer that, when given to the 
		intBitsToFloat(int) method, will produce a floating-point value the same as 
		the argument to floatToRawIntBits.
 		*/

		int l=Float.floatToRawIntBits(d); 
		int sign=(l & SIGN_MASK)>>SIGN_END; sign = Math.abs(sign);
		int exponent=(l & EXPONENT_MASK)>>EXPONENT_END;
		int mantissa=(l &  MANTISSA_MASK);
		String sSign=getBits(SIGN_WIDTH,sign);
		String sExponent=getBits(EXPONENT_WIDTH,exponent);
		String sMantissa=getBits(MANTISSA_WIDTH,mantissa);
		String s=sSign+"["+sExponent+"]"+sMantissa;
		String t=(sign==0)?"+":"-";

		int trueExponent=0;
		if(exponent==0){
			t=t+"0.";
			if(mantissa!=0)trueExponent=(exponent-BIAS)+1;
		} else {
			t=t+"1.";
			trueExponent=exponent-BIAS;
		}
		t=t+sMantissa+"x2^("+trueExponent+")";
		return(s+"="+t+"="+d);
	}

	// Get numBits least significant bits from d as a string
	// Least significant bit is rightmost character in returned string
	private static String getBits(int numBits, int d){
		String s="";
		for(int j=1;j<=numBits;j++){
			s=(d%2)+s;
			d=d>>1;
		}
		return s;
	}
}
