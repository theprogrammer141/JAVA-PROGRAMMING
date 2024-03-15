public class Employee
{
	//ATTRIBUTES
	private int id;
	String name;
	private double salary;
	
	//PARAMETERIZED CONSTRUCTOR
	public Employee(int id, String name, double salary)
	{
		setId(id);
		this.name = name;
		setSalary(salary);
	}
	
	//GETTERS AND SETTERS
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		if(id >= 10 && id <= 99)
		{
			this.id = id;
		}
		else
		{
			System.out.println("INVALID ID! ID MUST BE A TWO DIGIT NUMBER!");
		}
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void setSalary(double salary)
	{
		if(salary > 0 && salary < 50000)
		{
			this.salary = salary;
		}
		else
		{
			System.out.println("INVALID SALARY! SALARY MUST BE IN THE GIVEN RANGE!");
		}
	}
	
	//PRINT DATA METHOD
	public void printData()
	{
		System.out.println("ID : " + getId());
		System.out.println("NAME : " + name);
		System.out.println("ID : " + getSalary());
		System.out.print("\n");
	}
}