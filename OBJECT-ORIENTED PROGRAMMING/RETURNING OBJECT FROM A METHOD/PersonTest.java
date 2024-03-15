public class PersonTest
{
	public static void main(String [] args)
	{
		Person p1 = createPerson(20, "Ali");
		
		p1.printData();
	}
	
	public static Person createPerson(int age, String name)
	{
		Person p1 = new Person(age, name);
		return p1;
	}
}
	