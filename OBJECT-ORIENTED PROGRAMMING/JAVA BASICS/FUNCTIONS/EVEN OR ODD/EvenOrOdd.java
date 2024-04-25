import java.util.Scanner;

public class EvenOrOdd
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.print("Enter a number:");
		num = scanner.nextInt();
		if(isEven(num))
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
		
	}
	public static boolean isEven(int number)
	{
		if(number % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
