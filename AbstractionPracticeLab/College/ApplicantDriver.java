package College;
import java.util.Scanner;
public class ApplicantDriver {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean running=true;
        while(running){
            System.out.print("Please select an option\n1. grad student\n2. undergrad student\n3. quit\n> ");
            switch (input.nextInt()) {
                case 1:
                    input.nextLine();
                    System.out.print("Please enter the student's name\n> ");
                    String name=input.nextLine();
                    System.out.print("Please enter the college the student is applying to\n> ");
                    String applyingCollege=input.nextLine();
                    System.out.print("Please enter the student's college of origin\n> ");
                    System.out.println(new Graduate(name, applyingCollege, applyingCollege));
                    break;
                case 2:
                    input.nextLine();
                    System.out.print("Please enter the student's name\n> ");
                    String name2=input.nextLine();
                    System.out.print("Please enter the college the student is applying to\n> ");
                    String applyingCollege2=input.nextLine();
                    System.out.print("Please enter the student's gpa\n> ");
                    double gpa=input.nextDouble();
                    System.out.print("Please enter the student's sat score\n> ");
                    System.out.println(new Undergrad(name2, applyingCollege2, input.nextInt(), gpa));
                    break;
                case 3:
                    System.out.println("Goodbye :)");
                    running=false;
                    input.close();
                default:
                    System.out.println("Please enter a valid option");
                    break;
            }
        }
    }
}