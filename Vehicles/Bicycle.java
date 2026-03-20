public class Bicycle extends Vehicle{
    public Bicycle(String ownerName, int nbWheels) {
        super(ownerName, nbWheels);
    }
    @Override
    String getInfo() {
        return "This bicycle, owned by "+ownerName+", has "+nbWheels+" wheels";
    }
    
}