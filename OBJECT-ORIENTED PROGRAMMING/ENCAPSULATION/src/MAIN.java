public class MAIN {
    public static void main(String[] args)
    {
        Car car=new Car("BUGGATI","VEYRON",2016);

        car.setMake("ASTON MARTIN");
        car.setModel("DB11");
        car.setYear(2011);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

    }
}
