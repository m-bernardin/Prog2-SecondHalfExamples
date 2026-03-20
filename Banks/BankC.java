public class BankC extends Bank{
    @Override
    String getBalance() {
        return "balance in bank C: "+balance;
    }
    BankC(double balance){
        super(balance);
    }
}