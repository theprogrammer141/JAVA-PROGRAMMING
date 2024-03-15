import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Scanner stringScanner = new Scanner(System.in);
		Student s1 = new Student();
		
		System.out.print("ENTER STUDENT ID:");
		s1.id = scanner.nextInt();
		
		System.out.print("ENTER STUDENT NAME:");
		s1.name = stringScanner.nextLine();
		
		System.out.print("ENTER STUDENT MARKS1:");
		s1.marks1 = scanner.nextDouble();
		
		System.out.print("ENTER STUDENT MARKS2:");
		s1.marks2 = scanner.nextDouble();
		
		printData(s1);
		s1.CalculateAvgMarks();
		
	}
	
	public static void printData(Student s)
	{
		System.out.println("\nID : "+ s.id);
		System.out.println("NAME : "+s.name);
	}
}

		