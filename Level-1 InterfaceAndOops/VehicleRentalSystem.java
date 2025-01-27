import java.util.*;
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
	public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getRentalRate() {
        return rentalRate;
    }
    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }
    public abstract double calculateRentalCost(int days);
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: " + rentalRate + " per day");
    }
}
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}
class Car extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.05;
    private String insurancePolicyNumber;
    public Car(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    @Override
    public double calculateInsurance() {
        return getRentalRate() * INSURANCE_RATE;
    }
    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy Number: " + insurancePolicyNumber;
    }
}
class Bike extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.03;
    private String insurancePolicyNumber;
    public Bike(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    @Override
    public double calculateInsurance() {
        return getRentalRate() * INSURANCE_RATE;
    }
    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy Number: " + insurancePolicyNumber;
    }
}
class Truck extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.1;
    private String insurancePolicyNumber;
    public Truck(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    @Override
    public double calculateInsurance() {
        return getRentalRate() * INSURANCE_RATE;
    }
    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy Number: " + insurancePolicyNumber;
    }
}
public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        // Add vehicles to the list
        Car car = new Car("MH12AB1234", "Car", 1000, "CAR-12345");
        Bike bike = new Bike("MH14XY5678", "Bike", 300, "BIKE-56789");
        Truck truck = new Truck("MH15TR9876", "Truck", 2000, "TRUCK-98765");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);
        // Iterate through the list and display details
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            int rentalDays = 5; // Example: Rent for 5 days
            double rentalCost = vehicle.calculateRentalCost(rentalDays);

            System.out.println("Rental Cost for " + rentalDays + " days: " + rentalCost);
            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Insurance Cost: " + insurable.calculateInsurance());
                System.out.println(insurable.getInsuranceDetails());
            }
        }
    }
}
