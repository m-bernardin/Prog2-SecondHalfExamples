public class Rectangle extends Shape{
    private double width;
    private double height;
    @Override
    public double getPerimeter() {
        return 2*width+2*height;
    }
    @Override
    public double getArea() {
        return width*height;
    }
    public Rectangle(double width,double height){
        this.height=height;
        this.width=width;
    }
}