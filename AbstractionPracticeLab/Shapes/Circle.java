public class Circle extends Shape{
    private double radius;
    @Override
    public double getPerimeter() {
        return 2*PI*radius;
    }
    @Override
    public double getArea() {
        return PI*radius*radius;
    }
    public Circle(double radius){
        this.radius=radius;
    }
}