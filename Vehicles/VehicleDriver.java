public class VehicleDriver {
    public static void main(String[] args) {
        Bicycle bike=new Bicycle("John Bingus", 2);
        MotorVehicle car=new MotorVehicle("John Borkus", 4, 1);
        System.out.println("bike info: "+bike.getInfo()+"; car info: "+car.getInfo());
    }
}