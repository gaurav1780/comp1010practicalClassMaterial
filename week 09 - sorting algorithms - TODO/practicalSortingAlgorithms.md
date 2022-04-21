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
	10 20 70 90 30 80
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

Complete the following code so that the array passed is sorted in DESCENDING order.

```java
public static void sort(int[] data) {
	for(int i=0; i < data.length; i++) {
		int mystery = i;
		for(int k=i+1; k < data.length; k++) {
		
			???? { //COMPLETE THIS LINE

				mystery = k;

			}
		}
		int temp = data[i];
		data[i] = data[mysteryValue];
		data[mystery] = temp;
	}
}
```

### Question 5.

Complete the following code so that the array passed is unchanged and an DESCENDING sorted version is returned. You may assume the array passed is not `null`.

```java
public static int[] getSorted(int[] data) {
	int[] result = new int[???];
	
	??? //one or more statements allowed
	
	sort(result); //from the previous question
	
	???; //one or more statements allowed
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
}
```

### Question 7.

Complete the following function that sorted an array of `Rectangle` objects in ascending order of areas.


```java
public static void sort(Rectangle[] data) {
	for(int i=0; i < data.length; i++) {
		int mystery = i;
		for(int k=i+1; k < data.length; k++) {
		
			???? { //COMPLETE THIS LINE

				mystery = k;
			}
		}
		Rectangle temp = data[i];
		data[i] = data[mysteryValue];
		data[mystery] = temp;
	}
}
```

### Question 8.

Complete the following function that sorted an ArrayList of `Rectangle` objects in ascending order of areas.


```java
public static void sort(ArrayList<Rectangle> data) {
	for(int i=0; i < ??? ; i++) {
		int minIndex = i;
		for(int k=i+1; k < ???; k++) {
			if(data.get(k).compareTo(data.get(minIndex)) == -1) {
				minIndex = k;
			}
		}
		//swap items at indices i and minIndex
	}
}
```

### Question 9.

Write a function from scratch that sorts an ArrayList of `Box` objects in ascending order of volume. You may add methods in the `Box` class.

# Submission Task

### Due: 5pm (17:00:00) Sunday 8th May Sydney Time

- Complete at least 12 out of the 24 functions in the package `_06_sorting` to pass this week's hurdle.
- 5 marks per function with total capped at 100. (So, 20 or more functions get you the full marks).
- Time limit: 5 seconds.
- Standard rules apply.
- Late submissions not accepted.