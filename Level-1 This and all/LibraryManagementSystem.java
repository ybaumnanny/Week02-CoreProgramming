/*
 * Library Management System
Create a Book class to manage library books with the following features:
Static:
A static variable libraryName shared across all books.
A static method displayLibraryName() to print the library name.
This:
Use this to initialize title, author, and isbn in the constructor.
Final:
Use a final variable isbn to ensure the unique identifier of a book cannot be changed.
Instanceof:
Verify if an object is an instance of the Book class before displaying its details.
*/

class Book {
    // Static variable shared across all books
    private static String libraryName = "City Central Library";

    // Final variable to ensure unique identifier cannot be changed
    private final String isbn;

    private String title;
    private String author;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;       // Resolves ambiguity using 'this'
        this.author = author;     // Resolves ambiguity using 'this'
        this.isbn = isbn;         // Assigns the unique ISBN
    }

    // Static method to display the library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details
    public void displayBookDetails() {
        if (this instanceof Book) { // Check if the object is an instance of Book
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid book object!");
        }
    }
}

// LibraryManagementSystem class to test the Book class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Display library name (static method)
        Book.displayLibraryName();

        // Create book objects
        Book book1 = new Book("1984", "George Orwell", "9780451524935");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");

        // Display book details
        System.out.println("\nBook 1 Details:");
        book1.displayBookDetails();

        System.out.println("\nBook 2 Details:");
        book2.displayBookDetails();
    }
}
