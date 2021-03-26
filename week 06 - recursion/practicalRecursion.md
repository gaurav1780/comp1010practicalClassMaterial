# Department of Computing, Macquarie University

## Practical class - Recursion

# NOTE

We will continue working with the `COMP1010_source_codes_for_students` project. This week, we are dealing with package `practicalClassCodes.week06`.

## Outline

- 5 to 30 minutes: Call stack and stack frames in a recursive design
- 31 to 60 minutes: demos
	- numeric-based examples
	- String-based examples
- 61 minutes to end of class: 
	- practice,
	- practice, and, 
	- more practice

## ACTIVITY 1 - Call stack and stack frames

Trace the function calls and the status of call stack for the following codes:

```java
public class Recursion_6_1 {
	public static int mystery(int a, int b) {
   		if(b == 0) {
			return a;
		}
		return mystery(b, a%b);
	}
	
	public static boolean 
	public static void main(String[] args) {
		int x = 16, y = 44;
		int z = mystery(x, y);
		System.out.println(z);
	}
}
```

```java
public class Recursion_6_2 {
	public static int steep(String a) {
   		if(a == null || a.isEmpty()) {
			return 0;
		}
		if(a.charAt(0) == ' ') {
			return 1 + steep(a.substring(1));
		}
		return steep(a.substring(1));
	}
	
	public static void main(String[] args) {
		String s = "is it on?";
		int b = steep(s);
		System.out.println(b);
	}
}
```

```java
//ADVANCED (take-home)
public class Recursion_6_3 {
	public static String funky(String a, String b) {
   		if(a == null || b == null || a.length() < b.length()) {
			return a;
		}
		String first = a.substring(0, b.length());
		if(first.equals(b)) {
			return funky(a.substring(b.length()), b);
		}
		return a.charAt(0) + funky(a.substring(1), b);
	}
	
	public static void main(String[] args) {
		String s1 = "inkling";
		String s2 = "in";
		String s3 = funky(s1, s2);
		System.out.println(s3);
	}
}
```
	
## IMPORTANT

Students should pair-up for the rest of this workshop. For all programs, you should design the solution (not the code!) together, then person A should code and person B should act as an observer. If the observer sees a mistake, they may interject.

## ACTIVITY 2 - Demo of recursive design and coding

In the first task, your tutor will design and implement a recursive solution for,

1. [Number-based problem](https://codingbat.com/prob/p163932) 
2. [String-based problem](https://codingbat.com/prob/p170371)

## ACTIVITY 3 - Practising in pairs

Practice questions sequentially from [https://codingbat.com/java/Recursion-1](https://codingbat.com/java/Recursion-1)

The order is:

1. `factorial` (hint available, use only if needed)
2. `bunnyEars` (hint available, use only if needed)
3. `fibonacci`
4. `bunnyEars2`
5. `triangle`
6. `sumDigits`
7. `count7`
8. and so on...

## Week 6 submission

You should be working with package `practicePackage.recursion`, stages 1 and 2 only. 
There are a total of 21 functions across the two stages. 
Your code should pass **AT LEAST 10 functions to pass the hurdle**. 
Each function is worth 5 marks. Solving 20 functions will get you a full mark for week 6. 
Solving the 21st function will earn you my respect but unfortunately no bonus marks.

Drag and Drop the two java files (Stage1.java, Stage2.java) from the package explorer into "Week 6 submission" submission box by **Sunday 4th April, 21:00**.
Any compilation error, StackOverflowError or any infinite loop in ANY of the files will result in an automatic zero.

## ADVANCED PRACTICE QUESTIONS

If you are done with Recursion - 1, move on to [https://codingbat.com/java/Recursion-2](https://codingbat.com/java/Recursion-2).

## ADVANCED QUESTION

**This is for students looking for something fairly challenging.**
Solve as many questions as you can from [RecursionService.java] in `practiceClassCodes.week06.RecursionService` 
