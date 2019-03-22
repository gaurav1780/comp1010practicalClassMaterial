# Department of Computing, Macquarie University

## Workshop - Classes and Objects

### Outline

- designing a class
- creating objects
- getters and setters
- constructors
- compareTo
- 

## Question 1

Design classes (no implementation) that encapsulate the following real life entities. Add up to three instance variables for each class. Select the three most important attributes if you think a class has more than three attributes.

1. Person
2. Cylinder
3. Book (Take-home exercise)

## Question 2

### Part 1

Consider the following class definition:

```java
public class Date {
        public int date, month, year;
}
```

In a client code (outside the class `Date`), create an object to represent the date *13th April, 2011*.

<!--### Solution

```java
Date graduation = new Date();
graduation.day = 13;
graduation.month = 4;
graduation.year = 2011;
```-->

### Part 2

For the same class definition (`Date`), draw the memory diagram that represents the following objects. Please refer to the lecture notes to see the representation scheme we have established.

```java
Date bday = new Date();
bday.day = 31;
bday.month = 7;
bday.year = 1980;

Date anniversary = null;
```

### Part 3

**(Take-home exercise)** Consider the following class definition,

```java

public class Car {
        public String model;
        public int price;
}
```

In a client code (outside the class `Car`), create an object to represent a *Toyota Corolla* priced at *$21,999*.

<!--### Solution

  ```java
Car myCar = new Car();
myCar.model = "Toyota Corolla";
myCar.price = 21999;
```
-->

## Question 3

### Part 1

Consider the following class definition:

```java
public class Person {
        public String name;
        public int age;
}
```

With the help of an example, explain why it's a bad idea for the instance variables to be public.

<!--### Solution

```java
Person p = new Person();
p.name = "Hagrid";
p.age = -6; //OOPS!
```
-->

### Part 2

Solve the problem of public instance variables in the previous part by first changing visibility of the instance variables of class `Person` to `private` and then adding **getters** and **setters**. **Age of person cannot be negative**. If the user tries to assign a negative value to a person's age, the person's age should be set to 0.

<!--### Solution

```java
public class Person {
        private String name;
        private int age;
        
        //setters
        public void setName(String str) {
                name = str;
        }
        
        public void setAge(int a) {
                if(a <= 0)
                        age = 0;
                else
                        age = a;
        }
        
        public String getName() {
                return name;
        }
        
        public int getAge() {
                return age;
        }
}
```
-->

### Part 3

Declare and instantiate an object `baddy` of class `Person` written in the previous part, representing a person named *Tom Marvolo Riddle* aged *71*.

<!--### Solution
```java
Person baddy = new Person();
baddy.setName("Tom Marvolo Riddle");
baddy.setAge(71);
```
-->

### Part 4

Declare and instantiate an object `goody` of class `Person` written in the previous part, representing a person named *Luna Lovegood*. **Try** and assign the value -6 to her age. Display the values of the instance variables on the console. Luna's age should be displayed as zero (0).

<!--### Solution

```java
Person goody = new Person();
goody.setName("Luna Lovegood");
goody.setAge(-6);
System.out.println(goody.getName()); //"Luna Lovegood"
System.out.println(goody.getAge()); //0
```
-->

### Part 5

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
3. Constructor should call setters to assign values to instance variables.

Fixed constructor:

```java
public Person(String s, int a) {
        setName(s);
        setAge(a);
}
```
-->

### Part 6

Add a constructor to class Person with a single parameter for the instance variable name. The instance variable age should be set to 21.

<!--### Solution

```java
public Person(String s) {
        setName(s);
        setAge(18); //setter is used here as a best practice.
)
```
-->

### Part 7 (take-home question)

Assuming the constructor has been added to class `Person` according to the previous part, will the following statement run successfully or result in a compilation error? Explain your answer. If there is a compilation error, what should be done to fix it?

```java
Person p = new Person();
```

<!--### Solution

It will result in a compilation error since once parameterized constructors are defined, Java expects us to define the default constructor as well, and the default constructor that Java provides is no longer valid. The solution, therefore, is to add a default constructor.

```java
public Person() {
        setName("anonymous");
        setAge(0);
}
```-->

## Question 4 - JUnit Testing

We can test the correctness of individual methods through running JUnit tests on them.

In the project that you imported, open file RectangleTest.java and run it. You will see a green bar and a message that 5 out of 5 tests have passed (0 errors and 0 failures).

