public class Account
{
	String name;
	int age;
	int cnic;
	int accountId;
	int balance;
	
	public Account(int accountId)
	{
		this.accountId = accountId;
	}
	
	public Account(String name, int age, int cnic)
	{
		this.name = name;
		this.age = age;
		this.cnic = cnic;
		
		if(age > 35)
		{
			balance = 0;
		}
		else if(age >=20 && age <=25)
		{
			balance = 50000;
		}
		else if(age >= 25 && age <= 30)
		{
			balance = 25000;
		}
		else if(age >= 30 && age <= 35)
		{
			balance = 10000;
		}
		else if(age < 20)
		{
			System.out.print("SORRY! ACCOUNT CANNOT BE CREATED AT THIS AGE");
		}
	}
	
	public void deposit(int amount)
	{
		balance += amount;
	}
	
	public void withdraw(int amount)
	{
		if(balance < amount)
		{
			System.out.print("SORRY! NOT ENOUGH BALANCE!");
		}
		else
		{
			balance -= amount;
		}
	}
	
	