import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int start;

        if (n1 < n2) {
            start = n1;
        } else {
            start = n2;
        }

        for (int i = start; i >= 1; i--) {

            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println("GCD = " + i);
                break;
            }
        }
    }
}