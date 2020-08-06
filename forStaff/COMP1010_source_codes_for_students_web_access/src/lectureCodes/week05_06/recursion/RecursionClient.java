package lectureCodes.week05_06.recursion;

import java.util.Arrays;

public class RecursionClient {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		int p = 5;
		int q = RecursionService.factorial(p);
		System.out.println("factorial of "+p+" is "+q);

		System.out.println(RecursionService.fastPower(-2, 31));

		System.out.println("fast sum: "+RecursionService.sumRecursiveFast(11));

		System.out.println(RecursionService.fastFibonacci(45));
		System.out.println(RecursionService.isPalindrome("madam"));
		
		int a = 26384;
		int b = RecursionService.sumEvenDigits(a);
		System.out.println(b);;
	}
}
