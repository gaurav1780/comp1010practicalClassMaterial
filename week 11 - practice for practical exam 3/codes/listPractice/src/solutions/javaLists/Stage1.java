package solutions.javaLists;
import java.util.*;

public class Stage1 {
	/**
	 * 
	 * @param list
	 * @return the last item in the list.
	 * return null if list is null or empty
	 */
	public static Integer getLastItem(ArrayList<Integer> list) {
		if(list==null || list.isEmpty()) return null;
		return list.get(list.size()-1); //completed
	}

	/**
	 * 
	 * @param list
	 * @return the sum of the first and last items
	 * return null if list is null
	 * return the only value if list contains a single item
	 */
	public static Integer getSumFirstLastItems(ArrayList<Integer> list) {
		if(list==null || list.isEmpty()) return null;
		if(list.size()==1) return list.get(0);
		return list.get(0)+list.get(list.size()-1); //completed
	}

	/**
	 * 
	 * @param list
	 * @return true if the list contains an even number of items (0, 2, 4 ....), false otherwise
	 * return false if list is null
	 */
	public static boolean containsEvenNumberOfItems(ArrayList<Integer> list) {
		if(list==null || list.size()%2!=0) return false;
		return true; //completed
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return true if the two lists are of the same size, false otherwise
	 * return false if EITHER list is null
	 */
	public static boolean sameSize(ArrayList<Integer> a, ArrayList<Integer> b) {
		if(a==null || b==null) return false;
		return a.size()==b.size(); //completed
	}
	
	/**
	 * 
	 * @param list
	 * @return the median value in the list (the item in the middle).
	 * if the list has an odd number of items, it's a clear choice.
	 * if the list has an even number of items, return the number just to the left of the dividing line.
	 * if the list is null or empty, return null
	 * 
	 * Some parameter-return value examples:
	 * [10,70,20,90,30] --> 20
	 * [50,80,90,70] --> 80
	 * [] --> null
	 * null -> null
	 * 
	 */
	public static Integer median(ArrayList<Integer> list) {
		if(list==null || list.isEmpty()) return null;
		if(list.size()%2!=0) return list.get(list.size()/2); 
		else return list.get(list.size()/2 -1); //completed
	}
	
	/**
	 * 
	 * @param list - an arraylist of Rectangle objects
	 * @return the first item in the list.
	 * return null if list is null or empty
	 */
	public static Rectangle getFirstItem(ArrayList<Rectangle> list) {
		if(list==null || list.isEmpty()) return null;
		return list.get(0); //completed
	}
}
