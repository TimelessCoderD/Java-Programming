import java.util.ArrayList;

public class Basic2DArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(10);
        row1.add(20);
        row1.add(30);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(40);
        row2.add(50);
        row2.add(60);

        matrix.add(row1);
        matrix.add(row2);

        System.out.println("Basic 2D ArrayList");
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
