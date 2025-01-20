 class Book {
    String title;
    String author;
    int price;

    // Default constructor
    public Book() {
        this.title = "LIFE OF PI";
        this.author = "Yann Martel";
        this.price = 1250;
    }

    // Parameterized constructor
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Print method
    public void print() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

class BookDetails {
    // Main method
    public static void main(String[] args) {
        // Calling default constructor
        Book defaultBook = new Book();
        defaultBook.print();

        // Calling parameterized constructor
        Book parameterizedBook = new Book("Two Men in a Boat", "Joshua Bloch", 1599);
        parameterizedBook.print();
    }
}
