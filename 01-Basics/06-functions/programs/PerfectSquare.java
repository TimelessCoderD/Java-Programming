package programs;
import java.util.Scanner;

public class PerfectSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean isPerfectSquare = false;

        for (int i = 1; i * i <= n; i++) {

            if (i * i == n) {
                isPerfectSquare = true;
                break;
            }
        }

        if (isPerfectSquare) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not a Perfect Square");
        }
    }
}