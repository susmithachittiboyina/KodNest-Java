
import java.util.Scanner;

class Freq {

    void countFreq(int ref[], int key) {
        int count = 0;

        for (int i = 0; i < ref.length; i++) {
            if (ref[i] == key) {
                count++;
            }
        }

        System.out.println("Frequency of " + key + ": " + count);
    }
}

public class FrequencyReport {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        Freq freq = new Freq();
        freq.countFreq(arr, key);

        sc.close();
    }
}
