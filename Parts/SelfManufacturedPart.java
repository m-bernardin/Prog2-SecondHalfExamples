public class SelfManufacturedPart extends Part{
    private int cost;
    private String drawingNum;
    public SelfManufacturedPart(String partNum, int budget,int cost, String drawingNum) {
        super(partNum, budget);
        this.cost=cost;
        this.drawingNum=drawingNum;
    }
    @Override
    String getInfo() {
        return "part num "+partNum+"; budget for part: "+budget+"; costs "+cost+" to produce; drawing num "+drawingNum;
    }
    
}