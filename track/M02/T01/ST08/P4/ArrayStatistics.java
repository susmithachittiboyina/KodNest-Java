
import java.util.Scanner;

public class ArrayStatistics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int minimum = array[0];
        int maximum = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }

            if (array[i] > maximum) {
                maximum = array[i];
            }
        }

        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);

        sc.close();
    }
}
