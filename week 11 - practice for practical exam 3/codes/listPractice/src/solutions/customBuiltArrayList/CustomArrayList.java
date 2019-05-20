package solutions.customBuiltArrayList;

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
	private int[] data; //data.length gives the capacity
	private int nItems; //nItems gives items currently in the arraylist

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
		int[] temp = new int[data.length+5];
		for(int i=0; i < data.length; i++) {
			temp[i]=data[i];
		}
		data=temp;
		//completed
	}

	/**
	 * grow the array by n items. do nothing if n <= 0
	 * @param n
	 */
	public void grow(int n) {
		if(n <= 0) 
			return;
		int[] temp = new int[data.length+n];
		for(int i=0; i < data.length; i++) {
			temp[i]=data[i];
		}
		data=temp;
		//completed
	}

	/**
	 * add the value to the end of list.
	 * grow the list if required
	 * @param value
	 */
	public void add(int value) {
		if(nItems==data.length) grow(1);
		data[nItems]=value;
		nItems++;
		//completed
	}

	/**
	 * 
	 * @param idx
	 * @return item at index idx if there, null otherwise
	 */
	public Integer get(int idx) {
		if(idx < 0 || idx >= nItems) {
			return null;
		}
		return data[idx];
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
		if(idx < 0 || idx >= nItems) {
			return null;
		}
		int replacedVal=data[idx];
		data[idx]=newValue;
		return replacedVal; //completed
	}

	/**
	 * 
	 * @param oldValue
	 * @param newValue
	 * @return the index at which oldValue first existed 
	 * and is replaced, -1 otherwise
	 */
	public int replace(int oldValue, int newValue) {
		boolean exists = false;
		int idx=-1;
		for(int j=0;j<nItems;j++) {
			if(data[j]==oldValue) {
				exists=true;
				idx=j;
				data[idx]=newValue;
				break;
			}
		}
		if(!exists) return -1;
		else return idx; //completed
	}

	/**
	 * 
	 * @param oldValue
	 * @param newValue
	 * @return a CustomArrayList object containing all indices 
	 * where oldValue occurred and is now replaced by newValue
	 */
	public CustomArrayList replaceAll(int oldValue, int newValue) {
		CustomArrayList result = new CustomArrayList();
		for(int i=0; i < nItems; i++) {
			if(data[i] == oldValue) {
				result.add(i);
				data[i] = newValue;
			}
		}
		return result;
	}

	public boolean isFull() {
		return nItems == data.length;
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
		int cur = 0;
		int[] newData = new int[nItems+1];
		if(idx<0 || idx>nItems) return false;
		else{
			for(int j=0;j<nItems+1;j++) {
				if(j==idx) newData[j]=value;
				else{
					newData[j]=data[cur];
					cur++;
				}
			}
		}
		data=newData;
		nItems++;
		return true; //completed
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
		if(idx < 0 || idx >= nItems) 
			return null;
		int[] newArray = new int[nItems-1];
		int cur=0;
		for(int j=0;j<newArray.length;j++) {
			if(cur==idx) {
				cur++;
				newArray[j]=data[cur];
				cur++;				
			}
			else {
				newArray[j]=data[cur];
				cur++;
			}
		}
		int removed = data[idx];
		data=newArray;
		nItems--;
		return removed; //completed
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
		if(this.data.length!=other.data.length) return false;
		for(int j=0; j<data.length; j++) {
			if(this.data[j]!=other.data[j]) return false;
		}
		return true; //completed
	}

	/**
	 * 
	 * @param other
	 * @return CustomArrayList object containing all
	 * items of calling object followed by all items
	 * of parameter object
	 * FOR EXAMPLE:
	 * If this.data = [10,70,20]
	 * other.data = [50,90]
	 * 
	 * The data instance variable of list returned should
	 * be [10,70,20,50,90]
	 */
	public CustomArrayList join(CustomArrayList other) {
		CustomArrayList newArray = new CustomArrayList();
		for(int j=0; j<this.nItems;j++) {
			newArray.add(this.data[j]);
		}
		for(int j=this.nItems; j<this.nItems+other.nItems; j++) {
			newArray.add(other.data[j-this.nItems]);
		}
		return newArray; //completed
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
	 * this.data = [10,70,20,50,90,30,80]
	 * idx1 = 2
	 * idx2 = 5
	 * 
	 * The data instance variable of list returned should
	 * be [20,50,90,30]
	 */
	public CustomArrayList subList(int idx1, int idx2) {
		if(idx1<0 || idx2<0 || idx1>=nItems || idx2>=nItems || idx2<idx1) 
			return null;
		CustomArrayList sub = new CustomArrayList();
		for(int i=idx1; i<=idx2; i++) {
			sub.add(data[i]);
		}
		return sub; //completed
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
		if(this.nItems!=other.nItems) return false;
		this.sort();	
		other.sort();
		return this.identical(other);
		//completed
	}

	//sort in ascending order
	public void sort() {
		int numChanges = 1;
		while(numChanges>0) {
			for(int i=0; i < nItems-1; i++) {
				if(data[i] > data[i+1]) {
					int tmp = data[i];
					data[i] = data[i+1];
					data[i+1]=tmp;
					numChanges++;
				}
			}
			if(numChanges>1) numChanges=1;
			else numChanges = 0;
		}
		//completed
	}
}
