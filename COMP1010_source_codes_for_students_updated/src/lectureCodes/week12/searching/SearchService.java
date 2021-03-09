package lectureCodes.week12.searching;

public class SearchService {
	/**
	 * basic linear search 
	 * best case O(1) (first item is target)
	 * worst case O(n) (target not present in array)
	 * @param a
	 * @param target
	 * @return true if target found, false otherwise.
	 */
	public static boolean contains(int[] a, int target) {
		if(a == null)
			return false;
		for(int i=0; i < a.length; i++) {
			if(a[i] == target) {
				return true;
			}
		} //end loop
		return false;
	}
	
	/**
	 * basic linear search. 
	 * best case O(1) (first item is target)
	 * worst case O(n) (target not present in array)
	 * @param a
	 * @param target
	 * @return index of first occurrence (-1 if not found)
	 */
	public static int indexOf(int[] a, int target) {
		if(a == null)
			return -1;
		for(int i=0; i < a.length; i++) {
			if(a[i] == target) {
				return i;
			}
		} //end loop
		return -1;
	}
	
	/**
	 * basic linear search (inefficient). 
	 * best case and worst case both O(n) (irrespective of array contents)
	 * @param a
	 * @param target
	 * @return index of first occurrence (-1 if not found)
	 */
	public static int indexOfInefficient(int[] a, int target) {
		if(a == null)
			return -1;
		int result = -1;
		for(int i=a.length-1; i >= 0; i--) { //search back to front
			if(a[i] == target) {
				result = i; //over-write by an "earlier" occurrence
			}
		} //end loop
		return result;
	}
	
	/**
	 * variation of basic linear search. 
	 * best case O(1) (first item in second half equals target)
	 * worst case O(n) (target not present in second half of array)
	 * @param a
	 * @param target
	 * @return index of first occurrence in second half (-1 if not found in second half)
	 * IMPORTANT: second half is defined as index a.length/2 and onwards
	 */
	public static int indexOfSecondHalf(int[] a, int target) {
		if(a == null)
			return -1;
		for(int i=a.length/2; i < a.length; i++) { //only look through second half
			if(a[i] == target) {
				return i;
			}
		} //end loop
		return -1;
	}
	
	/**
	 * variation of basic linear search. 
	 * best case O(1) (first item is target)
	 * worst case O(n) (target not present at an even index in array)
	 * @param a
	 * @param target
	 * @return index of first occurrence at an even index (-1 if not found at an even index)
	 */
	public static int indexOfEvenIndex(int[] a, int target) {
		if(a == null)
			return -1;
		for(int i=0; i < a.length; i+=2) { //look through all even indices only
			if(a[i] == target) {
				return i;
			}
		} //end loop
		return -1;
	}
	
	/**
	 * variation of basic linear search. 
	 * best case O(1) (second item in the array is target)
	 * worst case O(n) (target not present at an odd index in array)
	 * @param a
	 * @param target
	 * @return index of first occurrence at an odd index (-1 if not found at an odd index)
	 */
	public static int indexOfOddIndex(int[] a, int target) {
		if(a == null)
			return -1;
		for(int i=1; i < a.length; i+=2) { //starting at index 1, look through all odd indices only
			if(a[i] == target) {
				return i;
			}
		} //end loop
		return -1;
	}
	
	/**
	 * 
	 * @param data (data is in ascending order: data[i] >= data[i-1])
	 * @param target: item to look for
	 * @return
	 */
	public static int binarySearch(int[] data, int target, int first, int last) {
		if(first > last)
			return -1;
		int median = (first+last)/2;
		if(target == data[median]) {
			return median;
		}
		else if(target > data[median]) {
			return binarySearch(data, target, median + 1, last);//right half
		}
		else 
			return binarySearch(data, target, first, median - 1);//left half
	}
	
	/**
	 * advanced search exercise
	 * @param a
	 * @return array containing positive items (more than 0) from passed array
	 */
	public static double[] getPositives(double[] a) {
		int c = countPositives(a);
		double[] result = new double[c];
		int k = 0; //destination index
		for(int i=0; i < a.length; i++) {
			if(a[i] > 0) {
				result[k] = a[i];
				k++;
			}
		}
		return result;
	}
	
	/**
	 * helper method for getPositives
	 * @param a
	 * @return number of positive items (more than 0) in passed array
	 */
	public static int countPositives(double[] a) {
		int r = 0;
		for(int i=0; i < a.length; i++) {
			if(a[i] > 0) {
				r++;
			}
		}//end loop
		return r;
	}
}
