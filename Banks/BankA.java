public class BankA extends Bank{
    @Override
    String getBalance() {
        return "balance in bank A: "+balance;
    }
    BankA(double balance){
        super(balance);
    }
}