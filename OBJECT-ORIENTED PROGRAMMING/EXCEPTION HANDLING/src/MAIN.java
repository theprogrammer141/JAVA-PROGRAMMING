import java.util.InputMismatchException;
import java.util.Scanner;

public class MAIN {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("ENTER A NUMBER TO DIVIDE:");
            int x = scanner.nextInt();

            System.out.println("ENTER A NUMBER TO DIVIDE BY:");
            int y = scanner.nextInt();

            int z = x / y;
            System.out.println(z);
        }
        catch(ArithmeticException e)
        {
            System.out.println("YOU CANNOT DIVIDE BY ZERO IDIOT");
        }
        catch (InputMismatchException e)
        {
            System.out.println("PLEASE ENTER A NUMBER...OH MY FUCKING GOD");
        }
        catch (Exception e)
        {
            scanner.close();
        }
    }
}
