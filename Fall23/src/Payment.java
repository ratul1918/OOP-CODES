public abstract class Payment implements Transaction{
    double amount;
    String currency ="BDT";

    public Payment(double amount, String currency){
        this.amount=amount;
        this.currency=currency;
    }

    @Override
    public void give() {


    }

    @Override
    public void receive() {

    }
}
