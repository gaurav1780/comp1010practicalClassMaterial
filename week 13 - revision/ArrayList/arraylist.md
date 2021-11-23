### Question 1

Create a reference copy and an instance copy of the following list

```java
ArrayList<Integer> list = new ArrayList<>();
list.add(10);
list.add(70);
list.add(20);
list.add(90);
```

### Question 2

Create a reference copy and an instance copy of the following list. No object in the instance copy should refer to the same object as the original list.

```java
ArrayList<ArrayList<Integer>> list = new ArrayList<>();
list.add(new ArrayList<Integer>(Arrays.asList(10, 70, 20, 90)));
list.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
list.add(null);
list.add(new ArrayList<Integer>(Arrays.asList(50, 100, 20, 150, 200)));
```

### Question 3

How many references and instances are there in the following list?

**TIP:** Draw the memory diagram.

```java
ArrayList<ArrayList<Integer>> list = new ArrayList<>();
list.add(new ArrayList<Integer>(Arrays.asList(10, 70, 20, 90)));
list.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
list.add(null);
list.add(new ArrayList<Integer>(Arrays.asList(50, 100, 20, 150, 200)));
```

### Question 4
Write one statement that changes the list `[10, 70, 20, 90]` into `[10, 70, 5, 20, 90]`.

### Question 5
Write one statement that changes the list `[10, 70, 20, 90]` into `[10, 5, 20, 90]`. Can you find at least 2 different ways to do this?

### Question 6
Write a function to see if an `ArrayList` of `Integer` objects contains at least one item more than `n`. What would be the input? What would be the return type?

### Question 7
Given the function in the previous question, which test cases would you pass to the function to see if it works?

**Tip:** There is more than one correct answer to this question. Consider which edge cases are usually passed to a function containing an `ArrayList`.
