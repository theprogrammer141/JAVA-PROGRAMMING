public class Student
{
	private int id;
	private String name;
	private int age;
	
	public Student(int id, String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Student(Student s)
	{
		id = s.id;
		name = s.name;
		age = s.age;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		if(id < 0)
		{
			System.out.println("ID CANNOT BE NEGATIVE");
		}
		else
		{
			this.id = id;
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
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void printData()
	{
		System.out.println("ID : " + id);
		System.out.println("NAME : " + name);
		System.out.println("AGE : " + age);
	}
}