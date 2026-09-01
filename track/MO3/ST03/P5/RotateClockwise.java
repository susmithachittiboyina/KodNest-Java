
import java.util.Scanner;

class RotateClockwise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = {12, 23, 34, 45};
        int temp = a[a.length - 1];
        for (int i = 2; i >= 0; i--) {
            a[i + 1] = a[i];
        }
        a[0] = temp;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
