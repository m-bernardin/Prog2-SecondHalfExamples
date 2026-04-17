package Shapes;
import java.util.Scanner;
public class ShapeDriver {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean running=true;
        while(running){
            System.out.print("Please select an option\n1. Circle\n2. Rectangle\n3. quit\n> ");
            switch (input.nextInt()) {
                case 1:
                    System.out.print("Please enter the radius\n> ");
                    Circle circle=new Circle(input.nextDouble());
                    System.out.println("Circle info:\nradius: "+circle.getRadius()+"\nperimeter: "+circle.getPerimeter()+"\narea: "+circle.getArea());
                    break;
                case 2:
                    System.out.print("Please enter the height\n> ");
                    double height=input.nextDouble();
                    System.out.print("Please enter the width\n> ");
                    Rectangle rectangle=new Rectangle(input.nextDouble(), height);
                    System.out.println("Rectangle info:\nheight: "+rectangle.getHeight()+"\nwidth: "+rectangle.getWidth()+"\nperimeter: "+rectangle.getPerimeter()+"\narea: "+rectangle.getArea());
                    break;
                case 3:
                    System.out.println("Goodbye :)");
                    running=false;
                    input.close();
                    break;
                default:
                    System.out.println("Please enter a valid option...");
                    break;
            }
        }
    }
}