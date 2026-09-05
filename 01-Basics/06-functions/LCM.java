import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int start;

        if (n1 > n2) {
            start = n1;
        } else {
            start = n2;
        }

        for (int i = start; ; i++) {

            if (i % n1 == 0 && i % n2 == 0) {
                System.out.println("LCM = " + i);
                break;
            }
        }
    }
}