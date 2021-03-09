package practicePackage.builtInLists.attempts;

import java.util.*;

public class Stage4 {
	/**
	 * sort the list in ascending order
	 * @param list
	 */
	public static void sort(ArrayList<Integer> list) {
		//to be completed
	}

	/**
	 * sort the list in ascending order if asc is true, descending order if asc is false
	 * @param list
	 * @param asc (true if ascending, false if descending)
	 */
	public static void sort(ArrayList<Integer> list, boolean asc) {
		//to be completed
	}

	/**  
	 * @param a: if not null, assumed to be sorted in ascending order
	 * @param b: if not null, assumed to be sorted in ascending order
	 * @return result of merging a and b and maintaining an overall sorted order
	 * return null if EITHER of the parameter lists are null
	 */
	public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return the longest sequence of consecutive items that are in ascending order.
	 * return null if list is null
	 */
	public static ArrayList<Integer> getLongestAscendingRun(ArrayList<Integer> list) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @param target
	 * @param n: least number of consecutive occurrences required
	 * @return true if there are n or more consecutive occurrences 
	 * of target in the list, false otherwise 
	 */
	public static boolean nInARow(ArrayList<Integer> list, int target, int n) {
		return false; //to be completed
	}


	/**
	 * 
	 * @param a
	 * @param b
	 * @return items that occur in both the lists.
	 * the order of items in the reversed list should be in the order they occur in the first list.
	 * also, there should be a single instance of each item in the resulting list.
	 * 
	 * For example:
	 * a = [1,4,3,6,2,1,2,7,3,2,8,7,7]
	 * b = [7,7,7,7,4,4,5,5,5,5,1,1,1,7,1,1,1,1,1,2]
	 * return [1,4,2,7]
	 * 
	 * return null if either list is null
	 */
	public static ArrayList<Integer> getIntersection(ArrayList<Integer> a, ArrayList<Integer> b) {
		return null; //to be completed
	}

	/**
	 * a modified version of getIntersection
	 * 
	 * @param a
	 * @param b
	 * @return items that occur in both the lists.
	 * the order of items in the reversed list should be in the order they occur in the first list.
	 * the number of times an item exists in the resulting list is the smaller of the occurrences
	 * of that item in a and b
	 * 
	 * For example:
	 * a = [1,4,3,6,2,1,2,7,3,2,8,7,7]
	 * b = [4,4,5,5,5,5,1,1,1,7,1,1,1,1,1,2,7]
	 * return [1,4,2,1,7,7]
	 * 
	 * return null if either list is null
	 */
	public static ArrayList<Integer> getIntersectionV2(ArrayList<Integer> a, ArrayList<Integer> b) {
		return null; //to be completed
	}

