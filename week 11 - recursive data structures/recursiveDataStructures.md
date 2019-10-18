# Department of Computing, Macquarie University

## Workshop - Recursive data structures


## Template

Template provided [here](./codes/week11template.zip). Import into Eclipse.

## Question 1
Draw a memory diagram for the objects (`t1`, `t2`, `app`) in the following code.

```java
class Time {
	public day, month, year;
	public hour, minute;
	public Time(int d, int m, int y, int h, int m) {
		day = d;
		month = m;
		year = y;
		hour = h;
		minute = m;
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
	public day, month, year;
	public hour, minute;
	public Time(int d, int m, int y, int h, int m) {
		day = d;
		month = m;
		year = y;
		hour = h;
		minute = m;
	}
	
	public Time(Date source) {
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
		start = new Date(s);
		end = new Date(e);
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
		Node b = new Node(60, null);
		Node c = new Node(60, a);
		Node d = new Node(60, e);
		Node e = new Node(60, b);
		Node f = new Node(60, c);
		b.next = d;		
	}
}
```

## Question 4

Update the diagram if the following statement is added at the end.

```java
d.next.next.next.next.next = -80;
```

## Question 5

For the `Node` class defined in Question 3, what is the value of `result` when the following code is executed?

```java
public class Client {
	public static void main(String[] args) {
		Node a = new Node(60, null);
		Node g = new Node(60, a);
		Node d = new Node(60, g);
		Node b = new Node(60, d);
		Node c = new Node(60, b);
		Node e = new Node(60, c);

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
		Node g = new Node(60, a);
		Node d = new Node(60, g);
		Node b = new Node(60, d);
		Node c = new Node(60, b);
		Node e = new Node(60, c);

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
		Node g = new Node(60, a);
		Node d = new Node(60, g);
		Node b = new Node(60, d);
		Node c = new Node(60, b);
		Node e = new Node(60, c);

		int result1 = 0;
		Node temp = e;
		while(temp != null) {
			result1 = result1 + temp.data;
			temp = temp.next;
		}
		
		int result1 = 0;
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
		Node g = new Node(60, a);
		Node d = new Node(60, g);
		Node b = new Node(60, d);
		Node c = new Node(60, b);
		Node e = new Node(60, c);

		int result1 = 0;
		Node temp = e;
		while(temp != null) {
			result1 = result1 + temp.data;
			temp = temp.next;
		}
		
		int result1 = 0;
		temp = e;
		while(temp != null) {
			result2 = result2 + temp.data;
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
			total+=start;
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
	return false;
}
```

## Question 13 (Weekly submission)

Complete any 5 of the 8 tasks in [week11practicePackage.zip](./codes/week11practicePackage.zip). Submit file `NodeService.java` under [Week 11 submission](https://ilearn.mq.edu.au/mod/assign/view.php?id=5360176) on iLearn by Sunday 27th October, 21:00.
