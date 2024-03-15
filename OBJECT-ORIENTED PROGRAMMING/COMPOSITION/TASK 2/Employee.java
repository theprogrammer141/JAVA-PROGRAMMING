public class Employee
{
	private int id;
	private String name;
	private Date hireDate;
	private Date birthDate;
	
	public Employee(int id, String name, Date hireDate, Date birthDate)
	{
		this.id = id;
		this.name = name;
		this.hireDate = hireDate;
		this.birthDate = birthDate;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public Date getHireDate()
	{
		return hireDate;
	}
	
	public void setHireDate(Date hireDate)
	{
		this.hireDate = hireDate;
	}
	
	public Date getBirthDate()
	{
		return birthDate;
	}
	
	public void setBirthDate(Date birthDate)
	{
		this.birthDate = birthDate;
	}
	
	public void printData()
	{
		System.out.print("\n");
		System.out.println("ID : " + id);
		System.out.println("NAME : " + name);
		
		System.out.print("\n");
		System.out.println("HIRE DATE :-");
		System.out.println(hireDate.getDay() + "/" + hireDate.getMonth() + "/" + hireDate.getYear());
		
		System.out.print("\n");
		System.out.println("BIRTH DATE :-");
		System.out.println(birthDate.getDay() + "/" + birthDate.getMonth() + "/" + birthDate.getYear());
		System.out.print("\n");
	}
}	