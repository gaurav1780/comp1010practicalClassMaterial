# Department of Computing, Macquarie University

## Workshop - Lists

### All tasks must be completed in the file [MyArrayList.java](./codes/MyArrayList.java). 

You need to create a new Java project and add this file. To do this, choose 

- File
- New
- Java Project
- Name it `week10workshop`
- Copy [MyArrayList.java](./codes/MyArrayList.java), [MyArrayListTest.java](./codes/MyArrayListTest.java) and [Rectangle.java](./codes/Rectangle.java)
- Right-click on `src` folder of project `week10workshop` and choose `Paste`.

## Complete all methods in class `MyArrayList.java`. 

Specifications are provided as method header javadoc and tests are in `MyArrayListTest.java`.

Completing these tests will be very helpful for practical exam 3.

### IMPORTANT! 

Whenever you return a `Rectangle` object from a method or add a `Rectangle` object to the `Rectangle[]` data, you should do so in a manner that a *deep copy* is made. The advantage of doing so is that if the client modifies the object returned, the original copy is not modified.

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

You should return a deep copy of `r` as:

```java
return new Rectangle(r);
```

Similarly, when you want to set an array item to a `Rectangle r`, instead of assigning using `=` as:

```java
data[i] = r;
```

You should create a deep copy of `r` as:

```java
data[i] = new Rectangle(r);
```


## Advanced

### Advanced 1

In the class `MyArrayList`, define a method that when passed another `MyArrayList` object, returns a `MyArrayList` object containing all items of the calling object followed by all items of the parameter object.

### Advanced 2

Define a method `getUniqueValues`, that when passed an `ArrayList` of `ArrayList` of `Integer` objects (So, like a two-dimensional array), returns the items that appear exactly once in the two-dimensional list. The items should appear in the order of appearance from first sub-list to last sub-list, and items from within a sub-list should appear in that order.

Some input-output mappings:

- `null` --> `null`
- `[null, null, null]` --> `null`
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
- `[[10,70,20,90,20], [90,30], [80,80,80], null, [30,60,60]]` --> `[10,70,80]` 
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
