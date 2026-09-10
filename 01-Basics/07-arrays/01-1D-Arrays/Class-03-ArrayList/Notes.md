 # ArrayList — Basics and Common Operations

## 1. What is ArrayList?

`ArrayList` is a resizable array implementation provided by Java.

Unlike a normal array, whose size is fixed after creation, an
`ArrayList` can grow or shrink dynamically.

Array:

```java
int[] arr = new int[5];
```

The size is fixed at `5`.

ArrayList:

```java
ArrayList<Integer> list = new ArrayList<>();
```

The size can change dynamically.

---

# 2. Import ArrayList

`ArrayList` belongs to the `java.util` package.

```java
import java.util.ArrayList;
```

---

# 3. Creating an ArrayList

Syntax:

```java
ArrayList<Integer> list = new ArrayList<>();
```

Example:

```java
ArrayList<Integer> numbers = new ArrayList<>();

numbers.add(10);
numbers.add(20);
numbers.add(30);
```

The list becomes:

```text
[10, 20, 30]
```

---

# 4. ArrayList with Different Data Types

ArrayList works with objects, so we use wrapper classes instead of
primitive types.

Examples:

```java
ArrayList<Integer> numbers = new ArrayList<>();
ArrayList<Double> values = new ArrayList<>();
ArrayList<String> names = new ArrayList<>();
ArrayList<Boolean> flags = new ArrayList<>();
```

We cannot write:

```java
ArrayList<int> numbers;
```

Instead:

```java
ArrayList<Integer> numbers;
```

---

# 5. `add()`

`add()` is used to add an element to the ArrayList.

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);
```

Result:

```text
[10, 20, 30]
```

---

# 6. Add an Element at a Specific Index

We can also specify the index.

```java
list.add(1, 50);
```

If the original list is:

```text
[10, 20, 30]
```

After:

```java
list.add(1, 50);
```

Result:

```text
[10, 50, 20, 30]
```

Elements from that position are shifted to the right.

---

# 7. `get()`

`get(index)` is used to read an element.

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);

System.out.println(list.get(1));
```

Output:

```text
20
```

ArrayList indexing starts from `0`, just like arrays.

---

# 8. `set()`

`set()` is used to replace an existing element.

```java
list.set(1, 100);
```

Before:

```text
[10, 20, 30]
```

After:

```text
[10, 100, 30]
```

Important:

`set()` replaces an element.

It does NOT insert a new element.

---

# 9. `remove()`

We can remove an element using its index.

```java
list.remove(1);
```

Example:

Before:

```text
[10, 20, 30]
```

```java
remove(1)
```

After:

```text
[10, 30]
```

---

# 10. `size()`

`size()` returns the number of elements in an ArrayList.

```java
System.out.println(list.size());
```

Example:

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);

System.out.println(list.size());
```

Output:

```text
3
```

### Important Difference

Array:

```java
arr.length
```

ArrayList:

```java
list.size()
```

`length` is a property.

`size()` is a method.

---

# 11. `contains()`

`contains()` checks whether an element exists.

```java
System.out.println(list.contains(20));
```

Output:

```text
true
```

If the element doesn't exist:

```text
false
```

---

# 12. `indexOf()`

`indexOf()` returns the index of an element.

```java
int index = list.indexOf(30);
```

If `30` is present at index `2`:

```text
2
```

If the element does not exist:

```text
-1
```

---

# 13. `isEmpty()`

`isEmpty()` checks whether the ArrayList contains no elements.

```java
if (list.isEmpty()) {
	System.out.println("List is empty");
}
```

It returns:

```text
true
```

or:

```text
false
```

---

# 14. `clear()`

`clear()` removes all elements.

```java
list.clear();
```

Example:

Before:

```text
[10, 20, 30]
```

After:

```text
[]
```

---

# 15. Traversing an ArrayList

We can use a normal `for` loop.

```java
for (int i = 0; i < list.size(); i++) {
	System.out.println(list.get(i));
}
```

Notice:

```java
list.size()
```

and:

```java
list.get(i)
```

---

# 16. Enhanced For Loop

We can also use the enhanced `for` loop.

```java
for (int value : list) {
	System.out.println(value);
}
```

This is useful when we only need the values and don't need the index.

---

# 17. Important ArrayList Functions

| Function | Purpose |
|---|---|
| `add()` | Add element |
| `add(index, value)` | Add at specific index |
| `get(index)` | Read element |
| `set(index, value)` | Replace element |
| `remove(index)` | Remove element |
| `size()` | Number of elements |
| `contains(value)` | Check if element exists |
| `indexOf(value)` | Find first index |
| `isEmpty()` | Check whether list is empty |
| `clear()` | Remove all elements |

---

# 18. Program — Return All Even Numbers

## Problem

Given an ArrayList, return all the even numbers.

Example:

```text
Input:
[10, 15, 22, 31, 40, 57]

