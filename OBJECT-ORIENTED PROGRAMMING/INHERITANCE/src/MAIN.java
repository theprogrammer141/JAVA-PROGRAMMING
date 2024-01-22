public class MAIN {
    public static void main(String[] args)
    {
        Car car=new Car();
        Bicycle bike=new Bicycle();

        car.go();
        bike.go();
        car.stop();
        bike.stop();
        System.out.println(car.wheels);
        System.out.println(car.doors);
        System.out.println(bike.wheels);
        System.out.println(bike.pedals);

    }
}
