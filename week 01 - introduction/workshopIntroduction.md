# Department of Computing, Macquarie University
## Workshop - Introduction to COMP125

# Outline 

Most of you have done COMP115 at Macquarie with Processing as the programming language and environment. We will revise some of the basics of programming learnt in COMP115. Also, in COMP125, Java is the programming language and Eclipse is the environment. Following are this week's learning outcomes,

- 10 minutes: introductions
- 10 minutes: be ready to use the lab computers (setup accounts and iLearn)
- 10 minutes: installing Java SE and Eclipse IDE
- 80 minutes: revise COMP115/WCOM115 topics

## COMP125 Support Structure

In COMP125, we understand that programming doesn't come naturally to everyone. Some learn faster than others. There are two kinds of support sessions provided in COMP125:

1. Faculty-funded PAL sessions conducted by Cooper Timewell (current 2nd year student) starting **week 1**
	1. Thursday 12pm - 1pm (23 Wallys Walk - 103 Tutorial Rm)
	2. Thursday 1pm - 2pm (4 Western Rd - 312 Tutorial Rm)
	3. Thursday 2pm - 3pm (4 Western Rd - 312 Tutorial Rm)
2. Unit-funded support sessions conducted by Cooper Timewell (2nd year), John Kim, Mark Smith (both 3rd year) starting **week 2**
	1. Monday 3pm - 4pm (9 Wallys Walk - 112)
	2. Tuesday 11am - 12pm (9 Wallys Walk - 110)
	3. Tuesday 3pm - 4pm **(TO BE CONFIRMED)**
	4. Wednesday 4pm - 5pm **(TO BE CONFIRMED)**
	5. Friday 1pm - 2pm **(TO BE CONFIRMED)**
	6. Friday 6pm - 7pm (9 Wallys Walk - 114) **Specially scheduled for full-time working students**
	
* The times for sessions marked as **(TO BE CONFIRMED)** are subject to change.

## Installing Java SE and Eclipse IDE

Java is the programming language while Eclipse is one of the editors in which you write Java programs.

Current version of Java SE is `12.0.2` and Eclipse IDE is `2019-06`.

You must install Java Development Kit (JDK), now known as Java Standard Edition (Java SE).

A Google search for "Download Java SE" should take you to the right link, which is [https://www.oracle.com/technetwork/java/javase/downloads/index.html](https://www.oracle.com/technetwork/java/javase/downloads/index.html).

If you are using Windows, most likely yours is a 64-bit OS. 

After installing Java SE, you can Google for "Download Eclipse" which should take you to [https://www.eclipse.org/downloads/](https://www.eclipse.org/downloads/). Download the installer and run it.

Choose `Eclipse IDE for Java Developers` from the list of options.

If you have any problem installing Java and/or Eclipse, try troubleshooting with your friends. If the problem persists, bring your laptop to one of the above listed **support sessions** and we'll help you out. Please do not ask your lecturer or tutor to sort it during classes as these sessions are not designed for troubleshooting such issues.


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

Discuss this question as a group.

```java
int[] a = {10, 70, 20, 90, 30}; //a refers to an array instance containing 5 items
int[] b = {a[4], a[2], a[0]}; 
//new array instance creating three items from a created, b refers to this instance 
int[] c = b; //c is a reference copy. c and b both refer to the same instance of the array
```

The notation scheme for the memory diagram we will be using is as follows:

![](./figs/arrayStorage.png)

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

## Advanced questions

We understand that some students are quite advanced so here's a section to keep them *entertained*.

#### AQ1 (Advanced question 1)

Define a function that when passed two arrays, returns `true` if they have any item in common, `false` otherwise.

#### AQ2 

Define a function that when passed an array, returns an array containing only the positive items from the array passed.

#### AQ3

A *set* is defined as a collection of unique values. That is, each item in a set occurs exactly once. 

Define a function that when passed an array, returns a *set* version of the array. The order of occurrence of items in the array returned should be the same as the order of the **first** occurrences of the items in the array passed.

For example, if the array passed is `{10, 70, 20, 30, 30, 30, 10, 70, 20}`, return the array `{10, 70, 20, 30}`.

#### AQ4

Define a function that when passed an array, returns a *frequency table* of the array in the form of a two-dimensional array. Each subarray of the array should have two items - 

- the first item holding the value of the item in the passed array
- the second item holding number of times that item exists in the passed array.

The order of occurrence of the first item of each subarray in the array returned should be the same as the order of the **first** occurrences of the items in the array passed.

For example, if the array passed is 

```java
{10, -4, 8, 0, -4, -4, -4, 8, 2, -4, 6, 6, 10, 10, 6}, 
```

return the array 

```java
{{10, 3}, {-4, 5}, {8, 2}, {0, 1}, {2, 1}, {6, 3}}
```
as the item 10 exists 3 times, the item -4 exists 5 times and so on.
