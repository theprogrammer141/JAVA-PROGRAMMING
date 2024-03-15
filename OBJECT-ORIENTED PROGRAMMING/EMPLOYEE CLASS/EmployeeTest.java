import java.util.Scanner;

public class EmployeeTest
{
	public static void main(String[] args)
	{
		int id;
		String name;
		double salary;
	
		Scanner input = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		
		System.out.print("ENTER ID:");
		id = input.nextInt();
		
		System.out.print("ENTER NAME:");
		name = inputString.nextLine();
		
		System.out.print("ENTER SALARY:");
		salary = input.nextDouble();
			
		Employee e1 = new Employee(id, name, salary);
		
		e1.printData();
	}
}

		