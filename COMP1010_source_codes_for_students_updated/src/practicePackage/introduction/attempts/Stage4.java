// Cannot use Math library functions for any task

package practicePackage.introduction.attempts;

public class Stage4 {
	/**
	 * 
	 * @param data: assume it's not null
	 * @param target
	 * @return the first index at which target exists in data, -1 if it doesn't exist
	 */
	public int indexOf(int[] data, int target) {
		return -1; //to be completed
	}

	/**
	 * 
	 * @param data: assume it's not null
	 * @param target
	 * @return the LAST index at which target exists in data, -1 if it doesn't exist
	 */
	public int lastIndexOf(int[] data, int target) {
		return -1; //to be completed
	}

	/**
	 * fibonacci sequence begins with a 0 and 1
	 * and each term is the sum of previous two terms.
	 * so 
	 * fibonacci(0) = 0,
	 * fibonacci(1) = 1,
	 * fibonacci(2) = 1,
	 * fibonacci(3) = 2,
	 * fibonacci(4) = 3,
	 * fibonacci(5) = 5,
	 * fibonacci(6) = 8,
	 * fibonacci(7) = 13,
	 * 
	 * @param n (assume n is more than or equal to 0)
	 * @return fibonacci(n)
	 */
	public int fibonacci(int n) {
		return 0; //to be completed
	}

	/**
	 * @param a
	 * @param b
	 * @return the highest integer that divides both a and b.
	 * for example, 
	 * gcd(70, 40) = 10
	 * gcd(-70, 40) = 10
	 * gcd(15, 32) = 1
	 * gcd(-51, 153) = 51
	 */
	public int gcd(int a, int b) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param n (assume n is more than 0)
	 * @return the highest perfect square (square of an integer) that is less than or equal to n
	 * for example, 
	 * highestPerfectSquare(20) = 16
	 * highestPerfectSquare(1) = 1
	 * highestPerfectSquare(278) = 256
	 * highestPerfectSquare(10000) = 10000
	 */
	public int highestPerfectSquare(int n) {
		return 0; //to be completed
	}

	/**
	 * DO NOT use Math library
	 * @param a
	 * @param b
	 * @param c
	 * @return the median of the three integers passed 
	 * (the value that is in the middle when the three are arranged in ascending order) 
	 */
	public int median(int a, int b, int c) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param val (val could be positive or zero or negative)
	 * @return val rounded to the nearest integer.
	 */
	public int roundOffAdvanced(double val) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param val (can be positive or zero or negative)
	 * @return floor of val
	 * floor of a floating-point value is defined as the highest integer
	 * that is less than or equal to the value.
	 * For example, floorAdvanced(4.2) = 4, floorAdvanced(7.0) = 7,
	 * floorAdvanced(5.9999) = 5, floorAdvanced(-3.7) = -4
	 */
	public int floorAdvanced(double val) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param val (val can be positive or zero or negative)
	 * @return ceiling of val
	 * ceiling of a floating-point value is defined as the smallest integer
	 * that is more than or equal to the value.
	 * For example, ceiling(4.2) = 5, ceiling(7.0) = 7,
	 * ceiling(5.9999) = 6, ceiling(-3.7) = -3
	 */
	public int ceilingAdvanced(double val) {
		return 0; //to be completed
	}
	
	/**
	 * 
	 * @param str
	 * @param idx: index that must be removed
	 * @return the String with the character at index idx (if any) removed
	 */
	public String getWithout(String str, int idx) {
		return ""; //to be completed
	}	
	
	/**
	 * 
	 * @param str
	 * @return true if every character in str is a digit ('0' to '9'), false otherwise.
	 * also, return false if str is empty.
	 */
	public boolean isNumeric(String str) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param str
	 * @return the string with all leading zero (0') characters removed.
	 */
	public String withoutLeadingZeroes(String str) {
		return ""; //to be completed
	}
	
	/**
	 * 
	 * @param str
	 * @return the reverse of the String passed
	 */
	public String reverse(String str) {
		return ""; //to be completed
	}
	
	/**
	 * 
	 * @param str
	 * @return true if String remains unchanged when reversed, false otherwise
	 */
	public boolean isPalindrome(String str) {
		return false; //to be completed
	}
}
