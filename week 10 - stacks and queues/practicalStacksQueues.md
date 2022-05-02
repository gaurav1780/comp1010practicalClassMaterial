# School of Computing, Macquarie University

## Practical - Stacks and Queues

This week, we'll practise with,

- Stacks
- Queues

### Question 1.

Consider the `MyStack` class in [./codes/MyStack.java](./codes/MyStack.java).

What is the status of the stack after each instruction of the following code?

```java
MyStack stk = new MyStack();
stk.push("This");
stk.push("is");
stk.push("great");
stk.push("news!");
System.out.println(stk.pop());
stk.push(stk.pop());
```

### Question 2.

Add an instance method `peek` in `MyStack` class that returns the top item, WITHOUT removing it.

### Question 3.

Add an instance method `clear` in `MyStack` class that clears the stack. As in removes all the items currently on the stack.

### Question 4.

Add a copy constructor in the `MyStack` class that creates an *effective* duplicate of the passed stack. It is critical that the state of the stack passed should not be altered. The template is provided below:

```java
public MyStack(MyStack source) {
	//to be completed
}
```

### Question 5.

Let's say we add another instance variable inside the `MyStack` class to hold the number of items currently in the stack - `nItems`. Which methods in the `MyStack` class would need to modified so that `nItems` holds the right value at any point of time? Make the required changes.

### Question 6.

Define a double-ended queue `DeQueue` based on [./codes/MyQueue.java](./codes/MyQueue.java). Items in a double-ended queue can be inserted and removed at the front or the end. The class should have the following methods (at least):

1. `insertAtFront`
2. `insertAtEnd`
3. `removeFromFront`
4. `removeFromEnd`
5. `Dequeue` (default constructor)
6. `toString`

Additionally, you can choose to keep an instance variable `nItems`. Based on that you may or may not need to define the instance method `size()`.

# Submission Task

### Due: 5pm (17:00:00) Sunday 15th May Sydney Time

* There are 35 test in `practicePackage._07_arrayBasedList.testsAttempts`.
* Complete the code in `practicePackage._07_arrayBasedList.attempts` so that at least 15 of the tests pass. 
* Each test is worth 3 marks.
* Marks are capped at 100.
* Standard rules listed on iLearn apply.
* Time limit: 5 seconds.

