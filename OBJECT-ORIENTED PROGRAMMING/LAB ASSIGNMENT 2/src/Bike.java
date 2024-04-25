public class Bike extends Vehicle{
    private boolean isElectric;

    public Bike(int vehicleID, boolean isAvailable, int rentalPricePerDay, boolean isElectric) {
        super(vehicleID, isAvailable, rentalPricePerDay);
        this.isElectric = isElectric;
    }


    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}
