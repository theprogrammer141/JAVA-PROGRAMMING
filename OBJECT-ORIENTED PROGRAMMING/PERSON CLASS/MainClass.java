public class MainClass
{
	public static void main(String[] args)
	{
		PersonClass p1 = new PersonClass();
		p1.id = 101;
		p1.name = "Abdullah";
		p1.age = 20;
		
		PrintData(p1);
		
	}
	
	public static void PrintData(PersonClass p1)
	{
		System.out.println("Person ID: "+p1.id);
		System.out.println("Person Name: "+p1.name);
		System.out.println("Person Age: "+p1.age);
	}
}