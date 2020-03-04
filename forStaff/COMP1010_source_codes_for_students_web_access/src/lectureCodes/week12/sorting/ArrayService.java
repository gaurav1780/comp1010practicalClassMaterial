package lectureCodes.week12.sorting;

import java.util.Random;

public class ArrayService {

	
	/**
	 * 
	 * @param size
	 * @param low
	 * @param high
	 * @return an array containing size number of items, such that 
	 * each item is in the range [low, high] (inclusive)
	 */
	public static int[] generate(int size, int low, int high) {
		Random r = new Random();
		int[] a = new int[size];
		for(int i=0; i<a.length; i++) {
			a[i] = low + r.nextInt(high-low+1);
		}
		return a;
	}
	
	/**
	 * 
	 * @param size
	 * @param low
	 * @param high
	 * @return an array containing size number of items, such that 
	 * each item is in the range [low, high] (inclusive) AND
	 * each item is smaller than or equal to the next item
	 */
	public static int[] generateSortedArray(int size, int low, int high) {
		Random r = new Random();
		int[] a = new int[size];
		for(int i=0; i<a.length; i++) {
			if(i == 0) //first item
				a[i] = low;
			else { //second and subsequent items
				int inc = r.nextInt(3); //0 or 1 or 2
				int value = a[i-1] + inc;
				if(value <= high) //within bounds
					a[i] = value;
				else //overshot
					a[i] = high;
			}
		}
		return a;
	}

	public static void display(int[] a) {
		System.out.println("-----------");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
	}
	
	public static void display(char[] a) {
		System.out.println("-----------");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
	}

	
	public static void display(Rectangle[] b) {
		System.out.println("-----------");
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
	}
	

	public static void swap(Rectangle[] r, int index1, int index2) {
		Rectangle temp = r[index1];
		r[index1] = r[index2];
		r[index2] = temp;
	}

	public static boolean isSorted(int[] a) {
		if(a == null)
			return false;
		
		for(int i=0; i < a.length - 1; i++)
			if(a[i+1] < a[i])
				return false;
		
		return true;
	}

	public static boolean isSorted(char[] a) {
		if(a == null)
			return false;
		
		for(int i=0; i < a.length - 1; i++)
			if(a[i+1] < a[i])
				return false;
		
		return true;
	}
	
	/**
	 * 
	 * @param a
	 * @param target
	 * @return true if the array a contains the item target, false otherwise
	 */
	public static boolean contains(int[] a, int target) {
		//what if a is null?
		if(a == null) {
			return false;
		}
		
		for(int item: a) { //check each item
			if(item == target) { //if a match is found
				return true; //success!!
			}
		}
		//checked all, matched none
		return false;
	}
	
	/**
	 * 
	 * @param a
	 * @param target
	 * @return the FIRST index at which target exists. 
	 * return -1 if target doesn't exist in array a 
	 * BEST CASE (when target IS the first item): 1 iteration O(1)
	 * WORST CASE (when doesn't exist): n iterations O(n)
	 */
	public static int indexOf(int[] a, int target) {
		if(a == null) {
			return -1;
		}
		for(int i=0; i < a.length; i++) {
			if(a[i] == target) {
				return i;
			}
		}
		//checked all, matched none
		return -1;
	}
	
	/**
	 * 
	 * @param a
	 * @param target
	 * @return the FIRST index at which target exists. 
	 * return -1 if target doesn't exist in array a 
	 * BEST CASE (there really isn't any :( ): O(n) 
	 * WORST CASE (when doesn't exist): O(n)
	 * 
	 * the loop iterates through the entire array unconditionally
	 */
	public static int indexOfV2(int[] a, int target) {
		if(a == null) {
			return -1;
		}
		int result = -1;
		for(int i=a.length - 1; i >= 0 ; i--) {
			if(a[i] == target) {
				result = i; //found a better match, but a yet better match might exist
			}
		}
		//checked all
		return result;
	}
	
	/**
	 * 
	 * @param a: assumed to be sorted (in ascending order)
	 * @param target
	 * @return an index at which target is found, false if not found.
	 */
	public static int binarySearch(int[] a, int target) {
		if(a == null) {
			return -1;
		}
		
		int first = 0;
		int last = a.length - 1;
		int counter = 0;
		while(first <= last) {
			counter++;
			int median = (first+last)/2;
			System.out.println("Searching through range "+first+" to "+last);
			System.out.println("Gonna compare "+target+" with a["+median+"] = "+a[median]);
			if(target == a[median]) {
				System.out.println("bwahahahahah!!!! and it only took me "+counter+" iterations");
				return median;
			}
			if(target < a[median]) { //(left)
				System.out.println("less");
				last = median - 1; //update right bound
			}
			else {  //target > a[median] (right) 
				System.out.println("right");
				first = median + 1; //update left bound
			}
		}
		//first > last - search space exhausted
		System.out.println("not found, "+counter+" iterations");
return -1;
	}
}
