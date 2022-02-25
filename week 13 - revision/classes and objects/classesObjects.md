### Question 1

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

### Question 2

Complete the `compareTo` method in the following class:

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

   /** 
    *
    * @param other Another rectangle to comapre to
    * @return 1, 0 or -1 based on area as comparison value
    */
   public int compareTo(Rectangle other) {
      // to be completed
   }
}
```

### Question 3
If `width` and `height` in the previous question was of type `double`, how would you need to rewrite the `compareTo` method?

**Tip:** Depending on how you implemented `compareTo`, you might not have to change anything.

### Question 4
Create a reference copy and an instance copy of the following Rectangle.

```Java
Rectangle r = new Rectangle(10, 70);
```

### Question 5
Fill in the `???` given that `Rectangle` is the class defined in question 2.

```java
public class Box {
   public Rectangle base, side;
   public Rectangle(int base, int side) {
      ??? = base;
      ??? = side;
   }

   public int area() {
      return ???;
   }
}
```

### Question 6
What is the value of `x`, `y` and `z` after the following code executes?

**Tip :bulb:** Draw a memory diagram!

```java
Rectangle r = new Rectangle(10, 70);
Box b = new Box(r, new Rectangle(20, 90));
Rectangle temp = new Rectangle(b.base.width, b.side.height);

Rectangle x = b.side;
Box y = new Box(new Rectangle(r.width, r.height), temp);
Box z = new Box(b.base, b.side);

z.side.width = 5;
b.base = new Rectangle(1, 1);
```
