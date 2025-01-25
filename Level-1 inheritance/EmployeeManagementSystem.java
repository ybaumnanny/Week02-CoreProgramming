abstract class Employee {
    protected String name;
    protected int id;        
    protected double salary; 
    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public abstract void showRoleSpecificDetails();
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + salary);
    }
}
// Subclass Manager
class Manager extends Employee {
    private int teamSize;

    // Constructor
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    @Override
    public void showRoleSpecificDetails() {
        System.out.println("Role: Manager, Team Size: " + teamSize);
    }
}
// Subclass Developer
class Developer extends Employee {
    private String programmingLanguage;

    // Constructor
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void showRoleSpecificDetails() {
        System.out.println("Role: Developer, Programming Language: " + programmingLanguage);
    }
}
// Subclass Intern
class Intern extends Employee {
    private String departmentIntern;

    // Constructor
    public Intern(String name, int id, double salary, String departmentIntern) {
        super(name, id, salary);
        this.departmentIntern = departmentIntern;
    }
    @Override
    public void showRoleSpecificDetails() {
        System.out.println("Role: Intern, Department: " + departmentIntern);
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating objects for each role
        Employee manager = new Manager("Yaman", 101, 90000, 10);
        Employee developer = new Developer("Kapil", 102, 75000, "Java");
        Employee intern = new Intern("Mohit", 103, 30000, "Human Resources");

        // Displaying details for each employee
        System.out.println("Employee Details:");
        manager.displayDetails();
        manager.showRoleSpecificDetails();

        System.out.println();
        developer.displayDetails();
        developer.showRoleSpecificDetails();

        System.out.println();
        intern.displayDetails();
        intern.showRoleSpecificDetails();
    }
}
