public class MotorVehicle extends Vehicle{
    int engineVolume;
    @Override
    String getInfo() {
        return "This motor vehicle, owned by "+ownerName+", has "+nbWheels+" wheels and "+getHorsepower()+"HP";
    }
    public MotorVehicle(String ownerName, int nbWheels,int engineVolume){
        super(ownerName, nbWheels);
        this.engineVolume=engineVolume;
    }
    private int getHorsepower(){
        return engineVolume*nbWheels;
    }
}