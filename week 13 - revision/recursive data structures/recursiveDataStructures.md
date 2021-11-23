This `Node` class will be used for all questions, unless otherwise specified.
```java
public class Node {
   private int data;
   public Node next;

   public Node(int d, Node n) {
      data = d;
      next = n;
   }
}
```

### Question 1
Using the `Node` class as defined above, complete the `returnLast` method in the custom-built linked list class `MyLinkedList`.
```java
public class MyLinkedList {
   private Node head;

   public int size(){
       Node temp =  head;
       int count = 0;

       while(temp != null){
           count++;
           temp = temp.next;
       }
       return count;
   }

   // return the last node containing the value x.
   // return null if the list is empty or if x does not occur in the list.
   public Node returnLast(int x) {
   // to be completed
   }
}
```

### Question 2
Create a constructor for the linked list class `MyLinkedList`. The list should not have any unused nodes.

### Question 3
Given that the linked list is a `stack` (first in, first out), write an `add(int)` method for the class.

### Question 4
Given that the linked list is a `queue` (first in, last out), write an `add(int)` method for the class.

### Question 5
Given the following `add` method in the `MyLinkedList` class, draw a memory diagram of the code given below.

<details><summary>Finish question 3 and 4 before opening</summary>
<p>

```java
public void add(int n) {
  head = new Node(n, head);
}
```
</p>
</details>

```Java
MyLinkedList list = new MyLinkedList(10);
list.add(70);
list.add(20);
Node temp = list.head.next;
list.add(90);
```

### Question 6
Given the following `add` method in the `MyLinkedList` class, draw a memory diagram of the code given below.

<details><summary>Finish question 3 and 4 before opening</summary>
<p>

```java
public void add(int n) {
  if(head == null) {
    head = new Node(n, null);
    return;
  }
  Node temp = head;
  while(temp.next != null) {
    temp = temp.next;
  }
  temp.next = new Node(n, null);
}
```
</p>
</details>

```Java
MyLinkedList list = new MyLinkedList(10);
list.add(70);
list.add(20);
Node temp = list.head.next;
list.add(90);
```
