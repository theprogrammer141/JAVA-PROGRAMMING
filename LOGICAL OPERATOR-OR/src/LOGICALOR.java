import java.util.Scanner;

public class LOGICALOR {
    public static void main(String[] args)
    {
         Scanner scanner=new Scanner(System.in);
         String response=scanner.next();
         if(response.equals("q")||response.equals("Q"))
         {
             System.out.println("YOU QUIT THE GAME");
         }
         else
         {
             System.out.println("YOU ARE STILL PLAYING THE GAME");
         }
    }
}
