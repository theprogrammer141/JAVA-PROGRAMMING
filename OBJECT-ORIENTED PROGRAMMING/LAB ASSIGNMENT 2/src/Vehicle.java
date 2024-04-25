public class Vehicle {
    private int vehicleID;
    private boolean isAvailable;
    private int rentalPricePerDay;

    public Vehicle(int vehicleID, boolean isAvailable, int rentalPricePerDay) {
        this.vehicleID = vehicleID;
        this.isAvailable = isAvailable;
        this.rentalPricePerDay = rentalPricePerDay;
    }


    public int getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(int rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }
}
