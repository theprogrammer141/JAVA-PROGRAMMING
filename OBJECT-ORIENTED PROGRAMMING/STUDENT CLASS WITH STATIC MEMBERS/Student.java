public class Student
{
	int id;
	String name;
	public static String universityName;
	public static int counter;
	
	static
	{
		System.out.println("IN STATIC BLOCK");
		universityName = "COMSATS";
	}
	
	public Student(String name)
	{
		System.out.println("CONSTRUCTOR CALLED");
		//this.id = id;
		this.id = ++counter;
		this.name = name;
		//counter++;
	}
	
	public void printData()
	{
		System.out.println(id);
		System.out.println(name);
		//System.out.println(universityName);
		System.out.println(printUniversityName());
		//System.out.println(printCounter());
	}
	
	public static String printUniversityName()
	{
		return universityName;
	}
	
	public static int printCounter()
	{
		return counter;
	}
}