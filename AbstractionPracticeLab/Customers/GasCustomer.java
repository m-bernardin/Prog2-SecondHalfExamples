package Customers;
public class GasCustomer extends UtilityCustomer{
    private double cubicMetersUsed;
    public double getCubicMetersUsed() {
        return cubicMetersUsed;
    }
    public void setCubicMetersUsed(double cubicMetersUsed) {
        this.cubicMetersUsed = cubicMetersUsed;
    }
    public static final double DOLLARS_PER_METER_CUBED=1.5;
    public GasCustomer(String customerID, double cubicMetersUsed) {
        super(customerID);
        this.cubicMetersUsed = cubicMetersUsed;
    }
    @Override
    protected double calculateBill() {
        return cubicMetersUsed*DOLLARS_PER_METER_CUBED;
    }
    @Override
    public String toString() {
        return super.toString()+", used "+cubicMetersUsed+" m3 of gas this season, amnt due: "+calculateBill();
    }
}