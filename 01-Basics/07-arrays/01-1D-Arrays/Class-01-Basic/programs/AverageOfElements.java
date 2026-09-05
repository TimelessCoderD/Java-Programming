public class AverageOfElements {

    static double arrAverage(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return (double)sum/arr.length;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 33, 40, 50};
        System.out.println(arrAverage(arr));
    }
}
