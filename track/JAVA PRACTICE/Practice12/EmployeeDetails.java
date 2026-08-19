
import java.util.Scanner;

class Employee {

    int id;
    String name;
    double salary;
    String email;

    Employee(int id, String name, double salary, String email) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.email = email;
    }

    void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Email: " + email);
    }

}

public class EmployeeDetails {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        double salary = sc.nextDouble();
        sc.nextLine();
        String email = sc.nextLine();
        Employee e = new Employee(id, name, salary, email);
        e.display();
    }
}
