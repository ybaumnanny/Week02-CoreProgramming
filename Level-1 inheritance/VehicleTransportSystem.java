class Vehicle {
    protected String model;
    protected int maxSpeed;

    // Constructor
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Method to display basic details
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface: Refuelable
interface Refuelable {
    void refuel();
}

// Subclass: ElectricVehicle
class ElectricVehicle extends Vehicle {
    private int batteryCapacity; // in kWh

    // Constructor
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    // Method to charge the vehicle
    public void charge() {
        System.out.println("Charging the electric vehicle...");
    }
}

// Subclass: PetrolVehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelCapacity; // in liters

    // Constructor
    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }

    // Method to refuel the vehicle
    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle...");
    }
}

// Main Class to Test the System
public class VehicleTransportSystem {
    public static void main(String[] args) {
        // Create instances of ElectricVehicle and PetrolVehicle
        ElectricVehicle tesla = new ElectricVehicle("Tesla Model S", 250, 100);
        PetrolVehicle ford = new PetrolVehicle("Ford Mustang", 240, 60);

        // Display details and specific functionality for ElectricVehicle
        System.out.println("Electric Vehicle Details:");
        tesla.displayDetails();
        tesla.charge();
        System.out.println();

        // Display details and specific functionality for PetrolVehicle
        System.out.println("Petrol Vehicle Details:");
        ford.displayDetails();
        ford.refuel();
    }
}