Output:
[10, 22, 40]
```

## Approach

1. Create an empty ArrayList for the result.
2. Traverse the original ArrayList.
3. Check whether each element is divisible by `2`.
4. If it is even, add it to the result.
5. Return the result.

Condition:

```java
value % 2 == 0
```

## Program

```java
import java.util.ArrayList;

public class EvenNumbers {

	static ArrayList<Integer> getEvenNumbers(ArrayList<Integer> list) {

		ArrayList<Integer> result = new ArrayList<>();

		for (int value : list) {

			if (value % 2 == 0) {
				result.add(value);
			}
		}

		return result;
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(15);
		list.add(22);
		list.add(31);
		list.add(40);
		list.add(57);

		ArrayList<Integer> result = getEvenNumbers(list);

		System.out.println(result);
	}
}
```

Output:

```text
[10, 22, 40]
```

### Complexity

If the ArrayList contains `N` elements:

```text
Time Complexity: O(N)
Space Complexity: O(N)
```

The additional `O(N)` space is used for the result list.

---

# 19. Program — Return Unique Elements

## Problem

Given an array, return the elements that occur only once.

Example:

```text
Input:
[10, 20, 10, 30, 20, 40]

Output:
[30, 40]
```

Here:

```text
10 -> occurs 2 times
20 -> occurs 2 times
30 -> occurs 1 time
40 -> occurs 1 time
```

Therefore:

```text
[30, 40]
```

---

# 20. Approach — Count Occurrences

For every element:

1. Count how many times it appears in the array.
2. If the count is `1`, add it to the result.
3. Continue until all elements are processed.

Example:

```text
arr = [10, 20, 10, 30]

For 10:
count = 2 -> don't add

For 20:
count = 1 -> add

For 10:
count = 2 -> don't add

For 30:
count = 1 -> add
```

Result:

```text
[20, 30]
```

---

# 21. Program — Unique Elements

```java
import java.util.ArrayList;

public class UniqueElements {

	static ArrayList<Integer> getUniqueElements(int[] arr) {

		ArrayList<Integer> result = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {

			int count = 0;

			for (int j = 0; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
				}
			}

			if (count == 1) {
				result.add(arr[i]);
			}
		}

		return result;
	}

	public static void main(String[] args) {

		int[] arr = {10, 20, 10, 30, 20, 40};

		ArrayList<Integer> result = getUniqueElements(arr);

		System.out.println(result);
	}
}
```

Output:

```text
[30, 40]
```

### Complexity

There are two nested loops.

For `N` elements:

```text
Time Complexity: O(N^2)
Space Complexity: O(N)
```

The result ArrayList can contain up to `N` elements.

---

# 22. Important Concept — Unique vs Distinct

These two terms can mean different things in programming problems.

### Unique elements

Elements that occur exactly once.

Example:

```text
[10, 20, 10, 30]

Unique:
[20, 30]
```

### Distinct elements

Each different value appears only once in the result.

Example:

```text
[10, 20, 10, 30]

Distinct:
[10, 20, 30]
```

So always read the problem carefully.

---

# 23. Array vs ArrayList

| Feature | Array | ArrayList |
|---|---|---|
| Size | Fixed | Dynamic |
| Syntax | `int[]` | `ArrayList<Integer>` |
| Length | `arr.length` | `list.size()` |
| Access | `arr[i]` | `list.get(i)` |
| Update | `arr[i] = x` | `list.set(i, x)` |
| Add | Manual/fixed size | `add()` |
| Remove | Manual/new array | `remove()` |
| Package | No import | `java.util.ArrayList` |

---

# 24. Key Takeaways

- `ArrayList` is a resizable collection.
- It stores objects, so primitive types use wrapper classes.
- `Integer` is used instead of `int`.
- `add()` adds elements.
- `get()` reads elements.
- `set()` replaces elements.
- `remove()` removes elements.
- `size()` gives the number of elements.
- `contains()` checks whether an element exists.
- `indexOf()` finds the first occurrence.
- `ArrayList` can be traversed using a normal or enhanced `for` loop.
- We can return an ArrayList from a method.
- Filtering elements, such as finding even numbers, commonly uses a result ArrayList.
- Counting occurrences with nested loops takes `O(N^2)` time.
