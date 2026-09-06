import java.util.Arrays;

public class RightShift {

    static void rightShift(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = 0;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        rightShift(arr);

        System.out.println(Arrays.toString(arr));
    }
}