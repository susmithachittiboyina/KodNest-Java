
import java.util.Scanner;

class UnderAgeException extends Exception {

    UnderAgeException() {
        super("you are too young.... you have more time");
    }
}

class OverAgeException extends Exception {

    OverAgeException() {
        super("you are too old....take rest");
    }
}

class DrivingLicence {

    int age;

    void takeUserAge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        age = sc.nextInt();
    }

    void verify() throws UnderAgeException, OverAgeException {
        if (age < 18) {
            throw new UnderAgeException();
        } else if (age > 65) {
            throw new OverAgeException();
        } else {
            System.out.println("Driving licence issue......");
        }
    }

}

class DLApplication {

    public static void main(String[] args) {
        DrivingLicence dl = new DrivingLicence();
        dl.takeUserAge();
        try {
            dl.verify();
        } catch (UnderAgeException | OverAgeException e) {
            e.printStackTrace();
        }
    }

}
