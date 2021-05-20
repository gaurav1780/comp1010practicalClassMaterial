# Department of Computing, Macquarie University

## Workshop - Recursive data structures


## Question 1
Draw a memory diagram for the objects (`t1`, `t2`, `app`) in the following code.

```java
class Time {
	public int day, month, year;
	public int hour, minute;
	public Time(int d, int m1, int y, int h, int m2) {
		day = d;
		month = m1;
		year = y;
		hour = h;
		minute = m2;
	}
}

class Appointment {
	public Time start, end;
	public Appointment(Time s, Time e) {
		start = s;
		end = e;
	}
}

public class Client {
	public static void main(String[] args) {
		Time t1 = new Time(18, 10, 2019, 14, 0);
		Time t2 = new Time(18, 10, 2019, 14, 30);
		Appointment app = new Appointment(t1, t2);
	}
}
```

## Question 2
Draw a memory diagram for the objects (`t1`, `t2`, `app`) in the following code.

```java
class Time {
	public int day, month, year;
	public int hour, minute;
	public Time(int d, int m1, int y, int h, int m2) {
		day = d;
		month = m1;
		year = y;
		hour = h;
		minute = m2;
	}
	
	public Time(Time source) { //this is called a "copy constructor"
		day = source.day;
		month = source.month;
		year = source.year;
		hour = source.hour;
		minute = source.minute;
	}
}

class Appointment {
	public Time start, end;
	public Appointment(Time s, Time e) {
		start = new Time(s); //make a copy of s into start
		end = new Time(e); //make a copy of e into end
	}
}

public class Client {
	public static void main(String[] args) {
		Time t1 = new Time(18, 10, 2019, 14, 0);
		Time t2 = new Time(18, 10, 2019, 14, 30);
		Appointment app = new Appointment(t1, t2);
	}
}
```

## Question 3
Draw a memory diagram for the objects (`a` through `f`) in the following code.

```java
class Node {
	public int data;
	public Node next;
	
	public Node(int d, Node n) {
		data = d;
		next = n;
	}
}

public class Client {
	public static void main(String[] args) {
		Node a = new Node(60, null);
		Node b = new Node(10, null);
		Node c = new Node(-50, a);
		Node e = new Node(0, b);
		Node d = new Node(-20, e);
		Node f = new Node(-90, c);
		b.next = d;		
	}
}
```

## Question 4

Update the diagram if the following statement is added at the end.

```java
d.next.next.next.next.data = -80;
```

## Question 5

For the `Node` class defined in Question 3, what is the value of `result` when the following code is executed?

```java
public class Client {
	public static void main(String[] args) {
		Node a = new Node(60, null);
		Node g = new Node(10, a);
		Node d = new Node(-50, g);
		Node b = new Node(0, d);
		Node c = new Node(-20, b);
		Node e = new Node(-90, c);

		int result = 0;
		while(e != null) {
			result = result + e.data;
		}
	}
}
```
	

## Question 6

For the `Node` class defined in Question 3, what is the value of `result` when the following code is executed?

```java
public class Client {
	public static void main(String[] args) {
		Node a = new Node(60, null);
		Node g = new Node(10, a);
		Node d = new Node(-50, g);
		Node b = new Node(0, d);
		Node c = new Node(-20, b);
		Node e = new Node(-90, c);

		int result = 0;
		while(e != null) {
			result = result + e.data;
			e = e.next;
		}
	}
}
```	


## Question 7

For the `Node` class defined in Question 3, what are the values of `result1` and `result2` when the following code is executed?

```java
public class Client {
	public static void main(String[] args) {
		Node a = new Node(60, null);
		Node g = new Node(60, a);
		Node d = new Node(60, g);
		Node b = new Node(60, d);
		Node c = new Node(60, b);
		Node e = new Node(60, c);

		int result1 = 0;
		while(e != null) {
			result1 = result1 + e.data;
			e = e.next;
		}
		
		int result2 = 0;
		while(e != null) {
			result2 = result2 + e.data;
			e = e.next;
		}
	}
}
```

## Question 8

For the `Node` class defined in Question 3, what are the values of `result1` and `result2` when the following code is executed?

```java
public class Client {
	public static void main(String[] args) {
		Node a = new Node(60, null);
		Node g = new Node(10, a);
		Node d = new Node(-50, g);
		Node b = new Node(0, d);
		Node c = new Node(-20, b);
		Node e = new Node(-90, c);

		int result1 = 0;
		Node temp = e;
		while(temp != null) {
			result1 = result1 + temp.data;
			temp = temp.next;
		}
		
		int result2 = 0;
		temp = e;
		while(temp != null) {
			result2 = result2 + temp.data;
			temp = temp.next;
		}
	}
}
```

## Question 9

For the `Node` class defined in Question 3, will the following code compile? 

- If yes, what is the value of `result`? 
- If no, why?

```java
public class Client {
	public static void main(String[] args) {
		Node a = new Node(60, null);
		Node g = new Node(10, a);
		Node d = new Node(-50, g);
		Node b = new Node(0, d);
		Node c = new Node(-20, b);
		Node e = new Node(-90, c);

		int result1 = 0;
		Node temp = e;
		while(temp != null) {
			result1 = result1 + temp.data;
			temp = temp.next;
		}
		
		int result2 = 0;
		temp = e;
		while(temp != null) {
			result2 = result2 + temp;
			temp = temp.next;
		}
	}
}
```

