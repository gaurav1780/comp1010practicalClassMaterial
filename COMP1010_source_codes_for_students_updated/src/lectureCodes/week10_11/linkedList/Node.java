package lectureCodes.week10_11.linkedList;

public class Node {
	public String data;
	public Node next;
	
	public Node() {
		data = null;
		next = null;
	}
	
	public Node(String d) {
		data = d;
		next = null;
	}
	
	public Node(String d, Node n) {
		data = d;
		next = n;
	}	
	
	public String toString() {
		if(next == null)
			return data;
		else 
			return data + " -> " + next.toString();
	}
}
