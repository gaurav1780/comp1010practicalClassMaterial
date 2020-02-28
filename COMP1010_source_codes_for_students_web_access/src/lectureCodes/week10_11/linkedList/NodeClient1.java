package lectureCodes.week10_11.linkedList;

public class NodeClient1 {

	public static void main(String[] args) {
		Node a = new Node("Messi", null);
		Node b = new Node("Sane", a);
		Node c = new Node("Hazard", b);
		Node d = new Node("Moura", c);
		System.out.println(d.data);
		
		//d.next refers to the same instance as c
		System.out.println(d.next.data); 

		//d.next.next refers to the same instance 
		//as c.next which refers to the same instance as b
		System.out.println(d.next.next.data); 

		//d.next.next.next refers to the same instance 
		//as c.next.next which refers to the same instance 
		//as b.next which refers to the same instance as a
		System.out.println(d.next.next.next.data);
	}

}
