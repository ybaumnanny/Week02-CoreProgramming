class PalindromeChecker {
    private String text;
    // Constructor to initialize PalindromeChecker with the text
    public PalindromeChecker(String text) {
        this.text = text;
    }
    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedText = new StringBuilder(cleanedText).reverse().toString();
        return cleanedText.equals(reversedText);
    }
    // Method to display the result of the palindrome check
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("'" + text + "' is a palindrome.");
        } else {
            System.out.println("'" + text + "' is not a palindrome.");
        }
    }
}
// Main class to test the PalindromeChecker
public class PalindromeCheckerTest{
    public static void main(String[] args) {
        PalindromeChecker checker1 = new PalindromeChecker("Madam");
        checker1.displayResult();

        PalindromeChecker checker2 = new PalindromeChecker("Hello");
        checker2.displayResult();

        PalindromeChecker checker3 = new PalindromeChecker("A man, a plan, a canal, Panama");
        checker3.displayResult();
    }
}
