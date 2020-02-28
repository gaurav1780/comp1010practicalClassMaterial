package lectureCodes.week05_06.recursion;

public class RecursionService {
	public static int[] fib = new int[100];
	//{0,0,0,0,0,0,0,0...}

	//O(n)
	public static int factorial(int n) {
		if(n == 1) {
			return 1;
		}
		int result = factorial(n-1);
		result = result * n;
		return result;
	}

	//O(n)
	public static double power(double x, int n) {
		if(n == 0) {
			return 1;
		}
		if(n < 0) {
			return 1.0/power(x, -n);
		}
		else {
			return power(x, n - 1);
		}
	}

	//O(n)
	public static double powerIterative(double x, int n) {
		double result = 1;
		for(int i=1; i <= n; i++) {
			result = result * x;
		}
		return result;
	}

	//O(log(n))
	public static int fastPower(int x, int n) {
		if(n == 0) {
			return 1;
		}
		int root = fastPower(x, n/2);
		if(n % 2 == 0) { //even power
			return root * root;
		}
		else { //odd power
			return root * root * x;
		}
	}

	//O(1.618^n) not in course
	public static int fibonacci(int n) {
		if(n < 2) {
			return n;
		}
		return fibonacci(n-1) + fibonacci(n-2); 
	}

	//O(n)
	public static int fastFibonacci(int n) {
		if(n < 2) {
			return n;
		}

		if(fib[n] == 0) { //not computed previously
			fib[n] = fastFibonacci(n-1) + fastFibonacci(n-2);//compute it
		}
		//guaranteed that fib[n] has been populated
		return fib[n];
	}

	//assume n >= 0
	//returns the sum of the first n positive integers
	//O(n)
	public static int sumRecursive(int n) {
		if(n == 0)
			return 0;
		else 
			return sumRecursive(n-1)+n;
	}

	//assume n >= 0
	//returns the sum of the first n positive integers
	//O(n)
	public static int sumIterative(int n) {
		int result = 0;
		for(int i=1; i<= n; i++) {
			result = result + i;
		}
		return result;
	}

	//O(logn) I feel so clever (???)
	public static int sumRecursiveFast(int n) {
		if(n == 0)
			return 0;
		int halfSum = sumRecursiveFast(n/2);
		if(n%2 == 0) {
			return halfSum*2 + n*n/4;
		}
		else {
			return n + halfSum*2 + (n-1)*(n-1)/4;
		}
	}

	//O(1) THAT IS THE FASTEST
	public static int sumIterativeFastest(int n) {
		return n*(n+1)/2;
	}
	
	//O(log_10 n)
	public static int countDigits(int n) {
		if(n == 0)
			return 0;
		else
			return 1 + countDigits(n/10);
	}
	
	//O(log_10 n)
	public static int sumDigits(int n) {
		if(n == 0)
			return 0;
		else
			return n%10 + sumDigits(n/10);
	}
	
	//O(log_10 n)
	public static int highestDigit(int n) {
		n = Math.abs(n);
		if(n == 0)
			return 0;
		else {
			int maxRemaining = highestDigit(n/10);
			if(n%10 > maxRemaining) {
				return n%10;
			}
			else {
				return maxRemaining;
			}
		}
	}
	
	public static int highestDigitIterative(int n) {
		n = Math.abs(n);
		int result = 0;
		while(n != 0) {
			if(n%10 > result)
				result = n%10;
			n = n/10;
		}
		return result;
	}
	
	/**
	 * a palindrome is a string that remains the same
	 * when reversed.
	 * 
	 * @param s
	 * @return true if the String s IS a a palindrome,
	 * false otherwise
	 */
	public static boolean isPalindrome(String s) {
		if(s == null) {
			return false;
		}
		System.out.println("Checking if "+s+" is a palindrome");
		if(s.length() < 2) {
			System.out.println(s+" is a palindrome as it has less than 2 characters");
			return true;
		}
		//s.length() >= 2
		char first = s.charAt(0);
		char last = s.charAt(s.length()-1);
		if(first != last) {
			System.out.println(s+" is not a palindrome as the first and last characters are different");;
			return false;
		}
		//first == last
		System.out.println("first and last characters are the same. Check the rest of it");
		String rest = s.substring(1, s.length()-1);
		boolean status = isPalindrome(rest);
		System.out.println(s+" is a palindrome: "+status);
		return status;
	}
	
	public static int sumEvenDigits(int n) {
		if(n == 0)
			return 0;
		int lastDigit = n%10;
		int remaining = n/10;
		int resultRemaining = sumEvenDigits(remaining);
		if(lastDigit%2 == 0) 
			return lastDigit + resultRemaining;
		else
			return resultRemaining;
	}
	
}
