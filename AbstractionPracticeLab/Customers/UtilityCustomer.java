package Customers;
public abstract class UtilityCustomer{
    protected String customerID;
    public String getCustomerID() {
        return customerID;
    }
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    public UtilityCustomer(String customerID) {
        this.customerID = customerID;
    }
    protected abstract double calculateBill();
    @Override
    public String toString() {
        return "customer ID: "+customerID;
    }
}