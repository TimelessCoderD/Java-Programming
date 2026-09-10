import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EvenInArrayList {
    static ArrayList<Integer> getEvenNumber(ArrayList<Integer> al){
     
        ArrayList<Integer> eveAl = new ArrayList<>();

        for (int i = 0; i < al.size(); i++){
           
            if( al.get(i) % 2 == 0){
                eveAl.add(al.get(i));
            }
        }
        Collections.sort(eveAl);
        return eveAl;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();

       System.out.println("Array List sze " );
       int size =  sc.nextInt();
       
       for(int i = 0; i < size; i++){
            al.add(sc.nextInt());
       }

       System.out.println("Unique Values are " + getEvenNumber(al));
       sc.close();
    }
}
