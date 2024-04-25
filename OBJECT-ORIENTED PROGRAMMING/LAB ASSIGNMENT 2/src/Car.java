public class Car extends Vehicle{
    private String bodyStyle;
    private boolean hasAirConditioning;

    public Car(int vehicleID, boolean isAvailable, int rentalPricePerDay, String bodyStyle, boolean hasAirConditioning) {
        super(vehicleID, isAvailable, rentalPricePerDay);
        this.bodyStyle = bodyStyle;
        this.hasAirConditioning = hasAirConditioning;
    }


    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public boolean isHasAirConditioning() {
        return hasAirConditioning;
    }

    public void setHasAirConditioning(boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
    }
}
