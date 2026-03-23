package Customers;
public class ElectricCustomer extends UtilityCustomer{
    private double kwhUsed;
    public double getKwhUsed() {
        return kwhUsed;
    }
    public void setKwhUsed(double kwhUsed) {
        this.kwhUsed = kwhUsed;
    }
    public static final double DOLLARS_PER_KWH=0.4;
    public static final double DELIVERY_FEE=30;
    public ElectricCustomer(String customerID, double kwhUsed) {
        super(customerID);
        this.kwhUsed = kwhUsed;
    }
    @Override
    protected double calculateBill() {
        return DELIVERY_FEE+DOLLARS_PER_KWH*kwhUsed;
    }
    @Override
    public String toString() {
        return super.toString()+", used "+kwhUsed+" kWh this season, amnt due: "+calculateBill();
    }
}