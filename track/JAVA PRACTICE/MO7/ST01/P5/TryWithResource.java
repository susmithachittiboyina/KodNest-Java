
import java.util.Scanner;

class TrywithResource {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a: ");
            int age = sc.nextInt();
            System.out.println("Age: " + age);
        }
    }
}
