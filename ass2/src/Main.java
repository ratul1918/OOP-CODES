public class Account {
    // Private attributes
    private String accNumber;
    private int balance;

    // Constructor
    public Account(String accNumber, int balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    // Method to simulate deposit
    public void deposit() {
        System.out.println("Cash deposited");
    }

    // Method to simulate withdrawal
    public void withdraw() {
        System.out.println("Cash withdrawn");
    }
}

// Child class SavingsAccount that inherits Account
class SavingsAccount extends Account {
    // Private attribute
    private int interest;

    // Constructor to initialize attributes
    public SavingsAccount(String accNumber, int balance, int interest) {
        super(accNumber, balance); // Call to parent class constructor
        this.interest = interest;
    }

    // Overriding the deposit method
    @Override
    public void deposit() {
        super.deposit(); // Call the parent class deposit method
        System.out.println("Cash deposited in Savings account");
    }

    // Method to print shareholder eligibility
    public void shareHolder() {
        System.out.println("Eligible for being a shareholder");
    }
}



public class Main {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount acc = new SavingsAccount("1234", 1500, 1);

        // Call the overridden deposit method
        acc.deposit();

        // Call the shareHolder method
        acc.shareHolder();
    }
}