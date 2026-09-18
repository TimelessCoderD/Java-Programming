public class MaxOfEachRow {
    public static void main(String[] args) {
        int[][] matrix = {
            {12, 5, 9, 18},
            {7, 24, 3, 10},
            {15, 8, 21, 6}
        };

        System.out.println("Matrix:");
        printMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            int max = matrix[i][0];

            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }

            System.out.println("Maximum of row " + i + " = " + max);
        }
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
