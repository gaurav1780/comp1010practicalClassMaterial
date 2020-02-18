package ServiceClasses;

public class MathService {
	/**
	 * DO NOT MODIFY
	 * A number is prime numbers if it is more than 1 
	 * and divisible only by 1 and itself 
	 * @param n
	 * @return true if the integer passed is prime, 
	 * false otherwise
	 */
	public static boolean isPrime(int n) {
		if(n < 2)
			return false;
		for(int i=2; i*i <= n; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 
	 * @param n
	 * @return true if n is a (perfect) square,
	 * that is square of an integer, false otherwise
	 */
	public static boolean isSquare(int n) {
		int root = (int)Math.sqrt(n);
		return root * root == n;
	}
}
