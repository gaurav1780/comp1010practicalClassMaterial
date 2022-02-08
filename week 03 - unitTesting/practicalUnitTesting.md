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

When writing tests for a particular function, a set of input-output mappings is used to determine the correctness of the function. This set should test as many scenarios as possible.

## Question 1

Consider a function that is supposed to return the number of even digits in an integer. Which of the following sets of sample inputs is the best?

1. 31, 255, 1
2. 240, 1080, 0, 42
3. 31, 65, 84, 29
4. 5782, 374, 18642, -7135342
5. 1, 589, 409512, -6158, -1357, 0

## Question 2

Consider a function that returns the number of odd items in an array. If one sample input is `{15, 7, 103}`, does a second sample input `{15, 103, 91}` offer any additional value to the test (as in improving the "test quality")? What about `{81, -25, 63}`?

## Question 3

Consider a function with the following header:

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

Consider a function `sum` that when passed an integer array, returns the sum of all the items in the array.

1. What value is the function **expected** to return for the array \{10, 70, 20, 90\}?

Now, consider the following implementation of this function:

```java
public class Question4a {
	/** 
	 * return the sum of all items of the array passed
	 */
	public static int sum(int[] data) {
		int r = 0;
		for(int i=1; i < data.length; i++) {
			r+=data[i]; //change from r++; to r+=data[i]; (
		}
		return r;
	}
}
```

2. What value does the above function **actually** return for the array \{10, 70, 20, 90\}?

This check on expectations is managed by the assertion:

```java
int[] arr = {10, 70, 20, 90};
assertEquals(190, Question4a.sum(arr));
```

Here, 190 is the expected value, while `Question4.sum(arr)` is the actual value returned by our implementation.

## Question 4b

Consider the following implementation of a function:

```java
public class Question4b {
	/** 
	 * return number of items in the array that belong 
	 * to the range [min...max] (including min and including max)
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

Consider the following function header:

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

Consider the following function header:

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

```java
@Test
public void testIndexOf() {
	//add test cases




	
	
	
	
	
	
	
}
```

# Submission Task

### Due: 5pm (17:00:00), Wednesday 16th March Sydney Time

Work on the practice package for **arrays** for the rest of the time. It's in `practicePackage.arrays.attempts`, corresponding tests under `practicePackage.arrays.testsAttempts`. There are four stages, going from easier to harder. You need to work on, and submit stages 2 to 4. Stage 1 doesn't carry any marks. Stage 1 functions do not need any loop and they are to help you with the nitty-gritty required for Stages 2 and beyond. Mostly, they are about checking if the array is null, what's the length, and returning either the value at an index, or the index itself; or in some cases, returning `true` or `false` based on that.

In order to pass this week's hurdle, you must pass tests corresponding to,
	
1. **at least** 10 functions from stage 2, AND,
2. **at least** 5 functions from stage 3.

- Each function is worth 3 marks.
- Passing mark (if you satisfy above condition) is 45.
- If you satisfy the criteria for passing this week's hurdle, your total marks will be capped at 100. For example, if you solve 40 stage 2 functions and 20 stage 3 functions, you will get 100, not 180 (3 * 60).
- If you **DO NOT** satisfy the criteria for passing this week's hurdle, your total marks will be capped at 44. For example, if you solve 40 stage 2 functions only, you will get 44, not 120 (3 * 40).
- Any infinite loop in any file will result in an automatic zero.
- Any compilation error in any file will result in an automatic zero. (This covers incorrect file names too).
- Running `testsAttempts` as JUnit test must finish executing in under 10 seconds. If execution time is more than that, it will result in an automatic zero.
- Use of functions from outsie the four files will result in an automatic zero (Usual culprits: `Arrays`, `Collections`, `stream`, `Math`, `StringBuilder`).
- Late submissions are NOT accepted.

Drag and Drop **all** relevant java files from the package explorer in Eclipse or explorer in Visual Studio Code into "Week 3 submission" submission box by **5pm (17:00:00), Wednesday 16th March Sydney Time**.