package practicalClassCodes.week08;

import java.util.ArrayList;

public class ListPractical {
	/**
	 * 
	 * @param list
	 * @return the first item in the list. assume list contains at least one item.
	 */
	public static Integer firstItemV1(ArrayList<Integer> list) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return the first item in the list. 
	 * assume list is not null (it could still be empty).
	 * return null if list is empty
	 */
	public static Integer firstItemV2(ArrayList<Integer> list) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return the first item in the list. 
	 * return null if list is null or empty
	 */
	public static Integer firstItemV3(ArrayList<Integer> list) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return the last item in the list. return null if list is null or empty.
	 * IMPORTANT: in such situations, you should FIRST do a null check
	 * and THEN a length check 
	 */
	public static Integer lastItem(ArrayList<Integer> list) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return sum of the first and last items in the list.
	 * return null if list is null or is empty.
	 * return the only item if the list has a single item.
	 * IMPORTANT: in such situations, you should FIRST do a null check
	 * and THEN a length check 
	 */
	public static Integer sumFirstLast(ArrayList<Integer> list) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return the sum of all items of the list
	 * return 0 if list is empty
	 */
	public static int sum(ArrayList<Integer> list) {
		if(list == null)
			return 0;
		int total = 0;
		for(int i=0; i < list.size(); i++) {
			total+=list.get(i);
		}
		return total;
	}

	/**
	 * 
	 * @param list
	 * @return number of items in the list that are more than zero
	 * return 0 if the list is null or empty
	 */
	public static int countPositives(ArrayList<Integer> list) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @return the item in the middle. return null if list is null or empty.
	 * IMPORTANT: in such situations, you should FIRST do a null check
	 * and THEN a length check 
	 * If the list has an even number of items, 
	 * the one on the left of the midway point is considered the median.
	 * for example, if list = [10,70,20,90], median is 70 
	 */
	public static Integer median(ArrayList<Integer> list) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param list
	 * @param min
	 * @param max (>= min)
	 * @return true if all items of the list are in the range [min...max], false otherwise
	 * return false if list is null
	 * return true if list is empty
	 * IMPORTANT: in such situations, you should FIRST do a null check
	 * and THEN a length check 
	 */
	public static boolean allInRange(ArrayList<Integer> list, int min, int max) {
		return false; //to be completed
	}
}
