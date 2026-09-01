
import java.util.Scanner;

public class ValueClosesttoaTarget {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long arr[] = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }

        long target = scanner.nextLong();
        long closest = arr[0];
        long minDiff = Math.abs(arr[0] - target);

        for (int i = 0; i < n; i++) {
            long diff = Math.abs(arr[i] - target);

            if (diff < minDiff || (diff == minDiff && arr[i] < closest)) {
                minDiff = diff;
                closest = arr[i];
            }
        }

        System.out.println(closest);
        scanner.close();
    }
}
