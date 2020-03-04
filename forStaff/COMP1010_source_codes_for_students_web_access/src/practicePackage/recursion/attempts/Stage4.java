package practicePackage.recursion.attempts;

import java.math.BigInteger;
import java.util.ArrayList;

public class Stage4 {
	@SuppressWarnings("unused")
	private static int[] fibLookupTable = new int[100];
	
	/**
	 * 
	 * @param data: assumed to be sorted in ascending order
	 * @param target: item to find
	 * @param start: starting index
	 * @param end: ending index (assume start is less than or equal to end)
	 * @return an index at which target exists in the array data, -1 if target doesn't exist
	 */
	public static int binarySearch(int[] data, int target, int start, int end) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param x
	 * @param n
	 * @return x to the power of n. 
	 * should have O(log n) complexity, not O(n) complexity
	 */
	public static int fastPower(int x, int n) {
		return 0;
	}

	/**
	 * fibonacci sequence is a sequence where the first two terms
	 * are 0 and 1 and every subsequent term is the sum of the two terms
	 * before it
	 * @param n
	 * @return term at index n in fibonacci sequence.
	 * should have O(n) complexity
	 * 
	 * HINT: use lookup tables. fibLookupTable is created as a static variable 
	 * for you to use
	 * 
	 * FOR EXAMPLE,
	 * fastFibonacci(0) = 0
	 * fastFibonacci(1) = 1
	 * fastFibonacci(3) = 2
	 * fastFibonacci(6) = 8
	 * fastFibonacci(8) = 21
	 */
	public static int fastFibonacci(int n) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param n
	 * @param k
	 * @return (better explained with an example)
	 * return null if n is 0 or k is less than 0 or k is more than or equal to factorial(n)
	 * Say n = 5
	 * Create a String "12345" (using helper getString)
	 * The list of permutations in lexicographic order are:
	 * 
	 * "12345" (k=0)
	 * "12354" (k=1)
	 * "12435" (k=2)
	 * "12453" (k=3)
	 * "12534" (k=4)
	 * "12543" (k=5)
	 * "13245" (k=6)
	 * ...
	 * 
	 * return the permutation at index k
	 */
	public static String getPermutation(int n, int k) {
		return null; //to be completed
	}
	
	//helper for getPermutation
	//n = 5 -> return 120
	//n = 7 -> return 5040
	public static int factorial(int n) {
		if(n <= 1)
			return 1;
		return n*factorial(n-1);
	}

	//helper for getPermutation
	//n = 5 -> return "12345"
	//n = 3 -> return "123"
	public static String getString(int n) {
		if(n==1) {
			return "1";
		}
		else {
			return getString(n-1) + n;
		}
	}
	
	/**
	 * Do the same but with O(log n) complexity? 
	 * "How?". Research.
	 */
	public static BigInteger veryFastFibonacci(int n) {
		return null; //to be completed
	}
	
	/**
	 * 
	 * @param data
	 * @return true if it is possible to divide the items of the array 
	 * into two groups, so that the sum of the two groups is the same, 
	 * with these constraints: all the values that are multiple of 5 
	 * must be in one group, and all the values that are a multiple of 3 
	 * (and not a multiple of 5) must be in the other. 
	 * 
	 * For example:
	 * split53(new int[]{3, 5, 6, 10, 3, 3}) = true
	 * (group 1 being: 5 and 10 - adding up to 15,
	 * group 2 being: 3, 6, 3 and 3 - adding up to 15)
	 * other combinations may also exist, but one is enough
	 * 
	 * split53(new int[]{1, 10, 100, 1000}) = false
	 * easy to see why
	 */
	public static boolean split53(int[] data) {
		return false; //to be completed
	}
}
