package lectureCodes.week05_06.recursion.advanced;

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
		if(data == null || first > last)
			return -1;
		int median = (first+last)/2;
		if(target == data[median])
			return median;
		if(target > data[median]) 
			return binarySearch(data, target, median + 1, last);
		return binarySearch(data, target, first, median - 1);
	}

	public static int binarySearch(int[] a, int target) {
		return binarySearch(a, target, 0, a.length - 1);
	}

	/**
	 * 
	 * @param x
	 * @param n
	 * @return
	 */
	public static int mod(int x, int n) {
		if(x < 0) 
			return n - mod(-x, n);
		return x%n;
	}

	public static int inverse(int x, int n) {
		int p0 = 0;
		int p1 = 1;
		int a = n;
		int b = x;
		int r = mod(a, b);
		while(r != 0) {
			int d = a/b;
			int p2 = mod(p0 - p1*d, n);
			r = mod(a, b);
			p0 = p1;
			p1 = p2;
			a = b;
			b = r;
		}
		return p0;
	}

	public static int inverseRecursive(int a, int b, int n, int p0, int p1) {
		int r = mod(a, b);
		if(r == 0)
			return p1;
		int d = a/b;
		int p2 = mod(p0 - p1*d, n);
		return inverseRecursive(b, r, n, p1, p2);  
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
		if(n == 0)
			return 1;
		//reduce to within modulo first
		x = x % modulo;
		if(n == 1)
			return x;
		int log = (int)(Math.log10(n)/Math.log10(2)); //log n base 2
		int highestPowerOfTwo = (int)Math.pow(2, log);
		int r1 = twosPowerModulo(x, highestPowerOfTwo, modulo);
		int r2 = powerModulo(x, n - highestPowerOfTwo, modulo);
		int result = (r1 * r2) % modulo;
		return result;
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
		if(n <= 0)
			return 1;
		if(n == 1)
			return x;
		int root = twosPowerModulo(x, n/2, modulo);
		int result = (root*root) % modulo;
		return result;
	}

	//helper for getPermutations
	public static int factorial(int n) {
		if(n == 1) {
			return 1;
		}
		int result = factorial(n-1) * n;
		return result;
	}

	/**
	 * 
	 * @param s
	 * @return all permutations of the String passed
	 */
	public static String[] getPermutations(String s) {
		if(s.length() == 1)
			return new String[]{s};
		int f1 = factorial(s.length());
		int f2 = factorial(s.length() - 1);
		String[] result = new String[f1];
		int counter = 0;
		for(int i=0; i < s.length(); i++) {
			String[] sub = getPermutations(s.substring(0,i)+s.substring(i+1));
			System.out.println("Subset: "+Arrays.toString(sub));
			for(int k=0; k < f2; k++) {
				result[counter++] = s.charAt(i) + sub[k];
			}
		}
		return result;
	}

	/**
	 * @param s
	 * @param permutationNumber
	 * @return a specific permutation of the String in lexicographic order
	 */
	public static String getPermutation(String s, int permutationNumber) {
		int totalPermutations = factorial(s.length());
		if(permutationNumber < 0 || permutationNumber >= totalPermutations)
			return null;
		if(s.length() == 1)
			return s;
		int groupSize = factorial(s.length() - 1);
		int idx = permutationNumber / groupSize;
		int rem = permutationNumber % groupSize;
		return s.charAt(idx) + getPermutation(s.substring(0, idx) + s.substring(idx+1), rem);
	}

	/**
	 * 
	 * @param n
	 * @param k
	 * @return the number of permutations when choose k items from n items
	 */
	public static int countPermutations(int n, int k) {
		if(k==1)
			return n;
		return n*countPermutations(n-1, k-1);
	}

	/**
	 * 
	 * @param s
	 * @param size
	 * @param n
	 * @return a specific permutation of size "size" from string s
	 */
	public static String getPermutation(String s, int size, int n) {
		if(size < 0 || size > s.length())
			return null;
		int c1 = countPermutations(s.length(), size); 
		if(n < 0 || n >= c1)
			return "";

		if(size==1) {
			if(n < 0 || n >= c1) {
				return "";
			}
			else {
				return s.charAt(n)+"";
			}
		}

		int c2 = countPermutations(s.length()-1, size-1); 

		int idx = n/c2;
		int rem = n%c2;

		char ch = s.charAt(idx);
		s = s.substring(0, idx) + s.substring(idx+1);

		return ch + getPermutation(s, size-1, rem);	
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
		if(start == a.length) {
			return target == 0;
		}
		if(addsUpTo(a, target  - a[start], start+1)) {
			System.out.print(a[start]+" ");
			return true;
		}
		if(addsUpTo(a, target, start+1))
			return true;
		return false;
	}

	/**
	 * a pretty-printer version (with output statements)
	 * @param data
	 * @param target
	 * @param start
	 * @param indentation
	 * @return true if a collection of items in array data (not necessarily sequential)
	 * starting at index "start" add up to target, false otherwise
	 */
	public static boolean addsUpTo(int[] data, int target, int start, int indentation) {
		System.out.println(spaces(indentation)+"Evaluating addsUpTo("+Arrays.toString(data)+", "+start+", "+target);
		System.out.println(spaces(indentation)+"total = "+target+", ("+target+" == 0 ? "+(target==0)+")");
		if(target == 0) {
			System.out.println(spaces(indentation)+"addsUpTo("+Arrays.toString(data)+", "+start+", "+target+" evaluates to true");
			return true;
		}
		System.out.println(spaces(indentation)+"start = "+start+", ("+start+" == "+data.length+" ? "+(start==data.length)+")");
		if(start == data.length) {
			System.out.println(spaces(indentation)+"addsUpTo("+Arrays.toString(data)+", "+start+", "+target+" evaluates to false");
			return false;
		}
		System.out.println(spaces(indentation)+"Checking if we can use "+data[start]);
		System.out.println(spaces(indentation)+"Calling addsUpTo("+Arrays.toString(data)+", "+(start+1)+", "+(target-data[start])+")");	
		boolean b = addsUpTo(data, target  - data[start], start+1, indentation + 1);
		if(b == true) {
			System.out.println(spaces(indentation)+"addsUpTo("+Arrays.toString(data)+", "+start+", "+target+" evaluates to true");
			return true;
		}
		System.out.println(spaces(indentation)+"Cannot use "+data[start]);
		System.out.println(spaces(indentation)+"Calling addsUpTo("+Arrays.toString(data)+", "+(start+1)+", "+target+")");	
		b = addsUpTo(data, target, start+1, indentation + 1);
		System.out.println(spaces(indentation)+"addsUpTo("+Arrays.toString(data)+", "+start+", "+target+" evaluates to "+b);
		return b;
	}

	//helper
	public static String spaces(int indentation) {
		return new String(new char[indentation * 4]).replace('\0', ' ');
	}

	/**
	 * 
	 * @param n
	 * @return true if n is prime, false otherwise
	 */
	public static boolean isPrime(int n) {
		if(n < 2)
			return false;
		for(int i=2; i*i <= n; i++) 
			if(n%i == 0)
				return false;
		return true;
	}

	public static Integer getPrime(int min, int max) {
		for(int i=max; i >= min; i--) {
			if(isPrime(i))
				return i;
		}
		return null;
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
		if(target.length()==0) {
			return true;
		}
		int loc = source.indexOf(target.charAt(0));
		if(loc == -1) {
			return false;
		}
		String remSource = source.substring(0, loc)+source.substring(loc+1);
		return containsAnagram(remSource, target.substring(1));
	}

	//TODO
	public static ArrayList<String> getPermutations(String str, ArrayList<String> list) {
		if(str.length() == 0) {
			return list;
		}
		for(int i=0; i < factorial(str.length()-1); i++) {
			list.add(str.charAt(1)+"");
		}
		return getPermutations(str.substring(1), list);
	}
}
