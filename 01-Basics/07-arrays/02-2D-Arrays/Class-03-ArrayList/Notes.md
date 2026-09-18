# 2D ArrayList - Class 3

## 1. Introduction to 2D ArrayList

A 2D ArrayList is an ArrayList that contains other ArrayLists. It is used when we want to store data in rows and columns, but the size of rows or columns may change dynamically.

Unlike a normal 2D array, a 2D ArrayList is not fixed in size. We can add rows or elements easily.

Example:

```java
ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
```

This means:

- outer ArrayList stores rows
- each row is itself an ArrayList
- each row stores integer values

---

## 2. Why Use 2D ArrayList?

A 2D ArrayList is useful when:

- Number of rows is not fixed
- Number of columns can vary
- We need dynamic data storage
- We want to add or remove elements easily

Example use cases:

- student marks in multiple subjects
- matrix with variable row sizes
- grid-like data that can grow

---

## 3. Declaration of 2D ArrayList

```java
ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
```

This creates an empty list of rows.

Each row can be created as:

```java
ArrayList<Integer> row = new ArrayList<>();
```

Then we add row to the matrix:

```java
matrix.add(row);
```

---

## 4. Creating a 2D ArrayList

```java
ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

ArrayList<Integer> row1 = new ArrayList<>();
row1.add(10);
row1.add(20);
row1.add(30);

ArrayList<Integer> row2 = new ArrayList<>();
row2.add(40);
row2.add(50);
row2.add(60);

matrix.add(row1);
matrix.add(row2);
```

This creates the structure:

```text
10 20 30
40 50 60
```

---

## 5. Accessing Elements

To access an element, we use two indexes:

```java
int value = matrix.get(0).get(1);
```

This means:

- `matrix.get(0)` = first row
- `.get(1)` = second element of that row

Example:

```java
System.out.println(matrix.get(1).get(2)); // 60
```

---

## 6. Adding Elements to a 2D ArrayList

### Add a new row

```java
ArrayList<Integer> row3 = new ArrayList<>();
row3.add(70);
row3.add(80);
row3.add(90);

matrix.add(row3);
```

### Add an element to a row

```java
matrix.get(0).add(99);
```

This adds `99` to the first row.

---

## 7. Printing a 2D ArrayList

```java
for (int i = 0; i < matrix.size(); i++) {
    for (int j = 0; j < matrix.get(i).size(); j++) {
        System.out.print(matrix.get(i).get(j) + " ");
    }
    System.out.println();
}
```

Output:

```text
10 20 30
40 50 60
```

---

## 8. Example Program

```java
import java.util.ArrayList;

public class TwoDArrayListDemo {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);

        matrix.add(row1);
        matrix.add(row2);

        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
```

Output:

```text
1 2 3
4 5 6
```

---

## 9. Difference Between 2D Array and 2D ArrayList

### 2D Array

- Fixed size
- All rows must have same length
- Faster and memory efficient
- Better when size is known

### 2D ArrayList

- Dynamic size
- Rows can have different lengths
- Easier to add/remove elements
- Better when size is not fixed

---

## 10. Important Methods

For a 2D ArrayList, we commonly use:

```java
matrix.add(row);
matrix.get(i);
row.add(value);
row.get(j);
row.size();
matrix.size();
```

These are useful while working with dynamic data.

---

## 11. Example: Sum of All Elements

```java
import java.util.ArrayList;

public class SumOf2DArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);

        matrix.add(row1);
        matrix.add(row2);

        int sum = 0;

        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                sum += matrix.get(i).get(j);
            }
        }

        System.out.println("Sum = " + sum);
    }
}
```

Output:

```text
Sum = 21
```

---

## 12. Summary

A 2D ArrayList is an ArrayList of ArrayLists.

It is used when we need dynamic data storage in rows and columns.

Key ideas:

- Outer list stores rows
- Inner list stores values in each row
- Use `add()` to insert elements
- Use nested loops to access and print data
- It is more flexible than a normal 2D array

A 2D ArrayList is useful when the size of the matrix is not fixed in advance.

---

## 13. Practice Questions

1. Create a 2D ArrayList of 3 rows and print it.
2. Add a new row to the matrix.
3. Find the maximum value in each row.
4. Find the sum of all elements in the 2D ArrayList.
5. Add an element to the second row.

