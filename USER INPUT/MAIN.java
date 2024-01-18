import java.util.Scanner;

public class MAIN {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME:");
        String name=scanner.nextLine();
        System.out.println("YOUR NAME IS:"+name);

        System.out.println("ENTER YOUR AGE:");
        int age=scanner.nextInt();
        scanner.nextLine();
        System.out.println("YOUR AGE IS:"+age);

        System.out.println("ENTER YOUR FAVOURITE FOOD:");
        String food=scanner.nextLine();
        System.out.println("YOUR FAVOURITE FOOD IS:"+food);
        
    }
}