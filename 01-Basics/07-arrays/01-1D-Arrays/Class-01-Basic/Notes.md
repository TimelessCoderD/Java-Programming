 # 1D Arrays - Class 1

## 1. Introduction to Arrays

An array is a collection of elements of the same data type stored under one variable name.

Instead of creating multiple variables:

```java
int marks1 = 80;
int marks2 = 75;
int marks3 = 90;
int marks4 = 85;
```

We can use an array:

```java
int[] marks = {80, 75, 90, 85};
```

### Why do we use arrays?

Arrays are useful when:

- We have multiple values of the same data type.
- We want to store and process values together.
- We want to access elements using an index.
- We want to perform operations such as searching, finding the maximum, calculating the sum, and counting occurrences.

---

## 2. Properties of an Array

An array has the following important properties:

1. Stores elements of the same data type.
2. Has a fixed size after creation.
3. Uses index-based access.
4. Index starts from `0`.
5. Last valid index is `length - 1`.

Example:

```java
int[] arr = {10, 20, 30, 40, 50};
```

| Index | Value |
| ---: | ---: |
| 0 | 10 |
| 1 | 20 |
| 2 | 30 |
| 3 | 40 |
| 4 | 50 |

So:

```java
arr[0] // 10
arr[2] // 30
arr[4] // 50
```

---

## 3. Array Declaration

There are two common ways to declare an array:

```java
int[] arr;
```

or:

```java
int arr[];
```

The preferred Java style is:

```java
int[] arr;
```

At this point, the array has only been declared. Memory for the array elements has not been allocated yet.

---

## 4. Creating an Array

We can create an array using the `new` keyword:

```java
int[] arr = new int[5];
```

This creates an integer array capable of storing 5 elements.

Indexes will be:

```text
0  1  2  3  4
```

The size is fixed and cannot be changed after creation.

---

## 5. Default Values

When an array is created using `new`, Java automatically assigns default values.

For an `int` array:

```java
int[] arr = new int[5];
```

The initial values are:

```text
0  0  0  0  0
```

Common default values:

| Data type | Default value |
| --- | --- |
| `int` | `0` |
| `long` | `0` |
| `float` | `0.0` |
| `double` | `0.0` |
| `boolean` | `false` |
| `char` | `\u0000` |
| Reference types | `null` |

---

## 6. Different Ways to Initialize an Array

### Method 1 - Declaration and creation

```java
int[] arr = new int[5];
```

### Method 2 - Direct initialization

```java
int[] arr = {10, 20, 30, 40, 50};
```

Java automatically determines the size.

### Method 3 - Declaration followed by creation

```java
int[] arr;

arr = new int[5];
```

### Method 4 - Declaration followed by initialization

```java
int[] arr;

arr = new int[]{10, 20, 30, 40, 50};
```

---

## 7. Adding or Assigning Values to an Array

Values can be assigned using indexes.

```java
int[] arr = new int[5];

arr[0] = 10;
arr[1] = 20;
arr[2] = 30;
arr[3] = 40;
arr[4] = 50;
```

The array now contains:

```text
10 20 30 40 50
```

Remember:

```text
First index = 0
Last index = length - 1
```

---

## 8. Reading a Value from an Array

We can access an element using its index.

```java
int[] arr = {10, 20, 30, 40, 50};

System.out.println(arr[0]);
```

Output:

```text
10
```

Another example:

```java
System.out.println(arr[3]);
```

Output:

```text
40
```

---

## 9. Reading All Values from an Array

We can use a loop to access every element.

```java
int[] arr = {10, 20, 30, 40, 50};

for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]);
}
```

Output:

```text
10
20
30
40
50
```

---

## 10. `array.length`

The `length` property gives the number of elements in an array.

```java
int[] arr = {10, 20, 30, 40, 50};

System.out.println(arr.length);
```

Output:

```text
5
```

Important:

```java
arr.length
```

is a property, not a method.

Correct:

```java
arr.length
```

Incorrect:

```java
arr.length()
```

For an array of size `N`:

```text
First index = 0
Last index = N - 1
Number of elements = N
```

---

## 11. Array Index Out of Bounds

An array only allows valid indexes from `0` to `length - 1`.

Example:

```java
int[] arr = {10, 20, 30};
```

Valid indexes are:

```text
0, 1, 2
```

This is invalid:

```java
System.out.println(arr[3]);
```

It results in:

```text
ArrayIndexOutOfBoundsException
```

Similarly, `arr[-1]` is also invalid.

### Common mistake

Wrong:

```java
for (int i = 0; i <= arr.length; i++) {
	System.out.println(arr[i]);
}
```

Correct:

```java
for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]);
}
```

The last index is `arr.length - 1`.

---

## 12. Addition or Sum of All Elements

We can calculate the sum using a loop.

```java
int[] arr = {10, 20, 30, 40, 50};

int sum = 0;

for (int i = 0; i < arr.length; i++) {
	sum += arr[i];
}

System.out.println(sum);
```

