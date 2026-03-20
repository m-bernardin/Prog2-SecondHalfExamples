public abstract class Part {
    String partNum;
    int budget;
    abstract String getInfo();
    Part(String partNum,int budget){
        this.partNum=partNum;
        this.budget=budget;
    }
}
