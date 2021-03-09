package practicePackage.recursion.attempts;

public class Stage2 {
	/**
	 * 
	 * @param n
	 * @return number of digits in n
	 * For example,
	 * 
	 * countDigits(1729) = 4
	 * countDigits(-1729) = 4
	 * countDigits(0) = 0 (That's the termination case)
	 * countDigits(3) = 1
	 * countDigits(8) = 1
	 * countDigits(-43) = 2
	 */
	public int countDigits(int n) {
		n = Math.abs(n); //first step is to make it positive
		return 0; //to be completed
	}

	/**
	 * 
	 * @param n
	 * @return the sum of the even digits in n
	 */
	public int sumEvenDigits(int n) {
		return 0; //to be completed
	}


	/**
	 * 
	 * @param n
	 * @param d (a single digit number)
	 * @return the sum of the digits in n that are more than d
	 */
	public int sumDigitsOver(int n, int d) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param n
	 * @param d: digit to count, d is between 0 and 9 (inclusive on both sides)
	 * @return the number of times digit d exists in integer n
	 * IMPORTANT countDigit(0, d) for any d should return 0
	 * 
	 * countDigit(10074, 0) = 2
	 * countDigit(38, 8) = 1
	 * countDigit(888, 8) = 3
	 * countDigit(12345, 6) = 0
	 * countDigit(0, 0) = 0 (NOT 1)
	 */
	public int countDigit(int n, int d) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param a
	 * @param b (assume b is more than or equal to 1)
	 * @return the product of a and b using ONLY addition operator (+).
	 * you cannot use the multiplication operator (*) 
	 * or the Math library
	 * HINT: multiplication is repeated addition
	 */
	public int product(int a, int b) {
		return 0; //to be completed
	}

	/**
	 * fibonacci sequence is a sequence where the first two terms
	 * are 0 and 1 and every subsequent term is the sum of the two terms
	 * before it
	 * @param n
	 * @return term at index n in fibonacci sequence
	 * 
	 * FOR EXAMPLE,
	 * fibonacci(0) = 0
	 * fibonacci(1) = 1
	 * fibonacci(3) = 2
	 * fibonacci(6) = 8
	 * fibonacci(8) = 21
	 */
	public int fibonacci(int n) {
		return 0; //to be completed
	}

	/**
	 * tribonacci sequence is a variation of fibonacci sequence where the first three terms
	 * are 0, 0 and 1 and every subsequent term is the sum of the THREE terms
	 * before it
	 * @param n
	 * @return term at index n in tribonacci sequence
	 * 
	 * FOR EXAMPLE,
	 * tribonacci(0) = 0
	 * tribonacci(1) = 0
	 * tribonacci(2) = 1
	 * tribonacci(3) = 1
	 * tribonacci(4) = 2
	 * tribonacci(5) = 4
	 * tribonacci(6) = 7
	 * tribonacci(7) = 13
	 */
	public int tribonacci(int n) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param n
	 * @param k
	 * @return n choose k, as explained here: https://en.wikipedia.org/wiki/Combination
	 */
	public int combinations(int n, int k) {
		return 0;
	}
}
