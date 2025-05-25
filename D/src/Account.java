// Base class representing a general bank account
class Account {
    private String accNumber;  // Account number
    private int balance;       // Account balance

    // Constructor to initialize account number and balance
    public Account(String accNumber, int balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    // Method to simulate cash deposit
    public void deposit() {
        System.out.println("Cash deposited");
    }

    // Method to simulate cash withdrawal
    public void withdraw() {
        System.out.println("Cash withdrawn");
    }
}

// Derived class representing a savings account
class SavingsAccount extends Account {
    private int interest;  // Interest rate

    // Constructor to initialize account number, balance, and interest
    public SavingsAccount(String accNumber, int balance, int interest) {
        super(accNumber, balance); // Call to base class constructor
        this.interest = interest;
    }

    // Overridden deposit method for savings account
    @Override
    public void deposit() {
        super.deposit();  // Call base class deposit method
        System.out.println("Cash deposited in Savings account");
    }

    // Method to show eligibility for shareholder
    public void shareHolder() {
        System.out.println("Eligible for being a shareholder");
    }
}

// Main class to run the program
class Main {
    public static void main(String[] args) {
        // Creating an object of SavingsAccount
        SavingsAccount acc = new SavingsAccount("370", 1500, 4);

        // Calling deposit method (overridden)
        acc.deposit();

        // Calling method specific to SavingsAccount
        acc.shareHolder();
    }
}
