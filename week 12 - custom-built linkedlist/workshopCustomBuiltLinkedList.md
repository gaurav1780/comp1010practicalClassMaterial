# Department of Computing, Macquarie University

## Workshop - Custom-built linked list.

### Outline:

- In-class exercises (Questions 1 to 4): beginning of class to 45 minutes
- Working on Practice package: 46 minutes to end of class.

## In-class exercises

Consider the following class definition of `Node` and `CustomLinkedList` classes:

```java
class Node {
	public int data;
	public Node next;
	
	public Node(int d, Node n) {
		data = d;
		next = n;
	}
}
```

```java
class CustomLinkedList {
	Node head;
	
	public void addToFront(int val) {
		head = new Node(val, head);
	}
	
	public String toString() {
		return data+"";
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

Add an instance method in class `CustomLinkedList` that returns the sum of all items starting at `head` in the calling object. Remember that the method has access to the instance variable `head` and can use it.

```java
class CustomLinkedList {
	Node head;
	
	public void addToFront(int val) {
		head = new Node(val, head);
	}
	
	public String toString() {
		return data+"";
	}
	
	public int sum() {
		return 0; //to be completed
	}
}
```

## Weekly submission

Template provided [here](./codes/week12practicePackage.zip). Import into Eclipse. The package contains 19 methods.
You should solve at least 10 correctly. Submit file `Week12.java` under Week 12 submission on iLearn.

Remember, some of these will take a very short amount of time and some longer. 

If you are lost, it means you need to go back and study from the [lecture notes](https://software-technology.herokuapp.com/programming/recursive_lists.html).
