package samplePracExams.pracExam3;

//IMPORTANT! Do NOT change any method headers

import static org.junit.Assert.*;
import org.junit.*;
import java.io.*;
import java.text.*;
import java.util.*;
import org.junit.rules.*;
import java.lang.reflect.*;

 
//10 marks
//method add(int,int) at the bottom of the class must be completed
class MyArrayList {
	public int[] data;
	public final static int MAX_SIZE = 500;
	public final static int INC_SIZE = 5;
	public final static int DEFAULT_SIZE = 5;
	public int nItems;

	/**
	 * DO NOT MODIFY
	 * create a list with an initial size of DEFAULT_SIZE
	 */
	public MyArrayList() {
		data = new int[DEFAULT_SIZE];
		nItems = 0; //currently 0 items added to list
	}

	/**
	 * DO NOT MODIFY
	 * create a list with an initial size of n
	 * @param n
	 */
	public MyArrayList(int n) {
		if(n > 0 && n <= MAX_SIZE)
			data = new int[n];
		else
			data = new int[DEFAULT_SIZE];
		nItems = 0; //currently 0 items added to list
	}

	// DO NOT MODIFY
	public String toString() {
		String s = "List size "+nItems+": [";
		for(int i=0; i<nItems; i++)
			s+=data[i]+", ";
		if(data.length > 0)
			s = s.substring(0, s.length()-2);
		return s + "]";
	}

	// DO NOT MODIFY
	public void add(int item) {
		if(isFull()) //if full, reserve a bigger block
			grow();
		data[nItems] = item;
		nItems++; //next item should be inserted one index ahead
	}

	// DO NOT MODIFY
	public boolean isFull() {
		return nItems == data.length;
	}

	// DO NOT MODIFY
	public int indexOf(int item) {
		for(int i=0; i<nItems; i++)
			if(data[i] == item)
				return i;
		return -1;
	}

	/**
	 * DO NOT MODIFY
	 * @return number of items in the list
	 */
	public int size() {
		return nItems;
	}

	/**
	 * DO NOT MODIFY
	 * @return capacity of the list
	 */
	public int capacity() {
		return data.length;
	}

	/**
	 * DO NOT MODIFY
	 * @param idx: index from which the item should be returned
	 * @return null if index is invalid, otherwise the item at that index
	 */
	public Integer get(int idx) {
		if(idx < 0 || idx >= nItems)
			return null;
		return data[idx];
	}

	 /**
	 * DO NOT MODIFY
	 * ONLY IF the array is full,
	 * increase the capacity of the array by INC_SIZE
	 * for example,
	 * if before calling the method,
	 * data = [2, 8, 3, 5, 7, 1, 4, 2, 5, 3] (nItems = 10, data.length = 10),
	 * then after the method call, it should become
	 * data = [2, 8, 3, 5, 7, 1, 4, 2, 5, 3, 0, 0, 0, 0, 0]
	 *
	 * if before calling the method,
	 * data = [2, 8, 3, 5, 7, 1, 4, 0, 0, 0] (nItems = 7, data.length = 10),
	 * then after the method call, it should STAY
	 * data = [2, 8, 3, 5, 7, 1, 4, 0, 0, 0]
	 */
	public void grow() {
		if(nItems < data.length) {
			return;
		}
		//create an array INC_SIZE items more than current array
		int[] temp = new int[data.length + INC_SIZE];

		//copy all items to new array
		for(int i=0; i<data.length; i++)
			temp[i] = data[i];

		//update the reference (java's garbage collection handles the old array)
		data = temp;
	}

