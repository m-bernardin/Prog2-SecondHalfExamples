public class EquilateralTriangle implements RegularPolygon{
    private int sideLength;
    public EquilateralTriangle(int sideLength) {
        this.sideLength = sideLength;
    }
    public int getSideLength() {
        return sideLength;
    }
    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }
    @Override
    public int getNumSides() {
        return 3;
    }
    @Override
    public int getPerimeter() {
        return getNumSides()*getSideLength();
    }
    @Override
    public double getInteriorAngle() {
        return 90;
    }
    @Override
    public String toString() {
        return String.format("sides: %d, side length: %d, perimeter %d, interior angle: %d",getNumSides(),getSideLength(),getPerimeter(),getInteriorAngle());
    }
}