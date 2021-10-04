# Department of Computing, Macquarie University

## Practical - Lists 2

This week, we'll practise with,

- `ArrayList` of objects of user-defined classes, 
- `ArrayList` of `ArrayLists`, and, 
- iterators

The classes required (`Rectangle`, `Box`) are provided in [codes](./codes) directory.


### Question 1 (List of objects of user-defined classes)

1. Create an `ArrayList` of `Rectangle` objects named `rectangles`.

<!--```java
ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
```-->

2. Add 100 rectangle objects, each with a random width between 1 and 10 (inclusive on both sides) and a random height between 1 and 10 (inclusive on both sides) to the list `rectangles`.

<!--```java
for(int i=0; i < 100; i++) {
	int w = (int)(Math.random()*10) + 1;
	int h = (int)(Math.random()*10) + 1;
	rectangles.add(new Rectangle(w, h));
}
```-->

3. Create an `ArrayList` of `Box` objects named `boxes`.

<!--```java
ArrayList<Box> boxes = new ArrayList<Box>();
```-->

4. Add 100 `Box` objects, each with a random width between 1 and 10 (inclusive on both sides) and a random height between 1 and 10 (inclusive on both sides) and a random depth between 1 and 10 (inclusive on both sides) to the list `boxes`.

<!--```java
for(int i=0; i < 100; i++) {
	int w = (int)(Math.random()*10) + 1;
	int h = (int)(Math.random()*10) + 1;
	int d = (int)(Math.random()*10) + 1;
	boxes.add(new Box(w, h, d));
}
```-->

5. Count the number of objects in the list `boxes` that have a width of 5 or more.

<!--```java
int count = 0;
for(int i=0; i < rectangles.size(); i++) {
	if(boxes.get(i).base.width >= 5) {
		count++;
	}
}
```

OR

```java
int count = 0;
for(int i=0; i < rectangles.size(); i++) {
	Rectangle r = boxes.get(i).base;
	if(r.width >= 5) {
		count++;
	}
}
```

OR

```java
int count = 0;
for(Box b: boxes) {
	if(b.base.width >= 5) {
		count++;
	}
}
```

OR

```java
int count = 0;
for(Box b: boxes) {
	Rectangle r = b.base;
	if(r.width >= 5) {
		count++;
	}
}
```-->

6. Find the sum of the volumes of the objects in the list `boxes` where the base has an area of 20 or more.

<!--```java
int sum = 0;
for(Box b: boxes) {
	Rectangle r = b.base;
	if(r.area() >= 20) {
		sum+=b.volume();
	}
}
```-->

### Question 2 (List of Lists)

1. Create an `ArrayList` of `ArrayLists` of `Rectangle` objects named `matrix`. 

<!--```java
ArrayList<ArrayList<Rectangle>> matrix = new ArrayList<ArrayList<Rectangle>>();
```-->

2. Add `rectangles` to `matrix`.

<!--```java
matrix.add(rectangles);
```-->

3. Display matrix. You should see an output beginning with two opening square brackets (`[[`) and ending with two closing square brackets (`]]`).

<!--```java
System.out.println(matrix);
```-->

4. Calculate the total area of all the rectangles in the list `matrix` and display it.

<!--```java
for(ArrayList<Rectangle> sub: matrix) {
	int total = 0;
	for(Rectangle r: sub) {
		total+=r.area();
	}
}
```-->

5. Create an `ArrayList` of `Rectangle` objects named `fields`.

<!--```java
ArrayList<Rectangle> fields = new ArrayList<Rectangle>();
```-->

6. Add 3 rectangles of size (100, 160), (80, 60) and (150,75) to the list `fields`.

<!--```java
fields.add(new Rectangle(100, 160));
fields.add(new Rectangle(80, 60));
fields.add(new Rectangle(150, 75));
```-->

7. Append list `fields` to `matrix`.

<!--```java
matrix.add(fields);
```-->

8. Calculate the total area of all the rectangles in the list `matrix` and display it.

<!--```java
int total = 0;
for(ArrayList<Rectangle> sub: matrix) {
	for(Rectangle r: sub) {
		total+=r.area();
	}
}
```-->

### Question 3 (Iterators)

1. Create an iterator and display each object in list `boxes` from the first item to the last item.

<!--```java
ListIterator<Box> iter1 = boxes.listIterator();
while(iter1.hasNext()) {
	System.out.println(iter1.next());
}
```-->

2. Create an iterator and display each object in list `boxes` from the last item to the first item.

<!--```java
ListIterator<Box> iter2 = boxes.listIterator(boxes.size());
while(iter2.hasPrevious()) {
	System.out.println(iter2.previous());
}
```-->

3. Using an iterator, remove all objects from the list `boxes` that have square bases.

<!--```java
ListIterator<Box> iter3 = boxes.listIterator();
while(iter3.hasNext()) {
	Box b = iter3.next();
	Rectangle r = b.base;
	if(r.isSquare()) {
		iter3.remove();
	}
}
```-->

4. Using an iterator, add a unit `Box` object (of dimensions 1 by 1 by 1) **after** every item that has an even depth.

<!--```java
ListIterator<Box> iter4 = boxes.listIterator();
while(iter4.hasNext()) {
	Box b = iter4.next();
	if(b.depth%2 == 0) {
		iter4.add(new Box(1, 1, 1));
	}
}
```-->

5. Using an iterator, add a unit `Box` object (of dimensions 1 by 1 by 1) **before** every item that has an even depth.

<!--```java
ListIterator<Box> iter5 = boxes.listIterator();
while(iter5.hasNext()) {
	Box b = iter5.next();
	if(b.depth%2 == 0) {
		iter5.previous();
		iter5.add(new Box(1, 1, 1));
		iter5.next();
	}
}
```-->

## Weekly submission

Lecture notes on [List of lists](http://software-technology.mattr.net.au/programming/listOfLists.html) will be of tremendous help. There are heaps of examples in there for you.

Download and import the project from [week9submissionTemplate.zip](https://github.com/gaurav1780/comp1010practicalClassMaterial/blob/master/week%2009%20-%20lists%202/codes/week9submissionTemplate.zip).

The class `ListOfListService` contains 15 functions that operate on lists of lists (all except countSquares operate on list of lists of Integer objects,
 whereas countSquares operates on list of lists of Rectangle objects).
 
Each method except getClean has two tests,
- *Basic* tests: assume none of the sublists are null, and none of the items within the sublists are null.
- *Comprehensive* tests: make no such assumption

Further instructions:

- Besides functions and methods in the template, you may only use methods that operate on `ArrayList` objects.
- Passing criteria for this week: 40 marks. Marks for each test are specified in the test file.
- Submit the file `ListOfListService.java` under `Week 9 Submission` box on iLearn.
- Standard rules for submissions listed on iLearn apply.
- Execution time limit: 5 seconds.
