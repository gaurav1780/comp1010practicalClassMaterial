package practicePackage.customBuiltLists.customLinkedList.attempts;

public class MyLinkedList {
	public Node head;

	public MyLinkedList() {
		head = null;
	}

	/**
	 * DO NOT MODIFY
	 * @return true if list is empty, false otherwise
	 */
	public boolean isEmpty() {
		return head == null;
	}

	/**
	 * DO NOT MODIFY
	 * insert the value val at the beginning of the list
	 * if the list = null before calling the method
	 * and val = 50, then list should become [50]
	 * after the method finishes execution
	 * @param val
	 */
	public void addAtFront(int val) {
		Node temp = new Node(val, null);
		temp.next = head;
		head = temp;
	}

	//DO NOT MODIFY
	public String toString() {
		String result = "[";
		Node current = head;
		while(current != null) {
			result = result + current.data + ", ";
			current = current.next;
		}
		if(result.length() > 1) {
			result = result.substring(0, result.length()-2);	
		}
		return result + "]";
	}

	/**
	 * 
	 * @param idx
	 * @return true if an item exists at the passed idx
	 * Note that the first item is said to be at index 0.
	 * 
	 * FOR EXAMPLE,
	 * if list represents [10, 70, 20, 90],
	 * items exist at indices 0, 1, 2, 3 
	 * but not at indices [... -2, -1] or [4, 5, ..]
	 */
	public boolean itemExistsAt(int idx) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param idx
	 * @return true if an item can be added at the passed idx
	 * 
	 * FOR EXAMPLE,
	 * if list represents [10, 70, 20, 90],
	 * items can be added at indices 
	 * 0 (before the first item), 1, 2, 3, 4 (after the last item) 
	 * but not at indices [... -2, -1] or [5, 6, ..]
	 */
	public boolean canInsertItemAt(int idx) {
		return false; //to be completed
	}

	/**
	 * DO NOT MODIFY - given as an example of traversal
	 * @return number of items in the list
	 */
	public int size() {
		int count = 0;
		Node current = head;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	/**
	 * 
	 * @return the sum of all items (0 if the list is empty)
	 */
	public int total() {
		return 0; //to be completed
	}

	/**
	 * 
	 * @return the sum of all positive items (0 if the list is empty)
	 */
	public int totalPositives() {
		return 0; //to be completed
	}

	/**
	 * 
	 * @return the number of positive items (0 if the list is empty)
	 */
	public int countPositives() {
		return 0; //to be completed
	}

	/**
	 * @param target: item to count
	 * @return the number of time target exists in the list 
	 * (0 if the list is empty)
	 */
	public int countOccurrences(int target) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @return true if all items are positive, false otherwise
	 * return true if list is empty
	 * 
	 * [1,7,0,9], return false
	 */
	public boolean allPositives() {
		return false; //to be completed
	}

	/**
	 * 
	 * @return true if all items are even numbers, false otherwise
	 * return true if list is empty
	 * 
	 */
	public boolean allEven() {
		return false; //to be completed
	}

	/**
	 * 
	 * @param low
	 * @param high
	 * @return true if all items are in the range [low...high]
	 * false otherwise.
	 * 
	 * return true if list is empty
	 */
	public boolean allInRange(int low, int high) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param low
	 * @param high
	 * @return true if ANY item is in the range [low...high]
	 * false otherwise.
	 * 
	 * return false if list is empty
	 */
	public boolean containsInRange(int low, int high) {
		return false; //to be completed
	}

	/**
	 * 
	 * @return true if there is ANY prime number in the list 
	 * false otherwise.
	 * 
	 * The method isPrime is provided in class
	 * MathService and can be called as:
	 * MathService.isPrime(number to check)
	 * 
	 * return false if list is empty
	 */
	public boolean containsPrime() {
		return false; //to be completed
	}

	/**
	 * 
	 * @return the highest item in the list
	 * return null if empty
	 * list represents [10, 70, 20, 90], return 90
	 * head = null, return null
	 * list represents [0, 0, 0, 0, return 0
	 */
	public Integer highest() {
		return null; //to be completed
	}

	/**
	 * 
	 * @return true if list is in ascending order, false otherwise
	 * return true if list is empty or contains a single value
	 */
	public boolean isAscending() {
		return false; //to be completed
	}

	/**
	 * O(n) :(
	 * that's why no one uses linked lists!
	 * @param idx
	 * @return item at given index if index is valid, null otherwise
	 */
	public Integer get(int idx) {
		return null; //to be completed
	}

	/**
	 * D level
	 * add the given item (val) at the given index (idx) if possible
	 * @param idx
	 * @param val
	 * @return true if val added, false otherwise
	 */
	public boolean add(int idx, int val) {
		return false; //to be completed
	}

	/**
	 * D level
	 * Best case (idx = 0): O(1)
	 * Worst case (idx = size()-1): O(n)
	 * remove and return item at given idx if any
	 * @param idx
	 * @return item remove, null if idx invalid
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
	 * calling object holds [10, 70, 20, 90]
	 * parameter object (other) holds [10, 70, 20, 90]
	 * return true
	 *
	 * if 
	 * calling object holds [10, 70, 20, 90]
	 * parameter object (other) holds [90, 10, 20, 70]
	 * return false
	 *
	 * if 
	 * calling object holds [10, 60, 20, 90]
	 * parameter object (other) holds [90, 10, 20, 70]
	 * return false
	 * 
	 * if 
	 * calling object holds [10, 20, 90]
	 * parameter object (other) holds [90, 10, 20, 70]
	 * return false
	 * if 
	 * calling object holds [10, 20, 90]
	 * parameter object (other) holds [10, 20]
	 * return false
	 */
	public boolean identical(MyLinkedList other) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param other
	 * @return MyLinkedList object containing all
	 * items of calling object followed by all items
	 * of parameter object
	 * FOR EXAMPLE:
	 * if 
	 * calling object holds [10, 70, 20]
	 * parameter object (other) holds [50, 90]
	 * 
	 * then for the returned object,
	 * list represents [10, 70, 20, 50, 90]
	 */
	public MyLinkedList join(MyLinkedList other) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param idx1
	 * @param idx2
	 * @return MyLinkedList containing items from index
	 * idx1 to index idx2 (inclusive on both sides), if valid.
	 * return null if the range is invalid.
	 * FOR EXAMPLE:
	 * If 
	 * calling object holds [10, 70, 20, 50, 90, 30, 80]
	 * idx1 = 2
	 * idx2 = 5
	 * 
	 * then for the returned object,
	 * calling object holds [20, 50, 90, 30]
	 */
	public MyLinkedList subList(int idx1, int idx2) {
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
	 * calling object holds [10, 70, 20, 90]
	 * parameter object (other) holds [90, 10, 20, 70]
	 * return true
	 *
	 * if 
	 * calling object holds [10, 60, 20, 90]
	 * parameter object (other) holds [90, 10, 20, 70]
	 * return false
	 * 
	 * if 
	 * calling object holds [10, 20, 90]
	 * parameter object (other) holds [90, 10, 20, 70]
	 * return false
	 * if 
	 * calling object holds [10, 20, 90]
	 * parameter object (other) holds [10, 20]
	 * return false
	 */
	public boolean same(MyLinkedList other) {
		return false; //to be completed
	}

	/**
	 * sort in ascending order if asc = true,
	 * otherwise sort in descending order
	 * @param asc
	 */
	public void sort(boolean asc) {
		//to be completed
	}
}
