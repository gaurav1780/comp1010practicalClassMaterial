### Question 1

What is the value returned by `sumEven(4)`?  
What is the value returned by `sumEven(7)`?
How many times (including the initial call) is the function `sumEven` called if the initial call is `sumEven(7)`?  
How would you modify the function `sumEven` to make it tail recursive?

```java
public int sumEven(int n) {
  if(n <= 0) {
    return 0;
  }
  if(n%2 != 0) {
    return sumEven(n - 1);
  }
  return n + sumEven(n - 2);
}
```

### Question 2

What is the value returned by `foo("COMP1010")`?  
What is the value returned by `foo("avatar")`?
How many times (including the initial call) is the function `foo` called if the initial call is `foo("avatar")`?  
How would you modify the function `foo` to make it tail recursive?

```java
public int foo(String str) {
  if(str.isEmpty()) {
    return 0;
  }
  if(str.charAt(0) == 'a') {
    return 1 + foo(str.substring(1));
  }
  return foo(str.substring(1));
}
```

### Question 3

What is the value returned by `foo("COMP1010", 'a')`?
What is the value returned by `foo("COMP1010", 'M')`?  
What is the value returned by `foo("avatar", 'a')`?
How many times (including the initial call) is the function `foo` called if the initial call is `foo("avatar", 'a')`?  
How would you modify the function `foo` to make it tail recursive?

```java
public int foo(String str, char c) {
  if(str.isEmpty()) {
    return 0;
  }
  if(str.charAt(0) == c) {
    return c + 'b' + foo(str.substring(1));
  }
  return str.charAt(0) + foo(str.substring(1));
}
```

### Question 4

What is the value returned by `foo({10, 70, 20, 90}, {1, 2, 3, -1}, 0)`?
What is the value returned by `foo({10, 70, 20, 90}, {3, -1, 0, 1}, 0)`?  
What is the value returned by `foo({10, 70, 20, 90}, {3, -1, 0, 1}, 3)`?
How many times (including the initial call) is the function `foo` called for each of the inputs above?
How would you modify the function `foo` to make it tail recursive?
**ADVANCED** How would you modify the function to identify and break infinite loops? Examples of this would be `foo({10, 20}, {1, 0}, 0)` and `foo({10}, {0}, 0)`

```java
public int foo(int[] data, int[] parent, int idx) {
  if(data == null || parent == null || idx == -1) {
    return 0;
  }
  return data[idx] + foo(data, parent, parent[idx]);
}
```

### Question 5

Fill in the table of what `foo(n)` returns

| n | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |
|---|---|---|---|---|---|---|---|---|---|
|value | 1 | 1 |   |   |   |   |   |   |   |


How many times (including the initial call) is the function `foo` called if the initial call is `foo(5)`?  
**ADVANCED:** How would you modify the function `foo` so that it can make a linear amount of function calls?

```java
public int foo(int n) {
  if(n < 3) {
    return 1;
  }
  return foo(n - 1) + (2 * foo(n - 2));
}
```
