
import java.util.Scanner;

public class Array3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[5];
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            total = total + arr[i];
        }

        System.out.println("Total: " + total);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        scan.close();
    }
}
