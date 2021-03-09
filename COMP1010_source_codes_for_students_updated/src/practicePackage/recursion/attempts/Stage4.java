package practicePackage.recursion.attempts;

import java.math.BigInteger;

public class Stage4 {
	@SuppressWarnings("unused")
	private int[] fibLookupTable = new int[100];
	
	/**
	 * 
	 * @param data: assumed to be sorted in ascending order
	 * @param target: item to find
	 * @param start: starting index
	 * @param end: ending index (assume start is less than or equal to end)
	 * @return an index at which target exists in the array data, -1 if target doesn't exist
	 */
	public int binarySearch(int[] data, int target, int start, int end) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param x
	 * @param n
	 * @return x to the power of n. 
	 * should have O(log n) complexity, not O(n) complexity
	 */
	public int fastPower(int x, int n) {
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
	 * HINT: use lookup tables. fibLookupTable is created as a variable 
	 * for you to use
	 * 
	 * FOR EXAMPLE,
	 * fastFibonacci(0) = 0
	 * fastFibonacci(1) = 1
	 * fastFibonacci(3) = 2
	 * fastFibonacci(6) = 8
	 * fastFibonacci(8) = 21
	 */
	public int fastFibonacci(int n) {
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
	public String getPermutation(int n, int k) {
		return null; //to be completed
	}
	
	//helper for getPermutation
	//n = 5 -> return 120
	//n = 7 -> return 5040
	public int factorial(int n) {
		if(n <= 1)
			return 1;
		return n*factorial(n-1);
	}

	//helper for getPermutation
	//n = 5 -> return "12345"
	//n = 3 -> return "123"
	public String getString(int n) {
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
	public BigInteger veryFastFibonacci(int n) {
		return null; //to be completed
	}
	
	/**
	 * 
	 * @param data
	 * @param start
	 * @param target
	 * @return true if some of the items of data, starting at index start,
	 * not necessarily next to each other, add up to target, false otherwise.
	 * if data = {10,70,20,90}, start = 0, target = 30, return true (10+20 = 30)
	 * if data = {10,70,20,90}, start = 0, target = 60, return false
	 */
	public boolean addsUpTo(int[] data, int start, int target) {
		return false;
	}	
	
	/**
	 * 
	 * @param data
	 * @param start
	 * @param target
	 * @return true if some of the items of data, starting at index start,
	 * not necessarily next to each other, combine* up to target, false otherwise.
	 * you can use +/- for the combinations.
	 * if data = {10,70,20,90}, start = 0, target = 30, return true (10+20 = 30)
	 * if data = {10,70,20,90}, start = 0, target = 60, return true (-10+70 = 60)
	 * if data = {10,70,20,90}, start = 2, target = 60, return false
	 * if data = {10,70,20,90}, start = 0, target = 130, return true (-10+70-20+90 = 130)
	 */
	public boolean combinesUpTo(int[] data, int start, int target) {
		return false;
	}	
	
	/**
	 * 
	 * @param data
	 * @param start
	 * @param target
	 * @param count
	 * @return the number of ways in which you can construct target by adding
	 * the items of data, starting at index start
	 * 
	 *  for example, 
	 *  if data = {10,70,20,90}, start = 0, target = 100
	 *  then return 2 (10+70+20 = 100, 10+90 = 100)
	 *  if data = {10,70,20,90,30}, start = 0, target = 100
	 *  then return 3 (10+70+20 = 100, 10+90 = 100, 70+30 = 100)
	 *  if data = {10,20,30,40,50,60}, start = 0, target = 100
	 *  then return 4 (10+20+30+40 = 100, 10+30+60 = 100, 20+30+50 = 100, 40+60 = 100)
	 *  
	 *  You CAN create a helper method
	 */
	public int waysAddsUpTo(int[] data, int start, int target) {
		return 0;
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
	public boolean split53(int[] data) {
		return false; //to be completed
	}
}
