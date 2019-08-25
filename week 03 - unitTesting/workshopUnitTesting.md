# Department of Computing, Macquarie University
## Workshop - Unit testing


# Outline 

1. Test quality
2. Sample mappings
3. Satisfying JUnit tests
4. Writing JUnit tests

# Test quality

When writing tests for a particular method, a set of input-output mappings is used to test the correctness of the method. This set should test as many scenarios as possible.

## Question 1

Consider a method that is supposed to return the number of even digits in an integer. Which of the following sets of sample inputs is the best?

1. 31, 255, 1
2. 240, 1080, 0, 42
3. 31, 65, 84, 29
4. 5782, 374, 18642, -7135342
5. 1, 589, 409512, -6158, 0

## Question 2

Consider a method that returns the number of odd numbers in an array. If one sample input is `{15, 7, 103}`, does a second sample input `{15, 103, 91}` offer any additional value to the test (as in improving the "test quality")? What about `{81, -25, 63}`?

## Question 3

Consider a method with the following header:

```java
/**
 * return true if there exists any value that occurs 
 * more than once in the array, false otherwise
 */
public static boolean hasDuplicates(int[] data)
```

Write a set of sample inputs and expected outputs to test the correctness of its implementation.

| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Passed array &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | Expected return value |
|--------------|-----------------------|
|  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;            |                       |
|  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;            |                       |
|  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;            |                       |
|  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;            |                       |
|  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;            |                       |
|  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;            |                       |

## Question 4a

Consider the following implementation of a method:

```java
public class Question4a {
	/** 
	 * return the sum of all items of the array passed
	 */
	public static int sum(int[] data) {
		int r = 0;
		for(int i=1; i < data.length; i++) {
			r+=data[i];
		}
		return r;
	}
}
```

1. What value is the above method **expected** to return for the array \{10, 70, 20, 90\}?
2. What value does the above method **actually** return for the array \{10, 70, 20, 90\}?

This check on expectations is managed by the assertion:

```java
int[] arr = {10, 70, 20, 90};
assertEquals(190, Question4a.sum(arr));
```

Here, 190 is the expected value, while `Question4.sum(arr)` is the actual value returned by our implementation.

## Question 4b

Consider the following implementation of a method:

```java
public class Question4b {
	/** 
	 * return number of items in the array that belong 
	 * to the range [min...max]
	 */
	public static int countInRange(int[] data, int min, int max) {
		int r = 0;
		for(int i=0; i < data.length; i++) {
			if(data[i] > min && data[i] < max) {
				r++;
			}
		}
		return r;
	}
}
```

Will the above implementation pass the following test cases and if not, which case will it fail (first)?

```java
@Test
public void testCountInRange() {
	int[] a = {10, 70, 20, 90, 30, 80};
	assertEquals(2, Question4b.countInRange(a, 25, 75));
	assertEquals(3, Question4b.countInRange(a, 15, 75));
	assertEquals(0, Question4b.countInRange(a, -100, -60));
	assertEquals(6, Question4b.countInRange(a, 0, 100));
	assertEquals(1, Question4b.countInRange(a, 85, 95));
}
```

## Question 5

Can you identify the bug in the implementation of `countInRange`? What tests must be added to expose this category of bugs?

## Question 6

Consider the following method header:

```java
public class Question6 {
	/**
	 * return true if the array is in ascending order, false otherwise.
	 * ascending order is where every item is less than or equal to the 
	 * the item after it.
	 */
	public static boolean isAscending(int[] data) {
		return false; //to be completed
	}
}
```

Complete the test to test implementation of `isAscending`. Two test cases are provided to get you started.

```java
public void testIsAscending() {
	int[] a = {10, 20, 30, 40};
	assertTrue(Question6.isAscending(a));
	
	int[] b = {40, 30, 20, 10};
	assertFalse(Question6.isAscending(b));
	
	//add more test cases
	
	
	
	
	
	
	
}
```

## Question 7

Consider the following method header:

```java
public class Question7 {
	/**
	 * return the first index at which target exists in the array.
	 * return -1 if target does not exist in the array
	 */
	public static int indexOf(int[] data, int target) {
		return 0; //to be completed
	}
}
```

Complete the test to test implementation of `indexOf`.

```java
@Test
public void testIndexOf() {
	//add test cases




	
	
	
	
	
	
	
}
```

## Question 8

Work on [Practice Package Week 2 (Arrays)](https://ilearn.mq.edu.au/mod/forum/discuss.php?d=1258107) for the rest of the time. There are 35 mandatory methods to complete (out of a total of 118 methods). Make the submission by 21:00 Saturday week 3 at [https://ilearn.mq.edu.au/mod/assign/view.php?id=5316821](https://ilearn.mq.edu.au/mod/assign/view.php?id=5316821).

Choice of questions (read below for details)

#### Stage 1: All 13 questions

#### Stage 2 (19 questions):
`sum, sumPositives, sumMultiples, sumNotInRange, sumEvenIndexedItems, resetNegatives, makeAbsolute, countFactors, countOccurrences, indexOf, lastIndexOf, containsBetweenIndices, sumUpToIndex, productNegativesFromIndex, allNonZeroes, containsPositive, isDescending, isBalanced, getCopy`

#### Stage 3 (3 questions):
`generatePatternedArray, identical, mutuallyReverse`

### You must complete -

1. at least 24 methods overall, and,
2. at least 10 methods from stage 2, and,
3. at least 1 method from stage 3.

(So while normally i'd expect students to do 13 from stage 1, 10 from stage 2 and 1 from stage 3; technically, you can do 23 methods from stage 2 and 1 from stage 3, or 10 from stage 2 and 13 from stage 3, etc.)
