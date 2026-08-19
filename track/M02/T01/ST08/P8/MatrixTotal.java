
import java.util.Scanner;

public class MatrixTotal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            int rowTotal = 0;  // Reset for every row

            for (int j = 0; j < columns; j++) {
                int value = sc.nextInt();
                rowTotal += value;
            }

            System.out.println("Row " + i + " total: " + rowTotal);
        }

        sc.close();
    }
}