## Question 10

Consider the following method that adds up all the positive values in the nodes starting at `start`. There is a bug. Identify and fix it.

```java
public static int sumPositives(Node start) {
	//NOTE: it's ok to modify start since it's a reference copy of the actual parameter
	int total = 0;
	while(start != null) { 
		if(start > 0) {
			total+=start.data;
		}
		start = start.next;
	}
	return total;
}
```

## Question 11

Consider the following method that returns `true` if all the values in nodes starting at `start` are positive, `false` otherwise. There is a bug. Identify and fix it.

```java
public static boolean allPositives(Node start) {
	//NOTE: it's ok to modify start since it's a reference copy of the actual parameter
	while(start != null) { 
		if(start.data <= 0) { //at least one value is not positive
			return false;
			start = start.next;
		}
	}
	return true;
}
```

## Question 12

Consider the following method that returns `true` if the sequence of values in nodes starting at `head1` and `head2` is exactly the same, `false` otherwise. There is a bug. Identify and fix it.

```java
public static boolean identical(Node head1, Node head2) {
	while(head1 != null && head2 != null) { 
		if(head1.data != head2.data) {
			return false;
		}
		//move both references one node forward
		head1 = head1.next;
		head2 = head2.next;	
	}
	return true;
}
```

## Question 13 (Weekly submission)

- You will be working on `NodeService` class from the practice package located at `practicePackage.customBuiltLists.customBuiltLinkedList.attempts.NodeService`. 
- The function `sum` is already completed as an example of traversal. The test for that already passes and is not considered towards the total.
- Updated `testJoin`, `testSame` provided below.
- Each function is worth 10 (out of 100).
- Passing mark: 50. So, you need to pass at least 5 out of 10 tests that fail in the template.
- Submit file `NodeService.java` under Week 11 submission on iLearn by Sunday 23rd May, 21:00:00.
- Late submissions not accepted (unless you have received special considerations approval).

As usual, any of the following will disqualify your submission

- late submission
- compilation error
- infinite loop
- timeout (program must terminate within 5 seconds)
- use of function from outside `NodeService` class

IMPORTANT: Please fix `testJoin` and `testSame` as follows:

```java
	@Test
	void testJoin() {
		assertNotEquals(a, NodeService.join(null, a));
		assertNotEquals(c, NodeService.join(c, null));
		
		Node x = NodeService.join(a, c1);
		assertEquals("[-12, 0, 36, 49, 25, 17, 36, 49, 25, 17]", NodeService.toString(x));
		
		x = NodeService.join(a.next, c1.next);
		assertEquals("[0, 36, 49, 25, 17, 49, 25, 17]", NodeService.toString(x));
		
		while(x!=null) {
			x = x.next;
			assertEquals("[-12, 0, 36, 49, 25, 17]", NodeService.toString(a));
			assertEquals("[36, 49, 25, 17]", NodeService.toString(c1));
		}
		
		//do it a second time to ensure a and c1 were unchanged
		x = NodeService.join(a, c1);
		assertEquals("[-12, 0, 36, 49, 25, 17, 36, 49, 25, 17]", NodeService.toString(x));
		
		ensureNoModify();
	}
	
	@Test
	void testSame() {
		assertTrue(NodeService.same(a, a1));

		Node f2 = new Node(17, null);
		Node e2 = new Node(25, f2);
		Node d2 = new Node(49, e2);
		Node c2 = new Node(-36, d2);
		Node b2 = new Node(0, c2);
		Node a2 = new Node(-12, b2);
		//a -> -12 -> 0 -> 36 -> 49 -> 25 -> 17 -> null;		
		//a2 -> -12 -> 0 -> -36 -> 49 -> 25 -> 17 -> null;		

		assertFalse(NodeService.same(a, a2));

		c2.data = 36;
		e2.next = null;
		//a  -> -12 -> 0 -> 36 -> 49 -> 25 -> 17 -> null;		
		//a2 -> -12 -> 0 -> 36 -> 49 -> 25 -> null;

		assertFalse(NodeService.same(a, a2));

		e2.next = f2;
		f2.next = new Node(20, null);
		//a -> -12 -> 0 -> 36 -> 49 -> 25 -> 17 -> null;		
		//a2 -> -12 -> 0 -> 36 -> 49 -> 25 -> 17 -> 20 -> null;

		assertFalse(NodeService.same(a, a2));

		f2.next = null;

		System.out.println(NodeService.toString(a));
		System.out.println(NodeService.toString(a2));
		assertTrue(NodeService.same(a, a2));

		//a  -> -12 -> 0 -> 36 -> 49 -> 25 -> 17 -> null;		
		//a2 -> -12 -> 0 -> 36 -> 49 -> 25 -> 17 -> null;

		Node tempA1 = new Node(10);
		Node tempA2 = new Node(70, tempA1);
		Node tempA3 = new Node(20, tempA2);
		Node tempA4 = new Node(90, tempA3);
		//tempA4 -> 90 -> 20 -> 70 -> 10

		Node tempB1 = new Node(90);
		Node tempB2 = new Node(20, tempB1);
		Node tempB3 = new Node(10, tempB2);
		Node tempB4 = new Node(70, tempB3);
		//tempB4 -> 70 -> 10 -> 20 -> 90
		
		assertTrue(NodeService.same(tempA4, tempB4));

		ensureNoModify();
	}
```
