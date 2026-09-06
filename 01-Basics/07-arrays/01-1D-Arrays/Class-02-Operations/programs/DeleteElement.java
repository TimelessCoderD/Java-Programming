import java.util.Arrays;

public class DeleteElement {

    static int[] deleteElement(int[] arr, int position) {

        int[] result = new int[arr.length - 1];

        // Copy elements before position
        for (int i = 0; i < position; i++) {
            result[i] = arr[i];
        }

        // Copy elements after position
        for (int i = position + 1; i < arr.length; i++) {
            result[i - 1] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int position = 2;

        int[] result = deleteElement(arr, position);

        System.out.println(Arrays.toString(result));
    }
}