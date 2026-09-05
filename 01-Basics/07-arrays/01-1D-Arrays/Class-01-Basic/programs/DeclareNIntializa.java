public class DeclareNIntializa {

    public static void main(String[] args){
        // Declaration and creation together
        int[] arr = new int[5];

        // Declaration and initialization together
        int arr2[] = {50};

        // Declaration first, creation later
        int[] arr3;
        arr3 = new int[3];

        // Declaration first, initialization later
        int[] arr4;
        arr4 = new int[]{10, 20, 30};

        System.out.println(arr);
        System.out.println(arr2);
        System.out.println(arr[0]);
        System.out.println(arr2[0]);
        System.out.println(arr3[0]);
        System.out.println(arr4[0]);
    }
    
}
