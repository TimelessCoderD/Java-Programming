public class MethodsDemo {

    public static void main(String[] args) {

        greet();

        greetUser("Dev");

        int number = getNumber();
        System.out.println("Number = " + number);

        System.out.println("Add = " + add(10, 20));

        printSquare(5);

        checkNumber(-5);
        checkNumber(10);

        int[] arr = {10, 20, 30, 40};

        changeFirstElement(arr);
        System.out.println("First element = " + arr[0]);

        System.out.println("Array sum = " + findSum(arr));
        System.out.println("Maximum = " + findMaximum(arr));

        System.out.println("Overload 2 args = " + add(10, 20));
        System.out.println("Overload 3 args = " + add(10, 20, 30));
        System.out.println("Overload double = " + add(10.5, 20.5));

        System.out.println("Varargs sum = " + sum(1, 2, 3, 4, 5));

        System.out.println("Sum of squares = " + sumOfSquares(3, 4));

        System.out.println("17 is prime? " + isPrime(17));

        System.out.println("5! = " + factorial(5));

        int[] dsaArray = {7, 2, 15, 4, 9};
        System.out.println("DSA maximum = " + findMaximum(dsaArray));
    }

    // 1. No parameter, no return
    static void greet() {
        System.out.println("Hello");
    }

    // 2. Parameter, no return
    static void greetUser(String name) {
        System.out.println("Hello " + name);
    }

    static void printSquare(int n) {
        System.out.println("Square = " + (n * n));
    }

    // 3. No parameter, return value
    static int getNumber() {
        return 10;
    }

    // 4. Parameter + return value
    static int add(int a, int b) {
        return a + b;
    }

    // Method overloading
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b) {
        return a + b;
    }

    // Early return
    static void checkNumber(int n) {
        if (n < 0) {
            System.out.println("Negative number");
            return;
        }

        System.out.println("Non-negative number");
    }

    // Primitive pass-by-value
    static void changePrimitive(int x) {
        x = 100;
    }

    // Array reference value is copied; both references point to same array
    static void changeFirstElement(int[] arr) {
        arr[0] = 100;
    }

    // Varargs
    static int sum(int... numbers) {
        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        return total;
    }

    // Method calling another method
    static int square(int n) {
        return n * n;
    }

    static int sumOfSquares(int a, int b) {
        return square(a) + square(b);
    }

    // Array + DSA style
    static int findSum(int[] arr) {
        int total = 0;

        for (int value : arr) {
            total += value;
        }

        return total;
    }

    // DSA-style maximum
    static int findMaximum(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    // Boolean-returning method
    static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Basic recursion example
    static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
