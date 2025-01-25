abstract class Vehicle {
    protected double maxSpeed;
    protected String fuelType;
    // Constructor
    public Vehicle(double maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    public abstract void displayInfo();
    protected void showDetails() {
        System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
    }
}
// Subclass Car created
class Car extends Vehicle {
    private int seatCapacity;
    // Constructor
    public Car(double maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    @Override
    public void displayInfo() {
        super.showDetails();
        System.out.println("Vehicle Type: Car, Seat Capacity: " + seatCapacity);
    }
}
// Subclass Truck created
class Truck extends Vehicle {
    private int loadCapacity; // in tons
    // Constructor
    public Truck(double maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }
    @Override
    public void displayInfo() {
        super.showDetails();
        System.out.println("Vehicle Type: Truck, Load Capacity: " + loadCapacity + " tons");
    }
}
// Subclass Motorcycle created
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    // Constructor
    public Motorcycle(double maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.showDetails();
        System.out.println("Vehicle Type: Motorcycle, Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

// Main class to test the Vehicle hierarchy
public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Creating objects for each subclass
        Vehicle car = new Car(200, "Petrol", 5);
        Vehicle truck = new Truck(120, "Diesel", 15);
        Vehicle motorcycle = new Motorcycle(180, "Petrol", true);
        // Displaying information for each vehicle
        Vehicle[] vehicles = { car, truck, motorcycle };

        // Displaying information for each vehicle using polymorphism
        System.out.println("Vehicle Details:");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println(); // Blank line for readability
        }
    }
}
