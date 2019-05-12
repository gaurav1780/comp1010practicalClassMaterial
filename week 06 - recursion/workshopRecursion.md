# Department of Computing, Macquarie University

## Workshop - Classes and Objects

### Outline

- 6 - 15 minutes: a note for practical exams about `NullPointerException`
- 16 - 35 minutes: demos
	- numeric-based example
	- String-based example
- 36 - end of class: practice,
- practice, and, 
- more practice

## `NullPointerException`

In your second practical exam, we'll ask you to ensure an object (including arrays) is not `null` before operating on it. If you access any instance variable or method of a `null` object, you get a `NullPointerException` - java's way of telling you that the object hasn't been instantiated.

```java
public static int sum(int[] data) {
	int result = 0;
	for(int i=0; i < data.length; i++) { //NullPointerException on data.length
		result+=data[i];
	}
	return result;
}
```

Since we are accessing `data.length`, we will get a `NullPointerException` when `data` is `null`.

### Fixed version:

```java
public static int sum(int[] data) {
	if(data == null) {
		return 0;
	}
	int result = 0;
	for(int i=0; i < data.length; i++) { //NullPointerException on data.length
		result+=data[i];
	}
	return result;
}
```

### Similar examples with String and Rectangle objects

```java
public static boolean isNumeric(String str) {
	if(str == null)
		return false;
	//...rest of your code
}
```

```java
public static int sumAreas(Rectangle[] data) {
	if(data == null) {
		return 0;
	}
	
	int result = 0;
	for(Rectangle r: data) { //enhanced for loop :)
		if(r != null) { //first check that object is NOT null
			result+=r.area();
		}
	}
}
```

## IMPORTANT

Students should pair-up for the rest of this workshop. For all programs, you should design the solution (not the code!) together, then person A should code and person B should act as an observer. If the observer sees a mistake, (s)he may interject.

## Demo of recursive design and coding

In the first task, your tutor will design and implement a recursive solution for,

1. [Number-based problem](https://codingbat.com/prob/p163932) 
2. [String-based problem](https://codingbat.com/prob/p104029)

## PRACTICE - IN PAIRS

Practice questions sequentially from [https://codingbat.com/java/Recursion-1](https://codingbat.com/java/Recursion-1)

The order is:

1. factorial (hint available, use only if needed)
2. bunnyEars (hint available, use only if needed)
3. fibonacci
4. bunnyEars2
5. triangle
6. sumDigits
7. count7 
8. and so on...

## ADVANCED PRACTICE QUESTIONS

If you are done with Recursion - 1, move on to [https://codingbat.com/java/Recursion-2](https://codingbat.com/java/Recursion-2).

## ADVANCED QUESTION

**This is for students looking for something fairly challenging.**
Solve as many questions as you can from [RecursionService.java](./codes/RecursionService.java)
