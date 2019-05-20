package solutions.javaLists;
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
		if(list==null) return false;
		if(list.isEmpty() || list.size()==1) return true;
		for(int j=0; j<list.size()-1;j++) {
			if(list.get(j)>list.get(j+1)) return false;
		}
		return true; //completed
	}

	/**
	 * 
	 * @param list
	 * @return a list containing all the positive items from the list passed.
	 * return null if list is null
	 * return an empty list if list is NOT null but do
	 */
	public static ArrayList<Integer> getPositives(ArrayList<Integer> list) {
		if(list==null || list.isEmpty()) return list;
		ArrayList<Integer> positives = new ArrayList<Integer>();
		for(Integer cur:list) {
			if(cur>0) positives.add(cur);
		}
		return positives; //completed
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
		int counter=0;
		while(counter<list.size()) {
			if(list.get(counter)<0) list.remove(counter);
			else counter++; //completed
		}
	}

	/**
	 * 
	 * @param list
	 * @return true if the list contains two instances of target in a row, false otherwise.
	 * return false if list is null or if it contains less than 2 items
	 */
	public static boolean twoInARow(ArrayList<Integer> list, int target) {
		if(list==null || list.size()<2) return false; 
		for(int j=0; j<list.size()-1;j++) {
			if(list.get(j)==target && list.get(j+1)==target) return true;
		}
		return false;
		//completed
	}

	/**
	 * 
	 * @param list
	 * @return true if the list contains three instances of target in a row, false otherwise.
	 * return false if list is null or if it contains less than 3 items
	 */
	public static boolean threeInARow(ArrayList<Integer> list, int target) {
		if(list==null || list.size()<3) return false; 
		for(int j=0; j<list.size()-2;j++) {
			if(list.get(j)==target && list.get(j+1)==target && list.get(j+2)==target) return true;
		}
		return false;
		//completed
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
		if(a==null || b==null || a.size()!=b.size()) return false; 
		for(int j=0; j<a.size();j++) {
			if(a.get(j)!=b.get(a.size()-j-1)) return false;
		}
		return true;
		//completed
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
		if(list==null) return false;
		if(list.isEmpty()) return true;
		for(Integer cur:list) {
			if(list.indexOf(cur)!=list.lastIndexOf(cur)) return false;
		}
		return true; //completed
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
		if(widths==null || heights==null) return null; 
		ArrayList<Rectangle> rect = new ArrayList<Rectangle>();
		for(int j=0; j<widths.size();j++) {
			Rectangle tmp = new Rectangle(widths.get(j),heights.get(j));
			rect.add(tmp);
		}
		return rect;//completed
	}
}