	public static int count(ArrayList<Integer> list, int temp) {
		int c = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == temp) {
				c++;
			}
		}
		return c;
	}

	/**
	 * @param list: an ArrayList of ArrayLists
	 * @param n: assume n is more than 0
	 * @return a list containing items that exist in at least
	 * n (sub)ArrayList of the passed list
	 * order of items should be -
	 * all items from the first sub-list that satisfy the requirement, followed by,
	 * all items from the second sub-list (but not in the first sub-list) that satisfy the 
	 * requirement, followed by,
	 * all items from the third sub-list (but not in the first two sub-lists) that satisfy 
	 * the requirement, and so on...
	 * for example, 
	 * if list = [[1,2,3,4,5], [4,6,7,8], [3,5,7,6]] and n = 2, return the list [3,4,5,6,7]
	 * if list = [[1,2,3,4,5], [4,6,7,8], [3,5,7,6]] and n = 3, return the list []
	 * if list = [[1,2,3,4,5,6], [4,6,7,8], [3,5,7,6,4]] and n = 3, return the list [4, 6]
	 */
	public static ArrayList<Integer> itemsInAtleastN(ArrayList<ArrayList<Integer>> list, int n) {
		return null; //to be completed
	}
	
		/**
	 * from GeeksForGeeks.com
	 * return an list (say prod) such that for all i, 
	 * prod.get(i) is equal to the product of all the elements
	 * of list except list.get(i). 
	 * 
	 * IMPORTANT!!! Solve it without division operator and in O(n).
	 * 
	 * Example :
	 * if list = {10, 3, 5, 6, 2}
	 * then prod = {180, 600, 360, 300, 900}
	 * @param list
	 * @return list based on above specs
	 */
	public static ArrayList<Integer> productAllButOne(ArrayList<Integer> list) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return the longest sequence in ascending order.
	 * return the sequence that occurs first in case of a tie.
	 * for example, 
	 * if list = {10, 70, 20, 50, 50, 80}, return {20, 50, 50, 80}
	 * if list = {70, 70, 20, 10, 80, 20}, return {70, 70}
	 * if list = {50, 40, 30, 30}, return {30}
	 * if list = null, return null
	 * if list = {}, return {}
	 */
	public static ArrayList<Integer> getLongestAscendingSequence(ArrayList<Integer> list) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return the longest sequence in descending order.
	 * return the sequence that occurs first in case of a tie.
	 * for example, 
	 * if list = {10, 70, 50, 20, 10, 50, 50, 80}, return {70, 50, 20, 10}
	 * if list = {70, 70, 90, 10, 90, 80}, return {70, 70}
	 * if list = {50, 40, 30, 30}, return {50, 40, 30, 30}
	 * if list = null, return null
	 * if list = {}, return {}
	 */
	public static ArrayList<Integer> getLongestDescendingSequence(ArrayList<Integer> list) {
		return null; //to be completed
	}


	/**
	 * 
	 * @param list
	 * @return the longest sequence of the same item.
	 * return the sequence that occurs first in case of a tie.
	 * for example, 
	 * if list = {10, 30, 30, 30, 30, 50, 50, 80}, return {30, 30, 30, 30}
	 * if list = {70, 70, 90, 90, 80, 80}, return {70, 70}
	 * if list = {50, 40, 30, 20}, return {50}
	 * if list = null, return null
	 * if list = {}, return {}
	 */
	public static ArrayList<Integer> getLongestUnchangedSequence(ArrayList<Integer> list) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param list
	 * sort the list in ascending order,
	 * do nothing if the list is null or has fewer than 2 items
	 */
	public static void sortAsc(ArrayList<Integer> list) {
		//to be completed
	}

	/**
	 * 
	 * @param list
	 * sort the list in descending order,
	 * do nothing if the list is null or has fewer than 2 items
	 */
	public static void sortDesc(ArrayList<Integer> list) {
		//to be completed
	}
	
	/**
	 * 
	 * @param list
	 * @param asc
	 * if the list is already sorted (either ascending or descending), do nothing regardless of asc,
	 * otherwise sort the list in ascending order if asc is true,
	 * otherwise sort the list in descending order
	 */
	public static void sortIfNeeded(ArrayList<Integer> list, boolean asc) {
		//to be completed
	}

	/**
	 * 
	 * @param list
	 * if the list is in ascending order, sort it in descending order
	 * if the list is in descending order, sort it in ascending order
	 * do nothing if the list is unsorted
	 */
	public static void reverseSort(ArrayList<Integer> list) {
		//to be completed
	}


	/**
	 * 
	 * @param a: sorted in ascending order
	 * @param b: sorted in ascending order
	 * @return an list containing the common items from a and b.
	 * If list a contains p occurrences of an item and list b contains q occurrences of the same item, 
	 * the list returned must have Math.min(p, q) occurrences of that item.
	 */
	public static ArrayList<Integer> getCommonItemsSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return an list containing the common items from a and b.
	 * If list a contains p occurrences of an item and list b contains q occurrences of the same item, 
	 * the list returned must have Math.min(p, q) occurrences of that item.
	 * 
	 * All occurrences of an item in the resulting list should be together, and be in the order of first appearance in list a.
	 * See the last junit test sample for details 
	 */
	public static ArrayList<Integer> getCommonItemsUnsorted(ArrayList<Integer> a, ArrayList<Integer> b) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return true if there are no common items between any two sublists of the list passed, false otherwise.
	 */
	public static boolean noCommonItems(ArrayList<ArrayList<Integer>> list) {
		return false; //to be completed
	}

	/**
	 * @param list
	 * @return the longest sequence of items that occurs
	 * in the mirrored (back to front) form as well.
	 * in case of a tie, return the sequence that occurs first.
	 * Examples:
	 * if list = {10, 20, 30, 40, 50, 20, 10, 40, 30, 20, 50, 40}
	 * return the list {20, 30, 40} (not {40, 30, 20})
	 *
	 * if list = {1,2,1,2,1,2,1,2,1,2,1,2}
	 * return the list {1,2,1,2,1,2,1,2,1,2,1}
	 * if list = {5,6,7,8,9}
	 * return the list {5}
	 * if list = {5,6,7,5,7,6,8,5,6,9}
	 * return the list {6,7}
	 */
	public static ArrayList<Integer> longestMirroredSequence(ArrayList<Integer> list) {
		return null; //to be completed
	}

	/**
	 * in math, a "set" is defined as a collection of **distinct** items.
	 * Thus, [1,7,2,9] is a set, but [1,7,2,1,9] is not (since 1 occurs multiple times).
	 * @param list
	 * @return a "set" obtained from the passed array. the order of the items should be 
	 * the order in of the first occurrences of the items in the passed array.
	 * for example,
	 * if list = [1,7,2,1,9,7,9,9], return [1,7,2,9]
	 * if list = [7,2,1,1,9,7,9,9], return [7,2,1,9]
	 */
	public static ArrayList<Integer> getSet(ArrayList<Integer> list) {
		return null; //to be completed
	}
	
	/**
	 * 
	 * @param data
	 * @param n: length of sublists needed
	 * @return a list of lists such that each sublist has the same (and highest) total from all possible
	 * sublists of the same length in the original list
	 * For example, if a list is [6,4,6,1,1,1,1,1,1,1,3,1,2,5,6,5,1,1,3,2,1,1,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4] 
	 * and we need to find:
	 * - sublists of length 3 with the highest total will be [6,4,6] & [5,6,5]. return [[6,4,6],[5,6,5]]
	 * - a sublist of length 8, with highest total will be [4,4,4,4,4,4,4,4]. return [[4,4,4,4,4,4,4,4]]
	 */
	public static ArrayList<ArrayList<Integer>> bestTotalSubLists(ArrayList<Integer> data, int n) {
		return null; //to be completed
	}
}
