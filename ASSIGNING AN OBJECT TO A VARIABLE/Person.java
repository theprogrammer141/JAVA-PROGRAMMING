public class Person
{
	private int age;
	private String name;
	private int cnic;
	
	public Person(int age, String name, int cnic)
	{
		this.age = age;
		this.name = name;
		this.cnic = cnic;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		if(age < 0)
		{
			System.out.println("AGE CANNOT BE NEGATIVE");
		}
		else
		{
			this.age = age;
		}
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getCnic()
	{
		return cnic;
	}
	
	public void setCnic(int cnic)
	{
		this.cnic = cnic;
	}
	
	public void printData()
	{
		System.out.println("AGE : " + age);
		System.out.println("NAME : " + name);
		System.out.println("CNIC : " + cnic);
	}
}