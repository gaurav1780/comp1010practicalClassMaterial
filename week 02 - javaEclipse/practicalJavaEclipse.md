# School of Computing, Macquarie University
## Workshop - Java and Eclipse basics

# Assumptions

You have downloaded and installed Java SE (previously known as Java SDK) and an IDE (Eclipse is preferred, but you can choose Visual Studio Code or IntelliJ or ...) on your computer if you are using it. The software is installed in all Computing laboratories.

## IMPORTANT: Pair up for this lab. If you want to work individually, get permission from your tutor.

## Suggested Timeline 

- 5 minutes past start: Structure of a Java program
- 35 minutes past start: JUnit test example
- 70 minutes past start: Completing a simple Java program
- 90 minutes past start: Problem solving


## Structure of a Java program

The following is true for basic java programs (the kind we'll see in the beginning). More advanced program structures shall be discussed as needed.

- A basic java program resides in a `.java` file. 
- **By convention**, the file name begins with an uppercase letter and is camel-cased. For example `HelloWorld.java`.
- The first statement in a file named `XYZ.java` is the class header and **must** be:
		
```java
public class XYZ {
```

### Question 1.

Which of the following should be the first statement in a file named `Hello.java`?
	
1. `public class Hello {` 
2. `public class hello {`
3. `class Hello {`
4. `class hello {`


A class is like a container for java programs. A *runnable* java program contains a `main` function with the following **header** inside the class.

The header of the `main` function is:

```java
public static void main(String[] args)
```

It MUST satisfy following conditions:

- (CRITICAL) `public` means it can be seen by any other code in the program.
- (CRITICAL) `static` will be covered later.
- (CRITICAL) `void` because the function doesn't return any value.
- (CRITICAL) `main` is a special reserved name for this function (like `draw` in Processing).
- (CRITICAL) `String[]` means it accepts an array of Strings as parameter. We don't use that in this unit but that has to be there.
- (FLEXIBLE) `args` is the formal parameter name. We can use any valid value for a literal instead of this.

**TIP** :bulb: In Eclipse, you can press `Ctrl+Space`, type `main` and press `Enter` (`return` on Mac) to automatically generate the `main()` function. [See here](figs/autogen.mp4) for a demonstration.

### Question 2.

Which of the following are valid headers for the `main` function?
	
1. `public static void main()`
2. `public void main(String[] args)`
3. `public static void main(String[] tom)`
4. `public static void Main(String[] jerry)`
5. `public static void main(int[] args)`
6. `public static void main(String args)`
7. `public void main(String args)`
8. `public static void main(String[] args)`

## The complete picture

So, with the class header outside and the function header inside, a java program looks like this:

```java
public class MyFirstProgram {
	public static void main(String[] args) {
		//your code goes here
	}
	
	//other functions
}
```

### Question 3.

1. Create a new Java project named `simpleJavaProject`.
	1. **DO NOT create** `module-info.java` when prompted.
2. Right click on project and choose `New` -> `Class`. 
3. Choose the name `Product`.
	1. Make sure you enable the box for including `public static void main(String[] args)`.
4. In the `main` function of file `Product.java`, initialize two integers with names and values of your choice and display their product. Values are displayed using `System.out.println` function.
5. Run the program using the *Play* button. For example, if the variables hold the values 4 and 9, you should see the value 36 in the console. 

### Question 4. *(removed)*

### Question 5.

1. Open package `practicalClassCodes` and then `week02`.

2. Double click on `Welcome.java` and run it using the `Play` Button.

3. You should see the output in the console.

4. Repeat steps 1-3 with `SpeedCalculator.java`

### Question 6.

Complete the steps described in the program `AverageSpeedCalculator.java` so that the average speed of a return trip is calculated. The output should be 15.384....

**TIP** :bulb: `int/int = int` while `int/double = double`

### Question 7.

Another package in the same project is `practicePackage`, further containing `introduction` and then two packages - `attempts` and `testsAttempts`. Thus, the hierarchy being:

- `practicePackage`
	- `introduction`
		- `attempts`
		- `testsAttempts`

The questions are split across multiple stages. Your tutor will demonstrate what should be done for the following two functions:

1. `higher(int,int)` in `Stage1.java` (function returning `int`), and, 
2. `isPositive(int)` in `Stage1.java`(function returning `boolean`).

**IMPORTANT** Please note that we expect, AT MOST, the top 2% students to be able to complete questions from the final Stage. So don't freak out because you can't solve those.

&nbsp;<p> 

<!-- [![](http://img.youtube.com/vi/Q1oGIypsPls/0.jpg)](https://www.youtube.com/watch?v=Q1oGIypsPls "")
 -->
	
<!--Export the relevant part of the project to an archive file using steps shown in the following video

[![](http://img.youtube.com/vi/eeGrh_l5jp0/0.jpg)](http://www.youtube.com/watch?v=eeGrh_l5jp0 "")

1. Select the project `COMP1010_source_codes_for_students_updated` in the left panel so that it is highlighted in blue.
2. Choose `File`
3. Choose `Export`
4. Double-click (or expand) `General`
5. Double-click `Archive file`.
6. Uncheck the box against `COMP1010_source_codes_for_students`.
7. Choose only the package `practicePackage.introduction.attempts`.
8. Click on `Browse`
9. Choose location of your choice and choose the name `studentID_week_2_submission.zip` (studentID being your 8-digit student ID).
10. Click `Finish`.
11. Upload file `studentID_week_2_submission.zip` under `Week 2 submission`. For example, if your student ID is 40404040, the file you submit, must be `40404040_week_2_submission.zip`.-->

### Question 8 (Problem solving)

This question must be answered **on a piece of paper**.

#### Sub-task 1

Complete the body of the function `sumIndexRange` that returns the sum of all items in the index range in the array passed. Some examples,

- `data = {10, 70, 20, 90, 30}`, `idx1 = 1`, `idx2 = 3` 
	
	--> return `70+20+90` = `180`

- `data = {10, 70, 20, 90, 30}`, `idx1 = 2`, `idx2 = 2` 
	
	--> return `20`
	
```java
public static int sumIndexRange(int[] data, int idx1, int idx2) {
	return 0;
	//so that there is no compilation error. 
	//remove this return statement before writing your code.
}
```

 ***Only if you struggle***, access the pseudo-code provided [here](./sumIndexRangePseudoCode.md).

#### Sub-task 2

Complete the body of the function `isBalanced` that assumes that the array passed has an even number of items, and returns `true` if the sum of items in the first half of the array equals the sum of items in the second half of the array, `false` otherwise. 

You **SHOULD** (meaningfully) call the function `sumIndexRange`, even if you didn't finish it or get it right.

For example,

- `data = {10, 70, 20, 80, 0, 20}` --> return `true`
- `data = {10, 70, 20, 10, 10, 80, -50, 70}` --> return `true`
- `data = {10, 70, 80, 20}` --> return `false`

```java
public static boolean isBalanced(int[] data) {
	return false; 
	//so that there is no compilation error. 
	//remove this statement before writing your code.
}
```

## Extra questions for students who want/ need to be challenged 

Solve the following problems (in order of my perception of difficulty) from `codingbat`. Solutions to these will not be released. But you are free to search them online.

Adv1. [https://codingbat.com/prob/p109783](https://codingbat.com/prob/p109783)

Adv2. [https://codingbat.com/prob/p193753](https://codingbat.com/prob/p193753)

Adv3. [https://codingbat.com/prob/p153059](https://codingbat.com/prob/p153059)

Adv4. [https://codingbat.com/prob/p193817](https://codingbat.com/prob/p193817)

Adv5. [https://codingbat.com/prob/p134022](https://codingbat.com/prob/p134022)

Adv6. [https://codingbat.com/prob/p189576](https://codingbat.com/prob/p189576) 

# Submission Task

### Due: 5pm (17:00:00), Sunday 6th March Sydney Time

- Complete functions in the `practicePackage._01_introduction.attempts` package such that the corresponding tests in `practicePackage._01_introduction.testsAttempts` pass.
- Each test passed gets you 3 out of 100 marks.
- Time limit: 5 seconds for Stages 1 to 5 (combined), 30 seconds for Stage 6. Stage 6 will be marked separately.
- Total mark are capped at 100. So, passing 34 or more tests gets you 100/100, not more (unfortunately).
- Passing mark is 60 (or at least 20 functions).
- Submit all files on which you work (so up to 6 java files). For example, if you complete ONE OR MORE functions from Stage1.java, Stage2.java, Stage3.java - submit those three files.
- You can make the submission by **5pm (17:00:00), Sunday 6th March Sydney Time**. Late submissions are not accepted.
- The more functions you can solve, the better prepared you are for the unit.
- Just because this is the first submission, we'll specify some details explicitly, you cannot use:
	- ArrayList class,
	- LargeInteger class,
	- HashMap class,
	- Lambdas,
	- java.util.Arrays class (not array as in [])
