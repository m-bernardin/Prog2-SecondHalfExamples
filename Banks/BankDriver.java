import java.util.Scanner;

public class BankDriver {
    public static void main(String[] args) {
        BankA a=new BankA(100);
        BankB b=new BankB(150);
        BankC c=new BankC(200);
        boolean running=true;
        Scanner input=new Scanner(System.in);
        while (running) {
            System.out.print("Please select a bank\n1. A\n2. B\n3. C\n4. quit\n> ");
            switch (input.nextInt()) {
                case 1:
                    subMenu(a);
                    break;
                case 2:
                    subMenu(b);
                    break;
                case 3:
                    subMenu(c);
                    break;
                case 4:
                    running=false;
                    input.close();
                    break;
                default:
                    System.out.println("Please select a valid option");
                    break;
            }
        }
    }
    static Bank subMenu(Bank bank){
        Scanner input=new Scanner(System.in);
        System.out.print(bank.getBalance()+"; Please select an option\n1. Deposit\n2. Withdraw\n3. return\n> ");
        switch (input.nextInt()) {
            case 1:
                System.out.print("How much to deposit?\n> ");
                bank.deposit(input.nextDouble());
                System.out.println("New "+bank.getBalance());
                input.close();
                return bank;
            case 2:
                System.out.print("How much to withdraw?\n> ");
                if(bank.withdraw(input.nextDouble())){
                    System.out.println("New "+bank.getBalance());
                    input.close();
                    return bank;
                }
                else{
                    System.out.println("Not enough balance...");
                    input.close();
                    return bank;
                }
            case 3:
                input.close();
                return bank;
            default:
                System.out.println("Please select a valid option");
                input.close();
                return bank;
        }
    }
}