public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int k = 30;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                found = true;
                break;
            }
        }

        System.out.println("Element found: " + found);
    }
}
