public class Employee
{
	private int cnic;
	private String name;
	private double salary;
	
	
	public Employee()
	{
		System.out.println("NO-ARGS CONSTRUCTOR CALLED");
	}
	
	public Employee(int cnic, String name)
	{
		setCnic(cnic);
		setName(name);
	}
	
	public Employee(int cnic, String name, double salary)
	{
		this(cnic, name);
		this.salary = salary;
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
	
	public double getSalary()
	{
		return salary;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public void printData()
	{
		System.out.println("CNIC : " + cnic);
		System.out.println("NAME : " + name);
		System.out.println("SALARY : " + salary);
	}
}