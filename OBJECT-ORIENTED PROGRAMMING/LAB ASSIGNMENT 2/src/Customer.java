import java.util.ArrayList;

public class Customer {
    private int customerID;
    private String customerName;
    private ArrayList<Vehicle> rentedVehicles = new ArrayList<>();

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
    }


    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<Vehicle> getRentedVehicles() {
        return rentedVehicles;
    }

    public void addRentedVehicle(Vehicle vehicle)
    {
        rentedVehicles.add(vehicle);
    }

    public void removeRentedVehicle(Vehicle vehicle)
    {
        rentedVehicles.add(vehicle);
    }
}
