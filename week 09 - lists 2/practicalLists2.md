# Department of Computing, Macquarie University

## Practical - Lists 2

This week, we'll practise with,

- `ArrayList` of objects of user-defined classes, 
- `ArrayList` of `ArrayLists`, and, 
- iterators

The classes required (`Rectangle`, `Box`) are provided in [codes](./codes) directory.


### Question 1 (List of objects of user-defined classes)

1. Create an `ArrayList` of `Rectangle` objects named `rectangles`.
2. Add 100 rectangle objects, each with a random width between 1 and 10 (inclusive on both sides) and a random height between 1 and 10 (inclusive on both sides) to the list `rectangles`.
3. Create an `ArrayList` of `Box` objects named `boxes`.
4. Add 100 `Box` objects, each with a random width between 1 and 10 (inclusive on both sides) and a random height between 1 and 10 (inclusive on both sides) and a random depth between 1 and 10 (inclusive on both sides) to the list `boxes`.
5. Count the number of objects in the list `boxes` that have a width of 5 or more.
6. Find the sum of the volumes of the objects in the list `boxes` where the base has an area of 20 or more.

### Question 2 (List of Lists)

1. Create an `ArrayList` of `ArrayLists` of `Rectangle` objects named `matrix`. 
2. Add `rectangles` to `matrix`.
3. Display matrix. You should see an output beginning with two opening square brackets (`[[`) and ending with two closing square brackets (`]]`).
4. Calculate the total area of all the rectangles in the list `matrix` and display it.
5. Create an `ArrayList` of `Rectangle` objects named `fields`.
6. Add 3 rectangles of size (100, 160), (80, 60) and (150,75) to the list `fields`.
7. Append list `fields` to `matrix`.
8. Calculate the total area of all the rectangles in the list `matrix` and display it.


### Question 3 (Iterators)

1. Create an iterator and display each object in list `boxes` from the first item to the last item.
2. Create an iterator and display each object in list `boxes` from the last item to the first item.
3. Using an iterator, remove all objects from the list `boxes` that have square bases.
4. Using an iterator, add a unit `Box` object (of dimensions 1 by 1 by 1) **after** every item that has an even depth.
5. Using an iterator, add a unit `Box` object (of dimensions 1 by 1 by 1) **before** every item that has an even depth.


## Weekly submission

Lecture notes on [List of lists](http://software-technology.mattr.net.au/programming/listOfLists.html) will be of tremendous help. There are heaps of examples in there for you.

Download and import the project from [week9submissionTemplate.zip](https://github.com/gaurav1780/comp1010practicalClassMaterial/blob/master/week%2009%20-%20lists%202/codes/week9submissionTemplate.zip).

The class `ListOfListService` contains 15 functions that operate on lists of lists (all except countSquares operate on list of lists of Integer objects,
 whereas countSquares operates on list of lists of Rectangle objects).
 
Each method except getClean has two tests,
- *Basic* tests: assume none of the sublists are null, and none of the items within the sublists are null.
- *Comprehensive* tests: make no such assumption

Further instructions:

- Passing criteria for this week: 40 marks. Marks for each test are specified in the test file.
- Submit the file `ListOfListService.java` under `Week 9 Submission` box on iLearn.
- Standard rules for submissions listed on iLearn apply.
- Execution time limit: 5 seconds.