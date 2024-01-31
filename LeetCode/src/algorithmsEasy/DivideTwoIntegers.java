package algorithmsEasy;

public class DivideTwoIntegers {
	
	 public static void main(String[] args) {
	        int dividend = 6;
	        int divisor = 3;

	        int result = divide(dividend, divisor);

	        System.out.println("Result of division: " + result);
	    }

	private static int divide(int dividend, int divisor) {
		// TODO Auto-generated method stub
		

		if(dividend == Integer.MIN_VALUE && divisor == -1)
		{
			return Integer.MAX_VALUE;
		}
		
		int sign = (dividend < 0)^(divisor <0)? -1:1;
		
		long absDividend = Math.abs((long)dividend);
		long absDivisor = Math.abs((long) divisor);
		long result = 0;

        // Perform long division
        while (absDividend >= absDivisor) {
            absDividend -= absDivisor;
            result++;
        }

        // Apply the sign to the result
        result *= sign;

        // Ensure the result is within the 32-bit signed integer range
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return Integer.MAX_VALUE; // Overflow case
        }

        return (int) result;
    }
}
