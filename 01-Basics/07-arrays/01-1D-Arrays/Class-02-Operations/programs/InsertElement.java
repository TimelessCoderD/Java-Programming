import java.util.Arrays;

public class InsertElement {

    static int[] insertElement(int[] arr, int value, int position) {

        int[] result = new int[arr.length + 1];

        // Copy elements before position
        for (int i = 0; i < position; i++) {
            result[i] = arr[i];
        }

        // Insert new element
        result[position] = value;

        // Copy remaining elements
        for (int i = position; i < arr.length; i++) {
            result[i + 1] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int value = 25;
        int position = 2;

        int[] result = insertElement(arr, value, position);

        System.out.println(Arrays.toString(result));
    }
}