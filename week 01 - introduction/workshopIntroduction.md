# Department of Computing, Macquarie University
## Workshop - Introduction to COMP125

# Outline 

Most of you have done COMP115 at Macquarie with Processing as the programming language and environment. We will revise some of the basics of programming learnt in COMP115. Also, in COMP125, Java is the programming language and Eclipse is the environment. Following are this week's learning outcomes,

- 10 minutes: introductions
- 40 minutes: cognition survey
- 5 minutes: be ready to use the lab computers (setup accounts and iLearn)
- 55 minutes: revise COMP115/WCOM115 topics

# Revision

We will go through some questions that will help you revise COMP115. We have created material for students with the transition from COMP115 to COMP125 which is available [here](https://github.com/comp125mq/comp115_to_comp125_transition_workshops). Each topic contains a `.md` file containing the material.

## What is the value of `result` when each of the following codes is executed?

1. 
```java
int result = 12 / 5;
```

2. 
```java
float result = 12 / 5;
```

3. 
```java
float result = 12.0 / 5;
```

4. 
```java
int result = 13 % 5;
```

5. 
```java
int result = -13 % 5;
```

6. 
```java
int result = -13 % -5;
```

## CONDITIONS

Consider the following code:

```java
size(300, 200);
background(255);
int x = (int)random(width);
int y = (int)random(height);
if(x < width/2) {
	if(y < height/2) {
		line(0, 0, x, y);
	}
	else {
		ellipse(x, y, 20, 20);
	}
}
else {
	if(y < height/2) {
		rect(x, y, 20, 20);
	}
	else {
		triangle(x, 0, x, y, 0, y);
	}
}
```

What shapes are drawn for each of the following co-ordinates?

1. (90, 120)
2. (180, 160)
3. (40, 80)
4. (160, 90)

## LOOPS

What is the value of `result` when each of the following codes is executed?

1.

```java
int result = 1;
for(int i=0; i<4; i++) {
	result*=2;
}
```

2. 

```java
int n = 64;
int result = 0;
for(int i=1; i*i<=n; i++) {
	result++;
}
```

## CALLING A FUNCTION

What is the value of `result` when the following code is executed? Draw a memory diagram to illustrate the passing of variables. (You can see an example of such a memory diagram [here](https://github.com/comp125mq/comp115_to_comp125_transition_workshops/blob/master/3%20-%20functions/functions.md#defining-a-function)).

Function definition:

```java
int foo(int a, int b) {
	if(a < b)
		return a;
	else
		return b;
}
```

Function call:

```java
int p = 6;
int q = 3;
int result = foo(p - 2, q + 2);
```

## DEFINING A FUNCTION

1. Write a function that when passed an integer, return `true` if it is even (divisible by 2), and `false` otherwise.
2. Write a function that when passed an integer and a boolean, returns:

    - the square of the integer if the boolean value is `true`
		- the integer itself, if the boolean value is `false` and the integer is positive
		- negative of the integer, if the boolean value is `false` and the integer is not positive

## STORAGE OF ARRAYS

Draw the memory diagram that illustrates the arrays stored in the memory for the following code:

```java
int[] a = {10, 70, 20, 90, 30};
int[] b = {a[2], a[1], a[0]};
int[] c = b;
```

## CREATING AN ARRAY

1. Declare an array `arr` to store integers. 
2. Instantiate it to hold 400 integers. 
3. Using a loop, initialize the items such that,
    - the first item is 10, 
    - the second item is 15, 
    - the third item is 20,
    - and so on ...

## FUNCTIONS HANDLING ARRAYS

Complete the following functions (we are using Processing syntax here):

```java 
/**
 * return total of all items in the array
 */
int total(int[] data) {
   return 0; //to be completed
}
```

```java
/**
 * return total of all even numbers in the array
 */
int totalEven(int[] data) {
   return 0; //to be completed
}
```

```java
/**
 * return true if all items in data are positive, 
 * false otherwise
 */
boolean allPositives(int[] data) {
   return false; //to be completed
}
```

```java
/**
 * return true if there is at least 
 * one item that exists in both a and b, false otherwise
 */
boolean somethingInCommon(int[] a, int[] b) {
	return false; //to be completed
}
```
