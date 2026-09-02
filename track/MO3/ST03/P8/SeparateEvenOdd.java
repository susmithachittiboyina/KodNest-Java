
import java.util.Scanner;

public class SeparateEvenOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int j = n - 1;

        for (int i = 0; i < n / 2; i++) {
            if (a[i] % 2 != 0 && a[j] % 2 == 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j--;
            } else if (a[j] % 2 != 0) {
                j--;
            }
        }

        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
