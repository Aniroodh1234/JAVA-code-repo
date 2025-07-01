import java.util.Scanner;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Employee[] employees = new Employee[5];


        for (int i = 0; i < 2; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            employees[i] = new Employee();

            System.out.print("Enter Employee ID: ");
            employees[i].id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            employees[i].name = sc.nextLine();

            System.out.print("Enter Department: ");
            employees[i].department = sc.nextLine();

            System.out.print("Enter Salary: ");
            employees[i].salary = sc.nextDouble();
        }

        System.out.println("\nEmployee Details:");
        for (int i = 0; i < 5; i++) {
            employees[i].displayDetails();
        }
    }
}
