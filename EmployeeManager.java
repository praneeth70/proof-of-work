//EMPLOYEE MANAGEMENT BASED CONSOLE
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("\n==== Employee Manager ====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();

                employees.add(new Employee(id, name, salary));
                System.out.println("Employee added successfully!");
            }
            else if (choice == 2) {
                System.out.println("\n--- Employee List ---");
                for (Employee e : employees) {
                    System.out.println(e.id + " | " + e.name + " | " + e.salary);
                }
            }
            else {
                System.out.println("Exiting...");
                break;
            }
        }
        sc.close();
    }
}
