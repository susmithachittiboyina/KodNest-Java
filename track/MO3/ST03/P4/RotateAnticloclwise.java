
import java.util.Scanner;

class RotateAnticlockwise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = {12, 23, 34, 45};
        int temp = a[0];
        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];
        }
        a[a.length - 1] = temp;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
