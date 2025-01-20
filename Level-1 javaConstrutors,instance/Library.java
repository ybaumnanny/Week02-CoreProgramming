 class Book {
    String title;
    String author;
    double price;
    boolean isAvailable;

    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        this.isAvailable = true;
    }

    // Parameterized constructor
    public Book(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Copy constructor
    public Book(Book book) {
        this.title = book.title;
        this.author = book.author;
        this.price = book.price;
        this.isAvailable = book.isAvailable;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed \"" + title + "\".");
            return true;
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently unavailable.");
            return false;
        }
    }
}

// Library class with main method
    class Library {
    public static void main(String[] args) {
        // Calling the default constructor
        Book book1 = new Book();
        System.out.println("Book1 - Title: " + book1.title + ", Author: " + book1.author);

        // Calling the parameterized constructor
        Book book2 = new Book("1984", "George Orwell", 8.99, true);
        System.out.println("Book2 - Title: " + book2.title + ", Author: " + book2.author);

        // Calling the copy constructor
        Book book3 = new Book(book2);
        System.out.println("Book3 (copy of Book2) - Title: " + book3.title + ", Author: " + book3.author);

        // Borrowing book2
        book2.borrowBook(); // Should print: You have successfully borrowed "1984".

        // Borrowing book3, which is still available as it's a separate copy
        book3.borrowBook(); // Should print: You have successfully borrowed "1984".
    }
}
