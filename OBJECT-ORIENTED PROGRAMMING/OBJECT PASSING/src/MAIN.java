public class MAIN {
    public static void main(String[] args)
    {
        Garage garage=new Garage();
        Car car=new Car("BMW");
        Car car1=new Car("TESLA");
        garage.park(car);
        garage.park(car1);
    }
}
