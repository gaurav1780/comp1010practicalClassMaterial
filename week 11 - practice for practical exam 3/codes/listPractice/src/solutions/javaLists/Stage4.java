package solutions.javaLists;
import java.util.*;

public class Stage4 {
	/**
	 * sort the list in ascending order
	 * 
	 * do nothing if list is null or contains less than 2 items
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
	 * @param a
	 * @param b
	 * @return list containing a single instance of each item that occur in both the lists.
	 * the order of items in the returned list should be in the order they occur in the first list.
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
	 * @return list containing all(+) instance of items that occur in both the lists.
	 * the order of items in the returned list should be in the order they occur in the first list.
	 * (+) the number of times an item exists in the resulting list is the smaller of the occurrences
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

	/**
	 * @param list: an ArrayList of ArrayLists
	 * @param n: assume n > 0
	 * @return: a list containing items that exist in at least
	 * n (sub)ArrayList of the passed list
	 * order of items should be -
	 * all items from the first sub-list that satisfy the requirement, followed by,
	 * all items from the second sub-list (but not in the first sub-list) that satisfy the 
	 * requirement, followed by,
	 * all items from the third sub-list (but not in the first two sub-lists) that satisfy 
	 * the requirement, and so on...
	 * for example, 
	 * if list = null and n = 2, return null
	 * if list = [[1,2,3,4,5], [4,5,6,7,8], [3,5,7,6]] and n = 2, return the list [3,4,5,6,7]
	 * if list = [null, null, null] and n = 2, return the list []
	 * if list = [[1,2,3,4,5], [4,5,6,7,8], [3,5,7,6]] and n = 3, return the list [5]
	 * if list = [[1,2,3,4,5,6], [4,6,7,8], [3,5,7,6,4]] and n = 3, return the list [4, 6]
	 * if list = [[1,2,3,4,5,6], [4,6,7,8], null, [3,5,7,6,4]] and n = 3, return the list [4, 6]
	 */
	public static ArrayList<Integer> itemsInAtleastN(ArrayList<ArrayList<Integer>> list, int n) {
		return new ArrayList<Integer>(); //to be completed
	}
}
