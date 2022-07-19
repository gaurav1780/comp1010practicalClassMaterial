# School of Computing, Macquarie University

## Practical - Sorting algorithms


This week, we'll practise with,

- sorting algorithms

The classes required (`Rectangle`, `Box`) are provided in [codes](./codes) directory.


### Question 1.

Given the following sequence of transformations, determine the sorting algorithms being used.

a. 
	
	```
	10 70 20 90 30 80
	10 70 20 90 30 80 
	10 20 70 90 30 80 
	10 20 30 70 90 80
	10 20 30 70 90 80
	10 20 30 70 80 90
	```

b.

	```
	10 70 20 90 30 80
	10 70 20 90 30 80
	10 20 70 90 30 80
	10 20 30 90 70 80
	10 20 30 70 90 80
	10 20 30 70 80 90
	```

c.

	```
	10 70 20 90 30 80
	80 70 20 90 30 10
	80 70 30 90 20 10
	80 70 90 30 20 10
	80 90 70 30 20 10
	90 80 70 30 20 10
	```

### Question 2.

Write a trace for the transformations the array will go through during the process of **selection** sort, while:

1. Sorting in **ascending** order from **left to right**.
2. Sorting in **descending** order from **right to left**.

	```java
	int[] data = {5, 0, 1, 2, 9, 8, 4, 7, 3, 6};
	```

### Question 3.

Write a trace for the transformations the array will go through during the process of **insertion** sort, while:

1. Sorting in **descending** order from **left to right**.
2. Sorting in **ascending** order from **right to left**.

	```java
	int[] data = {5, 0, 1, 2, 9, 8, 4, 7, 3, 6};
	```
	
### Question 4.

Complete the following code so that the array passed is sorted in **DESCENDING** order.

```java
public static void sort(int[] data) {
	for(int i=0; i < data.length; i++) {
		int mystery = i;
		for(int k=i+1; k < data.length; k++) {
		
			??? { // COMPLETE THIS LINE

				mystery = k;

			}
		}
		int temp = data[i];
		data[i] = data[mystery];
		data[mystery] = temp;
	}
}
```

### Question 5.

Complete the following code so that the array passed is **unchanged** and a **DESCENDING** sorted version is returned. 
- You may assume the array passed is not `null`.

```java
public static int[] getSorted(int[] data) {
	int[] result = new int[???]; // how many items should be included?
	
	??? // one or more statements allowed
	
	sort(result); // from the previous question
	
	??? // one or more statements allowed
}
```

### Question 6.

Complete the helper function `insertAtRightPlace` so that the array passed is sorted in ascending order.

```java
public static void sort(int[] data) {
	for(int i=1; i < data.length; i++) {
		insertAtRightPlace(data, i);
	}
}

/**
 * @param data: array to operate on
 * @param idx: item to be moved into the right index
 * 
 * Assuming data is sorted in ascending order from index 0 
 * to index idx-1, insert the item at index idx into the right
 * place between indices 0 and idx, such that after the function terminates, 
 * the array is sorted in ascending order from 
 * index 0 to index idx
*/
public static void insertAtRightPlace(int[] data, int idx) {
	// Complete this function!
}
```

### Question 7.

Complete the following function that sorted an array of `Rectangle` objects in ascending order of areas.


```java
public static void sort(Rectangle[] data) {
	for(int i=0; i < data.length; i++) {
		int mystery = i;
		for(int k=i+1; k < data.length; k++) {
		
			??? { // COMPLETE THIS LINE

				mystery = k;
			}
		}
		Rectangle temp = data[i];
		data[i] = data[mystery];
		data[mystery] = temp;
	}
}
```

### Question 8.

Complete the following function that sorts an ArrayList of `Rectangle` objects in ascending order of areas.


```java
public static void sort(ArrayList<Rectangle> data) {
	for(int i=0; i < ??? ; i++) {
		int minIndex = i;
		for(int k=i+1; k < ???; k++) {
			if(data.get(k).compareTo(data.get(minIndex)) == -1) {
				minIndex = k;
			}
		}
		// swap items at indices i and minIndex
	}
}
```

### Question 9.

Write a function from scratch that sorts an ArrayList of `Box` objects in ascending order of volume. You may add methods in the `Box` class.

# Submission Task

### Due: 5pm (17:00:00) Sunday 8th May Sydney Time

Late submissions not accepted.

This week, we are working with practice package for built-in lists.

Relevant package: practicePackage -> _05_arrayList in the master project.

Hurdle requirements:

- Standard rules apply.
- You can use functions in the file submitted, and besides those, only those methods that operates on an ArrayList object.
- Stage 1 is not assessed but it will help you to solve Stage 1 functions to be better prepared for later stages.
- Each function in Stage 2 is worth 2 marks.
- Each function in Stage 3 is worth 3 marks.
- Each function in Stage 4 is worth 6 marks.
- We suggest (recommended, but not required) solving functions implementing a variety of algorithms from Stage 2. For example, the following five each implements a different algorithm:
	- sumNegatives
	- countEven
	- containsInRange
	- allPositives
	- isDescending
- To clear the weekly hurdle, you must solve at least
	- 10 functions from Stage2, and,
	- 5 functions from Stage3.
- If you don't meet the hurdle requirements, marks will be capped at 34.
- If you meet the hurdle requirements, marks will be capped at 100.
- You can drag and drop Stage2.java, Stage3.java, and Stage4.java into the Week 8 submission.
- Time limit for this week: 5 seconds.
