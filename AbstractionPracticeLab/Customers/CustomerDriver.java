package Customers;
import java.util.ArrayList;
import java.util.Scanner;
public class CustomerDriver {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean running=true;
        ArrayList<UtilityCustomer> customers=new ArrayList<>();
        while(running){
            System.out.print("Please select an option\n1. Add a gas customer\n2. Add an electric customer\n3. Show all customers\n4. quit\n> ");
            switch(input.nextInt()){
                case 1:
                    input.nextLine();
                    System.out.print("Please enter the customer's ID\n> ");
                    String customerID=input.nextLine();
                    System.out.print("Please enter the customer's gas usage\n> ");
                    customers.add(new GasCustomer(customerID, input.nextDouble()));
                    break;
                case 2:
                    input.nextLine();
                    System.out.print("Please enter the customer's ID\n> ");
                    String customerID2=input.nextLine();
                    System.out.print("Please enter the customer's electricty usage\n> ");
                    customers.add(new ElectricCustomer(customerID2, input.nextDouble()));
                    break;
                case 3:
                    System.out.println("All customers:");
                    for(UtilityCustomer customer:customers)System.out.println(customer);
                    break;
                case 4:
                    input.close();
                    System.out.println("Goodbye :)");
                    running=false;
                    break;
                default:
                    System.out.println("Please select a valid option...");
                    break;
            }
        }
    }
}