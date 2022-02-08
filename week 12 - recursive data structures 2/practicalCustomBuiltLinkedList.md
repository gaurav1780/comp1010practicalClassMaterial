# School of Computing, Macquarie University

## Workshop - Custom-built linked list

### Outline:

- In-class exercises (Questions 1 to 4): beginning of class to 45 minutes
- Working on Practice package: 46 minutes to end of class.

## In-class exercises

Consider the following class definition of `Node` and `CustomLinkedList` classes:

```java
public class Node {
	public int data;
	public Node next;
	
	public Node(int d, Node n) {
		data = d;
		next = n;
	}
	
	public String toString() {
		if(next == null) {
			return data+"";
		}
		else {
			return data+" "+next.toString();
		}
	}
}
```

```java
public class CustomLinkedList {
	public Node head;
	
	public void addToFront(int val) {
		head = new Node(val, head);
	}
	
	public String toString() {
		if(head == null) {
			return "";
		}
		return head.toString();
	}
}
```

### Question 1

Draw a memory diagram for objects created in the following client:

```java
public class Client {
	public static void main(String[] args) {
		CustomLinkedList list = new CustomLinkedList();
		list.addToFront(90);
		list.addToFront(10);
		list.addToFront(40);
		list.addToFront(60);
	}
}
```

### Question 2

For the same client, what's the value displayed if the following is added as the last statement in the client?

```java
System.out.println(list.head.next.data);
```

### Question 3

For the same client, draw the updated memory diagram if the following statements are added at the end of the client:

```java
Node temp = list.head.next.next;
list.head.next.next = new Node(30, temp);
```

### Question 4

Add an instance method in class `CustomLinkedList` that returns the sum of all items starting at `head` in the calling object. The list should not be modified. That is, you can call it over and over on a given list, and every time, it will give the same result (until the list is updated in the client). Remember that the method has access to the instance variable `head` and can use it.

```java
public class CustomLinkedList {
	public Node head;
	
	public void addToFront(int val) {
		head = new Node(val, head);
	}
	
	public String toString() {
		return head.data+"";
	}
	
	public int sum() {
		return 0; //to be completed
	}
}
```

### Question 5

Add an instance method in class `CustomLinkedList` that returns a reference to the first Node that holds an odd number, `null` if no such node exists. The list should not be modified.

```java
public class CustomLinkedList {
	public Node head;
	
	public void addToFront(int val) {
		head = new Node(val, head);
	}
	
	public String toString() {
		return head.data+"";
	}
	
	public Node firstOdd() {
		return null; //to be completed
	}
}
```

### Question 6

You can work collaboratively on `MyLinkedList` under practice packages, or you can discuss other content you feel is useful.

## Weekly submission

![](goodnews.jpeg)

There is no weekly submission in weeks 12 or 13.

<!--
In order to reduce the workload on students during the last two weeks, we have decided to ask for the first few methods of assignment 4 to be submitted as Week 12 submission.
You are required to complete the following methods and submit the three files into `Week 12 submission`:

- `Deck.java`:
	- `add(char ch, int score)`
	- `size()`

- `Hand.java`:
	- `add(Letter letter))`
	- `size()`

- `Word.java`:
	- `addToStart(Letter letter)`
	- `addToEnd(Letter letter)`
	- `size()`

- Each method is worth 15 marks. 
- Total is capped at 100.
- At least 3 out of 7 methods should pass the tests to clear week 12 hurdle. 

Usual penalties of using functions defined outside project, compilation errors, infinite loops or timeouts, StackOverflowError, wrong submission, change of package declaration, etc. apply.-->
