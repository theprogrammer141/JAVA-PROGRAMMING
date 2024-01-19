import java.util.Scanner;
public class WHILE {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String name=" ";
        while(name.isBlank())
        {
            System.out.println("ENTER YOUR NAME:");
            name=scanner.next();
        }
        System.out.println("HELLO "+name);
    }
}
