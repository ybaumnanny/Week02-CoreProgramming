import java.util.*;
abstract class Employee {
    private int employeeID;
    private String name;
    private double baseSalary;

    public Employee(int employeeID, String name, double baseSalary) {
        this.employeeID = employeeID;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }    
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID is: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("His Base Salary: " + baseSalary);
    }
}

interface Department {
    void assignDepartment(String departmentName);

    String getDepartmentDetails();
}

// Subclass FullTimeEmployee
class FullTimeEmployee extends Employee implements Department {
    private double monthlySalary;
    private String departmentName;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double monthlySalary) {
        super(employeeId, name, baseSalary);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }
}

// Subclass PartTimeEmployee
class PartTimeEmployee extends Employee implements Department {
    private double hourlyRate;
    private int hoursWorked;
    private String departmentName;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, double hourlyRate, int hoursWorked) {
        super(employeeId, name, baseSalary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();

        // Add FullTimeEmployee and PartTimeEmployee
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee(1, "Yaman Mahtha", 50000, 70000);
        fullTimeEmp.assignDepartment("Engineering");

        PartTimeEmployee partTimeEmp = new PartTimeEmployee(2, "Dugdugi", 200000, 50, 100);
        partTimeEmp.assignDepartment("Support");

        employees.add(fullTimeEmp);
        employees.add(partTimeEmp);

        // Process and display employee details
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Salary: " + emp.calculateSalary());

            if (emp instanceof Department) {
                Department dept = (Department) emp;
                System.out.println(dept.getDepartmentDetails());
            }
        }
    }
}
