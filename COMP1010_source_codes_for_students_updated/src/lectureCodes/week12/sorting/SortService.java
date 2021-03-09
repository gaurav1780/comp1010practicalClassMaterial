package lectureCodes.week12.sorting;

public class SortService {
	/**
	 * best case and worst case: O(n*n)
	 * @param a: is sorted in ascending order after execution
	 */
	public static void selectionSort(int[] a) {
		if(a == null) //can't do anything
			return;

		//i is the starting point of the "unsorted region"
		for(int i=0; i < a.length - 1; i++) {
			int minIndex = i; //assume that smallest item is at beginning of that region
			for(int k=i+1; k < a.length; k++) { //for all subsequent items
				if(a[k] < a[minIndex]) { //we've reached a new low :D
					minIndex = k; //update location of smallest item so far
				}
			} //end k loop
			/*
			 * now we know smallest item in region [i] to [a.length-1] is at [minIndex]
			 * so swap a[i] with a[minIndex]
			 */
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}//end i loop
	}
	
	/**
	 * best case and worst case: O(n*n)
	 * @param a: is sorted in descending order after execution
	 */
	public static void selectionSortDescending(int[] a) {
		if(a == null) //can't do anything
			return;

		//i is the starting point of the "unsorted region"
		for(int i=0; i < a.length - 1; i++) {
			int maxIndex = i; //assume that highest item is at beginning of that region
			for(int k=i+1; k < a.length; k++) { //for all subsequent items
				
				//LOOK!
				if(a[k] > a[maxIndex]) { //+++++THE ONLY SIGNIFICANT CHANGE+++++
					
					maxIndex = k; //update location of highest item so far
				}
			} //end k loop
			/*
			 * now we know highest item in region [i] to [a.length-1] is at [maxIndex]
			 * so swap a[i] with a[maxIndex]
			 */
			int temp = a[i];
			a[i] = a[maxIndex];
			a[maxIndex] = temp;
		}//end i loop
	}
	
	/**
	 * best case: O(n) when already sorted in ascending order
	 * worst case: O(n*n) when sorted in descending order
	 * basic version of insertion sort with all operation done in-line (no delegation)
	 * @param a: is sorted in ascending order after execution
	 */
	public static void insertionSort(int[] a) {
		if(a == null)
			return;
		for(int i=1; i < a.length; i++) {
			int backup = a[i]; //keep a copy of item to insert into its rightful place
			int k = i - 1;
			while(k >= 0 && a[k] > backup) { //all higher items
				a[k+1] = a[k]; //must be pushed towards the back of the array
				k--;
			}
			a[k+1] = backup; //copy backup into its rightful place
		}
	}
	
	/**
	 * best case: O(n) when already sorted in ascending order
	 * worst case: O(n*n) when sorted in descending order
	 * basic version of insertion sort with all operation done in-line (no delegation)
	 * @param a: is sorted in DESCENDING order after execution
	 */
	public static void insertionSortDescending(int[] a) {
		if(a == null)
			return;
		for(int i=1; i < a.length; i++) {
			int backup = a[i]; //keep a copy of item to insert into its rightful place
			int k = i - 1;
			
			//LOOK!
			while(k >= 0 && a[k] < backup) { //+++++THE ONLY SIGNIFICANT CHANGE+++++
				a[k+1] = a[k]; //must be pushed towards the back of the array
				k--;
			}
			a[k+1] = backup; //copy backup into its rightful place
		}
	}
	
	/**
	 * best case: O(n) when already sorted in ascending order
	 * worst case: O(n*n) when sorted in descending order
	 * insertion sort utilizing a helper method (insertIntoSortedRegion)
	 * @param a: is sorted in ascending order after execution
	 */
	public static void insertionSortDelegated(int[] a) {
		if(a == null || a.length == 0)
			return;
		for(int pivotIndex=1; pivotIndex < a.length; pivotIndex++) {
			insertIntoSortedRegion(a, pivotIndex);
		}
	}
	
	/**
	 * Best case: O(1) - when already in its rightful place
	 * Worst case: O(n) - when moved to front
	 * helper to insertionSortDelegated
	 * @param a
	 * @param idx: item at index idx is moved to its rightful place 
	 * (between [0] and [idx]) after execution.
	 */
	public static void insertIntoSortedRegion(int[] a, int idx) {
		if(a == null)
			return; //nothing to do
		if(idx < 0 || idx >= a.length) //out of bounds
			return; //ditto
		
		int backup = a[idx]; //keep a backup to reinstate later
		int k = idx - 1; //start looking from the item just before
		//as long as there are items left that need to be pushed forward
		while(k >= 0 && a[k] > backup) {
			a[k+1] = a[k]; //copy item to the right
			k--; //look at the next contender (at one place to the left)
		}
		a[k+1] = backup; //reinstate backup at rightful place
		ArrayService.display(a);
	}
	
	/**
	 * 
	 * @param a: assumption - none of the items in the array are null.
	 * array is sorted in ascending order of area of items after execution
	 * comparison criteria: the one used in Rectangle.compareTo(Rectangle)
	 */
	public static void insertionSort(Rectangle[] a) {
		if(a == null)
			return;
		for(int i=1; i < a.length; i++) {
			Rectangle backup = a[i];
			int k = i - 1;
			while(k >= 0 && a[k].compareTo(backup) == 1) {
				a[k+1] = a[k];
				k--;
			}
			a[k+1] = backup;
		}
	}
	
	/**
	 * 
	 * @param a: assumption - none of the items in the array are null.
	 * array is sorted in ascending order of area of items after execution
	 * comparison criteria: the one used in Rectangle.compareTo(Rectangle)
	 */
	public static void insertionSortWithNullObjects(Rectangle[] a) {
		if(a == null)
			return;
		for(int i=1; i < a.length; i++) {
			Rectangle backup = a[i];
			int k = i - 1;
			/*
			 * change is that null objects are always moved to the front without
			 * comparing with other objects
			 */
			while(k >= 0 && a[k]!=null && (backup == null || a[k].compareTo(backup) == 1)) {
				a[k+1] = a[k];
				k--;
			}
			a[k+1] = backup;
		}
	}
	
	public static void insertionSortBasedOnNumberOfDivisors(int[] a) {
		if(a == null)
			return;
		
		for(int i=1; i < a.length; i++) {
			int backup = a[i];
			int k = i-1;
			int divCount = countDivisors(a[i]);
			while(k >= 0 && countDivisors(a[k]) > divCount) {
				a[k+1] = a[k];
				k--;
			}
			a[k+1] = backup;
		}
	}
	
	//helper for insertionSortBasedOnNumberOfDivisors
	public static int countDivisors(int n) {
		int count = 0;
		for(int i=1; i <= n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		return count;
	}

	/**
	 * for proficient students -
	 * a variation of selection sort. sorts starting from the end of the array
	 * @param a
	 */
	public static void selectionSortRightToLeft(int[] a) {
		if(a == null)
			return;

		//determine the search space
		for(int i=a.length - 1; i > 0; i--) { //n-1: O(n)
			//i is the starting point of the search space
			int maxIndex = i; 
			for(int k=i-1; k >= 0; k--) { //n/2: O(n)
				if(a[k] > a[maxIndex]) {
					maxIndex = k;
				}
			} //end k loop
			//end of current iteration to find smallest value
			//smallest item is at index minIndex
			//starting point is i
			swap(a, i, maxIndex);
			ArrayService.display(a);
		}//end i loop
	}

	/**
	 * helper method for selection sort methods
	 * @param a (a[idx1] and a[idx2] should be swapped)
	 * @param idx1
	 * @param idx2
	 */
	public static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}

}
