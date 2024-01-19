import java.util.Scanner;
public class ARRAYS {
    public static void main(String[] args)
    {
//        String[] cars={"CAMARO","CORVETTE","TESLA"};
//        System.out.println(cars[0]);
//        System.out.println(cars[1]);
//        System.out.println(cars[2]);

        Scanner scanner=new Scanner(System.in);
        String[] cars=new String[3];
        cars[0]="CAMARO";
        cars[1]="CORVETTE";
        cars[2]="TESLA";

        for(int i=0;i<cars.length;i++)
        {
            cars[i]=scanner.next();
        }

        for(int i=0;i< cars.length;i++)
        {
            System.out.println(cars[i]);
        }
    }
}
