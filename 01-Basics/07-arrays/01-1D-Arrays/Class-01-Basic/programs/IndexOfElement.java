public class IndexOfElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int k = 40;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                index = i;
                break;
            }
        }

        System.out.println("Index of " + k + " is: " + index);
    }
}
