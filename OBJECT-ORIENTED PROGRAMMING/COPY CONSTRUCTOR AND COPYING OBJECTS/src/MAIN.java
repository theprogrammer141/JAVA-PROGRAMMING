public class MAIN {
    public static void main(String[] args)
    {
        Car car1=new Car("BUGATTI","VEYRON",2016);

//        Car car2=new Car("LAMBO","VENENO",2018);
//        USING COPY CONSTRUCTOR

        Car car2=new Car(car1);

        //        car2=car1; //wrong method
        //        USING COPY METHOD
        //        car2.copy(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
}
