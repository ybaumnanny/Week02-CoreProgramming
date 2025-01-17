class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor to initialize BankAccount with account holder, account number, and balance
    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public void  setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }
    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }
}
// Main class to test the BankAccount functionality
public class BankAccountTest{
    public static void main(String[] args) {
        // Create a new BankAccount instance
        BankAccount account = new BankAccount("John Doe", "123456789", 1000.00);

        // Display the initial balance
        account.displayBalance();

        // Deposit money
        account.deposit(500.00);

        // Display the updated balance
        account.displayBalance();

        // Attempt to withdraw money
        account.withdraw(300.00);

        // Display the updated balance
        account.displayBalance();

        // Attempt to withdraw more than the balance
        account.withdraw(1500.00);
    }
}
