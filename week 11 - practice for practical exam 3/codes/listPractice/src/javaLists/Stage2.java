package javaLists;
import java.util.*;

public class Stage2 {
	/**
	 * 
	 * @param list
	 * @return the sum of all items of the list
	 * return 0 if list is null or empty
	 */
	public static int sum(ArrayList<Integer> list) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return the sum of all negatives items of the list
	 * return 0 if list is null or empty
	 */
	public static int sumNegatives(ArrayList<Integer> list) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return the number of even items in the list
	 * return 0 if list is null or empty
	 */
	public static int countEven(ArrayList<Integer> list) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @param target
	 * @return the number of times target exists in the list
	 * return 0 if list is null or empty
	 */
	public static int count(ArrayList<Integer> list, int target) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @param low
	 * @param high (assume low <= high)
	 * @return the number of items in the list that belong to the range [low ... high]
	 * return 0 if list is null or empty
	 */
	public static int countInRange(ArrayList<Integer> list, int low, int high) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @param low
	 * @param high (assume low <= high)
	 * @return true if there is at least one item in the list that is in the range [low ... high]
	 * return false if list is null or empty
	 */
	public static boolean containsInRange(ArrayList<Integer> list, int low, int high) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @param low
	 * @param high (assume low <= high)
	 * @return true if all the items in the list are in the range [low ... high]
	 * return false if list is null
	 * return true if the list is empty
	 */
	public static boolean allInRange(ArrayList<Integer> list, int low, int high) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return the number of prime numbers in the list
	 * return 0 if list is null or empty
	 * 
	 * IMPORTANT: you can (and should) use the helper 
	 * method isPrime(int)
	 */
	public static int countPrimes(ArrayList<Integer> list) {
		return 0; //to be completed
	}

	/**
	 * DO NOT MODIFY
	 * Helper for countPrimes
	 * @param n
	 * @return true if the integer passed is a prime number
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
	 * @param list
	 * @return true if there is at least one prime number in the list, false otherwise
	 * return false if list is null or empty
	 */
	public static boolean containsPrime(ArrayList<Integer> list) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return true if all the items in the list are prime numbers, false otherwise
	 * return false if list is null
	 * return true if the list is empty (because technically, every item in the list IS prime)
	 */
	public static boolean allPrimes(ArrayList<Integer> list) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return number of rectangles in the list that are squares
	 * (you can, and should invoke, the instance method isSquare() in class Rectangle)
	 * return 0 if list is null or empty
	 * 
	 * TIP: using the enhanced for loop will make your life much easier!
	 */
	public static int countSquares(ArrayList<Rectangle> list) {
		return 0; //to be completed
	}
	
	/**
	 * change each item of the list to its square.
	 * 
	 * if list is null or empty, do nothing
	 * 
	 * TIP: use set and get methods.
	 * @param list
	 * 
	 * For example,
	 * 
	 * if list = [3,0,-2,6], it should become [9, 0, 4, 36]
	 */
	public static void squareUp(ArrayList<Integer> list) {
		//to be completed
	}
}
