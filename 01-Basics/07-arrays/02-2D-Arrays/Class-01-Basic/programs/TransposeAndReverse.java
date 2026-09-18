public class TransposeAndReverse {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] transposed = transpose(matrix);
        int[][] reversed = reverseRows(transposed);

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        System.out.println("\nAfter Transpose:");
        printMatrix(transposed);

        System.out.println("\nAfter Transpose and Reverse:");
        printMatrix(reversed);
    }

    public static int[][] transpose(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = arr[i][j];
            }
        }

        return result;
    }

    public static int[][] reverseRows(int[][] arr) {
        int[][] result = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            int col = 0;
            for (int j = arr[i].length - 1; j >= 0; j--) {
                result[i][col] = arr[i][j];
                col++;
            }
        }

        return result;
    }

    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
