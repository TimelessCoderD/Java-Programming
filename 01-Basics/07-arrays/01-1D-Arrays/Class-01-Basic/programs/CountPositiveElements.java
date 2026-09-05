public class CountPositiveElements {
    public static void main(String[] args) {
        int[] arr = {-10, 15, 0, 22, -5, 30};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }

        System.out.println("Number of positive elements: " + count);
    }
}
