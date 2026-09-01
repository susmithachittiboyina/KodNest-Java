
import java.util.Scanner;

public class NonRepeatingValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                result = arr[i];
                break;
            }
        }

        System.out.println(result);
    }
}
