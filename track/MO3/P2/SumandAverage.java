
import java.util.Scanner;

public class SumandAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long sum = 0;
        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        double average = (double) sum / n;

        System.out.println(sum);
        System.out.printf("%.2f", average);

        scanner.close();
    }
}
