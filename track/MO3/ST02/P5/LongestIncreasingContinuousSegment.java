
import java.util.Scanner;

public class LongestIncreasingContinuousSegment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 1;
        int max = 1;
        int previous = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            int current = scanner.nextInt();

            if (current > previous) {
                count++;
            } else {
                count = 1;
            }

            if (count > max) {
                max = count;
            }

            previous = current;
        }

        System.out.println(max);
        scanner.close();
    }
}
