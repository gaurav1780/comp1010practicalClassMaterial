package javaLists;
import java.util.*;

public class Stage3 {
	/**
	 *
	 * @param list
	 * @return true if the list is in ascending order.
	 * that is, if every item is less than or equal to the next item.
	 * return false if list is null
	 * return true if list is empty or contains one item
	 */
	public static boolean isAscending(ArrayList<Integer> list) {
		return false; //to be completed
	}

	/**
	 *
	 * @param list
	 * @return a list containing all the positive items from the list passed.
	 * return null if list is null
	 * return an empty list if the passed list is empty
	 */
	public static ArrayList<Integer> getPositives(ArrayList<Integer> list) {
		return null; //to be completed
	}

	/**
	 * Remove all negative items from the list
	 * @param list
	 *
	 * For example,
	 *
	 * if list = [2, 4, 0, -1, -2, -3, 0, 4, -8, 3, 0, -1, -1],
	 * it should become [2, 4, 0, 0, 4, 3, 0]
	 *
	 * TIP: use remove method and use the debugger to ensure that the right item is being removed
	 */
	public static void removeNegatives(ArrayList<Integer> list) {
		//to be completed
	}

	/**
	 *
	 * @param list
	 * @return true if the list contains two instances of target in a row, false otherwise.
	 * return false if list is null or if it contains less than 2 items
	 */
	public static boolean twoInARow(ArrayList<Integer> list, int target) {
		return false; //to be completed
	}

	/**
	 *
	 * @param list
	 * @return true if the list contains three instances of target in a row, false otherwise.
	 * return false if list is null or if it contains less than 3 items
	 */
	public static boolean threeInARow(ArrayList<Integer> list, int target) {
		return false; //to be completed
	}

	/**
	 *
	 * @param a
	 * @param b
	 * @return true if the two lists contain the same items but in reverse order.
	 * return false if EITHER list is null
	 * For example,
	 * a = [10,70,20,90], b=[90,20,70,10] --> true
	 * a = [10,70,20,90], b=[90,20,70] --> false
	 * a = [10,70,20,90], b=[90,70,20,10] --> false
	 * a = [10,70,20], b=[90,20,70,10] --> false
	 * a = null, b = [90,20,70,10] --> false
	 */
	public static boolean mutuallyReverse(ArrayList<Integer> a, ArrayList<Integer> b) {
		return false; //to be completed
	}

	/**
	 *
	 * @param list
	 * @return true if every item in the list occurs only once, false otherwise.
	 * return true if list is empty, false if the list is null
	 *
	 * TIP: use of methods indexOf and lastIndexOf will make your life oh-so-easy
	 */
	public static boolean allUnique(ArrayList<Integer> list) {
		return false; //to be completed
	}

	/**
	 *
	 * @param widths: if not null, assume it has same number of items as heights
	 * @param heights: if not null, assume it has same number of items as widths
	 * @return an ArrayList of Rectangle objects such that rectangle at index i
	 * has a width of widths.get(i) and height of heights.get(i)
	 *
	 * return null if either of the parameter lists is null
	 */
	public static ArrayList<Rectangle> getRectangles(ArrayList<Integer> widths, ArrayList<Integer> heights) {
		return null; //to be completed
	}
}
