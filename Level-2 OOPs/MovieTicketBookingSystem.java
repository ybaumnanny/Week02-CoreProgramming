class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    // Constructor to initialize MovieTicket with movie name and price
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "";
        this.price = 0.0;
    }
    // Method to book a ticket by assigning a seat and updating price
    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully for movie: " + movieName);
    }
    // Method to display ticket details
    public void printTicketDetails() {
        if (seatNumber.isEmpty()) {
            System.out.println("No ticket booked yet.");
        } else {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Ticket Price: $" + price);
        }
    }
}

// Main class to test MovieTicket class
public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        // Create a MovieTicket object for a specific movie
        MovieTicket ticket = new MovieTicket("Avatar 2");

        // Book the ticket by assigning a seat number and price
        ticket.bookTicket("A12", 15.50);

        // Print ticket details
        ticket.printTicketDetails();
    }
}
