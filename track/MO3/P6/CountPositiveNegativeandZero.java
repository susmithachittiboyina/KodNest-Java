
import java.util.Scanner;

public class CountPositiveNegativeandZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 1; i <= n; i++) {
            int number = scanner.nextInt();

            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println(positive + " " + negative + " " + zero);

        scanner.close();
    }
}
