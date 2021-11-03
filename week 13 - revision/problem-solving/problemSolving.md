### Question 1

What is the output of the following program provided we have imported `java.util.Arrays` and the code sits in the `main` method. 

TIP: Draw the memory diagram.

```java
int[] a = {10, 70, 20, 90};
int[] b = {a[2], a[0], a[1]};
System.out.println(Arrays.toString(b));
```

### Question 2

How many references and instances are in the memory when the `System.out.println("Done")` statement executes in the following client code?

TIP: Draw the memory diagram, count the references and instances.

```java
public class Point {
	public int x, y;
	public Point(int _x, int _y) {
		x = _x;
		y = _y;
	}
}

public class Line {
	public Point start, end;
	public Line(Point p1, Point p2) {
		start = p1;
		end = p2;
	}
}


public class Client {
   public static void main(String[] args) {
      Point point1 = new Point(10, 40); 
      Point point2 = new Point(70, 60);
      Line line1 = new Line(point2, point1);
      Line line2 = new Line(point1, point2);
      System.out.println("Done");
   }
}
```

### Question 3

Create a reference copy and an instance copy of the following array

```java
int[] a = {10, 70, 20, 90};
```

### Question 4

Complete the `compareTo` function in the following class:

```java
public class Rectangle {
   public int width, height;
   public Rectangle(int w, int h) {
      width = w;
      height = h;
   }
   
   public int area() {
      return width * height;
   }
   
   public int compareTo(Rectangle other) { // return 1, 0 or -1 based on area as comparison value
   // to be completed
   }
}
```

### Question 5
Using the `Node` class as defined below, complete the `returnLast` method in the custom-built linked list class `MyLinkedList`. 
```java
public class Node {
   private int data;
   public Node next;
   
   public Node(int d, Node n) {
      data = d;
      next = n;
   }
}

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
