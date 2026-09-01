
import java.util.Scanner;

public class TwoArraysareIdentical {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int b[] = new int[m];

        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        if (n != m) {
            System.out.println(0);
        } else {
            int result = 1;

            for (int i = 0; i < n; i++) {
                if (a[i] != b[i]) {
                    result = 0;
                    break;
                }
            }

            System.out.println(result);
        }
    }
}
