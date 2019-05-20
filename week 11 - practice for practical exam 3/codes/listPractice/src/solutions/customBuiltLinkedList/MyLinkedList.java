package solutions.customBuiltLinkedList;

public class MyLinkedList {
	private Node head;

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
	 * 
	 * @return the value in the first Node, if any.
	 * return null if head is null
	 */
	public Integer getFirst() {
		if(isEmpty())
			return null;
		return head.getData();
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
		temp.setNext(head);
		head = temp;
	}

	//DO NOT MODIFY
	public String toString() {
		if(isEmpty())
			return "Empty";
		String result = "[";
		Node current = head;
		while(current != null) {
			result = result + current.getData() + ", ";
			current = current.getNext();
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
	 * if head -> 10 -> 70 -> 20 -> 90 -> null,
	 * items exist at indices 0, 1, 2, 3 
	 * but not at indices [... -2, -1] or [4, 5, ..]
	 */
	public boolean itemExistsAt(int idx) {
		if (idx >= 0 && idx < size()) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param idx
	 * @return true if an item can be added at the passed idx
	 * 
	 * FOR EXAMPLE,
	 * if head -> 10 -> 70 -> 20 -> 90 -> null,
	 * items can be added at indices 
	 * 0 (before the first item), 1, 2, 3, 4 (after the last item) 
	 * but not at indices [... -2, -1] or [5, 6, ..]
	 */
	public boolean canInsertItemAt(int idx) {
		if (idx >= 0 && idx <= size()) {
			return true;
		}
		return false;
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
			current = current.getNext();
		}
		return count;
	}

	/**
	 * 
	 * @return the sum of all items (0 if the list is empty)
	 */
	public int total() {
		int total = 0;
		Node current = head;
		while (current != null) {
			total = total + current.getData();
			current = current.getNext();
		}
		return total;
	}

	/**
	 * 
	 * @return the sum of all positive items (0 if the list is empty)
	 */
	public int totalPositives() {
		int total = 0;
		Node current = head;
		while (current != null) {
			if (current.getData() > 0) {
				total = total + current.getData();
			}
			current = current.getNext();
		}
		return total;
	}

	/**
	 * 
	 * @return the number of positive items (0 if the list is empty)
	 */
	public int countPositives() {
		int total = 0;
		Node current = head;
		while (current != null) {
			if (current.getData() > 0) {
				total++;
			}
			current = current.getNext();
		}
		return total;
	}

	/**
	 * 
	 * @return true if all items are positive, false otherwise
	 * return true if list is empty
	 * 
	 * [1,7,0,9] --> false
	 */
	public boolean allPositives() {
		Node current = head;
		while (current != null) {
			if (current.getData() <= 0) {
				return false;
			}
			current = current.getNext();
		}
		return true;
	}

	/**
	 * 
	 * @return true if all items are even numbers, false otherwise
	 * return true if list is empty
	 * 
	 */
	public boolean allEven() {
		Node current = head;
		while (current != null) {
			if (current.getData() % 2 != 0) {
				return false;
			}
			current = current.getNext();
		}
		return true;
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
		Node current = head;
		while (current != null) {
			if (current.getData() < low || current.getData() > high) {
				return false;
			}
			current = current.getNext();
		}
		return true;
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
		Node current = head;
		while (current != null) {
			if (current.getData() >= low && current.getData() <= high) {
				return true;
			}
			current = current.getNext();
		}
		return false;
	}

	/**
	 * 
	 * @return true if there is ANY prime number in the list 
	 * false otherwise.
	 * 
	 * The method isPrime is provided in class
	 * MathService and can be called as:
	 * MathService.isPrime(<number to check>)
	 * 
	 * return false if list is empty
	 */
	public boolean containsPrime() {
		Node current = head;
		while (current != null) {
			if (MathService.isPrime(current.getData())) {
				return true;
			}
			current = current.getNext();
		}
		return false;
	}

	/**
	 * 
	 * @return the highest item in the list
	 * return ??? if empty
	 * head -> 10 -> 70 -> 20 -> 90 -> null --> 90
	 * head = null --> null
	 * head -> 0 -> 0 -> 0 -> 0 --> 0
	 */
	public Integer highest() {
		if (isEmpty()) {
			return null;
		}
		Node current = head;
		Integer highest = current.getData();
		while (current != null) {
			highest = Math.max(current.getData(), highest);
			current = current.getNext();
		}
		return highest;
	}

	/**
	 * 
	 * @return true if list is in ascending order, false otherwise
	 * return true if list is empty or contains a single value
	 */
	public boolean isAscending() {
		Node current = head;
		while (current != null) {
			if (current.getNext() != null && current.getData() > current.getNext().getData()) {
				return false;
			}
			current = current.getNext();
		}
		return true;
	} 
	

	/**
	 * O(n) :(
	 * that's why no one uses linked lists!
	 * @param idx
	 * @return item at given index if index is valid, null otherwise
	 */
	public Integer get(int idx) {
		if (itemExistsAt(idx) == false) {
			return null;
		}
		
		Node current = head;
		for (int i = 1; i <= idx; i++) {
			current = current.getNext();
		}
		return current.getData();
	}

	/**
	 * D level
	 * add the given item (val) at the given index (idx) if possible
	 * @param idx
	 * @param val
	 * @return true if val added, false otherwise
	 */
	public boolean add(int idx, int val) {
		if (canInsertItemAt(idx) == false) {
			return false;
		}
		if (idx == 0) {
			addAtFront(val);
			return true;
		}
		else {
			Node current = head;
			for (int i = 1; i < idx; i++) {
				current = current.getNext();
			}
			Node temp = new Node (val, current.getNext());
			current.setNext(temp);
			return true;
		}
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
		if (itemExistsAt(idx) == false) {
			return null;
		}
		if (idx == 0) {
			Integer result = head.getData();
			head = head.getNext();
			return result;
		}
		Node current = head;
		for (int i = 1; i < idx; i++) {
			current = current.getNext();
		}
		Integer removed = current.getNext().getData();
		current.setNext(current.getNext().getNext());
		return removed; 
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
	 * this.head -> 10 -> 70 -> 20 -> 90 -> null
	 * other.head -> 10 -> 70 -> 20 -> 90 -> null
	 * return true
	 *
	 * if 
	 * this.head -> 10 -> 70 -> 20 -> 90 -> null
	 * other.head -> 90 -> 10 -> 20 -> 70 -> null
	 * return false
	 *
	 * if 
	 * this.head -> 10 -> 60 -> 20 -> 90 -> null
	 * other.head -> 90 -> 10 -> 20 -> 70 -> null
	 * return false
	 * 
	 * if 
	 * this.head -> 10 -> 20 -> 90 -> null
	 * other.head -> 90 -> 10 -> 20 -> 70 -> null
	 * return false
	 * if 
	 * this.head -> 10 -> 20 -> 90 -> null
	 * other.head -> 10 -> 20 -> null
	 * return false
	 */
	public boolean identical(MyLinkedList other) {
		Node a = this.head, b = other.head; 
        while (a != null && b != null) {
            if (a.getData() != b.getData()) {
            	return false; 
            }
            a = a.getNext(); 
            b = b.getNext();  
        }
        return (a == null && b == null);  

	}

	/**
	 * 
	 * @param other
	 * @return MyLinkedList object containing all
	 * items of calling object followed by all items
	 * of parameter object
	 * FOR EXAMPLE:
	 * if 
	 * this.head -> 10 -> 70 -> 20 -> null
	 * other.head -> 50 -> 90 -> null
	 * 
	 * then for the returned object,
	 * head -> 10 -> 70 -> 20 -> 50 -> 90 -> null
	 */
	public MyLinkedList join(MyLinkedList other) {
		MyLinkedList result = new MyLinkedList();
		Node a = this.head, b = other.head;
		while (a != null) {
			result.add(result.size(), a.getData());
			a = a.getNext();
		}
		while (b != null) {
			result.add(result.size(), b.getData());
			b = b.getNext();
		}
		return result;
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
	 * this.head -> 10 -> 70 -> 20 -> 50 -> 90 -> 30 -> 80 -> null
	 * idx1 = 2
	 * idx2 = 5
	 * 
	 * then for the returned object,
	 * this.head -> 20 -> 50 -> 90 -> 30 -> null
	 */
	public MyLinkedList subList(int idx1, int idx2) {
		if (itemExistsAt(idx1) == false || itemExistsAt(idx2) == false) {
			return null; 
		}
		MyLinkedList sublist = new MyLinkedList();
		Node current = head;
		for (int i = 1; i <= idx1; i++) {
			current = current.getNext();
		}
		for (int i = idx1; i <= idx2; i++) {
			sublist.add(sublist.size(), current.getData());
			current = current.getNext();
		}
		return sublist;
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
	 * this.head -> 10 -> 70 -> 20 -> 90 -> null
	 * other.head -> 90 -> 10 -> 20 -> 70 -> null
	 * return true
	 *
	 * if 
	 * this.head -> 10 -> 60 -> 20 -> 90 -> null
	 * other.head -> 90 -> 10 -> 20 -> 70 -> null
	 * return false
	 * 
	 * if 
	 * this.head -> 10 -> 20 -> 90 -> null
	 * other.head -> 90 -> 10 -> 20 -> 70 -> null
	 * return false
	 * if 
	 * this.head -> 10 -> 20 -> 90 -> null
	 * other.head -> 10 -> 20 -> null
	 * return false
	 */
	public boolean same(MyLinkedList other) {
		if (this.size() != other.size()) {
			return false;
		}
		Node a = this.head; 
		Node b = other.head;
		boolean flag = false;
		while (a != null) {
        		flag = false;
        		b = other.head; 
        		while (b != null) {
        			if (a.getData() == b.getData()) {
        				flag = true;
                			break; 
                		}
        			b = b.getNext();
        		}
        		if (flag == false) {
        			return false;
        		}
            		a = a.getNext();    
        	}
        	return true; 
	}

	/**
	 * sort in ascending order if asc = true,
	 * otherwise sort in descending order
	 * @param asc
	 */
	public void sort(boolean asc) {
		if (this.size() > 1 && asc) {
			while (isAscending() == false) {
		        	Node current = head;
		        	while (current != null && current.getNext() != null) {
		        		if (current.getData() > current.getNext().getData()) {
		        			int temp = current.getData();
		        			current.setData(current.getNext().getData());
		        			current.getNext().setData(temp);
		        		}
		        		current = current.getNext();
		        	}
			}
		}
		else if (this.size() > 1 && asc == false) {
			while (isDescending() == false) {
		        	Node current = head;
		        	while (current != null && current.getNext() != null) {
		        		if (current.getData() < current.getNext().getData()) {
		        			int temp = current.getData();
		        			current.setData(current.getNext().getData());
		        			current.getNext().setData(temp);
		        		}
		        		current = current.getNext();
		        	}
			}
		}   
	}
	
	//Helper method for sort() method:
	
	public boolean isDescending() {
		Node current = head;
		while (current != null) {
			if (current.getNext() != null && current.getData() < current.getNext().getData()) {
				return false;
			}
			current = current.getNext();
		}
		return true;
	} 

}
