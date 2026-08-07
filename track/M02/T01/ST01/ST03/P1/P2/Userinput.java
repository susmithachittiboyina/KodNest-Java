
import java.util.Scanner;

public class Userinput1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Age : ");
        int age = scan.nextInt();
        System.out.println("Age : " + age);

        System.out.println("Enter the Height : ");
        float height = scan.nextFloat();
        System.out.println("Height : " + height);

        scan.nextLine();

        System.out.println("Enter the Full name : ");
        String fname = scan.nextLine();
        System.out.println("Full name : " + fname);
    }
}
