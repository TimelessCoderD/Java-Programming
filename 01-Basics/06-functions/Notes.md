# Java Methods

## 1. What is a Method?

A method is a named block of code that performs a specific task.

Methods help us:

- Reuse code
- Avoid duplication
- Break large problems into smaller parts
- Improve readability
- Test logic independently

Example:

```java
static void greet() {
	System.out.println("Hello");
}
```

Call it with:

```java
greet();
```

## 2. Basic Syntax

```java
accessModifier static returnType methodName(parameters) {
	// body
}
```

Example:

```java
public static int add(int a, int b) {
	return a + b;
}
```

## 3. Method Parts

```text
public       -> access modifier
static       -> class-level method
int          -> return type
add          -> method name
int a, int b -> parameters
return       -> sends result to caller
```

## 4. Four Basic Types

### No parameter, no return

```java
static void hello() {
	System.out.println("Hello");
}
```

### Parameter, no return

```java
static void printSquare(int n) {
	System.out.println(n * n);
}
```

### No parameter, return

```java
static int getNumber() {
	return 10;
}
```

### Parameter + return

```java
static int add(int a, int b) {
	return a + b;
}
```

The fourth type is especially common in DSA.

## 5. Parameters vs Arguments

```java
static void greet(String name) { } // name = parameter

greet("Dev");                       // "Dev" = argument
```

## 6. `return`

`return` sends a value back and immediately exits the method.

```java
static int square(int n) {
	return n * n;
}
```

A `void` method may use `return;` for an early exit.

```java
static void check(int n) {
	if (n < 0) {
		return;
	}
	System.out.println(n);
}
```

## 7. Return Type

If a method says `int`, it must return an `int` on every valid path.

```java
static int add(int a, int b) {
	return a + b;
}
```

`void` means no value is returned.

## 8. `static` Method

A static method belongs to the class and can be called directly from a static context.

```java
static int add(int a, int b) {
	return a + b;
}

public static void main(String[] args) {
	System.out.println(add(10, 20));
}
```

This is why DSA utility methods are commonly written as `static`.

## 9. Instance / Non-static Method

A non-static method belongs to an object.

```java
class Calculator {
	int add(int a, int b) {
		return a + b;
	}
}

Calculator c = new Calculator();
System.out.println(c.add(10, 20));
```

For current DSA learning, focus mainly on static methods.

## 10. Method Overloading

Overloading means using the same method name with different parameter lists.

```java
static int add(int a, int b) {
	return a + b;
}

static int add(int a, int b, int c) {
	return a + b + c;
}

static double add(double a, double b) {
	return a + b;
}
```

Changing only the return type is not overloading.

Invalid:

```java
int add(int a, int b)
double add(int a, int b)
```

## 11. Varargs

Varargs allow a variable number of arguments.

```java
static int sum(int... numbers) {
	int sum = 0;

	for (int n : numbers) {
		sum += n;
	}

	return sum;
}
```

Calls:

```java
sum(1, 2);
sum(1, 2, 3);
sum(1, 2, 3, 4);
```

Inside the method, `numbers` behaves like an array. A varargs parameter must be the last parameter.

## 12. Java Is Pass-by-Value

Java always passes arguments by value.

For primitives, a copy of the value is passed:

```java
static void change(int x) {
	x = 100;
}

int a = 10;
change(a);
System.out.println(a); // 10
```

For arrays and objects, the copied value is a reference to the same object.

```java
static void changeFirst(int[] arr) {
	arr[0] = 100;
}
```

The original array can therefore be modified. Reassigning the parameter itself does not replace the caller's reference.

## 13. Arrays as Method Parameters

```java
static int findSum(int[] arr) {
	int sum = 0;

	for (int x : arr) {
		sum += x;
	}

	return sum;
}
```

This pattern is extremely common in DSA.

## 14. Scope

Variables declared inside a method are local to that method.

```java
static void test() {
	int x = 10;
	System.out.println(x);
}
```

`x` cannot be directly used in another method. A variable declared inside a block is also limited to that block.

## 15. Method Calling Another Method

Methods can be composed.

```java
static int square(int n) {
	return n * n;
}

static int sumOfSquares(int a, int b) {
	return square(a) + square(b);
}
```

## 16. Recursion

A method calling itself is recursion.

```java
static int factorial(int n) {
	if (n == 0 || n == 1) {
		return 1;
	}

	return n * factorial(n - 1);
}
```

The stopping condition is the **base case**.

Recursion will be studied in depth in the DSA recursion section.

## 17. Method Signature

For overloading, the method signature is based on:

- Method name
- Parameter types

Example:

```text
add(int, int)
add(int, int, int)
add(double, double)
```

Return type is not part of the signature for overloading.

## 18. Access Modifiers

| Modifier | Accessible from |
| --- | --- |
| `public` | Any class |
| `protected` | Same package and subclasses |
| No modifier | Same package only |
| `private` | Same class only |

## 19. `main()` Is a Method

```java
public static void main(String[] args)
```

- `public` -> accessible to the JVM
- `static` -> no object required
- `void` -> returns nothing
- `main` -> program entry point
- `String[] args` -> command-line arguments

## 20. Method Complexity

Complexity depends on the work inside the method.

```java
static int add(int a, int b) {
	return a + b;
}
```

Time: `O(1)`  
Extra space: `O(1)`

```java
static int findSum(int[] arr) {
	int sum = 0;
	for (int x : arr) {
		sum += x;
	}
	return sum;
}
```

Time: `O(n)`  
Extra space: `O(1)`

Recursive methods may also use call-stack space. For example, a recursion depth of `n` uses `O(n)` stack space even when no extra data structure is created.

## 21. DSA Method Pattern

A common structure is:

```java
static int solve(int[] arr) {
	// initialize
	// process
	// apply logic
	return answer;
}
```

Example:

```java
static int findMaximum(int[] arr) {
	int max = arr[0];

	for (int i = 1; i < arr.length; i++) {
		if (arr[i] > max) {
			max = arr[i];
		}
	}

	return max;
}
```

## 22. Common Mistakes

### Forgetting `return`

```java
static int add(int a, int b) {
	a + b; // wrong
}
```

### Wrong return type

```java
static int getValue() {
	return 10.5; // wrong
}
```

### Calling an instance method as static

A non-static method needs an object.

### Changing only the return type

Return type alone cannot overload a method.

### Forgetting local-variable scope

A local variable cannot be directly accessed outside its scope.

### Accessing an array without checking for `null`

```java
static int first(int[] arr) {
	if (arr == null || arr.length == 0) {
		return -1;
	}
	return arr[0];
}
```

## 23. What You Need for DSA

Be comfortable with:

1. Declaration
2. Calling
3. Parameters
4. Arguments
5. Return values
6. `void`
7. `static`
8. Overloading
9. Arrays as parameters
10. Pass-by-value
11. Scope
12. Basic recursion
13. Complexity
14. `solve()`-style methods
15. Checking reference inputs such as arrays for `null` and empty values
