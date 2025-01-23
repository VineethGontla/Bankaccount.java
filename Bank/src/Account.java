public class Account {
    // Instance variables
    private String name;
    private double balance;

    // Constructor to initialize name and balance
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Method to add amount to the balance (Credit)
    public void credit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println(amount + " credited. New balance: " + balance);
        } else if (amount == 0) {
            System.out.println("Credit amount cannot be zero. No change in balance.");
        } else {
            System.out.println("Credit amount must be positive.");
        }
    }

    // Method to withdraw amount from the balance (Debit)
    public void debit(double amount) {
        if (amount <= balance && amount > 0) {
            balance = balance - amount;
            System.out.println(amount + " debited. New balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance for this withdrawal.");
        } else {
            System.out.println("Debit amount must be positive.");
        }
    }

    // Getter method to get the balance
    public double getBalance() {
        return balance;
    }

    // Getter method to get the account holder's name
    public String getName() {
        return name;
    }

    // Main method to test the Account class
    public static void main(String[] args) {
        Account acc1 = new Account("Vineeth", 10000); // Creating an Account object

        // Display account holder's name and initial balance
        System.out.println("Account Holder: " + acc1.getName());
        System.out.println("Initial Balance: " + acc1.getBalance());

        // Credit amount to the account (add money)
        acc1.credit(10); // Credit 0, should display an appropriate message

        // Debit amount from the account (withdraw money)
        acc1.debit(3000); // Deducts 3000 from the balance

        // Try debiting more than the balance
        acc1.debit(12000); // Attempts to withdraw more than the available balance
    }
}
