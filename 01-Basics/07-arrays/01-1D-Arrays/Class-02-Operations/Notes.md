# 1D Arrays - Class 2
## Array Operations

This class covers common operations performed on one-dimensional arrays:

1. Insert an element at a specific index
2. Delete an element
3. Reverse an array using another array
4. Reverse an array in place
5. Reverse part of an array
6. Find the maximum element and count its occurrences
7. Shift an array

---

# 1. Insert an Element at a Specific Index

Java arrays have a fixed size. If we have:

```java
int[] arr = {10, 20, 30, 40, 50};
```

and want to insert `25` at index `2`:

```text
Before:

10  20  30  40  50
0   1   2   3   4

Insert 25 at index 2

After:

10  20  25  30  40  50
0   1   2   3   4   5
```

Because Java arrays have a fixed size, we need a new array with one additional position.

### Approach

1. Create a new array of size `N + 1`.
2. Copy the elements before the insertion index.
3. Insert the new element.
4. Shift the remaining elements one position to the right.

### Example

```java
int[] arr = {10, 20, 30, 40, 50};
int value = 25;
int index = 2;

int[] result = new int[arr.length + 1];

for (int i = 0; i < index; i++) {
	result[i] = arr[i];
}

result[index] = value;

for (int i = index; i < arr.length; i++) {
	result[i + 1] = arr[i];
}
```

### Complexity

```text
Time:  O(N)
Space: O(N)
```

---

# 2. Delete an Element from an Array

Java arrays have a fixed size, so deleting an element also requires creating a new array.

Suppose we want to delete the element at index `2`:

```text
Before:  10  20  30  40  50
After:   10  20  40  50
```

### Approach

1. Create a new array of size `N - 1`.
2. Copy all elements except the element at the deletion index.
3. Return or use the new array.

### Example

```java
int[] arr = {10, 20, 30, 40, 50};
int index = 2;

int[] result = new int[arr.length - 1];

for (int i = 0; i < index; i++) {
	result[i] = arr[i];
}

for (int i = index + 1; i < arr.length; i++) {
	result[i - 1] = arr[i];
}
```

### Complexity

```text
Time:  O(N)
Space: O(N)
```

---

# 3. Reverse an Array Using Another Array

Given:

```text
10  20  30  40  50
```

the reversed array is:

```text
50  40  30  20  10
```

We can create a second array and copy each element to its reversed index.

### Approach

For every element at index `i`:

```text
result[N - 1 - i] = arr[i]
```

### Example

```java
int[] arr = {10, 20, 30, 40, 50};
int[] result = new int[arr.length];

for (int i = 0; i < arr.length; i++) {
	result[arr.length - 1 - i] = arr[i];
}
```

### Complexity

```text
Time:  O(N)
Space: O(N)
```

---

# 4. Reverse an Array In Place

Instead of creating another array, we can reverse the original array itself. This is called **in-place reversal**.

```text
Before: 10  20  30  40  50
After:  50  40  30  20  10
```

We use two pointers:

```text
left  -> beginning of the array
right -> end of the array
```

Swap `arr[left]` and `arr[right]`, then move `left` forward and `right` backward. Continue until `left >= right`.

### Example

```java
int[] arr = {10, 20, 30, 40, 50};

int left = 0;
int right = arr.length - 1;

while (left < right) {
	int temp = arr[left];
	arr[left] = arr[right];
	arr[right] = temp;

	left++;
	right--;
}
```

### Complexity

```text
Time:  O(N)
Space: O(1)
```

This is more space-efficient than creating another array, but it modifies the original array.

---

# 5. Reverse Part of an Array

Sometimes we do not want to reverse the entire array.

Example:

```text
Original: 10  20  30  40  50  60  70
```

Reverse the elements from index `2` to index `5`. The selected part is:

```text
30  40  50  60
```

After reversing:

```text
10  20  60  50  40  30  70
```

### Two-Pointer Approach

Set `left = start` and `right = end`. Swap the elements while `left < right`.

### Example

```java
int[] arr = {10, 20, 30, 40, 50, 60, 70};

int left = 2;
int right = 5;

while (left < right) {
	int temp = arr[left];
	arr[left] = arr[right];
	arr[right] = temp;

	left++;
	right--;
}
```

### Complexity

If the selected part contains `K` elements:

```text
Time:  O(K)
Space: O(1)
```

---

# 6. Find the Maximum Element and Count Its Occurrences

Consider:

```text
10  50  20  50  30  50
```

The maximum element is `50`, and it occurs `3` times.

This approach assumes that the array is not empty.

### Approach

Maintain two variables:

```java
int max = arr[0];
int count = 1;
```

While traversing the array:

- If `arr[i] > max`, update `max` and reset `count` to `1`.
- If `arr[i] == max`, increment `count`.
- Otherwise, do nothing.

When a new maximum is found, occurrences of the previous maximum are no longer relevant.

### Example

