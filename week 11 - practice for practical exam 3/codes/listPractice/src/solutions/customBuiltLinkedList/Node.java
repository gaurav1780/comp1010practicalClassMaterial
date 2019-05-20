package solutions.customBuiltLinkedList;
public class Node {
	private int data;
	private Node next;

	public int getData() {
		return data;
	}

	public Node getNext() {
		return next;
	}

	public void setData(int d) {
		data = d;
	}

	public void setNext(Node n) {
		next = n;
	}

	public Node(int d, Node n) {
		data = d;
		next = n;
	}

	public Node(int d) {
		data = d;
		next = null;
	}

	public Node() {
		data = 0;
		next = null;
	}
}