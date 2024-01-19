import java.util.Scanner;
public class NESTED {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int rows;
        int columns;
        String symbol=" ";

        System.out.println("ENTER NO.OF ROWS:");
        rows=scanner.nextInt();
        System.out.println("ENTER NO.OF COLUMNS:");
        columns=scanner.nextInt();
        System.out.println("ENTER SYMBOL YOU WANT:");
        symbol=scanner.next();

        for(int i=1;i<=rows;i++)
        {
            System.out.println();
            for(int j=1;j<=columns;j++)
            {
                System.out.print(symbol);
            }
        }
    }
}
