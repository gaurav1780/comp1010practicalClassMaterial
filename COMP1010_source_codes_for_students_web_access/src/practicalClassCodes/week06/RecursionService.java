package practicalClassCodes.week06;

import java.util.ArrayList;
import java.util.Arrays;

public class RecursionService {
	/**
	 *
	 * @param data
	 * @param target
	 * @param first
	 * @param last
	 * @return an index in array data (not necessarily the first occurrence)
	 * in the index range [first...last] where item target exists.
	 */
	public static int binarySearch(int[] data, int target, int first, int last) {
		return 0; //to be completed
	}

  //proxy method - DO NOT MODIFY
	public static int binarySearch(int[] a, int target) {
		return binarySearch(a, target, 0, a.length - 1);
	}

	/**
	 *
	 * @param x
	 * @param n
	 * @param modulo
	 * @return x^n (mod modulo)
	 * principle used (through example):
	 * 3^87 mod 7
	 * = 3^(64+16+4+2+1) mod 7
	 * = 3^64 mod 7 * 3^16 mod 8 * 3^4 mod 7 * 3^2 mod 7 * 3^1 mod 7
	 *
	 * now
	 * 3^1 mod 7 = 3
	 * 3^2 mod 7 = (3^1)^2 mod 7 = 9 mod 7 = 2
	 * 3^4 mod 7 = (3^2)^2 mod 7 = 4
	 * 3^8 mod 7 = (3^4)^2 mod 7 = 16 mod 7 = 2
	 * (we got a repeating number - 2 - woot!!!)
	 * 3^16 mod 7 = 4
	 * 3^32 mod 7 = 2
	 * 3^64 mod 7 = 4
	 * STOP (as we have all values we need calculated)
	 * 3^87 mod 7
	 * = (3^64 	* 	3^16 	* 	3^4 	* 	3^2 	* 	3^1) mod 7
	 * = (4		*	4		*	4	*	2	*	3) 	 mod 7
	 * = 384 mod 7
	 * = 6
	 *
	 *
	 * twosPowerModulo calculates 3^64 for us
	 * then we multiply that value by 3^(87-64) = 3^23
	 *
	 * 3^23 is computed recursively.
	 *
	 * inside 3^23,
	 * twosPowerModulo calculates 3^16 for us
	 * then we multiply that value by 3^(23-16) = 3^7
	 *
	 * 3^7 is computed recursively.
	 *
	 * inside 3^7,
	 * twosPowerModulo calculates 3^4 for us
	 * then we multiply that value by 3^(7-4) = 3^3
	 *
	 * 3^3 is computed recursively.
	 *
	 * inside 3^3,
	 * twosPowerModulo calculates 3^2 for us
	 * then we multiply that value by 3^(3-2) = 3^1
	 *
	 * 3^1 is computed recursively.
	 *
	 * inside 3^1, n is 1, so it returns 3
	 *
	 * 3^3 multiplies that 3 by 3^2 = 2 (Calculated by twosPowerModulo)
	 * and returns 6 to 3^7
	 *
	 * 3^7 multiplies that 6 by 3^4 = 4 (Calculated by twosPowerModulo)
	 * and returns 24 mod 7 = 3 to 3^23
	 *
	 * 3^23 multiplies that 3 by 3^16 = 4 (Calculated by twosPowerModulo)
	 * and returns 12 mod 7 = 5 to 3^87
	 *
	 * 3^87 multiplies that 5 by 3^64 = 4 (Calculated by twosPowerModulo)
	 * and returns 20 mod 7 = 6 to the client
	 *
	 */
	public static int powerModulo (int x, int n, int modulo) {
		return 0; //to be completed
	}

	/**
	 *
	 * @param x
	 * @param n: 2^k (for some integer k)
	 * @param modulo
	 * @return x^n (mod modulo)
	 *
	 * this method calculates x^n mod modulo AS LONG AS
	 * n itself is a power of 2.
	 *
	 * So it calculates x^1, x^2, x^4, x^8, x^16, x^32, ... recursively
	 *
	 * principle used
	 *
	 * x^n mod m = (x^{n/2} mod m)^2 (if n is a power of two)
	 *
	 * so
	 * twosPowerModulo(x, n, m) = twoPowerModulo(x, n/2, m) * twoPowerModulo(x, n/2, m)
	 * termination case: twosPowerModulo(x, 1, m) = x
	 *
	 * of course, we don't want to calltwoPowerModulo(x, n/2, m) TWICE
	 * so we store it in a variable (root) and return root*root
	 */
	public static int twosPowerModulo (int x, int n, int modulo) {
		return 0; //to be completed
	}

	/**
	 *
	 * @param s
	 * @return all permutations of the String passed
	 */
	public static String[] getPermutations(String s) {
		return null; //to be completed
	}

	/**
	 * @param s
	 * @param permutationNumber
	 * @return a specific permutation of the String in lexicographic order
	 */
	public static String getPermutation(String s, int permutationNumber) {
		return ""; //to be completed
 	}

	/**
	 *
	 * @param n
	 * @param k
	 * @return the number of permutations when choose k items from n items
	 */
	public static int countPermutations(int n, int k) {
		return 0; //to be completed
	}

	/**
	 *
	 * @param s
	 * @param size
	 * @param n
	 * @return a specific permutation of size "size" from string s
	 */
	public static String getPermutation(String s, int size, int n) {
		return ""; //to be completed
	}

	/**
	 * @param data
	 * @param target
	 * @param start
	 * @param indentation
	 * @return true if a collection of items in array data (not necessarily sequential)
	 * starting at index "start" add up to target, false otherwise
	 */
	public static boolean addsUpTo(int[] a, int target, int start) {
		return false; //to be completed
	}

	/**
	 * use recursion to make it efficient (there will still be a loop)
	 * @param n
	 * @return true if n is prime, false otherwise
	 */
	public static boolean isPrime(int n) {
		if(n < 2)
			return false;
		for(int i=2; i*i <= n; i++)
			if(n%i == 0) //hint: something here
				return false;
		return true;
	}

	/**
	 *
	 * @param source
	 * @param target
	 * @return true if source contains target (shuffled is ok), false otherwise
	 * for example,
	 * "dictionary" contains "ration"
	 * "parliament" contains "pale"
	 * "orangutan" does not contain "orate"
	 */
	public boolean containsAnagram(String source, String target) {
		return false; //to be completed
	}
}
