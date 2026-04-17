package Shapes;
public class Rectangle extends Shape{
    private double width;
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    private double height;
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
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