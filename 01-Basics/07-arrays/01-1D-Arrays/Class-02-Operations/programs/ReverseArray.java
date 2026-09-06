import java.util.Arrays;

public class ReverseArray {

    static int[] reverseArray(int[] arr) {

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[arr.length - 1 - i] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int[] result = reverseArray(arr);

        System.out.println(Arrays.toString(result));
    }
}