public class StudentTest
{
	public static void main(String[] args)
	{
		Student s1 = new Student(101, "Ali", 20);
		Student s2 = new Student(s1);
		
		System.out.println("BEFORE CHANGING VALUES OF S1:-");
		s1.printData();
		s2.printData();
		
		s1.setId(102);
		s1.setName("Ahmed");
		s1.setAge(21);
		System.out.println("AFTER CHANGING VALUES OF S1:-");
		s1.printData();
		s2.printData();
		
	}
}
