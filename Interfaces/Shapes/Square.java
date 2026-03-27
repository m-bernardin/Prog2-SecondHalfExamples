public class Square implements RegularPolygon{
    private int sideLength;
    public Square(int sideLength) {
        this.sideLength = sideLength;
    }
    @Override
    public int getNumSides() {
        return 4;
    }
    @Override
    public int getSideLength() {
        return sideLength;
    }
    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }
    @Override
    public int getPerimeter() {
        return getNumSides()*getSideLength();
    }
    @Override
    public double getInteriorAngle() {
        return ((getNumSides()-2)*180/getNumSides());
    }
    @Override
    public String toString() {
        return String.format("sides: %d, side length: %d, perimeter %d, interior angle: %d",getNumSides(),getSideLength(),getPerimeter(),getInteriorAngle());
    }
}