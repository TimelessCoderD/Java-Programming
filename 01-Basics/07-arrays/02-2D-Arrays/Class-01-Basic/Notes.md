# 2D Arrays - Class 1

## 1. Introduction to 2D Arrays

A 2D array is an array of arrays. It is used to store data in rows and columns, like a table or matrix.

Example:

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

This matrix has:

- 3 rows
- 3 columns
- 9 total elements

It is called a 3 x 3 matrix.

---

## 2. Structure of a 2D Array

A 2D array is created with two indexes:

```java
array[row][column]
```

For example:

```java
matrix[0][0] = 1;
matrix[0][1] = 2;
matrix[1][2] = 6;
```

The first index represents the row, and the second index represents the column.

### Example matrix

```text
1  2  3
4  5  6
7  8  9
```

So:

- `matrix[0][0]` = 1
- `matrix[1][2]` = 6
- `matrix[2][1]` = 8

---

## 3. Declaration of 2D Arrays

### Method 1: Declaration and initialization together

```java
int[][] matrix = {
    {10, 20, 30},
    {40, 50, 60}
};
```

### Method 2: Declaration using `new`

```java
int[][] matrix = new int[2][3];
```

This creates a 2D array with:

- 2 rows
- 3 columns

The default value for each element is `0`.

---

## 4. Accessing Elements

```java
int[][] matrix = {
    {10, 20, 30},
    {40, 50, 60}
};

System.out.println(matrix[0][0]); // 10
System.out.println(matrix[1][2]); // 60
```

To access all elements, we use nested loops.

---

## 5. Iterating Through a 2D Array

We use two loops:

- outer loop for rows
- inner loop for columns

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};

for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

Output:

```text
1 2 3
4 5 6
```

---

## 6. Important Facts

- A 2D array is also called a matrix.
- `matrix.length` gives the number of rows.
- `matrix[i].length` gives the number of columns in row `i`.
- The array is not always rectangular, but usually it is.
- It is useful for tables, board games, images, and matrix operations.

---

## 7. Example: Sum of All Elements

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};

int sum = 0;

for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        sum += matrix[i][j];
    }
}

System.out.println("Sum = " + sum);
```

Output:

```text
Sum = 21
```

---

## 8. Transpose of a Matrix

The transpose of a matrix is formed by swapping rows and columns.

For example:

Original matrix:

```text
1 2 3
4 5 6
7 8 9
```

Transpose:

```text
1 4 7
2 5 8
3 6 9
```

### Logic

If the original matrix is `matrix[i][j]`, then the transposed matrix is:

```java
transpose[j][i] = matrix[i][j]
```

This means:

- row becomes column
- column becomes row

---

## 9. Reverse of a Matrix

Reversing a matrix means changing the arrangement of rows or columns.

For example, reversing each row of:

```text
1 2 3
4 5 6
```

gives:

```text
3 2 1
6 5 4
```

A matrix can be reversed:

- row-wise
- column-wise
- or both at the same time

---

## 10. Summary

A 2D array helps us store data in rows and columns. It is useful for tables, matrices, and grid-based problems.

Key points:

- Declare with `int[][] name;`
- Create with `new int[row][column]`
- Access with `array[row][column]`
- Use nested loops to process all values
- Transpose swaps rows and columns
- Reverse changes order of elements

In the next programs, we will practice:

1. Basic 2D array operations
2. Matrix transpose
3. Transpose + reverse

---

## 11. Practice Questions

1. Create a 2D array of size `3 x 3` and print it.
2. Find the sum of all elements in the matrix.
3. Write a program to transpose a matrix.
4. Write a program to reverse each row after transposing.


