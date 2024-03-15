public class AccountTest
{
	public static void main(String [] args)
	{
		Account account1 = new Account(34603, "ali", 23);
		Account account2 = new Account(98734);
		
		account1.setCnic(34704);
		account1.setName("Ahmed");
		account1.setAge(45);
		
		System.out.println("ORIGINAL DATA OF ACCOUNT 1:-");
		account1.printDataOfNewAccount();
		System.out.print("\n\n");
		
		account1.deposit(40000);
		System.out.println("AFTER DEPOSITING:-");
		account1.printDataOfNewAccount();
		System.out.print("\n\n");
		
		account1.withdraw(20000);
		System.out.println("AFTER WITHDRAWING:-");
		account1.printDataOfNewAccount();
		System.out.print("\n\n");
	
		System.out.println("ORIGINAL DATA OF ACCOUNT 2:-");
		account2.printDataOfExistingAccount();
	}
}