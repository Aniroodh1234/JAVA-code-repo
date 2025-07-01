class Employee {
    String name, address;
    int yearOfJoining;

    Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    void display() {
        System.out.printf("%-10s %-10d %-10s\n", name, yearOfJoining, address);
    }
}
    public class EmployeeDetails {
    public static void main(String[] args) {
        System.out.printf("%-10s %-10s %-10s\n", "Name", "Year", "Address");
        Employee e1 = new Employee("Ujwal", 2024, "BBS");
        Employee e2 = new Employee("Ravi", 2023, "KUR");

        e1.display();
        e2.display();
    }
}