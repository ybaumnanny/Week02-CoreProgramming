
class Person {
    protected String name;
    protected int id;

    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display basic details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Interface: Worker
interface Worker {
    void performDuties();
}

// Subclass: Chef
class Chef extends Person implements Worker {
    private String specialty;

    // Constructor
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialty: " + specialty);
    }

    @Override
    public void performDuties() {
        System.out.println("Duties: Prepares meals, ensures kitchen safety, and designs menus.");
    }
}

// Subclass: Waiter
class Waiter extends Person implements Worker {
    private String shift;

    // Constructor
    public Waiter(String name, int id, String shift) {
        super(name, id);
        this.shift = shift;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Shift: " + shift);
    }

    @Override
    public void performDuties() {
        System.out.println("Duties: Takes orders, serves customers, and ensures satisfaction.");
    }
}

// Main Class to Test the System
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        // Create instances of Chef and Waiter
        Chef chef = new Chef("Alice", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("Bob", 102, "Evening Shift");

        // Store references in an array of Worker type
        Worker[] workers = { chef, waiter };

        // Iterate through workers and perform actions
        for (Worker worker : workers) {
            // Downcast to Person to display general details
            if (worker instanceof Person) {
                ((Person) worker).displayDetails();
            }
            // Perform specific duties
            worker.performDuties();
            System.out.println();
        }
    }
}

