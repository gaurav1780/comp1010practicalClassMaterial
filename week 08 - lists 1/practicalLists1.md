# Department of Computing, Macquarie University

## Workshop - Lists 1

# Useful methods:

| Method                         | Description                                                                                                                                                                                                                                                             |
|--------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| int size()                     | It is used to return the number of elements present in the list. Example: list.size()                                                                                                                                                                                   |
| E get(int index)               | It is used to fetch the element from the particular position of the list. Examples: list.get(0), list.get(3), list.get(list.size()-5)                                                                                                                                   |
| boolean add(E e)               | It is used to fetch the element from the particular position of the list. Examples: list.add(1729) for list containing Integer objects list.add("Super") for String list list.add(new Rectangle(10, 5)) for Rectangle (user-defined) list                               |
| void add(int index, E element) | It is used to insert the specified element at the specified position in a list. Examples:  list.add(2, 1729) list.add(list.size(), false) list.add(5, "Nice!")                                                                                                          |
| void clear()                   | It is used to remove all of the elements from this list. Example: list.clear()                                                                                                                                                                                          |
| boolean isEmpty()              | It returns true if the list is empty, otherwise false. Example: list.isEmpty()                                                                                                                                                                                          |
| int indexOf(Object o)          | It is used to return the index in this list of the first occurrence of the specified element, or -1 if the List does not contain this element. Example: list.indexOf("Super")                                                                                           |
| int lastIndexOf(Object o)      | It is used to return the index in this list of the last occurrence of the specified element, or -1 if the list does not contain this element. Example: list.lastIndexOf("Mario")                                                                                        |
| boolean contains(Object o)     | It returns true if the list contains the specified element Example: list.contains("Doh!")                                                                                                                                                                               |
| E remove(int index)            | It is used to remove the element present at the specified position in the list. Examples: Integer itemRemoved = list.remove(5); //for list of Integer objects String removedVal = list.remove(3); //for list of String objects list.remove(0); //returned value ignored |
| boolean remove(Object o)       | It is used to remove the first occurrence of the specified element. Examples: boolean status = list.remove("Hello"); list.remove("Pi"); //returned value ignored                                                                                                        |
| E set(int index, E element)    | It is used to replace the specified element in the list, present at the specified position. Example: list.set(2, "Done"); //for list of String objects, replaces third item with "Done" list.set(5, 1729); //for list of Integer objects, replaces sixth item with 1729 |

### All tasks must be completed in the file [Client.java](./codes/Client.java). 

You need to create a new Java project and add this file. To do this, choose 

- File
- New
- Java Project
- Name it `week08practical`
- Copy [Client.java](./codes/Client.java) (or its contents) 
- Right-click on `src` folder of project `week08practical` and choose `Paste`.

## Question 1 through 10 are based on a list of String objects

### Outline

This is a practical class that gets to do the kind of practice on `ArrayList` objects that you will need in online quiz 3.

### Question 1

Write a piece of code inside the `main` function that creates an `ArrayList` named `words` that holds `String` objects.

### Question 2

Add the following items, in that order, to the list `words`:

- "I"
- "solemnly"
- "swear"
- "that"
- "I"
- "am"
- "upto"
- "no"
- "good."

### Question 3

Display the number of items in the list. Output should be of the form `Number of items in list: <value>`. All subsequent outputs should contain contextual information (in this case: `Number of items in list` is the contextual information).

### Question 4

Display the fifth item in the list. 	

### Question 5

Display the last item in the list. 

**DO NOT** hard-code the index (as `list.get(8)`).

### Question 6

Replace the fifth item by the String `"you"`. Display the list.

### Question 7

Remove the second item. Display the removed item (as `Removed item: <value>`). Display the list.	

### Question 8

Replace the fifth item by the String `"are"`. Display the list.

### Question 9

Add the String `"real"` before the last item. Display the list.

### Question 10

Store the number of items that have more than 4 characters in a variable `lengthyWordCount`. Display the value of `lengthyWordCount`. If you use an enhanced for-loop, you will not have to chain method calls. If you use a regular loop, you will have to chain, i.e. words.get(i).length().

## Question 11 through 15 are based on a list of `Integer` objects

### Question 11

Create a list holding `Integer` objects named `outcomes`. Add the following items to the list, in the given order:

6, 10, 8, 2, -5, 0, -12, 2, 3, 10, 2, -5

### Question 12

Store the number of negative items in the list in a variable `countNegatives`.

### Question 13

Store, in a variable `hasNeg`, the value `true`, if there are one or more negative items in the list, and `false` otherwise. Hint: you've already counted the number of negatives, no need to re-loop.

