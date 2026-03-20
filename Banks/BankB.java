public class BankB extends Bank{
    @Override
    String getBalance() {
        return "balance in bank B: "+balance;
    }
    BankB(double balance){
        super(balance);
    }
}