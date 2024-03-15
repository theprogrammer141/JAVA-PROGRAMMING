public class StudentTest
{
	public static void main(String[] args)
	{
		Student std1 = new Student("Abid");
		Student std2 = new Student("Zahid");
		Student std3 = new Student("Hania");
		Student std4 = new Student("Sehar");
		//Student.universityName = "COMSATS";
		
		std1.printData();
		std2.printData();
		std3.printData();
		std4.printData();
		
		//std1.universityName = "COMSATS";
		//std2.universityName = "FAST";
		
		
		//std1.printData();
		//System.out.println(std1.universityName);
		//std2.printData();
		//System.out.println(std2.universityName);
		//System.out.println(Student.universityName);

		//System.out.println(Calculator.sum(2, 4));
		
		//System.out.println(Student.printUniversityName());
	}
}