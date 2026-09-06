import java.util.Arrays;

public class LeftShift {

    static void leftShift(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = 0;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        leftShift(arr);

        System.out.println(Arrays.toString(arr));
    }
}