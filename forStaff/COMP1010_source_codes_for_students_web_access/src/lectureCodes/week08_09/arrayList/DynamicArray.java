package lectureCodes.week08_09.arrayList;

import java.util.Arrays;

public class DynamicArray {
	public int[] data; //storage
	public int nItems; //all-important counter to handle operations

	public DynamicArray() {
		data = new int[5];
		nItems = 0;
	}

	public DynamicArray(int n) {
		if(n < 5)
			data = new int[5];
		else if(n > 1000)
			data = new int[1000];
		else 
			data = new int[n];
		nItems = 0;
	}

	public DynamicArray(int[] source) {
		if(source == null) {
			data = new int[5];
			nItems = 0;
		}
		else { //parameter has been properly instantiated (has 0 or more items)
			data = new int[source.length];
			for(int i=0; i < source.length; i++)
				data[i] = source[i];
			nItems = source.length;
		}
	}

	public boolean isFull() {
		if(nItems == data.length)
			return true;
		else
			return false;
	}

	/**
	 * add an item at the end of the array
	 * @param item: item to be added
	 */
	public void add(int item) {
		if(isFull()) {
			grow();
		}
		data[nItems] = item;
		nItems++;

	}

	public void grow() {
		System.out.println("I am a growing kid! " + Arrays.toString(data));//create a bigger array temp
		int[] temp = new int[data.length + 5];
		//copy items over
		for(int i=0; i < data.length; i++) {
			temp[i] = data[i];
		}
		//data still refers to the old (smaller) set
		//re-refer instance variable array data
		data = temp;
	}

	/**
	 * 
	 * @param inc: the size by which instance variable array should grow
	 */
	public void grow(int inc) {
		if(inc > 0) {
			System.out.println("I am a growing kid! " + data);//create a bigger array temp
			int[] temp = new int[data.length + inc];
			//copy items over
			for(int i=0; i < data.length; i++) {
				temp[i] = data[i];
			}
			//data still refers to the old (smaller) set
			//re-refer instance variable array data
			data = temp;
		}
	}

	/**
	 * add item at given index
	 * best case: O(1) when array not full and inserting at back of array
	 * worst case: O(n) when full OR inserting at front of array
	 * @param item
	 * @param index
	 * @return true if item successfully added, false otherwise
	 */
	public boolean add(int item, int index) {	
		if(index < 0 || index > nItems)
			return false;
		if(isFull()) {
			grow();
		}
		//shift all items towards the back of the array
		for(int i=nItems-1; i >= index; i--) {
			data[i+1] = data[i];
		}
		data[index] = item;
		nItems++;
		return true;
	}

	/**
	 * remove and return the item at the supplied index
	 * @param index
	 * @return item removed (null if the index is invalid)
	 */
	public Integer remove(int index) {	
		if(index < 0 || index >= nItems)
			return null;
		int itemRemoved = data[index];
		for(int i=index; i < nItems - 1; i++) {
			data[i] = data[i+1];
		}
		nItems--; //CRITICAL
		return itemRemoved;
	}
	
	/**
	 * 
	 * @param start
	 * @param end
	 * @return remove and return the subset starting at index start
	 * and ending at index end
	 * for example,
	 * if data = {4,9,2,7,3,6,1,8,0,0,0}
	 * nItems = 8
	 * start = 2
	 * end = 5
	 * data should become {4,9,1,8,0,0,0,0,0,0,0,0}
	 * and return the array {2,7,3,6}
	 */
	public int[] remove(int start, int end) {
		if(start > end || start < 0 || end >= nItems)
			return null;
		int[] result = new int[end-start+1];
		for(int i=start; i<=end; i++) {
			result[i-start] = data[i];
		}
		
		int k = 0;
		for(int i=end+1; i < nItems; i++) {
			data[start+k] = data[i];
			k++;
		}
		
		nItems-=(end-start+1);
		return result;
	}

	public String toString() {
		String result = "";
		for(int i=0; i < nItems; i++)
			result+=data[i]+" ";
		return result;
	}
}
