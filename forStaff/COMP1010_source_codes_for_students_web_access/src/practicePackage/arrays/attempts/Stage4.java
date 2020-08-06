package practicePackage.arrays.attempts;

import java.util.Arrays;

public class Stage4 {
	/**
	 * from GeeksForGeeks.com
	 * return an array (say prod) such that for all i, 
	 * prod[i] is equal to the product of all the elements
	 * of data except data[i]. 
	 * 
	 * IMPORTANT!!! Solve it without division operator and in O(n).
	 * 
	 * Example :
	 * if data = {10, 3, 5, 6, 2}
	 * then prod = {180, 600, 360, 300, 900}
	 * @param data
	 * @return array based on above specs
	 */
	public int[] productAllButOne(int[] data) {
		return new int[0]; //to be completed
	}

	/**
	 * @param data
	 * @return length of the longest series of consecutive items (in terms of value)
	 * For example, 
	 * if data = {0, 10, 3, -2, 5, 2, 1, 12, -1, -1, -1, -1, -1, 0, 0, 0}, the longest 
	 * series of consecutive values is -2, -1, 0, 1, 2, 3 (6 items in total).
	 * so return 6.
	 * 
	 * return 0 if the array is empty or null.
	 */
	public int getLongestConsecutiveLength(int[] data) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return the longest sequence in ascending order.
	 * return the sequence that occurs first in case of a tie.
	 * for example, 
	 * if data = {10, 70, 20, 50, 50, 80}, return {20, 50, 50, 80}
	 * if data = {70, 70, 20, 10, 80, 20}, return {70, 70}
	 * if data = {50, 40, 30, 30}, return {30, 30}
	 * if data = null, return null
	 * if data = {}, return {}
	 */
	public int[] getLongestAscendingSequence(int[] data) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return the longest sequence in descending order.
	 * return the sequence that occurs first in case of a tie.
	 * for example, 
	 * if data = {10, 70, 50, 20, 10, 50, 50, 80}, return {70, 50, 20, 10}
	 * if data = {70, 70, 90, 10, 90, 80}, return {70, 70}
	 * if data = {50, 40, 30, 30}, return {50, 40, 30, 30}
	 * if data = null, return null
	 * if data = {}, return {}
	 */
	public int[] getLongestDescendingSequence(int[] data) {
		return new int[0]; //to be completed
	}


	/**
	 * 
	 * @param data
	 * @return the longest sequence of the same item.
	 * return the sequence that occurs first in case of a tie.
	 * for example, 
	 * if data = {10, 30, 30, 30, 30, 50, 50, 80}, return {30, 30, 30, 30}
	 * if data = {70, 70, 90, 90, 80, 80}, return {70, 70}
	 * if data = {50, 40, 30, 20}, return {50}
	 * if data = null, return null
	 * if data = {}, return {}
	 */
	public int[] getLongestUnchangedSequence(int[] data) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * sort the array in ascending order,
	 * do nothing if the array is null or has fewer than 2 items
	 */
	public void sortAsc(int[] data) {
		//to be completed
	}

	/**
	 * 
	 * @param data
	 * sort the array in descending order,
	 * do nothing if the array is null or has fewer than 2 items
	 */
	public void sortDesc(int[] data) {
		//to be completed
	}

	/**
	 * 
	 * @param data
	 * @param asc
	 * sort the array in ascending order if asc is true,
	 * otherwise sort the array in descending order
	 */
	public void sort(int[] data, boolean asc) {
		//to be completed
	}

	/**
	 * 
	 * @param data
	 * @param asc
	 * if the array is already sorted (either ascending or descending), do nothing regardless of asc,
	 * otherwise sort the array in ascending order if asc is true,
	 * otherwise sort the array in descending order
	 */
	public void sortIfNeeded(int[] data, boolean asc) {
		//to be completed
	}

	/**
	 * 
	 * @param data
	 * if the array is in ascending order, sort it in descending order
	 * if the array is in descending order, sort it in ascending order
	 * do nothing if the array is unsorted
	 */
	public void reverseSort(int[] data) {
		//to be completed
	}


	/**
	 * 
	 * @param a: sorted in ascending order
	 * @param b: sorted in ascending order
	 * @return an array containing the common items from a and b.
	 * If array a contains p occurrences of an item and array b contains q occurrences of the same item, 
	 * the array returned must have Math.min(p, q) occurrences of that item.
	 */
	public int[] getCommonItemsSorted(int[] a, int[] b) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return an array containing the common items from a and b.
	 * If array a contains p occurrences of an item and array b contains q occurrences of the same item, 
	 * the array returned must have Math.min(p, q) occurrences of that item.
	 * 
	 * All occurrences of an item in the resulting array should be together, and be in the order of first appearance in array a.
	 * See the last junit test sample for details 
	 */
	public int[] getCommonItemsUnsorted(int[] a, int[] b) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if there are no common items between any two subarrays of the array passed, false otherwise.
	 */
	public boolean noCommonItems(int[][] data) {
		return false; //to be completed
	}

	/**
	 * @param data
	 * @return the longest sequence of items that occurs
	 * in the mirrored (back to front) form as well.
	 * in case of a tie, return the sequence that occurs first.
	 * Examples:
	 * if data = {10, 20, 30, 40, 50, 20, 10, 40, 30, 20, 50, 40}
	 * return the array {20, 30, 40} (not {40, 30, 20})
	 *
	 * if data = {1,2,1,2,1,2,1,2,1,2,1,2}
	 * return the array {1,2,1,2,1,2,1,2,1,2,1}
	 * if data = {5,6,7,8,9}
	 * return the array {5}
	 * if data = {5,6,7,5,7,6,8,5,6,9}
	 * return the array {6,7}
	 */
	public int[] getLongestMirroredSequence(int[] data) {
		return new int[0]; //to be completed
	}

	/**
	 * in math, a "set" is defined as a collection of **distinct** items.
	 * Thus, {1,7,2,9} is a set, but {1,7,2,1,9} is not (since 1 occurs multiple times).
	 * @param data
	 * @return a "set" obtained from the passed array. the order of the items should be 
	 * the order in of the first occurrences of the items in the passed array.
	 * for example,
	 * if data = {1,7,2,1,9,7,9,9}, return {1,7,2,9}
	 * if data = {7,2,1,1,9,7,9,9}, return {7,2,1,9}
	 */
	public int[] getSet(int[] data) {
		return new int[0]; //to be completed
	}
}
