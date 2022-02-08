# School of Computing, Macquarie University
## Workshop - Unit testing

# NOTE

We will continue working with our master source code project that you should already have in your IDE by now. If not, go through week 1 and 2 content again. This week, we are dealing with package `practicalClassCodes.week03`.

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
5. 1, 589, 409512, -6158, 0 (Contains positives, negatives, zeroes, with different number of digits)

# ANSWER: 

Number 5 (1, 589, 409512, -6158, 0) although some more numbers, positive and negative, composed purely of odd digits, and also those composed purely of even digits would be good. Like 13579, -13579, 24680, -24680

## Question 2

Consider a method that returns the number of odd values in an array. If one sample input is `{15, 7, 103}`, does a second sample input `{15, 103, 91}` offer any additional value to the test (as in improving the "test quality")? What about `{81, -25, 63}`?

# Answer: 
`{15, 103, 91}` doesn't really offer any added value. `{81, -25, 63}` does, by bringing in negative numbers, exposing a faulty boolean expression `data[i]%2 == 1`, if it occurs.

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
|  `{10,70,20,90}`            |            `false`           |
|  `{10,70,20,20}`            |              `true`         |
|  `{5000,10,5000,0,1,2,-3,4,5,6}`            |      `true`                 |
|  null            |           `false`            |
|  `{}`            |            `false`           |
|  `{10}`            |           `false`            |

## Question 4a

Consider a method `sum` that when passed an integer array, returns the sum of all the items in the array.

1. What value is the method **expected** to return for the array \{10, 70, 20, 90\}?

# ANSWER: 190

Now, consider the following implementation of this method:

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

2. What value does the above method **actually** return for the array \{10, 70, 20, 90\}?

# ANSWER: 180

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

# ANSWER: It passes all the tests (it shouldn't)

## Question 5

Can you identify the bug in the implementation of `countInRange`? What tests must be added to expose this category of bugs?

# ANSWER:

`>` AND `<` used instead of `>=` and `<=`

```java
int[] a = {10, 70, 20, 90, 30, 80};
assertEquals(2, Question4b.countInRange(a, 10, 80));
assertEquals(3, Question4b.countInRange(a, 20, 25));
assertEquals(3, Question4b.countInRange(a, 25, 70));
```

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

Complete the test to check the correctness of the implementation of `isAscending`. Two test cases are provided to get you started.

# ANSWER:

```java
public void testIsAscending() {
	int[] a = {10, 20, 30, 40};
	assertTrue(Question6.isAscending(a));
	
	int[] b = {40, 30, 20, 10};
	assertFalse(Question6.isAscending(b));
	
	int[] c = {40, 40, 40, 40, 40, 40, 40};
	assertTrue(Question6.isAscending(c));
	
	int[] d = {10, 20, 30, 40, 50, 60, 70, 80, 90, 89};
	assertFalse(Question6.isAscending(d));
	
	int[] e = {21, 20, 30, 40, 50, 60, 70, 80, 90};
	assertFalse(Question6.isAscending(e));
	
	a = new int[]{10, 10, 10, 10};
	assertTrue(Question6.isAscending(a));
	
	a = new int[]{10};
	assertTrue(Question6.isAscending(a));

	a = new int[]{};
	assertTrue(Question6.isAscending(a));
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

Complete the test to check the correctness of the implementation of `indexOf`.

# ANSWER: 

```java
@Test
public void testIndexOf() {
	assertEquals(-1, indexOf(null, 80)); //null check
	assertEquals(-1, indexOf(new int[]{10,70,20,90,10}, 80));
	assertEquals(-1, indexOf(new int[]{10,70,20,90}, -10));
	assertEquals(0, indexOf(new int[]{10,70,20,90}, 10));
	assertEquals(1, indexOf(new int[]{10,70,20,90}, 70));
	assertEquals(2, indexOf(new int[]{10,70,20,90}, 20));
	assertEquals(3, indexOf(new int[]{10,70,20,90}, 90));	
}
```

## Question 8

Work on the practice package for **arrays** for the rest of the time. It's in `practicePackage.arrays.attempts`, corresponding tests under `practicePackage.arrays.testsAttempts`. There are four stages, going from easier to harder. You need to work on, and submit stages 2 to 4. Stage 1 doesn't carry any marks. Stage 1 functions do not need any loop and they are to help you with the nitty-gritty required for Stages 2 and beyond. Mostly, they are about checking if the array is null, what's the length, and returning either the value at an index, or the index itself; or in some cases, returning `true` or `false` based on that.

In order to pass this week's hurdle, you must pass tests corresponding to,
	
1. **at least** 10 functions from stage 2, AND,
2. **at least** 5 functions from stage 3.

- Each function is worth 3 marks.
- Passing mark (if you satisfy above condition) is 45.
- If you satisfy the criteria for passing this week's hurdle, your total marks will be capped at 100.
- If you **DO NOT** satisfy the criteria for passing this week's hurdle, your total marks will be capped at 45.

Drag and Drop **all** relevant java files from the package explorer in Eclipse or explorer in Visual Studio Code into "Week 3 submission" submission box by **Tuesday 17th August, 21:00**. Note: this is a one-off situation where submission is NOT on a Sunday night (because of assignment 1 deadline).
