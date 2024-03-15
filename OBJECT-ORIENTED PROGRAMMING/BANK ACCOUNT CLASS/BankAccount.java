public class BankAccount
{
	int accountNumber;
	String accountTitle;
	double balance;
	
	public BankAccount(int accountNumber, String accountTitle, double balance)
	{
		this.accountNumber = accountNumber;
		this.accountTitle = accountTitle;
		this.balance = balance;
	}
	
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	public void withdraw(double amount)
	{
		if(balance < amount)
		{
			System.out.print("SORRY! YOUR BALANCE IS LOW! YOU CANNOT WITHDRAW");
		}
		else
		{
			balance -= amount;
		}
	}
	
	public void displayBalance()
	{
		System.out.println("CURRENT BALANCE: " + balance);
	}
}