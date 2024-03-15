public class TestPerson
{
	public static void main(String[] args)
	{
		Person p1 = new Person();
		Person p2 = new Person(101);
		Person p3 = new Person("Abdullah");
		Person p4 = new Person(102, "Abdullah");
		
		//p2.setId(20);
		
		//printData(p1);
		//printData(p2);
		//printData(p3);
		printData(p4);
	}
	
	public static void printData(Person p)
	{
		System.out.println("ID : " + p.getId());
		System.out.println("NAME : " + p.getName());
	}
}