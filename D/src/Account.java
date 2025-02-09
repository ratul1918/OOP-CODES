class Account {
    private String accNumber;
    private int balance;

    public Account(String accNumber, int balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }
    public void deposit() {
        System.out.println("Cash deposited");
    }
    public void withdraw() {
        System.out.println("Cash withdrawn");
    }
}
class SavingsAccount extends Account {
    private int interest;
    public SavingsAccount(String accNumber, int balance, int interest) {
        super(accNumber, balance);
        this.interest = interest;
    }
    @Override
    public void deposit() {
        super.deposit();
        System.out.println("Cash deposited in Savings account");
    }
    public void shareHolder() {
        System.out.println("Eligible for being a shareholder");
    }
}
class Main {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount("370", 1500, 4);

        acc.deposit();
        acc.shareHolder();
    }
}
