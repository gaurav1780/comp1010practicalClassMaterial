### Question 1

What is the output of the following program provided we have imported `java.util.Arrays` and the code sits in the `main` method.

**TIP:** Draw the memory diagram.

```java
int[] a = {10, 70, 20, 90};
int[] b = {a[2], a[0], a[1]};
System.out.println(Arrays.toString(b));
```

### Question 2

Create a reference copy and an instance copy of the following array

```java
int[] a = {10, 70, 20, 90};
```

### Question 3

Write a function that returns an array containing the `minimum` and `maximum` value in the `int` array `data`. The function should only iterate over the array `data` once. Remember to specify both the input and return type.

### Question 4
What is the value of `-1%2`, `24%5`, `-24%5`, and `30%7`?  

### Question 5
Create an array `data` containing the values 10, 70, 20, 90 in one statement.

### Question 6
Given an array `data`, write a function that checks if every value at an even index is directly followed by it's square.  
`[2, 4, 5, 25, 3, 9]` returns `true` since `2^2 = 4`, `5^2 = 25` and `3^2 = 9`.  
`[2, 4, 5, 10, 3]` returns `false` since `5^2 != 10` and 3 does not have a value after it.  

Remember to check that you don't have any `IndexOutOfBounds` errors!  
Can you write it both iteratively and recursively?

### Question 7
Given an array `data`, write a function that checks if every value at an even index is directly followed by it's square root.  
`[4, 2, 25, 5, 9, 3]` returns `true` since `sqrt(4) = 2`, `sqrt(25) = 5` and `sqrt(9) = 3`.  
`[4, 2, 26, 5, 9]` returns `false` since `sqrt(26) != 5` and 9 does not have a value after it.  

**Tip:** If you use `Math.sqrt()` remember that it returns a `double` but `data` is an integer array. There is a faster way to do it than using `Math.sqrt()`.
