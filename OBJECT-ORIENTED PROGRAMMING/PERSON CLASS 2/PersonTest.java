import java.time.LocalDate;
import java.util.Scanner;

public class PersonTest
{
	public static void main(String[] args)
	{
		String name;
		String dateOfBirthStr;
		LocalDate dateOfBirth;
		
		Scanner input = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		
		System.out.print("ENTER NAME : ");
		name = inputString.nextLine();
		
		System.out.print("ENTER DATE OF BIRTH(YYYY-MM-DD):");
		dateOfBirthStr = inputString.nextLine();
		dateOfBirth = LocalDate.parse(dateOfBirthStr);
		
		Person p1 = new Person(name, dateOfBirth);
		
		p1.setHeight(175.26);
		p1.setWeight(70);
		p1.printData();
	}
}
		