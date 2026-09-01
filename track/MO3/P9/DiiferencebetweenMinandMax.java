
import java.util.Scanner;

public class DiiferencebetweenMinandMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            long num = scanner.nextLong();

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        System.out.println(max - min);

        scanner.close();
    }
}
