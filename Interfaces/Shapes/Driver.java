import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        boolean running=true;
        Scanner input=new Scanner(System.in);
        while(running){
            System.out.print("Please select an option\n1. \n> ");
            switch (input.nextInt()) {
                case 1:
                    
                    break;
                default:
                    System.out.println("Please select a valid option...");
                    break;
            }
        }
    }
}