public class Account
{
	private int cnic;
	private String name;
	private int age;
	private int accountId;
	private int balance;
	
	public Account(int accountId)
	{
		setAccountId(accountId);
	}
	
	public Account(int cnic, String name, int age)
	{
		setCnic(cnic);
		setName(name);
		setAge(age);
	}
	
	public int getCnic()
	{
		return cnic;
	}
	
	public void setCnic(int cnic)
	{
		this.cnic = cnic;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
		if(age > 35)
		{
			setBalance(0);
		}
		else if(age >= 20 && age <=25)
		{
			setBalance(50000);
		}
		else if(age >= 25 && age <=30)
		{
			setBalance(25000);
		}
		else if(age >= 30 && age <= 35)
		{
			setBalance(10000);
		}
		else if(age < 20)
		{
			System.out.print("SORRY, YOU MUST BE ABOVE 20 TO CREATE AN ACCOUNT!");
		}
	}
	
	public int getAccountId()
	{
		return accountId;
	}
	
	public void setAccountId(int accountId)
	{
		this.accountId = accountId;
	}
	
	public int getBalance()
	{
		return balance;
	}
	
	private void setBalance(int balance)
	{
		this.balance = balance;
	}
	
	public void deposit(int newBalance)
	{
		balance += newBalance;
		setBalance(balance);
	}
	
	public void withdraw(int newBalance)
	{
		if(balance <= 0)
		{
			System.out.println("CANNOT WITHDRAW! ACCOUNT IS EMPTY!");
		}
		else
		{
		balance -= newBalance;
		setBalance(balance);
		}
	}
	
	public void printDataOfNewAccount()
	{
		System.out.println("CNIC : " + cnic);
		System.out.println("NAME : " + name);
		System.out.println("AGE : " + age);
		System.out.println("BALANCE : " + balance);
	}
	
	public void printDataOfExistingAccount()
	{
		System.out.println("ACCOUNT ID: " + accountId);
	}
}