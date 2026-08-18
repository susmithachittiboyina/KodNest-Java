
import java.util.Scanner;

public class ReplaceMatchingVlaues {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        int replacement = sc.nextInt();

        int count = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                arr[i] = replacement;
                count++;
            }
        }

        System.out.println("Changes: " + count);
        System.out.print("Updated array: ");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);

            if (i < size - 1) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}
