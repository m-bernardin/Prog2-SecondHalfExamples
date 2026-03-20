public abstract class Vehicle {
    String ownerName;
    int nbWheels;
    abstract String getInfo();
    Vehicle(String ownerName,int nbWheels){
        this.nbWheels=nbWheels;
        this.ownerName=ownerName;
    }
}