public class CountOccurrences {
    static int arrCountOccurance(int[] arr, int k){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if( arr[i]  == k){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 10, 40};
        int k = 10;
        System.out.println(arrCountOccurance(arr,k));
    }
}
