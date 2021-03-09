package practicePackage.customBuiltLists.customArrayList.attempts;

import java.util.ArrayList;

/**
 * CustomArrayList provides a (very basic) implementation of an ArrayList
 * containing a collection of int values.
 * we add the CORE methods:
 * 
 * isEmpty() return true if list is empty
 * size() number of items in list
 * add(int) add given item
 * add(int, int) add at given index the given value
 * remove(int) remove given item
 * remove(int) remove item from given index
 * 
 * auxillary methods
 * 
 * indexOf(int) first index where item is found
 * lastIndexOf(int) last index where item is found
 * 
 * It is not "generic"/"parameterized" #REMIND_ME_COMP229
 * @author gauravgupta
 * 
 */
public class CustomArrayList {
	//instance variables
	public int[] data; //data.length gives the capacity
	public int nItems; //nItems gives items currently in the arraylist

	//DO NOT MODIFY
	public CustomArrayList() {
		nItems = 0;
	data = new int[10];
	}

	//DO NOT MODIFY
	public boolean isEmpty() {
		return nItems == 0;
	}

	//DO NOT MODIFY
	public int currentSize() {
		return nItems;
	}


	//DO NOT MODIFY
	public int currentCapacity() {
		return data.length;
	}

	//DO NOT MODIFY
	public boolean isFull() {
		return nItems == data.length;
	}


	//DO NOT MODIFY
	public String toString() {
		String result = "[";
		for(int i=0; i < nItems; i++) {
			result = result +  data[i] +", ";
		}
		if(result.length() > 1) //not empty
			result = result.substring(0, result.length()-2);
		return result + "]";
	}

	/**
	 * grow the array by 5 items
	 */
	public void grow() {
		//to be completed
	}

	/**
	 * grow the array by n items. do nothing if n is less than or equal to 0
	 * @param n
	 */
	public void grow(int n) {
		//to be completed
	}

	/**
	 * add the value to the end of list.
	 * grow the list if required
	 * @param value
	 */
	public void add(int value) {
		//to be completed
	}

	/**
	 * 
	 * @param idx
	 * @return item at index idx if there, null otherwise
	 */
	public Integer get(int idx) {
		return null; //to be completed
	}

	/**
	 * set the item at index idx to value newValue,
	 * returning the value previously stored at index idx
	 * @param idx
	 * @param newValue
	 * @return the value that was overwritten
	 * 
	 * return null if the index is invalid
	 */
	public Integer set(int idx, int newValue) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param oldValue
	 * @param newValue
	 * @return the index at which oldValue first existed 
	 * and is replaced, -1 otherwise
	 */
	public int replace(int oldValue, int newValue) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param oldValue
	 * @param newValue
	 * @return a CustomArrayList object containing all indices 
	 * where oldValue occurred and is now replaced by newValue
	 */
	public CustomArrayList replaceAll(int oldValue, int newValue) {
		return null; //to be completed 
	}

	/**
	 * add item value at index idx
	 * @param idx
	 * @param value
	 * @return true if value CAN be added at index idx,
	 * false otherwise (if idx is invalid).
	 * FOR EXAMPLE, 
	 * If a list contains 5 items, we can add a new value
	 * at any index from 0 (before the first item) to
	 * 5 (after the last item)
	 */ 
	public boolean add(int idx, int value) {
		return false; //to be completed
	}

	/**
	 * remove the value at index idx (if any) and return value removed.
	 * if idx is invalid, return null
	 * @param idx
	 * @return the value removed
	 * FOR EXAMPLE, 
	 * If a list contains 5 items, we can remove a value
	 * at any index from 0 (first item) to
	 * 4 (last item)	
	 */
	public Integer remove(int idx) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param other
	 * @return true if calling object and parameter objects
	 * have the same items in the same order
	 * 
	 * FOR EXAMPLE,
	 * 
	 * if 
	 * instance variable data of calling object = [10,70,20,90]
	 * instance variable data of parameter object = [10,70,20,90]
	 * return true	
	 *  
	 * if 
	 * instance variable data of calling object = [10,70,20,90]
	 * instance variable data of parameter object = [90,10,20,70]
	 * return false
	 * 
	 * if 
	 * instance variable data of calling object = [10,60,20,90]
	 * instance variable data of parameter object = [90,10,20,70]
	 * return false
	 * 
	 * if 
	 * instance variable data of calling object = [10,20,90]
	 * instance variable data of parameter object = [90,10,20,70]
	 * return false
	 * if 
	 * instance variable data of calling object = [10,20,90]
	 * instance variable data of parameter object = [10,20]
	 * return false
	 */
	public boolean identical(CustomArrayList other) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param other
	 * @return CustomArrayList object containing all
	 * items of calling object followed by all items
	 * of parameter object
	 * FOR EXAMPLE:
	 * If thisdata = [10,70,20]
	 * otherdata = [50,90]
	 * 
	 * The data instance variable of list returned should
	 * be [10,70,20,50,90]
	 */
	public CustomArrayList join(CustomArrayList other) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param idx1
	 * @param idx2
	 * @return CustomArrayList containing items from index
	 * idx1 to index idx2 (inclusive on both sides), if valid.
	 * return null if the range is invalid.
	 * FOR EXAMPLE:
	 * If 
	 * thisdata = [10,70,20,50,90,30,80]
	 * idx1 = 2
	 * idx2 = 5
	 * 
	 * The data instance variable of list returned should
	 * be [20,50,90,30]
	 */
	public CustomArrayList subList(int idx1, int idx2) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param other
	 * @return true if calling object and parameter objects
	 * have the same items (ok to be in different order)
	 * 
	 * FOR EXAMPLE,
	 * 
	 * if 
	 * instance variable data of calling object = [10,70,20,90]
	 * instance variable data of parameter object = [90,10,20,70]
	 * return true
	 * 
	 * if 
	 * instance variable data of calling object = [10,60,20,90]
	 * instance variable data of parameter object = [90,10,20,70]
	 * return false
	 * 
	 * if 
	 * instance variable data of calling object = [10,20,90]
	 * instance variable data of parameter object = [90,10,20,70]
	 * return false
	 * if 
	 * instance variable data of calling object = [10,20,90]
	 * instance variable data of parameter object = [10,20]
	 * return false
	 */
	public boolean same(CustomArrayList other) {
		return false; //to be completed
	}

	//sort in ascending order
	public void sort() {
		//to be completed
	}
}
