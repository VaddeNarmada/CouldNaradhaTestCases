import java.util.ArrayList;

class Employee {
    int id;
    String name;
    double salary;

    // Constructor
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a list to store Employee objects
        ArrayList<Employee> employees = new ArrayList<>();

        // Add at least 3 Employee objects
        employees.add(new Employee(101, "John Doe", 50000.0));
        employees.add(new Employee(102, "Jane Smith", 60000.5));
        employees.add(new Employee(103, "Alice Brown", 55000.75));

        // Display all employee details
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
