# Department of Computing, Macquarie University

## Practical class - Classes and Objects

# NOTE

Typically we have practical exams in week 4 so the source code is provided separately in [comp1010_week_4_practical_class_code.zip](./comp1010_week_4_practical_class_code.zip).

## Outline

- designing a class
- creating objects
- references and instances
- constructors
- compareTo
- `this` as a reference copy of *calling object*

## Question 1 (Up to 10 minutes)

Design classes (no implementation) that encapsulate the following real life entities. 
	- Add up to three instance variables for each class. Select the three most important attributes if you think a class has more than three attributes.
	- Add up to three instance methods that objects of this class may exhibit.

#### 1. Person

<!--
### SOLUTION
	
#### Instance variables:
	
1. name: text
	
2. yearOfBirth: integer
	
3. gender: integer (0 - male, 1 - female, 2 - transgender, ...)
	
#### Instance methods:
	
1. initials(): text (initials of "Harry Potter" are "HP")
	
2. age(): integer
	
3. isMale() or isFemale(): boolean
-->

	
#### 2. Cylinder (Take-home exercise)

<!--
### SOLUTION
	
#### Instance variables:
	
1. radius: real number
	
2. height: real number

#### Instance methods:
	
1. volume(): real number
	
2. surfaceArea(): real number
	
3. diameter(): real number
-->
	
#### 3. Book (Take-home exercise)

<!--
### SOLUTION
	
#### Instance variables:
	
1. title: text
	
2. authors: text
	
3. genre: text
	
#### Instance methods:
	
none needed
-->
	
## Question 2 (Up to 10 minutes)

#### Part 1

Consider the following class definition:

```java
public class Date {
	public int day, month, year;
}
```

In a client code (outside the class `Date`), create an object to represent the date *13th April, 2011*. Also, draw the corresponding memory diagram. Point out the *reference* and the *instance* in that diagram.

<!--### Solution

```java
Date graduation = new Date();
graduation.day = 13;
graduation.month = 4;
graduation.year = 2011;
```-->

#### Part 2

**(Take-home exercise)** Consider the following class definition,

```java
public class Car {
	public String model;
	public int price;
}
```

In a client code (outside the class `Car`), create an object to represent a *Toyota Corolla* priced at *$21,999*. Also, draw the corresponding memory diagram. Point out the *reference* and the *instance* in that diagram.

<!--### Solution

  ```java
Car myCar = new Car();
myCar.model = "Toyota Corolla";
myCar.price = 21999;
```
-->

## Question 3 (Up to 15 minutes)

Consider the following class definition,

```java
public class Person {
	public String name;
	public int age;
}
```

List the mistakes (syntactical and logical) in the following constructor for class `Person`:

```java
public void person(String s, int a) {
	name = s;
	age = a;
}
```

<!--### Solution

1. Constructor should have no return type, not even void.
2. Name of constructor should be exactly the same as the class name. So, Person, not person.

Fixed constructor:

```java
public Person(String s, int a) {
	name = s;
	age = a;
}
```
-->

#### Part 2

Add a constructor to class `Person` with a single parameter for the instance variable `name`. The instance variable `age` should be set to 21.

<!--### Solution

```java
public Person(String s) {
	name = s;
	age = 21;
}
```
-->

#### Part 3 (take-home question)

Assuming the constructor has been added to class `Person` according to the previous part, will the following statement run successfully or result in a compilation error? Explain your answer. If there is a compilation error, what should be done to fix it?

```java
Person p = new Person();
```

<!--
### Solution

It will result in a compilation error since once parameterized constructors are defined, Java expects us to define the default constructor as well, and the default constructor that Java provides is no longer valid. The solution, therefore, is to add a default constructor.

```java
public Person() {
	name = "anonymous";
	age = 0;
}
```
-->

## Question 4 (Up to 20 minutes)

Consider the following class definition,

```java
public class Rectangle {
	public double width, height;
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}
}
```

### Part 1 (Up to 10 minutes)

What is the output of the following program?

