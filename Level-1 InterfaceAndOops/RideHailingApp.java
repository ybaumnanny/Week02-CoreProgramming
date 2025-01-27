import java.util.*;
abstract class Vehicle {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;
    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }
    public int getVehicleId() {
        return vehicleId;
    }
    public String getDriverName() {
        return driverName;
    }
    public double getRatePerKm() {
        return ratePerKm;
    }
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: ₹" + ratePerKm);
    }
    public abstract double calculateFare(double distance);
}
interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}
class Car extends Vehicle implements GPS {
    private String currentLocation;
    public Car(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
    @Override
    public String getCurrentLocation() {
        return currentLocation != null ? currentLocation : "Location not set";
    }
    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }
}
class Bike extends Vehicle implements GPS {
    private String currentLocation;
    public Bike(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.9; // 10% discount for bikes
    }
    @Override
    public String getCurrentLocation() {
        return currentLocation != null ? currentLocation : "Location not set";
    }
    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }
}
class Auto extends Vehicle implements GPS {
    private String currentLocation;
    public Auto(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.95; // 5% discount for autos
    }
    @Override
    public String getCurrentLocation() {
        return currentLocation != null ? currentLocation : "Location not set";
    }
    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }
}
public class RideHailingApp {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        // Add vehicles with Indian driver names
        Car car = new Car(101, "Ramesh Kumar", 20.0);
        car.updateLocation("Indira Nagar, Bengaluru");

        Bike bike = new Bike(102, "Pooja Sharma", 10.0);
        bike.updateLocation("MG Road, Mumbai");

        Auto auto = new Auto(103, "Rajesh Singh", 12.0);
        auto.updateLocation("Connaught Place, Delhi");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);
        // Calculate fare for a distance of 15 km
        double distance = 15.0;
        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();
            System.out.println("Current Location: " + ((GPS) vehicle).getCurrentLocation());
            System.out.println("Fare for " + distance + " km: ₹" + vehicle.calculateFare(distance));
        }
    }
}
