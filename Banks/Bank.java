public abstract class Bank{
    double balance;
    abstract String getBalance();
    Bank(double balance){
        this.balance=balance;
    }
    void deposit(double deposit){
        balance+=deposit;
    }
    boolean withdraw(double deposit){
        if(balance-deposit<=0)return false;
        else{
            balance-=deposit;
            return true;
        }
    }
}