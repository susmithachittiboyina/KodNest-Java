
import java.util.Scanner;

public class ArrayProblemSolving {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] array = new int[n];

        int arrayTotal = 0;

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            arrayTotal += array[i];
        }

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        int matrixTotal = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
                matrixTotal += matrix[i][j];
            }
        }

        // Display results
        System.out.println("Array total: " + arrayTotal);
        System.out.println("Matrix total: " + matrixTotal);

        sc.close();
    }
}