Output:

```text
150
```

### Complexity

- Time complexity: `O(N)`
- Space complexity: `O(1)`

---

## 13. Search for an Element

We can search for a value using a loop.

```java
int[] arr = {10, 20, 30, 40, 50};

int k = 30;
boolean found = false;

for (int i = 0; i < arr.length; i++) {
	if (arr[i] == k) {
		found = true;
		break;
	}
}

System.out.println(found);
```

Output:

```text
true
```

This is called **linear search**.

### Complexity

- Worst-case time complexity: `O(N)`
- Space complexity: `O(1)`

---

## 14. Find the Index of K

Sometimes we do not just want to know whether `K` exists. We want to find its index.

```java
int[] arr = {10, 20, 30, 40, 50};

int k = 40;
int index = -1;

for (int i = 0; i < arr.length; i++) {
	if (arr[i] == k) {
		index = i;
		break;
	}
}

System.out.println(index);
```

Output:

```text
3
```

We initialize `index` to `-1` because `-1` can represent an element that was not found.

```text
Array: 10 20 30 40 50
Index:  0  1  2  3  4
```

For `K = 40`, the answer is `3`.

---

## 15. Find the Maximum Element

We can find the maximum element by maintaining a variable containing the largest value found so far.

```java
int[] arr = {10, 50, 20, 40, 30};

int max = arr[0];

for (int i = 1; i < arr.length; i++) {
	if (arr[i] > max) {
		max = arr[i];
	}
}

System.out.println(max);
```

Output:

```text
50
```

### Why start with `arr[0]`?

We should not assume that `0` is the maximum starting value.

For example:

```java
int[] arr = {-10, -5, -20};
```

If we initialize `max` with `0`, we get the wrong answer. The correct initialization is:

```java
int max = arr[0];
```

### Complexity

- Time complexity: `O(N)`
- Space complexity: `O(1)`

---

## 16. Number of Occurrences of K

Occurrence means how many times a particular value appears in the array.

```java
int[] arr = {10, 20, 10, 30, 10, 40};

int k = 10;
int count = 0;

for (int i = 0; i < arr.length; i++) {
	if (arr[i] == k) {
		count++;
	}
}

System.out.println(count);
```

Output:

```text
3
```

Because `10` occurs three times.

### Complexity

- Time complexity: `O(N)`
- Space complexity: `O(1)`

---

## 17. Important Array Pattern

A large number of basic array problems follow this pattern:

```java
for (int i = 0; i < arr.length; i++) {
	// Process arr[i]
}
```

Once this pattern is understood, many problems become easier.

Examples:

- Sum of elements
- Search for an element
- Find an index
- Count occurrences
- Find the maximum
- Find the minimum
- Count positive numbers
- Count even numbers

---

## 18. Common Mistakes

### Mistake 1 - Starting the index from 1

Wrong:

```java
for (int i = 1; i <= arr.length; i++)
```

Correct:

```java
for (int i = 0; i < arr.length; i++)
```

### Mistake 2 - Using `length()`

Wrong:

```java
arr.length()
```

Correct:

```java
arr.length
```

### Mistake 3 - Accessing `arr[arr.length]`

Wrong:

```java
arr[arr.length]
```

Correct:

```java
arr[arr.length - 1]
```

### Mistake 4 - Assuming the array size can change

```java
int[] arr = new int[5];
```

The size is fixed. We cannot directly increase it to 10 elements.

### Mistake 5 - Initializing the maximum with 0

Avoid this when array values can be negative:

```java
int max = 0;
```

Prefer:

```java
int max = arr[0];
```

---

## 19. Key Takeaways

- An array stores multiple values of the same data type.
- Array indexing starts from `0`.
- Array size is fixed after creation.
- `arr.length` gives the number of elements.
- The last valid index is `arr.length - 1`.
- Values are accessed using `arr[index]`.
- Basic array traversal usually uses a `for` loop.
- Linear search takes `O(N)` time.
- Sum, maximum, search, and occurrence counting generally require traversing the array.
- Be careful about `ArrayIndexOutOfBoundsException`.

---

## 20. Practice Problems

Try solving these without looking at the solution:

1. Print all elements of an array.
2. Print the elements in reverse order.
3. Find the sum of all elements.
4. Find the maximum element.
5. Find the minimum element.
6. Search for a given `K`.
7. Find the index of `K`.
8. Count how many times `K` occurs.
9. Count the number of even elements.
10. Count the number of positive elements.
11. Calculate the average of all elements.
12. Find the second-largest element.

---

## Complexity Summary

| Operation | Time complexity |
| --- | ---: |
| Access `arr[i]` | `O(1)` |
| Update `arr[i]` | `O(1)` |
| Traverse array | `O(N)` |
| Sum of elements | `O(N)` |
| Linear search | `O(N)` |
| Find maximum | `O(N)` |
| Count occurrences | `O(N)` |
