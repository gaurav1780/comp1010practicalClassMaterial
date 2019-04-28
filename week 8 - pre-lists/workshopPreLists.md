# Department of Computing, Macquarie University

## Workshop - A preview of lists

### Outline

This is a demonstrative workshop to introduce `lists`. The next week's workshop will be a more comprehensive one on the same topic.

- 6 - 15 minutes: the problem with arrays
- 16 - 25 minutes: the `list` interface and methods
- 26 - 35 minutes: types of `lists` (`ArrayList` and `LinkedList`)
- 36 - 50 minutes: examples of creating, and operating on, `list` objects
- 51 - 60 minutes: examples of passing `list` objects to methods
- 61 - 115 minutes: a practice project

## The problem with arrays

As a group, think about why arrays are not ideal containers to hold collection of values.

## The `list` interface

List is an interface in Java (for the time being, just assume that an interface is a collection of method headers - very loose definition but it will do for now).


The **most frequently used** methods from `List` are:

| Method                    | Description                                                                                         |
|---------------------------|-----------------------------------------------------------------------------------------------------|
| `get(int): Object`          | returns Object at passed index (IndexOutOfBoundsException if the index is out of range)             |
| `size(): int`               | returns number of items in the list (0 if empty)                                                    |
| `add(Object)`               |  adds passed object at the end of the list (IndexOutOfBoundsException if the index is out of range) |
| `add(int, Object)`          | adds (at the given index) the object passed (IndexOutOfBoundsException if the index is out of range)                                              |
| `remove(int): Object` | removes and returns Object at given index. (IndexOutOfBoundsException if the index is out of range)                                  |
| `remove(Object): boolean` | removes first occurrence of given Object and returns `true`. Returns `false` if item not found |
| `contains(Object): boolean` | returns true if passed object exists in the list, false otherwise                                   |
| `indexOf(Object): int`      | returns first index at which passed object exists (-1 if it doesn't exist in the list)              |
| `lastIndexOf(Object): int`      | returns last index at which passed object exists (-1 if it doesn't exist in the list)              |
| `toString():String`         | returns String representation of the list (comma-separated items inside square brackets)            |

## Classes implementing List interface

The two classes that implement the methods from `List` interface are: (**Details discussed in the lectures**)

- **ArrayList** 
- **LinkedList** 

## Creating and operating on List objects

**IMPORTANT: Students should pair up for this activity**. First person does odd-numbered activities, second person does even-numbered activities. 

### Creating a list

A list cannot hold variables of primitive data types (like `int`, `boolean`, `double`, `char`). Instead it must hold objects of corresponding classes provided by Java (`Integer`, `Boolean`, `Double`, `Character` respectively)

A list is typically parameterized with the type of objects it must hold. 

For those interested in learning about this, check out [Java Generics](https://docs.oracle.com/javase/tutorial/java/generics/index.html)

#### 1. Creating a List

```java
ArrayList<Integer> list = new ArrayList<Integer>();
```

This creates a list that can hold integer values (as Integer objects).

You can similarly create a `LinkedList` object as,


```java
LinkedList<Double> grades = new LinkedList<Double>();
```

#### **Student activity 1**: 

Create a list (as an `ArrayList`) to hold outcomes of a dice roll. The dice can be rolled an arbitrary number of times. Give it the name `outcomes`.

**NOTE:** You will need to import `ArrayList` library to do this. To import the library, hover over the keyword `ArrayList` and choose the option `import ArrayList (java.util)`.

#### 2. Storing list contents in a String or displaying it

When you display a `list` object, `toString` is invoked and displays the items inside square brackets. You can also store the outcome in a `String` by explicitly calling `toString`.

```java
System.out.println(list);     //toString() called, displays [30, 10, 70, 30]
String rep = list.toString(); //rep = "[30, 10, 70, 30]"
```

#### **Student activity 2**: 

Display the list `outcomes`. You should see the output `[]`.

#### 3. Adding items at the end

```java
list.add(10);
list.add(70);
list.add(20);
list.add(90);
//list = [10, 70, 20, 90]
```

Inside object `list`, the values are held in an instance variable array named `elementData`. Thus, in this case, `list.elementData = {10, 70, 20, 90}`

NOTE: A `LinkedList` holds objects differently from an `ArrayList`. We'll talk more about that later.

#### **Student activity 3**: 

Add the items 5, 6, and 2 (in that order) to `outcomes`. Display the list. You should see the output `[5, 6, 2]`.

#### 4. Getting number of items in a list

The method `size()` returns the number of items in a list. Returns `null` if empty. Throws `NullPointerException` if list is `null`.

```java
//assuming list = [10, 70, 20, 90]
int n = list.size(); //size = 4
```

#### **Student activity 4**: 

Store the number of items in list `outcomes` in a variable `nRolls`. Display `nRolls`. You should see the output 3.


#### 5. Getting item at a specific index

The method `get(int)` returns the item at passed index. Throws `NullPointerException` if list is `null`. Throws `IndexOutOfBoundsException` if index is invalid. 

```java
//assuming list = [10, 70, 20, 90]
int a = list.get(0); //a = 10
int b = list.get(list.size()-1); //b = 90 (last item)
int c = list.get(-3); //throws IndexOutOfBoundsException
ArrayList<Integer> nullList = null;
int d = nullList.get(0); //throws NullPointerException
```

#### **Student activity 5**: 

Store the first item of list `outcomes` in variable `first`. Display `first`. You should see the output 5.

Store the last item of list `outcomes` in variable `last`. **Do not hard-code the index as 2.** Assume you don't know the number of items in the list. Display `last`. You should see the output 2.

#### 6. Adding items at arbitrary index

```java
list.add(0, 30);
//list = [30, 10, 70, 20, 90]

list.add(2, 4);
//list = [30, 10, 4, 70, 20, 90]

list.add(list.size(), 30); //after the last item
//list = [30, 10, 4, 70, 20, 90, 30]

list.add(20, -60); //throws IndexOutOfBoundsException
```

#### **Student activity 6**: 

Add the item 4 between the first two items (5 and 6) of list `outcomes`. Display the list. You should see the output `[5, 4, 6, 2]`.


#### 7. Removing an item at a specific index

```java
list.remove(5);
//list = [30, 10, 4, 70, 20, 30]

list.remove(-3); //throws IndexOutOfBoundsException

list.remove(6); //throws IndexOutOfBoundsException
```

#### **Student activity 7**: 

Remove the first item from list `outcomes`. Display the list. You should see the output `[4, 6, 2]`.

Remove the last item from list `outcomes`. **Do not hard-code the index as 3**.
Assume that you do not know how many items are in the list. Display the list. You should see the output `[4, 6]`.

#### 8. Removing a specific object

The only scenario in which this is tricky is a list containing Integers, because the type of the object and the type of the index is the same (int or Integer).

```java
list.remove(4); 
//removes item at index 4, not the item 4. list = [30, 10, 4, 70, 30]

//if you want to remove THE ITEM 4, you must pass it as Integer object

list.remove((Integer)4); 
//removes item 4. list = [30, 10, 70, 30]
```

#### **Student activity 8**: 

Remove the item 4 from list `outcomes`. Display the list. You should see the output `[6]`.

Re-populate the list by adding the items 3, 5, and 2 (in that order) to `outcomes`. Display the list. You should see the output `[6, 3, 5, 2]`.

#### 9. Iterating over the list

Following example adds the items in the list

```java
int total = 0;
for(int i=0; i < list.size(); i++) {
	total = total + list.get(i);
}
//total = 30+10+70+30 = 140
```

#### **Student activity 9**: 

Count the number of items in `outcomes` that are greater than 2. Store in variable `moreThanTwo`. Display `moreThanTwo`. You should see the output 3.


#### 10. Checking existence and location of items in list
	
```java
//note: list = [30, 10, 70, 30]
boolean flag = list.contains(10);   //flag = true
boolean status = list.contains(20); //status = false

int idx1 = list.indexOf(70);        //idx1 = 2
int idx2 = list.indexOf(40);        //idx2 = -1
int idx3 = list.indexOf(30);        //idx3 = 0
int idx4 = list.lastIndexOf(30);    //idx4 = 3
```

#### **Student activity 10**: 

Add item 6 to the list. The list should now become `[6, 3, 5, 2, 6]`.
Display the first index at which the item 6 exists in list `outcomes`. You should see the output 0.
Display the last index at which the item 6 exists in list `outcomes`. You should see the output 4.
Display the first index at which the item 1 exists in list `outcomes`. You should see the output -1.

### Passing lists to objects

Lists are passed just like an array or an object. If you modify the contents of a list in a method, contents of the actual list that was passed are also modified.

Examples are provided in `ListMethods.java` in the project contained in archive file [workshopPreLists.zip](./codes/workshopPreLists.zip).

## Practice project 

Solve the tasks in `ListPractical.java` in the project contained in archive [workshopPreLists.zip](./codes/workshopPreLists.zip). Tests are provided in `ListPracticalTest.java`.
