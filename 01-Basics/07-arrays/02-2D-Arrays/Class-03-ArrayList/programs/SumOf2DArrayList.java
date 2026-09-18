import java.util.ArrayList;

public class SumOf2DArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);

        matrix.add(row1);
        matrix.add(row2);

        int sum = 0;

        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                sum += matrix.get(i).get(j);
            }
        }

        System.out.println("Sum of all elements = " + sum);
    }
}
