
import java.util.Scanner;

public class FirstMatchIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        int index = -1;

        for (int i = 0; i < size; i++) {
            if (target == numbers[i]) {
                index = i;
                break;
            }
        }

        System.out.println("First index: " + index);

        scanner.close();
    }
}
