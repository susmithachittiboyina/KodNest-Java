
import java.util.Scanner;

public class Array4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter the elements: ");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Array Elements are: ");
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(a[i] + " ");
        }
        int sum = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            sum = sum + a[i];
        }
        System.out.println("Total: " + sum);
    }
}
