
import java.util.Scanner;

class PracticeTask {

    int id;

    PracticeTask(int id) {
        this.id = id;
    }
}

public class ReferenceRelay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PracticeTask first = new PracticeTask(scanner.nextInt());
        PracticeTask second = new PracticeTask(scanner.nextInt());
        PracticeTask third = new PracticeTask(scanner.nextInt());

        int unreachableID = first.id;

        PracticeTask relay = first;

        first = second;

        relay = third;
        second = relay;

        relay = first;
        third = relay;
        relay = second;

        System.out.println("First Reference: " + first.id);
        System.out.println("Second Reference: " + second.id);
        System.out.println("Third Reference: " + third.id);
        System.out.println("Relay Reference: " + relay.id);
        System.out.println("Unreachable Object: " + unreachableID);
    }
}
