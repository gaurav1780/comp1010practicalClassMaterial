package lectureCodes.week10_11.linkedList;

public class MyLinkedList {
	public Node head;
	
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public MyLinkedList() {
		setHead(null);
	}

	public MyLinkedList(String s) {
		Node node = new Node(s);
		setHead(node);
	}

	public boolean isEmpty() {
		if(head == null)
			return true;
		else
			return false;
	}
	
	public void addToFront(String s) {
		Node node = new Node(s);
		if(isEmpty()) {
			head = node;
		}
		else {
			node.next = head;
			head = node;
		}
		
		/* as you can see head = node is common to both if and else.
		 * so the code can be reduced to:
		 * 
		 * 
		 	Node node = new Node(s);
			if(!isEmpty()) {
				node.setNext(head);
			}
			head = node;
			
			
		 * you can now see that node.next remains null if head is null and becomes head otherwise
		 * so node.next IS head irrespectively
		 * 
		 * code reduces to:
		 * 
		 
		 	Node node = new Node(s, head);
			head = node;
		 
		 * 
		 */
	}
	
	public int size() {
		Node current = head;
		int count = 0;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	/**
	 * 
	 * @param index
	 * @return the data value at the given index.
	 * return null if index is invalid
	 */
	public String get(int index) {
		if(index < 0 || index >= size()) 
			return null;
		//index is valid :)
		Node cur = head;
		
		/*
		 * if index = 0, we should move 0 times from head
		 * if index = 1, we should move 1 time from head
		 * if index = 2, we should move 2 times from head
		 * ...
		 * move forward, index number of times, from head
		 */
		for(int i=0; i < index; i++) {
			cur = cur.next;
		}
		
		//cur now holds a reference to the node whose data should be returned
		return cur.data;
	}

	/**
	 * add the string passed as the parameter
	 * to the END of the linked list
	 * @param s
	 */
	public void add(String s) {
		Node node = new Node(s);
		if(isEmpty()) {
			head = node;
		}
		else {
			Node last = head;
			Node current = head;
			while(current!=null) {
				last = current; //backup copy
				current = current.next;
			}
			last.next = node;
		}
	}
	
	public void add(int index, String s) {
		Node node = new Node(s);
		if(index < 0 || index > size())
			return; //out of bounds, do nothing
		else {
			if(index == 0) { //at the beginning of the list
				node.next = head; //node refers to the current head of list
				head = node; //node is the new head of the list
			}
			else { //somewhere in the middle or at the end
				Node last = head;
				Node current = head;
				for(int i=0; i<index; i++) { //index times 
					last = current;
					current = current.next;
				}
				last.next = node;
				node.next = current; 
				//current is null if item is added at the end of the list
			}
		}
		
	}
	
	public void display() {
		Node current = head;
		/*
		 * make a copy of the starting point
		 * otherwise you will modify the starting
		 * point itself, which is BAD!!!
		 */
		while(current!=null) {
			System.out.println(current.data + " ");
			current  = current.next;
		}
	}

	public void remove(int index) {
		if(index < 0 || index >= size())
			return; //out of bounds, do nothing
		else {
			if(index == 0) //remove head
				head = head.next;
			else { //index > 0
				Node last = head;
				Node current = head;
				for(int i=0; i<index; i++) { //index times 
					last = current;
					current = current.next;
				}
				last.next = current.next;
				//last refers to the node AFTER current
				//thereby effectively deleting current				
			}
		}
	}

	public String toString() {
		Node current = head;
		String result = "";
		/*
		 * make a copy of the starting point
		 * otherwise you will modify the starting
		 * point itself, which is BAD!!!
		 */
		while(current!=null) {
			result = result + current.data + " ";
			current  = current.next;
		}
		return result;
	}
}
