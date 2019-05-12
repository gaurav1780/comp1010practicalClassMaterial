# Department of Computing, Macquarie University
## Workshop - Unit testing


# Outline 

1. Test quality
2. Sample mappings
3. Satisfying JUnit tests
4. Writing JUnit tests


# HackerRank

By now, you should have attempted the first contest at [https://www.hackerrank.com/comp115-concepts](https://www.hackerrank.com/comp115-concepts).

This week's HackerRank contest is at [https://www.hackerrank.com/problem-solving-with-arrays](https://www.hackerrank.com/problem-solving-with-arrays)

# Test quality

When writing tests for a particular method, a set of input-output mappings is used to test the correctness of the method. This set should test as many scenarios as possible.

## Question 1

Consider a method that is supposed to return the number of even digits in an integer. Which of the following sets of sample inputs is the best?

1. 31, 255, 1
2. 240, 1080, 0, 42
3. 31, 65, 84, 29
4. 5782, 374, 18642, -7135342
5. **CORRECT ANSWER**: 1, 589, 409512, -6158, 0. Has a variety of test inputs including boundary conditions.

## Question 2

Consider a method that returns the number of odd numbers in an array. If one sample input is `{15, 7, 103}`, does a second sample input `{15, 103, 91}` offer any additional value to the test (as in improving the "test quality")? What about `{81, -25, 63}`?

### SOLUTION:

`{15, 103, 91}` has no additional value as an array with all odd numbers is already been tested.

`{81, -25, 63}` has some additional value since you are also checking negative odd numbers.

Hence, a buggy condition to check if an item `data[i]` is odd:

`if(data[i] % 2 == 1) //is true for positive odds only`

can be fixed using test feedback, to:

`if(data[i] % 2 != 0) //is true for positive AND negative odds`

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

### SOLUTION:

| &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Passed array &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | Expected return value |
|--------------|-----------------------|
{10, 70, 20, 90}|  false           |                       |
{10, 70, 20, 10, 90}|  true       |                       |
{10, 70, 20, 90, 80, 80}|  true           |                       |
{-50, -50, 70, 20, 90, 80, 80}|  true           |                       |
{1,5,2,7,3,9,4,8,6,0} |  false      |                       |

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

**SOLUTION:
180 (not 190)**

2. What value does the above method **actually** return for the array \{10, 70, 20, 90\}?

**SOLUTION:
190**

This check on expectations is managed by the assertion:

```java
int[] arr = {10, 70, 20, 90};
assertEquals(190, Question4a.sum(arr));
```

Here, 190 is the expected value, while `Question4.sum(arr)` is the actual value  returned by our implementation.

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
	assertEquals(2, Question4b.countInRange(a, 25, 75)); //PASSES
	assertEquals(3, Question4b.countInRange(a, 15, 75)); //PASSES
	assertEquals(0, Question4b.countInRange(a, -100, -60)); //PASSES
	assertEquals(6, Question4b.countInRange(a, 0, 100)); //PASSES
	assertEquals(1, Question4b.countInRange(a, 85, 95)); //PASSES
}
```

## Question 5

Can you identify the bug in the implementation of `countInRange`? What tests must be added to expose this category of bugs?

### SOLUTION:

#### BUG

Boundary items do not contribute to result because of comparison operators (`>` and `<`). 

Testing for the same array (`{10, 70, 20, 90, 30, 80}`) but `min = 10, max = 30` will expose the bug as the expected answer is 3 (10, 20 and 30) but the actual answer would be only 1 (10 and 30 do NOT satisfy the condition).

Hence, an additional assertion is required:

```java
assertEquals(3, Question4b.countInRange(a, 10, 30)); //FAILS: expected value: 3, actual value: 1
```

Correct condition:

```java
if(data[i] >= min && data[i] <= max)
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

Complete the test to test implementation of `isAscending`. Two test cases are provided to get you started.

### SOLUTION:

```java
public void testIsAscending() {
	int[] a = {10, 20, 30, 40};
	assertTrue(Question6.isAscending(a));
	
	int[] b = {40, 30, 20, 10};
	assertFalse(Question6.isAscending(b));
	
	//add more test cases
	
	int[] c = {10, 20, 30, 10}; 
	//checks if the second last item is being checked against last
	assertFalse(Question6.isAscending(c));

	int[] d = {-5, -5, -5, -5, -5, -5, -5, -5, -5}; 
	//array is in ascending order if all items are the same
	assertTrue(Question6.isAscending(d));
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

### SOLUTION:

```java
@Test
public void testIndexOf() {
	//add test cases
	int[] a = {10, 30, 20, 40, 10, 60, 70, 20, 90};
	assertEquals(0, Question7.indexOf(a, 10));
	assertEquals(-1, Question7.indexOf(a, 50));
	assertEquals(-1, Question7.indexOf(a, -10));
	assertEquals(2, Question7.indexOf(a, 20));
	assertEquals(8, Question7.indexOf(a, 90));
	assertEquals(6, Question7.indexOf(a, 70));
}
```

## Question 8 (1 hour)

We have created a sample practical exam under "Week 3" on iLearn. 

Your actual exam will have a similar structure (but 45 minutes to answer)
