
import java.util.Scanner;

public class EvenandOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int even = 0;
        int odd = 0;

        for (int i = 1; i <= n; i++) {
            if (scanner.nextInt() % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }

        System.out.println(even + " " + odd);

        scanner.close();
    }
}
