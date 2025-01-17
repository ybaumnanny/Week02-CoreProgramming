class MobilePhone {
    String brand;
    String model;
    double price;
    // Constructor to initialize the MobilePhone object
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    // Method to display mobile phone details
    void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
}
public class PhoneDetails {
    public static void main(String[] args) {
        // Creating a MobilePhone object
        MobilePhone phone = new MobilePhone("Samsung", "Galaxy S21", 799.99);
        // Displaying the mobile phone details
        phone.displayDetails();
    }
}
