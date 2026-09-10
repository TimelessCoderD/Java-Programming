import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UniqueElement {
    static ArrayList<Integer> getUnique(ArrayList<Integer> al){
        int val,count;
        ArrayList<Integer> unqAl = new ArrayList<>();

        for (int i = 0; i < al.size(); i++){
            val = al.get(i);
            count = 0;
            for(int j = 0; j < al.size(); j++){
                if(i != j && val == al.get(j)){
                    count++;
                    break;
                }
            }
            if( count == 0){
                unqAl.add(val);
            }
        }
        Collections.sort(unqAl);
        return unqAl;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();

       System.out.println("Array List sze " );
       int size =  sc.nextInt();
       
       for(int i = 0; i < size; i++){
            al.add(sc.nextInt());
       }

       System.out.println("Unique Values are " + getUnique(al));
       sc.close();
    }
}