Now open the file AllInOneTest.java and run the tests. You will see that two tests pass while one fails. The tests that pass are:

`testIsSquare: This tests the method isSquare from class AllInOne.
testAllSquares: This tests the method allSquares from class AllInOne.
The test that fails is:

testCountPositiveEvens: This tests the method countPositiveEvens from class AllInOne.
Your job is to complete the method countPositiveEvens so the test testCountPositiveEvens passes.

IMPORTANT: Note that the method should return 0 if the array passed is null. This is the first thing you should check in the method.

Solution

Refer to project in Eclipse archive file week3solution.zip

## Question 5 - compareTo method

Consider the class GoalScoringRecord in the project imported. Complete the method compareTo so the corresponding test supplied in class GoalScoringRecordTest passes.

Solution

Refer to project in Eclipse archive file week3solution.zip
view rawworkshopClassesAndObjects1.md hosted with ❤ by GitHub

## Question 6

For the [`Rectangle`](./codes/Rectangle.java) class definition, consider the following client code (outside `Rectangle` class):

```java
Rectangle[] data = new Rectangle[5];
```

1.	Draw the memory diagram representing the storage of array `data`.
2.	What is the output of the following client code:

	```java
	for(Rectangle temp: data) {
		System.out.println(temp);
	}
	```

	### SOLUTION
	```bash
	null
	null
	null
	null
	null
	```

3. 	Instantiate each item of the array so that,
	- the first item represents a square with `width=1, height=1`.
	- the second item represents a square with `width=2, height=2`.
	- the third item represents a square with `width=3, height=3`.
	- the fourth item represents a square with `width=4, height=4`.
	- the fifth item represents a square with `width=5, height=5`.

	## SOLUTION
	
	```java
	for(Rectangle temp: data) {
		temp = new Rectangle(i+1); //square constructor exists
	}
	```

4. 	Draw the updated memory diagram after the items have been instantiated.

## Question 7

Complete the method `countSquares` that when passed an array of [`Rectangle`](./codes/Rectangle.java) objects, returns the number of squares in the array. Note that the class `Rectangle` contains an intance method `isSquare` that you can call.

You may assume that the array passed and also every `Rectangle` in the array is instantiated. For a more comprehensive design, avoid that assumption, so the array might be uninstantiated or null, or if it is (instantiated), some `Rectangle` objects in the array might be uninstantiated or null.


```java
public static int countSquares(Rectangle[] data) {
	return 0; //to be completed
}
```

Test your implementation using the following test case:

```java
@Test
public void testCountSquares() {
	Rectangle[] data = new Rectangle[5];
	for(Rectangle temp: data) {
		temp = new Rectangle(i+1); //square constructor exists
	}
	//all are squares
	assertEquals(5, Questionxx.countSquares(data));
	
	data[0] = new Rectangle(1, 5); //first no longer a square
	assertEquals(4, Questionxx.countSquares(data));

	data[4] = new Rectangle(1, 5); //last no longer a square	
	assertEquals(3, Questionxx.countSquares(data));

	data[1] = new Rectangle(1, 5); //second no longer a square	
	data[2] = new Rectangle(1, 5); //third no longer a square	
	data[3] = new Rectangle(1, 5); //fourth no longer a square	
	assertEquals(0, Questionxx.countSquares(data));
}
```

## SOLUTION
	
#### Without assumption:

```java
public static int countSquares(Rectangle[] data) {
	int count = 0;
	for(Rectangle r: data) {
		if(r.isSquare()) {
			count++;
		}
	}
	return count;
}
```

#### Without assumption:

```java
public static int countSquares(Rectangle[] data) {
	if(data == null) { //nothing inside
		return 0;
	}
	
	int count = 0;
	for(Rectangle r: data) {
		if(r != null && r.isSquare()) { //first make sure it's not null
			count++;
		}
	}
	return count;
}
```

# ADVANCED QUESTIONS (HD level)

1. Write a method that when passed an array of `Rectangle` objects, returns a two-dimensional array of `Rectangle` objects (say `buckets`), such that -

	- all objects in the one-dimensional array `buckets[0]` have the same area,
	- all objects in the one-dimensional array `buckets[1]` have the same area, 
	- all objects in the one-dimensional array `buckets[2]` have the same area, 
	- all objects in the one-dimensional array `buckets[3]` have the same area, 
	- and so on...
