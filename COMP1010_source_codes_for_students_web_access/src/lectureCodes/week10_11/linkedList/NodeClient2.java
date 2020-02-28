package lectureCodes.week10_11.linkedList;

public class NodeClient2 {

	public static void main(String[] args) {
		Node head = new Node("Gaurav", new Node("Vanessa", new Node("Bestari", new Node("Akash"))));
		System.out.println(head);
		int idx = 2;

		Node current = head;
		for(int i=0; i<idx; i++) {
			current = current.next; 
		}
		System.out.println("at index "+idx+": "+current.data);

		idx = 3;
		current = head;
		for(int i=0; i<idx; i++) {
			current = current.next; 
		}
		System.out.println("at index "+idx+": "+current.data);

	}

}
