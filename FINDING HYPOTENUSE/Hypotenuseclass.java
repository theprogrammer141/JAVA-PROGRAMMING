import java.util.Scanner;

public class Hypotenuseclass {
    public static void main(String[] args)
    {
        double x;
        double y;
        double z;

        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER SIDE X:");
        x=scanner.nextDouble();
        System.out.println("ENTER SIDE Y:");
        y=scanner.nextDouble();
        z=Math.sqrt((x*x)+(y*y));
        System.out.println("HYPOTENUSE IS:"+z);

        scanner.close();

    }    
}
