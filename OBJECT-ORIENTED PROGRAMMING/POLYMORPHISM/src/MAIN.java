import java.lang.invoke.VarHandle;

public class MAIN {
    public static void main(String[] args)
    {
        Car car=new Car();
        Boat boat=new Boat();
        Bicycle bicycle=new Bicycle();

        Vehicle[] objects={car,boat,bicycle};

        for(Vehicle x:objects)
        {
            x.go();
        }
    }
}
