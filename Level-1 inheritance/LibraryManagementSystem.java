class Book {
    protected String title;
    protected int publicationYear;
    // Constructor
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    // Method to display book details
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}
// Subclass Author created
class Author extends Book {
    private String name;
    private String bio;
    // Constructor
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Call superclass constructor
        this.name = name;
        this.bio = bio;
    }
    @Override
    public void displayInfo() {
        super.displayInfo(); // Display book details
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create an Author object (which includes book details)
        Author author = new Author("Effective Java", 2008, "Joshua Bloch", "A software engineer and author known for his contributions to Java.");

        // Display book and author details
        System.out.println("Library Management System:");
        author.displayInfo();
    }
}
