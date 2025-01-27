import java.util.*;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }

    public abstract int getLoanDuration();
}

interface Reservable {
    void reserveItem(String borrower);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean reserved = false;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days loan duration
    }

    @Override
    public void reserveItem(String borrower) {
        if (!reserved) {
            reserved = true;
            System.out.println("Book reserved for: " + borrower);
        } else {
            System.out.println("Book already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !reserved;
    }
}

class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days loan duration
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean reserved = false;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 5; // 5 days loan duration
    }

    @Override
    public void reserveItem(String borrower) {
        if (!reserved) {
            reserved = true;
            System.out.println("DVD reserved for: " + borrower);
        } else {
            System.out.println("DVD already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !reserved;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book("B101", "1984", "George Orwell"));
        items.add(new Magazine("M202", "National Geographic", "Editorial Team"));
        items.add(new DVD("D303", "Inception", "Christopher Nolan"));

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                System.out.println("Available: " + reservable.checkAvailability());
                reservable.reserveItem("John Doe");
                System.out.println("Available after reservation: " + reservable.checkAvailability());
            }
        }
    }
}
