import java.util.Arrays;

public class ReversePartOfArray {

    static void reversePart(int[] arr, int start, int end) {

        int left = start;
        int right = end;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        reversePart(arr, 2, 5);

        System.out.println(Arrays.toString(arr));
    }
}