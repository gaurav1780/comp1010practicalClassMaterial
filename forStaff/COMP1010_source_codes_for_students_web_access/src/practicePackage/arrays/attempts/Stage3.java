package practicePackage.arrays.attempts;

import java.util.Arrays;
import ServiceClasses.*;

public class Stage3 {
	/**
	 * 
	 * @param n
	 * @param init
	 * @param inc
	 * @return an array containing n items such that the first item is init, 
	 * and each item is inc more than the previous item.
	 * return null if n is less than 0
	 * 
	 * NOTE 1: take special care when n equals 0, the method should return the array {}
	 * NOTE 2: inc can be negative too :)
	 */
	public static int[] generatePatternedArray(int n, int init, int inc) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return number of items that exist exactly once in the array passed
	 * 
	 */
	public static int countUniqueItems(int[] data) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return true if a and b have the same items in the same order,
	 * false otherwise 
	 * return false if either of array passed is null
	 */
	public static boolean identical(int[] a, int[] b) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return true if a contains all the items in b,
	 * false otherwise
	 * return false if either of array passed is null
	 */
	public static boolean contains(int[] a, int[] b) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return true if a and b have the same items but not necessarily in the same order,
	 * false otherwise 
	 * return false if either of array passed is null
	 */
	public static boolean same(int[] a, int[] b) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return true if a and b are mutually reserve, false otherwise
	 * return null if either of the array passed is null
	 */
	public static boolean mutuallyReverse(int[] a, int[] b) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return a new array where all items of a
	 * are followed by all items of b,
	 * return null if either of the array passed is null
	 */
	public static int[] merge(int[] a, int[] b) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param n
	 * @return an array containing items {1, 2, ..., n-1, n}
	 * return null if n is less than 0
	 */
	public static int[] generate(int n) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return the reverse of data,
	 * return null if array passed is null,
	 * return empty array if array passed is empty
	 */
	public static int[] getReverse(int[] data) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return the item that appears most in the array,
	 * or the first item that does so in case of a tie
	 * You may assume that array passed is NOT null
	 */
	public static int getMostFrequentItem(int[] data) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return the item that appears least in the array,
	 * or the first item that does so in case of a tie.
	 * You may assume that array passed is NOT null
	 */
	public static int getLeastFrequentItem(int[] data) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return an array containing the numbers of occurrences of all distinct items in data
	 * return null if the array is null.
	 */
	public static int[] getFrequencyTable(int[] data) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param start
	 * @return a subarray of data from index start (inclusive) to the end of the array,
	 * return null if array is null or empty or start is invalid
	 */
	public static int[] subarrayFromIndex(int[] data, int start) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param end
	 * @return a subarray of data from the start of the array to index end (inclusive),
	 * return null if array is null or empty or end is invalid
	 */
	public static int[] subarrayUptoIndex(int[] data, int end) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param start
	 * @param end
	 * @return a subarray of data from index start to index end (inclusive),
	 * return null if 
	 *  - array is null or empty, or, 
	 *  - start and/or end is invalid, or,
	 *  - start is more than end
	 */
	public static int[] subarray(int[] data, int start, int end) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return an array containing all positive items of data,
	 * return null if array passed is null,
	 * return an empty array if array passed is empty
	 */
	public static int[] getPositives(int[] data) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return an array containing all negative items of data,
	 * return null if array passed is null,
	 * return an empty array if array passed is empty
	 */
	public static int[] getNegatives(int[] data) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return an array containing all non-zero items of data,
	 * return null if array passed is null,
	 * return an empty array if array passed is empty
	 */
	public static int[] getNonZeroes(int[] data) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return an array containing all items of data that are prime numbers,
	 * return null if array passed is null,
	 * return an empty array if array passed is empty
	 * 
	 * TIP: Use isPrime from MathService class as:
	 * MathService.isPrime(number to check)
	 */
	public static int[] getPrimes(int[] data) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return an array containing all non-negative items of data,
	 * return null if array passed is null,
	 * return an empty array if array passed is empty
	 */
	public static int[] getWithoutNegatives(int[] data) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return an array containing all non-positive items of data,
	 * return null if array passed is null,
	 * return an empty array if array passed is empty
	 */
	public static int[] getWithoutPositives(int[] data) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return a new array where only unique items are included,
	 * return null if array passed is null,
	 * return an empty array if array passed is empty
	 */
	public static int[] getUniqueItems(int[] data) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data: an array of arrays
	 * @return a deep copy of the array passed as parameter,
	 * return null if array passed is null,
	 * return an empty array if array passed is empty
	 * 
	 * TIP: you can use getCopy(int[]) from Stage2
	 */
	public static int[][] getDeepCopy(int[][] data) {
		return new int[0][0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param sub
	 * @return the first index at which sub starts in data
	 * return -1 if sub has a higher length than data or there is no such sub found in data
	 */
	public static int indexOf(int[] data, int[] sub) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param sub
	 * @return the last index at which sub starts in data
	 * return -1 if sub has a higher length than data or there is no such sub found in data
	 */
	public static int lastIndexOf(int[] data, int[] sub) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data: an array of arrays
	 * @return the total number of items in non-null subarrays of data,
	 * return 0 if data is null or empty
	 */
	public static int totalNumberOfItems(int[][] data) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data: an array of arrays
	 * @return the total number of even items in non-null subarrays of data,
	 * return 0 if data is null or empty
	 */
	public static int totalNumberOfEvenItems(int[][] data) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data: an array of arrays
	 * @return the total number of odd items in non-null subarrays of data,
	 * return 0 if data is null or empty
	 */
	public static int totalNumberOfOddItems(int[][] data) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data: an array of arrays
	 * @return the total number of positive items in non-null subarrays of data,
	 * return 0 if data is null or empty
	 */
	public static int totalNumberOfPositiveItems(int[][] data) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data: an array of arrays
	 * @return the total number of negative items in non-null subarrays of data,
	 * return 0 if data is null or empty
	 */
	public static int totalNumberOfNegativeItems(int[][] data) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data: an array of arrays
	 * @return the total number of unique items in each non-null subarray of data,
	 * return 0 if data is null or empty
	 */
	public static int totalNumberOfUniqueItems(int[][] data) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data: an array of arrays
	 * @return the number of null subarrays in data,
	 * return 0 if data is null or empty
	 */
	public static int countNullSubarrays(int[][] data) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data: an array of arrays
	 * @return the number of non-null subarrays in data,
	 * return 0 if data is null or empty
	 */
	public static int countNonNullSubarrays(int[][] data) {
		return 0; //to be completed
	}
}
