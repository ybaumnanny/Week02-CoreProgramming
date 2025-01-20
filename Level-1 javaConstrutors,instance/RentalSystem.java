public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Unknown Model";
        this.rentalDays = 0;
        this.dailyRate = 50.0; // Default daily rate
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    // Copy constructor
    public CarRental(CarRental rental) {
        this.customerName = rental.customerName;
        this.carModel = rental.carModel;
        this.rentalDays = rental.rentalDays;
        this.dailyRate = rental.dailyRate;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }
}

// RentalSystem class with main method
public class RentalSystem {
    public static void main(String[] args) {
        // Using the default constructor
        CarRental rental1 = new CarRental();
        System.out.println("Rental1 - Customer: " + rental1.customerName + ", Car Model: " + rental1.carModel);

        // Using the parameterized constructor
        CarRental rental2 = new CarRental("Alice Johnson", "Toyota Camry", 5, 60.0);
        System.out.println("Rental2 - Customer: " + rental2.customerName + ", Car Model: " + rental2.carModel);
        System.out.println("Total Cost for Rental2: $" + rental2.calculateTotalCost());

        // Using the copy constructor
        CarRental rental3 = new CarRental(rental2);
        System.out.println("Rental3 (copy of Rental2) - Customer: " + rental3.customerName + ", Car Model: " + rental3.carModel);
        System.out.println("Total Cost for Rental3: $" + rental3.calculateTotalCost());
    }
}