### Question 14

Store, in a variable `hasOverTen`, the value `true`, if there are one or more items with a value more than 10 in the list, and `false` otherwise.

### Question 15

The function `allPositives` is defined (after the `main` function). Call this function by passing the list `outcomes` and store the value returned by the function in a variable `allPos`. Display the value held by the variable `allPos`.

## Questions 16 to 21 are based on `ArrayList` objects being passed to functions
### Questions 16 to 21 have tests available in [ClientTest.java](./codes/ClientTest.java). 

### Question 16

Call the function `allPositives` by passing a `null` value, as allPositives(null), and store the value returned by the function in a variable `allPosNull`. Display the value held by the variable `allPosNull `. You will see the value you get is `false`. This is an example of why a *null check* is desirable. Without it, we'd get a `NullPointerException` when operating on a `null` object.

### Question 17

Define a function `allEven` on the lines of `allPositives` that returns `true` if all items of the passed list are even (divisible by 2) and false otherwise. Tests provided in [ClientTest](./codes/ClientTest.java). Note that when you add the test file to the project, you will need to import Java 5 library. To do this, click on the red cross on the first line of `ClientTest`, choose `Fix Project Setup`, and then `Add Junit 5 library..."

## Question 18

Define a function `countInRange` from scratch (no header provided) that when passed,

1. An `ArrayList` of `Integer` objects (call it `list`),
2. An `Integer` (call it `min`),
3. An `Integer` (call it `max`). Assume `max` \>= `min`.

returns the number of items in `list` that are in the range `[min...max]`. Return 0 if the list is `null` or empty.

Once you define the function, uncomment the test function `testCountInRange` in class `ClientTest` and run it.

## Question 19

Define a function `squared` that when passed an `ArrayList` of `Integer` objects, squares all items of list. So if the list that is passed is `[3, 1, 7]`, after the function executes, it becomes `[9, 1, 49]`. Do nothing if the list is `null`.

Hint: the methods on `ArrayList` that you’ll need are,

- `size()`
- `get(int)`
- `set(int, Object)`

## Question 20

Define a function `removeNegatives` that when passed an `ArrayList` of `Integer` objects, removes all negative items. So if the list that is passed is `[-5, -7, 6, 0, -5, -1, -8, 3, 0, 0, 2, -7, -3]`, after the function executes, it becomes `[6, 0, 3, 0, 0, 2]`. Do nothing if the list is `null`.

Hint: the methods on `ArrayList` that you’ll need are,

- `size()`
- `get(int)`
- `remove(int)`

## Question 21 (HD level) 

Define a function `getExclusiveItems` that when passed an `ArrayList` of `ArrayList` of `Integer` objects (`ArrayList<ArrayList<Integer>>`), returns an `ArrayList` of `Integer` objects containing items that are exclusive to each sub-list. For example, if the list passed is [[8, 1, 4, 2, 4, 2, 1], [6, 4, 9, 8, 8, 8], [5, 3, 8, 8, 5, 6]], the function should return an `ArrayList` containing [1, 2, 2, 1, 9, 5, 3, 5] since 1, 2, 2, 1 occur only in the first sub-list, 9  occurs only in the second sub-list and 5, 3, 5 occur only in the third sub-list.

# Weekly submission

**IMPORTANT: Due Tuesday 5th October 9pm (21:00:00) because of assignment 2 being due on 3rd October.** 

Late submissions not accepted. 

This week, we are working with practice package for built-in lists. 

Relevant package: `practicePackage` -> `builtInLists` in the master project.

Hurdle requirement:

- Standard rules apply.
- You can use functions in the file submitted, and besides those, only those methods that operates on an `ArrayList` object.
- Stage 1 is not assessed but it will help you to solve Stage 1 functions to be better prepared for later stages.
- Each function in Stage 2 is worth 2 marks. 
- Each function in Stage 3 is worth 3 marks.
- Each function in Stage 4 is worth 6 marks.
- We suggest (recommended, but not required) solving functions implementing a variety of algorithms from Stage 2. For example, the following five each implements a different algorithm:
	- `sumNegatives`
	- `countEven`
	- `containsInRange`
	- `allPositives`
	- `isDescending`
- To clear the weekly hurdle, you must solve at least -
  - 10 functions from Stage2, **and**, 
  - 5 functions from Stage3.
- If you don't meet the hurdle requirements, marks will be capped at 34.
- If you meet the hurdle requirements, marks will be capped at 100.
- You can drag and drop `Stage2.java`, `Stage3.java`, and `Stage4.java` into Week 8 submission. 
- Time limit for this week: 5 seconds.
