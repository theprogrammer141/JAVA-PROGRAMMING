import java.util.Scanner;

public class BankAccountTest
{
	public static void main(String[] args)
	{
		int accountNumber;
		String accountTitle;
		double balance;
		int amount;
		
		Scanner input = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		
		System.out.print("ENTER ACCOUNT NUMBER:");
		accountNumber = input.nextInt();
		
		System.out.print("ENTER ACCOUNT TITLE:");
		accountTitle = inputString.nextLine();
		
		System.out.print("ENTER INITIAL BALANCE: ");
		balance = input.nextDouble();
		
		System.out.print("\n\n");
		
		BankAccount account1 = new BankAccount(accountNumber, accountTitle, balance);
		
		
		char option;
		int choice;
	
		do
		{
			System.out.println("PRESS 1 TO DEPOSIT AMOUNT");
			System.out.println("PRESS 2 TO WITHDRAW AMOUNT");
			System.out.println("PRESS 3 TO VIEW CURRENT BALANCE");
			System.out.print("\n\n");
			
			System.out.print("ENTER YOUR CHOICE:");
			choice = input.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.print("ENTER AMOUNT YOU WANT TO DEPOSIT:");
					amount = input.nextInt();
					account1.deposit(amount);
					break;
				case 2:
					System.out.print("ENTER AMOUNT YOU WANT TO WITHDRAW:");
					amount = input.nextInt();
					account1.withdraw(amount);
					break;
				case 3:
					account1.displayBalance();
					break;
			}
			
			System.out.print("\n");
			System.out.print("WANT TO PERFORM ANOTHER OPERATION?(Y/y)(N/n):");
			option = input.next().charAt(0);
			System.out.print("\n");
			
		}while(option == 'Y' || option == 'y');
	}
}