package practicePackage.customBuiltLists.customLinkedList.attempts;
public class Node {
	public int data;
	public Node next;

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
