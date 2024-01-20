public class MAIN {
    public static void main(String[] args)
    {
        CAR myCar=new CAR();

        System.out.println(myCar.make);
        System.out.println(myCar.model);
        System.out.println(myCar.color);
        System.out.println(myCar.year);
        System.out.println(myCar.price);

        myCar.drive();
        myCar.brake();
    }

}
