package customBuiltLinkedList;

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

	/**
	 * 
	 * @param start
	 * @return sum of all odd numbers
	 */
	public static int sumOdd(Node start) {
		return 0;
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
		return 0;
	}

	/**
	 * 
	 * @param start
	 * @return number of positive numbers
	 */
	public static int countPositives(Node start) {
		return 0;
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
		return 0;
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
	 * result -> 6 -> 2 -> -7 -> null
	 */
	public static Node getFirstPositiveNode(Node start) {
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
		return false; //to be completed
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
		return null; //to be completed
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
		return null; //to be completed
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
		return false; //to be completed
	}

	/**
	 * sort the nodes starting at Node start
	 * in ascending order if asc = true,
	 * otherwise sort in descending order
	 * @param start
	 * @param asc
	 */
	public static void sort(Node start, boolean asc) {
		//to be completed
	}
}
