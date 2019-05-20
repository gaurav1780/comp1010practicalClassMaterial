package solutions.customBuiltLinkedList;

public class NodeService {
	/**
	 * DO NOT MODIFY - provided as a sample for traversal
	 * @param start
	 * @return sum of all items starting at Node start
	 * 
	 * FOR EXAMPLE,
	 * 
	 * if start.data = 20
	 * and start.next refers to another Node (say b) such that
	 * b.data = 50
	 * and b.next refers to another Node (say c) such that
	 * c.data = 10
	 * and c.next is null
	 * 
	 * we represent this as:
	 * 
	 * start -> 20 -> 50 -> 10 -> null
	 * 
	 * in this case, the method should return 80
	 */
	public static int sum(Node start) {
		int result = 0;
		Node current = start;
		while(current != null) {
			result = result + current.getData();
			current = current.getNext();
		}
		return result;
	}
	
	//DO NOT MODIFY
	public static String toString(Node start) {
		String result = "[";
		Node temp = start;
		while(temp != null) {
			result = result + temp.getData() + ", ";
			temp = temp.getNext();
		}
		if(result.length() > 1) {
			result = result.substring(0, result.length()-2);
		}
		return result + "]";
	}

	/**
	 * 
	 * @param start
	 * @return sum of all odd numbers
	 */
	public static int sumOdd(Node start) {
		int result = 0;
		Node current = start;
		while (current != null) {
			if (current.getData()%2 != 0) {
				result = result + current.getData();
			}
			current = current.getNext();	
		}
		return result;
	}

	/**
	 * 
	 * @param start
	 * @return number of non-null Nodes starting at Node start.
	 * For example if 
	 * start -> 10 -> 70 -> 20 -> 90 -> null
	 * return 4
	 */
	public static int count(Node start) {
		int result = 0;
		Node current = start;
		while(current != null) {
			result++;
			current = current.getNext();
		}
		return result;
	}

	/**
	 * 
	 * @param start
	 * @return number of positive numbers
	 */
	public static int countPositives(Node start) {
		int result = 0;
		Node current = start;
		while(current != null) {
			if (current.getData() > 0) {
				result++;
			}
			current = current.getNext();
		}
		return result;
	}

	/**
	 * 
	 * @param start
	 * @return number of prime numbers
	 * 
	 * The method isSquare is provided in class
	 * MathService and can be called as:
	 * MathService.isSquare(<number to check>)
	 */
	public static int countPrimes(Node start) {
		int result = 0;
		Node current = start;
		while (current != null) {
			if (MathService.isPrime(current.getData())){
				result++;
			}
			current = current.getNext();
		}
		return result;
	}

	/**
	 * 
	 * @param start
	 * @return the first Node starting at Node start
	 * containing a positive data value
	 * return null if no Node containing a positive data value
	 * 
	 * for example, if
	 * start -> -5 -> 0 -> 6 -> 2 -> -8 -> 0 -> null
	 * 
	 * and the Node returned is result, then
	 * result -> 6 -> 2 -> -8 -> null
	 */
	public static Node getFirstPositiveNode(Node start) {
		Node current = start;
		while(current != null) {
			if (current.getData() > 0) {
				return current;
			}
			current = current.getNext();
		}
		return null;
	}

	/**
	 * 
	 * @param other
	 * @return true if sequence of items starting
	 * at Nodes start1 and start2
	 * have the same items in the same order
	 * 
	 * FOR EXAMPLE,
	 * 
	 * if 
	 * start1 -> 10 -> 70 -> 20 -> 90 -> null
	 * start2 -> 10 -> 70 -> 20 -> 90 -> null
	 * return true
	 *
	 * if 
	 * start1 -> 10 -> 70 -> 20 -> 90 -> null
	 * start2 -> 90 -> 10 -> 20 -> 70 -> null
	 * return false
	 *
	 * if 
	 * start1 -> 10 -> 60 -> 20 -> 90 -> null
	 * start2 -> 90 -> 10 -> 20 -> 70 -> null
	 * return false
	 * 
	 * if 
	 * start1 -> 10 -> 20 -> 90 -> null
	 * start2 -> 90 -> 10 -> 20 -> 70 -> null
	 * return false
	 * if 
	 * start1 -> 10 -> 20 -> 90 -> null
	 * start2 -> 10 -> 20 -> null
	 * return false
	 */
	public static boolean identical(Node start1, Node start2) {
		if (count(start1) != count(start2)) {
			return false;
		}
		Node current1 = start1;
		Node current2 = start2;
		while (current1 != null && current2 != null) {
			if (current1.getData() != current2.getData()) {
				return false;
			}
			current1 = current1.getNext();
			current2 = current2.getNext();
		}
		return true;
	}

	/**
	 * 
	 * @param other
	 * @return Node object starting a sequence of
	 * items from start1 followed by all items
	 * of start2
	 * FOR EXAMPLE:
	 * if 
	 * start1 -> 10 -> 70 -> 20 -> null
	 * start2 -> 50 -> 90 -> null
	 * 
	 * then if the returned object is result, 
	 * result -> 10 -> 70 -> 20 -> 50 -> 90 -> null
	 */
	public static Node join(Node start1, Node start2) {
		if (start1 == null) {
			return start2;
		}
		if (start2 == null) {
			return start1;
		}

		Node result = start1;
		Node temp = result;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(start2);
		return result;
	}