```java
Rectangle r = new Rectangle(10, 20);
Rectangle s = new Rectangle(10, 20);
if(r == s) {
	System.out.println("Team Messi");
}
else {
	System.out.println("Team Ronaldo");
}
```

<!--### Solution
Team Ronaldo, because r and s are NOT reference copies. They refer to unique, albeit identical instances
-->

Now, to understand why you got the output that you got, draw a memory diagram and point out the references and instances in the diagram.

### Part 2 (Up to 10 minutes)

How many references and instances are created in the following code? Point them out in a memory diagram. Write down the values of each instance variable for each object in the memory when the `println` statement is reached. (`r.width`, `r.height`, `s.width`, `s.height`, `t.width`, `t.height`, `v.width`, `v.height`)

```java
Rectangle r = new Rectangle(2, 5);
Rectangle s = r;
Rectangle t = s;
Rectangle v = new Rectangle(10, 20);
r = v;
t.width = 50;
System.out.println("state of all objects");
```

<!--### Solution
4 References: r, s, t and v
2 Instances: new Rectangle(2, 5) and new Rectangle(10, 20)

`r.width = 10`, 
`r.height = 20`, 
`s.width = 2`, 
`s.height = 50`, 
`t.width = 2`, 
`t.height = 50`, 
`v.width = 10`, 
`v.height = 20`
-->

## Question 5 (Up to 10 minutes)

Consider the class `GoalScoringRecord` in the code for week 4. Complete the method `compareTo` so the corresponding test supplied in class `GoalScoringRecordTest` passes.

<!--### Solution
```java
	public int compareTo(GoalScoringRecord other) {
		double cr1 = this.conversionRate();
		double cr2 = other.conversionRate();
		if(cr1 > cr2) {
			return 1;
		}
		else if(cr1 < cr2) {
			return -1;
		}
		return 0;
	}
```
-->

## Question 6 (Up to 40 minutes)

Please watch this video before moving to Part 1.

[https://www.youtube.com/watch?v=Llnn9NDkYYI](https://www.youtube.com/watch?v=Llnn9NDkYYI)

### Part 1 (Up to 10 minutes)

In `Media.java`, complete the definition for the constructor, `totalFrameCount` and `compareTo`. Run the tests in `MediaTest.java` to ensure your implementation is correct.

<!--###Solution
```java
	public int compareTo(Media other) {
		int tfc1 = this.totalFrameCount();
		int tfc2 = other.totalFrameCount();
		if(tfc1 > tfc2) {
			return 1;
		}
		else if(tfc1 < tfc2) {
			return -1;
		}
		else {
			return 0;
		}
	}
```
-->

### Part 2 (Up to 10 minutes)

1. Place breakpoints on every single statment in `totalFrameCount` and `compareTo`. 
2. Add a breakpoint on line 7 (`int status = m1.compareTo(m2);`) in `MediaClient.java`. 
3. Click on the green bug sign to enter the Debug mode.
4. Trace the variables through each step of the debugging process by completing the following table:

|             Method            | Object | id of the instance to which object refers |
|:-----------------------------:|--------|:-----------------------------------------:|
|              main             | m1     |                                           |
|                               | m2     |                                           |
|           compareTo           | this   |                                           |
|                               | other  |                                           |
|  totalFrameCount (first time) | this   |                                           |
| totalFrameCount (second time) | this   |                                           |

<!--Solution
No solution provided for this one
-->

## Question 7 (Submission for week 4)

You should work on the practice package for **classesObjects** for the rest of the time. It's in `practicePackage.classesObjects.attempts`, corresponding tests under `practicePackage.classesObjects.testsAttempts`. There are a total of 25 tests across 4 stages. Each test is worth 4 marks. Your submission must pass at least 10 tests (any 10) to get a *pass* mark. 


For rules applicable to **all** assignment and weekly submissions, check iLearn. 
Time limit on execution: 5 seconds 

Make the submission by dragging the following files from package explorer into "Week 4 submission" by **Sunday 22st August, 21:00**. Only submit the files in which you finish one or more functions.

1. CarTrip.java
2. Job.java
3. Fraction.java
4. Time.java
5. CoffeeTracker.java
6. LargeInteger.java


