# Department of Computing, Macquarie University

## Practical class - Classes and Objects 2

# NOTE

We will continue working with the master project. This week, we are dealing with package `practicalClassCodes.week05`.

## Outline

TODO

## Question 1

For the class `Rectangle` in the project contained in `practicalClassCodes.week05`, consider the following client code (outside `Rectangle` class):

```java
Rectangle[] data = new Rectangle[5];
```


1. Draw the memory diagram representing the storage of array `data`.

2.	What is the output of the following client code:

	```java
	for(int i=0; i < data.length; i++) {
		System.out.println(data[i]);
	}
	```

	<!--### SOLUTION
	```bash
	null
	null
	null
	null
	null
	```-->

3. 	Instantiate each item of the array so that,
	- the first item represents a square with `width=1, height=1`.
	- the second item represents a square with `width=2, height=2`.
	- the third item represents a square with `width=3, height=3`.
	- the fourth item represents a square with `width=4, height=4`.
	- the fifth item represents a square with `width=5, height=5`.

	<!--## SOLUTION
	
	```java
	for(int i=0; i < data.length; i++) {
		data[i] = new Rectangle(i+1); //square constructor exists
	}
	```-->

4. 	Draw the updated memory diagram after the items have been instantiated.

## Question 2

Take a look at the implementation of  `countSquares` in class `RectangleClient.java`, that when passed an array of `Rectangle` objects, returns the number of squares in the array. Note that the class `Rectangle` contains an intance method `isSquare()` that you can call.

Along the same lines, write a function `allSquares` in class `RectangleClient.java`, that when passed an array of `Rectangle` objects, returns `true` if all objects are *squares*, and `false` otherwise.

You may assume that the array passed and also every `Rectangle` in the array is instantiated. 

For a more comprehensive design, avoid that assumption, so,
- the array might be `null`, or if it is (instantiated), 
- some `Rectangle` objects in the array might be `null`.

Also, write your own test case in class `RectangleClientTest.java`.

<!--
## SOLUTION
	
#### Without assumption:

```java
public static int countSquares(Rectangle[] data) {
	int count = 0;
	for(int i=0; i < data.length; i++) {
		if(data[i].isSquare()) {
			count++;
		}
	}
	return count;
}
```

#### Without assumption:

```java
public static int countSquares(Rectangle[] data) {
	if(data == null) { //nothing inside
		return 0;
	}
	
	int count = 0;
	for(int i=0; i < data.length; i++) {
		if(data[i] != null && data[i].isSquare()) { //first make sure it's not null
			count++;
		}
	}
	return count;
}
```
-->

# ADVANCED QUESTIONS (HD level)

1. Write a method `groupSameAreas` in class `Advanced` that when passed an array of `Rectangle` objects (say `data`), returns a two-dimensional array of `Rectangle` objects (say `buckets`), such that all objects from `data` with the same area are in the same one-dimensional array in `buckets`. That is,

	- all objects in the one-dimensional array `buckets[0]` have the same area,
	- all objects in the one-dimensional array `buckets[1]` have the same area, 
	- all objects in the one-dimensional array `buckets[2]` have the same area, 
	- all objects in the one-dimensional array `buckets[3]` have the same area, 
	- and so on...

2. (Not related to classes and objects but aimed at students who might want something a little ... extra). Complete the method `longestRecurringSequence` in class `Advanced` that returns the longest sequence of items that occurs more than once in the array. return the array that occurs first in case of a tie.

---------

# Submission Task

This week, we will digress from the practice package. Download [comp1010\_week\_5\_submission\_template.zip](./codes/comp1010_week_5_submission_template.zip), import the project, and complete the methods in,

1. `Box.java`
2. `DeliveryTruck.java`

There are 20 methods you need to complete, each worth 5 marks.

Passing criteria is:

1. At least 7 methods from `Box.java`, AND,
2. At least 3 methods from  `DeliveryTruck.java`.

Rules applicable to all submissions are on iLearn [here](https://ilearn.mq.edu.au/mod/page/view.php?id=6701867).

**Due date**: `Sunday 29th August 21:00` Sydney time.

**Late submissions not accepted.**
