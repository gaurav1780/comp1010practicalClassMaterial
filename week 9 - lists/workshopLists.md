# Department of Computing, Macquarie University

## Workshop - Lists

### All tasks must be completed in the file [Client.java](./codes/Client.java). You need to create a new Java project and add this file.

## Question 1 through 10 are based on a list of String objects

### Outline

This is a workshop that gets to do the kind of practice on dock
`List` objects that you will need in practical exam 3.

### Question 1

Write a piece of code inside the `main` method that creates an `ArrayList` named `words` that holds `String` objects.

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

Display the last item in the list. **DO NOT** hard-code the index as `list.get(8)`.

### Question 6

Replace the fifth item by the String `you`. Display the list.

### Question 7

Remove the second item. Display the removed item (as `Removed item: <value>`). Display the list.	

### Question 8

Replace the fifth item by the String `you`. Display the list.

### Question 9

Add the String `real` before the last item. Display the list.

### Question 10

Store the number of items that have more than 4 characters in a variable `lengthyWordCount`. Display the value of `lengthyWordCount`.

## Question 11 through 15 are based on a list of Integer objects

### Question 11

Create a list holding `Integer` objects named `outcomes`. Add the following items to the list, in the given order:

6, 10, 8, 2, -5, 0, -12, 2, 3, 10, 2, -5

### Question 12

Store the number of negative items in the list in a variable `countNegatives`.

### Question 13

Store, in a variable `hasNeg`, the value `true`, if there are one or more negative items in the list, and `false` otherwise.

### Question 14

Store, in a variable `hasOverTen`, the value `true`, if there are one or more items with a value more than 10 in the list, and `false` otherwise.

### Question 15

The method `allPositives` is defined (after the `main` method). Call this method by passing the list `outcomes` and store the value returned by the method in a variable `allPos`. Display the value held by the variable `allPos`.

## Questions 16 to 21 are based on ArrayList objects being passed to methods

### Question 16

Call the method `allPositives` by passing a `null` value, as allPositives(null), and store the value returned by the method in a variable `allPosNull`. Display the value held by the variable `allPosNull `. You will see the value you get is `false`. This is an example of why a *null check* is desirable. Without it, we'd get a `NullPointerException` when operating on a `null` object.

### Question 17

Define a method `allEven` on the lines of `allPositives` that returns `true` if all items of the passed list are even (divisible by 2) and false otherwise. Tests provided in [ClientTest](./codes/ClientTest.java). Note that when you add the test file to the project, you will need to import Java 5 library. To do this, click on the red cross on the first line of `ClientTest`, choose `Fix Project Setup`, and then `Add Junit 5 library..."

## Question 18

Define a method `countInRange` from scratch (no header provided) that when passed,

1. An ArrayList of Integer objects (call it `list`),
2. An integer (call it `min`),
3. An integer (call it `max`). Assume `max` $\geq$ `min`.

returns the number of items in `list` that are in the range `[min...max]`. Return 0 if the list is `null` or empty.

Once you define the method, uncomment the test method `testCountInRange` in class `ClientTest` and run it.

## Question 19

Define a method `squared` that when passed an ArrayList of Integer objects, squares all items of list. So if the list that is passed is `[3, 1, 7]`, after the method executes, it becomes `[9, 1, 49]`. Do nothing if the list is `null`.

Hint: the methods on ArrayList that you’ll need are,

- size()
- get(int index)
- set(int index, int value)

## Question 20

Define a method `removeNegatives` that when passed an ArrayList of Integer objects, removes all negative items. So if the list that is passed is `[-5, -7, 6, 0, -5, -1, -8, 3, 0, 0, 2, -7, -3]`, after the method executes, it becomes `[6, 0, 3, 0, 0, 2]`. Do nothing if the list is `null`.

Hint: the methods on ArrayList that you’ll need are,

- size()
- get(int index)
- set(int index, int value)

## Question 21 (HD level) 

Define a method `getExclusiveItems` that when passed an ArrayList of ArrayList of Integer objects (ArrayList<ArrayList<Integer>>), returns an ArrayList of Integer objects containing items that are exclusive to each sub-list. For example, if the list passed is [[8, 1, 4, 2, 4, 2, 1], [6, 4, 9, 8, 8, 8], [5, 3, 8, 8, 5, 6]], the method should return an ArrayList containing [1, 2, 2, 1, 9, 5, 3, 5] since 1, 2, 2, 1 occur only in the first sub-list, 9  occurs only in the second sub-list and 5, 3, 5 occur only in the third sub-list.






