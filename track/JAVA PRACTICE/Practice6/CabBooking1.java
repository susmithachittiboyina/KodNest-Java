
import java.util.Scanner;

class CabBooking {

    String passengerName;
    String cabType;
    int distance;
    int fare;

    CabBooking(String passengerName) {
        this.passengerName = passengerName;
        this.cabType = "Mini";
        this.distance = 5;
        this.fare = 75;
    }

    CabBooking(String passengerName, String cabType, int distance) {
        this.passengerName = passengerName;
        this.cabType = cabType;
        this.distance = distance;
        this.fare = distance * 15;
    }

    void displayBooking() {
        System.out.println("Passenger: " + passengerName);
        System.out.println("Cab Type: " + cabType);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: Rs. " + fare);
    }
}

public class CabBooking1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            String passengerName = scanner.nextLine();

            CabBooking booking = new CabBooking(passengerName);
            booking.displayBooking();

        } else if (choice == 2) {
            String passengerName = scanner.nextLine();
            String cabType = scanner.nextLine();
            int distance = scanner.nextInt();

            CabBooking booking = new CabBooking(passengerName, cabType, distance);
            booking.displayBooking();
        }
    }
}
