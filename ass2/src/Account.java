public class Account {
    private String accNumber;
    private int balance;

    public Account(String accNumber, int balance) {
    }

    public void Vehicle(String accNumber, int balance) {
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
class SavingAccount extends Account{
    private int interest;

    public SavingAccount(String accNumber, int balance, int interest){
        super(accNumber,balance);
        this.interest = interest;



    }

    public void deposit(){
        System.out.println("Cash deposited in Savings \n" + "account”.");
    }
    public void ShareHolder(){
        System.out.println("Eligable for share holder");
    }

}

