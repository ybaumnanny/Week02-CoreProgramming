class Device {
    protected String deviceId;
    protected String status;
    // Constructor
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    // Method to display 
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}
// Subclass Thermostat created
class Thermostat extends Device {
    private double temperatureSetting;
    // Constructor
    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status); // Call the superclass constructor
        this.temperatureSetting = temperatureSetting;
    }
    @Override
    public void displayStatus() {
        super.displayStatus(); // Display general device information
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
public class SmartHomeSystem {
    public static void main(String[] args) {
        // Create a Thermostat object
        Thermostat thermostat = new Thermostat("T13650", "Online", 20.5);

        // Display the thermostat's status
        System.out.println("Smart Home System Status:");
        thermostat.displayStatus();
    }
}
