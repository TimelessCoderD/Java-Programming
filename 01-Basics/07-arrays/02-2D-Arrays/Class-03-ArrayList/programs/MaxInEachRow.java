import java.util.ArrayList;

public class MaxInEachRow {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(12);
        row1.add(8);
        row1.add(20);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(5);
        row2.add(15);
        row2.add(9);

        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(30);
        row3.add(7);
        row3.add(18);

        matrix.add(row1);
        matrix.add(row2);
        matrix.add(row3);

        for (int i = 0; i < matrix.size(); i++) {
            int max = matrix.get(i).get(0);

            for (int j = 1; j < matrix.get(i).size(); j++) {
                if (matrix.get(i).get(j) > max) {
                    max = matrix.get(i).get(j);
                }
            }

            System.out.println("Maximum of row " + i + " = " + max);
        }
    }
}
