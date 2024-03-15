import java.util.Random;
import java.util.Scanner;

public class Task
{
	public static void main(String[] args)
	{
		int number;
		int attempts = 10;
		int your_guess;
		
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		number = random.nextInt(101);
		
		System.out.print("ENTER YOUR GUESS:");
		
		
		int i = 0;
		while(i < attempts)
		{
			i++;
			your_guess = input.nextInt();
			if(your_guess < number)
			{
				System.out.print("TOO LOW! TRY AGAIN:");
			}
			else if(your_guess > number)
			{
				System.out.print("TOO HIGH! TRY AGAIN:");
			}
			else
			{
				System.out.printf("CONGRADULATIONS! YOU GUESSED THE NUMBER IN %d ATTEMPTS!", i);
				break;
			}
			
		}
	}
}