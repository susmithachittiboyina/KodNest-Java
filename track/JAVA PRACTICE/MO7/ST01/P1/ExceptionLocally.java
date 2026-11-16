
import java.util.Scanner;

class ExceptionLocally {

    public static void main(String[] args) {
        System.out.println("Main method Execution Started....");
        divide();
        System.out.println("Mian method Execution Completed....");
    }

    static void divide() {
        try {
            System.out.println("Division started");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a:");
            int a = sc.nextInt();
            System.out.println("Enter b:");
            int b = sc.nextInt();
            int res = a / b;
            System.out.println(res);
        } catch (Exception e) {
            System.out.println("Exception handled in divide method");
        }
        System.out.println("Division completed");
    }
}
