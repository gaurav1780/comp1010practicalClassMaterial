package practicePackage.recursion.attempts;

public class Stage1 {
	/**
	 * 
	 * @param n 
	 * @return sum of the first n positive integers (1+2+...+n)
	 * return 0 if n is less than or equal to 0
	 */
	public int sum(int n) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param start
	 * @param stop
	 * @return sum of all integers from start to stop (inclusive)
	 * return 0 if start is more than stop
	 */
	public int sumRange(int start, int stop) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param n 
	 * @return product of the first n positive integers (1*2*...*n)
	 * return 1 if n is less than or equal to 0
	 */
	public int product(int n) {
		return 1; //to be completed
	}

	/**
	 * 
	 * @param n 
	 * @return sum of the squares of the first n positive integers 
	 * (1*1 + 2*2 + ... + n*n)
	 * return 0 if n is less than or equal to 0
	 */
	public int sumSquares(int n) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param n 
	 * @return sum of all positive even numbers till n (including n)
	 * (2 + 4 + 6 + ... (n or n-1))
	 * For example,
	 * if n = 8, return 2+4+6+8=20
	 * if n = 5, return 2+4=6
	 * return 0 if n is less than or equal to 1
	 * 
	 * HINT: if the number is odd, ignore it and return sumEven(n-1)
	 */
	public int sumEven(int n) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param n 
	 * @return sum of all positive odd numbers till n (including n)
	 * (1 + 3 + 5+ ... (n or n-1))
	 * For example,
	 * if n = 8, return 1+3+5+7=16 
	 * if n = 5, return 1+3+5=9
	 * return 0 if n is less than or equal to 0
	 * 
	 * HINT: if the number is even, ignore it and return sumOdd(n-1)
	 */
	public int sumOdd(int n) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param n 
	 * @return sum of the squares of all positive even numbers up to n.
	 * (note, n itself may or may not be an even number)
	 * return 0 if n is less than or equal to 0
	 * For example:
	 * n = 6, return 6*6 + 4*4 + 2*2
	 * n = 9, return 8*8 + 6*6 + 4*4 + 2*2
	 * 
	 * HINT: If n is odd, ignore it and return sumEvenSquares(n-1)
	 */
	public int sumEvenSquares(int n) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param n 
	 * @return sum of the squares of all positive odd numbers up to n.
	 * (note, n itself may or may not be an odd number)
	 * return 0 if n is less than or equal to 0
	 * For example:
	 * n = 6, return 5*5 + 3*3 + 1*1
	 * n = 7, return 7*7 + 5*5 + 3*3 + 1*1
	 * 
	 * HINT: If n is even, ignore it and return sumOddSquares(n-1)
	 */
	public int sumOddSquares(int n) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param str
	 * @return true if str contains an y digit ('0' to '9'), false otherwise.
	 * return false if str is null.
	 * 
	 * HINT: you can check that a char ch is a digit using Character.isDigit(ch)
	 */
	public boolean containsDigit(String str) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param str
	 * @return true if str contains ONLY digits ('0' to '9'), false otherwise.
	 * 
	 * !!!!!!IMPORTANT!!!!!! return true if str is empty
	 * 
	 * return false if str is null.
	 * 
	 * HINT: you can check that a char ch is a digit using Character.isDigit(ch)
	 */
	public boolean isNumeric(String str) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param str
	 * @param target
	 * @return true if String str contains character target, false otherwise.
	 * return false if str is null
	 * IMPORTANT: You may not call the methods indexOf or lastIndexOf or contains from String class
	 */
	public boolean contains(String str, char target) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param str
	 * @param target
	 * @return true if String str contains String target, false otherwise.
	 * return false if str is null or target is null
	 * IMPORTANT: You may not call the methods indexOf or lastIndexOf or contains from String class
	 */
	public boolean contains(String str, String target) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param x
	 * @param n: assume n is more than or equal to 0
	 * @return x to the power of n
	 * IMPORTANT: for any integer x, x to the power of 0 is 1 
	 */
	public int power(int x, int n) {
		return 0; //to be completed
	}
}
