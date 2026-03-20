public class BankDriver {
    public static void main(String[] args) {
        BankA a=new BankA();
        BankB b=new BankB();
        BankC c=new BankC();
        System.out.println("bank A balance: "+a.getBalance()+"; bank B: "+b.getBalance()+"; bank C: "+c.getBalance());
    }
}