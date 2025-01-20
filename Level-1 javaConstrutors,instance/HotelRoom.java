class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
    // Method to display booking information
    public void displayBooking() {
        System.out.println("Guest: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}
    public class HotelRoom{
    public static void main(String[] args) {
        // Calling default constructor
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Booking 1:");
        booking1.displayBooking();

        // Calling parameterized constructor
        HotelBooking booking2 = new HotelBooking("Jacqueline", "Suite", 3);
        System.out.println("\nBooking 2:");
        booking2.displayBooking();

        // Calling copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("\nBooking 3 (Copy of Booking 2):");
        booking3.displayBooking();
    }
    }