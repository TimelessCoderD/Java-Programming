public class MaxAndOccurrence {

    static void findMaxAndOccurrence(int[] arr) {

        int max = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
                count = 1;
            }
            else if (arr[i] == max) {
                count++;
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Occurrence = " + count);
    }

    public static void main(String[] args) {

        int[] arr = {10, 50, 20, 50, 30, 50};

        findMaxAndOccurrence(arr);
    }
}