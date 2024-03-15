public class Employees
{
	private String rank;
	private int id;
	private String name;
	private double basic_salary;
	
	public Employees(String rank, int id, String name, double basic_salary)
	{
		this.rank = rank;
		this.id = id;
		this.name = name;
		this.basic_salary = basic_salary;
	}
	
	public String getRank()
	{
		return rank;
	}
	
	public void setRank(String rank)
	{
		this.rank = rank;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public double getBasicSalary()
	{
		return basic_salary;
	}
	
	public void setBasicSalary(double basic_salary)
	{
		if(basic_salary >= 30000)
			this.basic_salary = basic_salary;
		else
		{
			System.out.println("BASIC SALARY MUST BE AT LEAST 30000!");
			this.basic_salary = 30000;
		}
	}
	
	public double calculateTotalSalary()
	{
		double total_salary = 0.0;
		double HRA = (15.0/100.0) * basic_salary;
		double MA = (10.0/100.0) * basic_salary;
		
		if(rank.equals("Lecturer"))
		{
			double FYPA = (7.0/100.0) * basic_salary;
			total_salary = basic_salary + HRA + MA + FYPA;
		}
		else if(rank.equals("Assistant Professor"))
		{
			double PhDA = (10.0/100.0) * basic_salary;
			total_salary = basic_salary + HRA + MA + PhDA;
		}
		else if(rank.equals("Research Assistant"))
		{
			total_salary = basic_salary + HRA + MA;
		}
		
		return total_salary;
	}
	
	public void printEmployeeData()
	{
		System.out.print("\n\n");
		System.out.println("RANK : " + rank);
		System.out.println("ID : " + id);
		System.out.println("NAME : " + name);
		System.out.println("BASIC SALARY : " + basic_salary);
		System.out.println("TOTAL SALARY : " + calculateTotalSalary());
		System.out.print("\n\n");
	}
}