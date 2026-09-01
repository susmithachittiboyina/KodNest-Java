
import java.util.Scanner;

public class SearchforaGivenValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                System.out.println(i);
                found = true;
                break;
            }
        }

        if (found == false) {
            System.out.println(-1);
        }

        scanner.close();
    }
}
