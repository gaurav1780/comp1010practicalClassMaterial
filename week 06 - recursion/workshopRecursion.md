# Department of Computing, Macquarie University

## Workshop - Classes and Objects

### Outline

- 6 to 15 minutes: a note for practical exams about `NullPointerException`
- 16 to 35 minutes: demos
	- numeric-based example
	- String-based example
- 36 to end of class: 
	- practice,
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

**IMPORTANT** Only something that is a *reference* can be assigned a `null` value, not variables of primitive data type.

Consider the following code and state which of the `null` checks (`check1, check2, ...`) are valid and if so, what do they evaluate to?

```java
class Rectangle {
   public double width, height;
}
```

```java
public class Client {
   public static void main(String[] args) {
      String str1 = null;
      int[] data1 = new int[4];
      Rectangle r1 = new Rectangle();
      String str2 = "Messi!";
      int[] data2 = null;
      Rectangle r2 = null;
      int n = 5;
      char ch = '$';
      boolean flag = false;
      
      //are the following valid? and if so, what are the values of the boolean variables
      boolean check0 = (str == null);
      boolean check1 = (data1 == null); 
      boolean check2 = (r1 == null);
      boolean check3 = (n == null);
      boolean check4 = (ch == null);
      boolean check5 = (flag == null);
      boolean check6 = (data2 == null); 
      boolean check7 = (r2 == null);
      boolean check8 = (data1.length == null); 
      boolean check9 = (r2.width == null);
      boolean check10 = (str2 == null);
   }
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

1. `factorial` (hint available, use only if needed)
2. `bunnyEars` (hint available, use only if needed)
3. `fibonacci`
4. `bunnyEars2`
5. `triangle`
6. `sumDigits`
7. `count7`
8. and so on...

## ADVANCED PRACTICE QUESTIONS

If you are done with Recursion - 1, move on to [https://codingbat.com/java/Recursion-2](https://codingbat.com/java/Recursion-2).

## ADVANCED QUESTION

**This is for students looking for something fairly challenging.**
Solve as many questions as you can from [RecursionService.java](./codes/RecursionService.java)
