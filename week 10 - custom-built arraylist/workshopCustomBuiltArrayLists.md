# Department of Computing, Macquarie University

## Workshop - Lists

### All tasks must be completed in the file `MyArrayList.java`.

You can find the files you need to work on in the package `practicalClassCode.week10` in the master source code project. 

## Complete all methods in class `MyArrayList.java`. 

Specifications are provided as method header javadoc and tests are in `MyArrayListTest.java`.

### IMPORTANT! 

Whenever you return a `Rectangle` object from a method or add a `Rectangle` object to the `Rectangle[]` data, you should do so in a manner that an *instance copy* is made. The advantage of doing so is that if the client modifies the object returned, the original copy is not modified.

The copy constructor is defined in class `Rectangle` as,

```java
//assume r is not null
public Rectangle(Rectangle r) {
	setWidth(r.width);
	setHeight(r.height);
}
```

So instead of returning a `Rectangle r` as:

```java
return r;
```

You should return an instance copy of `r` as:

```java
return new Rectangle(r);
```

Similarly, when you want to set an array item to a `Rectangle r`, instead of assigning using `=` as:

```java
data[i] = r;
```

You should create an instance copy of `r` as:

```java
data[i] = new Rectangle(r);
```

# Weekly submission task 

The weekly submission task can be found under the package practicePackage.lists.customBuiltLists.customArrayList. Complete and submit the file `CustomArrayList.java` on iLearn under [Week 10 submission](https://ilearn.mq.edu.au/mod/assign/view.php?id=5469277).
- `add(int)`
- `get(int)`
- `add(int, int)`
- `grow()`
- `grow(int)`
- `remove(int)`
- `replaceAll(int, int)`

**IMPORTANT**

`grow(int)` and `add(int)` are inter-dependent. so you need to implement both correctly for them to pass.

Other methods are also dependent on `add(int)` since items are being added using this method in the method `run` annotated with `@BeforeEach` (in order to set up the objects properly).

## Advanced
### Only complete these tasks after completing MyArrayList.java

### Advanced 1

In the class `MyArrayList`, define a method that when passed another `MyArrayList` object, returns a `MyArrayList` object containing all items of the calling object followed by all items of the parameter object.

### Advanced 2

Define a method `getUniqueValues`, that when passed an `ArrayList` of `ArrayList` of `Integer` objects (So, like a two-dimensional array), returns the items that appear exactly once in the two-dimensional list. The items should appear in the order of appearance from first sub-list to last sub-list, and items from within a sub-list should appear in that order.

Some input-output mappings:

- `null` --> `null`
- `[null, null, null]` --> `[]`
- `[[10,70,20,90,70], [90,20,30], [80, 20], null, [60, 60]]` --> `[10,30,80]` 
- `[[10,10], [20,20], [30,30]` --> `[]`
- `[[10,20], [20,30], [30,10]` --> `[]`

```java
public static ArrayList<Integer> getUniqueValues(ArrayList<ArrayList<Integer>> list) {
	return null; //to be completed
}
```

### Advanced 3

Modify the method `getUniqueValues` so that it returns an `ArrayList` of items that appear only in a single sub-list.

Items from within a sub-list should appear in that order.

Some input-output mappings:

- `null` --> `null`
- `[null, null, null]` --> `[]`
- `[[10,70,20,90,20], [90,30], [80,80,80], null, [30,60,60]]` --> `[10,70,20,80,60]` 
- `[[10,10], [20,20], [30,30]` --> `[10,20,30]`
- `[[10,20], [20,30], [30,10]` --> `[]`

```java
public static ArrayList<Integer> getItemsUniqueToSubLists(ArrayList<ArrayList<Integer>> list) {
	return null; //to be completed
}
```

### Advanced 4

Define a method that when passed an `ArrayList` of `Integer` objects, returns the longest sequence that occurs more than once in the list. Return first such sequence in case of a tie.

Some input-output mappings:

- `null` --> `null`
- `[10,70,20,90]` --> `[]`
- `[10,70,70,10]` --> `[10]`
- `[80,80,80]` --> `[80,80]`
- `[10,70,20,90,60,10,70,20,90]` --> `[10,70,20,90]`
- `[1,2,1,2,1,2,1,2]` --> `[1,2,1,2,1,2]`

```java
public static ArrayList<Integer> longestRepeatingSequence(ArrayList<Integer> list) {
	return null; //to be completed
}
```
