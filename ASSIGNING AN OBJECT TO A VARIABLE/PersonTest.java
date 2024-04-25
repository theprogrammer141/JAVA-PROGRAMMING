public class PersonTest
{
	public static void main(String [] args)
	{
		Person p1 = new Person(20, "Ali", 34603);
		Person p2 = p1;
		
		p1.printData();
		p2.printData();
		
		p1.setCnic(37303);
		p1.printData();
		p2.printData();
		
	}
}