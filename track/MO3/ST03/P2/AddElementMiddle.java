
import java.util.Scanner;

class AddElementMiddle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = {10, 30, 50, 70};
        int b[] = new int[a.length + 1];
        int index = scanner.nextInt();
        int value = scanner.nextInt();
        int j = 0;
        for (int i = 0; i < b.length; i++) {
            if (i != index) {
                b[i] = a[j];
                j++;
            } else {
                b[i] = value;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