	/**
	 * start.data is considered to be item at index 0
	 * start.next.data is considered to be item at index 1
	 * start.next.next.data is considered to be item at index 2
	 * and so on...
	 * 
	 * @param start
	 * @param idx1
	 * @param idx2
	 * @return Node that starts a sequence of items 
	 * from index idx1 to index idx2 
	 * (inclusive on both sides) in items beginning 
	 * at Node start, if valid.
	 * return null if the range is invalid.
	 * FOR EXAMPLE:
	 * If 
	 * start -> 10 -> 70 -> 20 -> 50 -> 90 -> 30 -> 80 -> null
	 * idx1 = 2
	 * idx2 = 5
	 * 
	 * then for the returned object,
	 * start -> 20 -> 50 -> 90 -> 30 -> null
	 */
	public static Node subList(Node start, int idx1, int idx2) {
		if (start == null || idx1 <0 || idx2 >= count(start)) {
			return null;
		}
		Node result = start;
		for (int i = 0; i < idx1; i++) {
			result = result.getNext();
		}
		
		Node temp = result;
		for (int i = idx1; i < idx2; i++) {
			temp = temp.getNext();
		}
		temp.setNext(null);
		return result;
	}

	/**
	 * 
	 * @param other
	 * @return true if items starting at Nodes
	 * start1 and start2 are the same  
	 * (ok to be in different order)
	 * 
	 * FOR EXAMPLE,
	 *
	 * if 
	 * start1 -> 10 -> 70 -> 20 -> 90 -> null
	 * start2 -> 90 -> 10 -> 20 -> 70 -> null
	 * return true
	 *
	 * if 
	 * start1 -> 10 -> 60 -> 20 -> 90 -> null
	 * start2 -> 90 -> 10 -> 20 -> 70 -> null
	 * return false
	 * 
	 * if 
	 * start1 -> 10 -> 20 -> 90 -> null
	 * start2 -> 90 -> 10 -> 20 -> 70 -> null
	 * return false
	 * 
	 * if 
	 * start1 -> 10 -> 20 -> 90 -> null
	 * start2 -> 10 -> 20 -> null
	 * return false
	 */
	public static boolean same(Node start1, Node start2) {
		if (count(start1) != count(start2)) {
			return false;
		}
		Node current = new Node();
		Node temp1 = new Node();
		Node temp2 = new Node();
		for (int i = 0; i < count(start1); i++) {
			current = start1;
			int target = 0;
			for (int k = 0; k <= i; k++) {
				target = current.getData();
				current = current.getNext();
			}
			temp1 = start1;
			int count1 = 0;
			while (temp1!= null) {
				if (temp1.getData() == target) {
					count1 ++;
				}
				temp1 = temp1.getNext();
			}
			temp2 = start2;
			int count2 = 0;
			while (temp2!= null) {
				if (temp2.getData() == target) {
					count2 ++;
				}
				temp2 = temp2.getNext();
			}
			if (count1 != count2) {
				return false;
			}
			
		}
		return true;
	}

	/**
	 * @param start: assume the sequence of nodes starting at Node start are in ascending order
	 * @param value
	 * @return reference to the first Node at which the sorted sequence starts
	 * add a node containing value in the sequence of nodes starting at Node start such that
	 * the sequence of nodes starting at Node start are STILL in ascending order 
	 */
	public static Node addAscending(Node start, int value) {
		if(start == null || value < start.getData()) {
			start = new Node(value, start);
			return start;
		}
		Node last = start, current = start;
		while(current != null && current.getData() < value) {
			last = current;
			current = current.getNext();
		}
		Node temp = new Node(value, current);
		last.setNext(temp);
		return start;
	}

	/**
	 * @param start: assume the sequence of nodes starting at Node start are in descending order
	 * @param value
	 * @return reference to the first Node at which the sorted sequence starts
	 * add a node containing value in the sequence of nodes starting at Node start such that
	 * the sequence of nodes starting at Node start are STILL in descending order 
	 */
	public static Node addDescending(Node start, int value) {
		if(start == null || value > start.getData()) {
			start = new Node(value, start);
			return start;
		}
		Node last = start, current = start;
		while(current != null && current.getData() > value) {
			last = current;
			current = current.getNext();
		}
		Node temp = new Node(value, current);
		last.setNext(temp);
		return start;
	}	

	/**
	 * sort the nodes starting at Node start
	 * in ascending order if asc = true,
	 * otherwise sort in descending order
	 * @param start
	 * @param asc
	 * @return reference to the first Node at which the sorted sequence starts
	 */
	public static Node sort(Node start, boolean asc) {
		Node temp = null;
		if(asc) {
			while(start != null) {
				temp = addAscending(temp, start.getData());
				start = start.getNext();
			}
		}
		else {
			while(start != null) {
				temp = addDescending(temp, start.getData());
				start = start.getNext();
			}
		}
		return temp;
	}
}
