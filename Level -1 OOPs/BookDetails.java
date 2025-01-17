class Book{
    String bookTitle, bookAuthor;
    double bookPrice;

    Book(String bookTitle, String boobkAuthor, double bookPrice){
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
    }
    public void printBookDetails(){
        System.out.println("Title of the book is : " + bookTitle);
        System.out.println("and the name of the book's Author is " + bookAuthor);
        System.out.println("Book's price is Rs " + bookPrice);
        
    }
    public class BookDetails{
        public static void main(String[] args) {
            
            Book b1 = new Book("Life of Moye", "Yaman Moye", 12250);
            b1.printBookDetails();
        }

    } 


}