	/**
	 *
	 * @param index: index at which the item should be inserted
	 * @param item: item to be inserted at the specified index
	 * @return false if index is invalid and true if item was inserted
	 * for example,
	 * if before calling the method,
	 * data = [2, 8, 3, 5, 7, 1, 4, 2, 5, 3] (nItems = 10, data.length = 10, all items occupied),
	 * and index = 4, item = 20,
	 * then return true and after the method call, it should become
	 * data = [2, 8, 3, 5, 20, 7, 1, 4, 2, 5, 3, 0, 0, 0, 0] (nItems = 11, data.length = 15, last four items unoccupied),
	 *
	 * if before calling the method,
	 * data = [2, 8, 3, 5, 7, 1, 4, 0, 0, 0] (nItems = 7, data.length = 10, last three items unoccupied),
	 * and index = 7, item = 20,
	 * then return true and after the method call, it should become
	 * data = [2, 8, 3, 5, 7, 1, 4, 20, 0, 0] (nItems = 8, data.length = 10, last two items unoccupied)
	 *
	 * if before calling the method,
	 * data = [2, 8, 3, 5, 7, 1, 4, 0, 0, 0] (nItems = 7, data.length = 10, last three items unoccupied),
	 * and index = 12, item = 20,
	 * then return false and after the method call, it should STAY
	 * data = [2, 8, 3, 5, 7, 1, 4, 0, 0, 0] (nItems = 7, data.length = 10, last three items unoccupied),
	 */
	public boolean add(int index, int item) {
		return false; //to be completed
	}
}

//IMPORTANT!!! DO NOT MODIFY ANY CODE BELOW THIS LINE!

public class Question6 { //begin TEST class 

	@SuppressWarnings("deprecation")
	@Rule
	public TestRule timeout = new DisableOnDebug(new Timeout(1000));

	@Test @Graded(description="MyArrayList:add(int,int)", marks=10)
	public void testMyArrayListAddIntInt() throws NoSuchMethodException, SecurityException {
		MyArrayList list = new MyArrayList(); //create list of default size (5)

		assertTrue(list.add(0, 20));
		assertFalse(list.isFull());
		assertTrue(list.get(0).compareTo(20)==0);
		assertNull(list.get(1)); //no item at index 1

		assertTrue(list.add(1, 70)); //insert 70 after 20
		assertFalse(list.isFull());
		assertTrue(list.get(0).compareTo(20)==0);
		assertTrue(list.get(1).compareTo(70)==0);
		assertNull(list.get(2)); //no item at index 2

		assertTrue(list.add(1, 90)); //insert 90 between 20 and 70
		assertFalse(list.isFull());
		assertTrue(list.get(0).compareTo(20)==0);
		assertTrue(list.get(1).compareTo(90)==0);
		assertTrue(list.get(2).compareTo(70)==0);
		assertNull(list.get(3)); //no item at index 3

		assertTrue(list.add(0, 30)); //insert 30 at the front
		assertFalse(list.isFull());
		assertTrue(list.get(0).compareTo(30)==0);
		assertTrue(list.get(1).compareTo(20)==0);
		assertTrue(list.get(2).compareTo(90)==0);
		assertTrue(list.get(3).compareTo(70)==0);
		assertNull(list.get(4)); //no item at index 4

		assertTrue(list.add(1, 60)); //insert 60 at index 1
		assertTrue(list.isFull()); //all 5 items are now occupied
		assertTrue(list.get(0).compareTo(30)==0);
		assertTrue(list.get(1).compareTo(60)==0);
		assertTrue(list.get(2).compareTo(20)==0);
		assertTrue(list.get(3).compareTo(90)==0);
		assertTrue(list.get(4).compareTo(70)==0);
		assertNull(list.get(5)); //no item at index 5

		//list is now full
		assertTrue(list.add(5, 80)); //insert 80 at index 5, causing list to "grow"
		assertFalse(list.isFull()); //should have grown
		assertTrue(list.get(0).compareTo(30)==0);
		assertTrue(list.get(1).compareTo(60)==0);
		assertTrue(list.get(2).compareTo(20)==0);
		assertTrue(list.get(3).compareTo(90)==0);
		assertTrue(list.get(4).compareTo(70)==0);
		assertTrue(list.get(5).compareTo(80)==0);
		assertNull(list.get(6)); //no item at index 6


		assertFalse(list.add(20, 7)); //invalid index
		assertFalse(list.add(20, -2)); //invalid index

	}
} //end TEST class Question6 (do not delete this closing bracket)