```java
int[] arr = {10, 50, 20, 50, 30, 50};

int max = arr[0];
int count = 1;

for (int i = 1; i < arr.length; i++) {
	if (arr[i] > max) {
		max = arr[i];
		count = 1;
	} else if (arr[i] == max) {
		count++;
	}
}
```

Final values:

```text
max = 50
count = 3
```

### Complexity

```text
Time:  O(N)
Space: O(1)
```

---

# 7. Shift an Array

Shifting means moving array elements by one or more positions. The two common directions are:

- Left shift
- Right shift

## 7.1 Left Shift

Given:

```text
10  20  30  40  50
```

After one left shift, if the array size remains unchanged:

```text
20  30  40  50  0
```

The first element is lost, and `0` fills the empty position.

### Example

```java
for (int i = 0; i < arr.length - 1; i++) {
	arr[i] = arr[i + 1];
}

arr[arr.length - 1] = 0;
```

## 7.2 Right Shift

Given:

```text
10  20  30  40  50
```

After one right shift:

```text
0  10  20  30  40
```

For a right shift, traverse from right to left:

```java
for (int i = arr.length - 1; i > 0; i--) {
	arr[i] = arr[i - 1];
}

arr[0] = 0;
```

If we moved from left to right, we could overwrite values that we still need.

---

# 8. Shift by `K` Positions

If we shift by more than one position, we can repeat the one-position shift `K` times.

For example, shifting right by `2`:

```text
Before: 10  20  30  40  50
After:   0   0  10  20  30
```

Repeating the shift `K` times takes:

```text
Time: O(N * K)
```

More efficient techniques for array rotation will be covered separately.

---

# 9. Shift vs. Rotation

### Shift

Some elements are lost.

```text
10  20  30  40  50
```

After a left shift:

```text
20  30  40  50  0
```

The element `10` is lost.

### Rotation

Elements that leave one side come back on the other side.

```text
10  20  30  40  50
```

After a left rotation:

```text
20  30  40  50  10
```

Rotation will be covered separately.

---

# 10. Important Patterns from This Class

## Pattern 1 - Two Pointers

Used for:

- Reversing an entire array
- Reversing part of an array

Basic pattern:

```java
int left = start;
int right = end;

while (left < right) {
	int temp = arr[left];
	arr[left] = arr[right];
	arr[right] = temp;

	left++;
	right--;
}
```

## Pattern 2 - Shift Right

When moving elements toward the right:

```java
for (int i = arr.length - 1; i > 0; i--) {
	arr[i] = arr[i - 1];
}
```

Always move from right to left.

## Pattern 3 - Shift Left

When moving elements toward the left:

```java
for (int i = 0; i < arr.length - 1; i++) {
	arr[i] = arr[i + 1];
}
```

Always move from left to right.

---

# 11. Common Mistakes

### Mistake 1 - Using `<=` with Array Length

Wrong:

```java
for (int i = 0; i <= arr.length; i++) {
	// This can cause ArrayIndexOutOfBoundsException.
}
```

Correct:

```java
for (int i = 0; i < arr.length; i++) {
	// Accesses valid indexes from 0 to arr.length - 1.
}
```

### Mistake 2 - Using the Wrong Direction for a Right Shift

Wrong:

```java
for (int i = 0; i < arr.length - 1; i++) {
	arr[i + 1] = arr[i];
}
```

This can overwrite values that have not been moved yet.

Correct:

```java
for (int i = arr.length - 1; i > 0; i--) {
	arr[i] = arr[i - 1];
}
```

### Mistake 3 - Forgetting `arr.length - 1`

The last valid index is:

```text
arr.length - 1
```

It is not:

```text
arr.length
```

### Mistake 4 - Counting Maximum Values Incorrectly

When a new maximum is found:

```java
max = arr[i];
count = 1;
```

Do not only increment `count`. Occurrences of the old maximum should no longer be counted.

---

# 12. Complexity Summary

| Operation | Time | Extra Space |
|---|---:|---:|
| Insert an element | `O(N)` | `O(N)` |
| Delete an element | `O(N)` | `O(N)` |
| Reverse using a new array | `O(N)` | `O(N)` |
| Reverse in place | `O(N)` | `O(1)` |
| Reverse part of an array | `O(K)` | `O(1)` |
| Find maximum and count occurrences | `O(N)` | `O(1)` |
| Left shift by one position | `O(N)` | `O(1)` |
| Right shift by one position | `O(N)` | `O(1)` |
| Shift by `K` positions | `O(N * K)` | `O(1)` |

---

# 13. Key Takeaways

1. Java arrays have a fixed size.
2. Insertion and deletion generally require creating a new array.
3. Two pointers are useful for reversing arrays.
4. In-place reversal uses `O(1)` extra space.
5. When right shifting, traverse from right to left.
6. When left shifting, traverse from left to right.
7. The maximum element and its occurrence count can be found in one traversal.
8. Shifting and rotating are different operations.
