
import java.util.Scanner;

public class CountValueswithinaGivenRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        int lower = scanner.nextInt();
        int upper = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= lower && a[i] <= upper) {
                count++;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}
