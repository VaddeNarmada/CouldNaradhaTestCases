import java.util.ArrayList;
import java.util.List;

// Main class
public class EmployeeManagementSystem {

    // Static inner Employee class
    static class Employee {
        // Attributes
        private int id;
        private String name;
        private double salary;

        // Constructor
        public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        // Method to display employee details
        public void displayDetails() {
            System.out.println("Employee ID: " + id);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee Salary: " + salary);
            System.out.println(); // For better readability
        }
    }

    public static void main(String[] args) {
        // Create at least 3 Employee objects
        Employee emp1 = new Employee(1, "John Doe", 50000.0);
        Employee emp2 = new Employee(2, "Jane Smith", 60000.0);
        Employee emp3 = new Employee(3, "Alice Johnson", 55000.0);

        // Store them in a list
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        // Display their details
        for (Employee emp : employeeList) {
            emp.displayDetails();
        }
    }
}
