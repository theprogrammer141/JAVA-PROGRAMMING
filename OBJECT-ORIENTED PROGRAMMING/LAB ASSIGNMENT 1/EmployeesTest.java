import java.util.Scanner;

public class EmployeesTest
{
	public static void main(String [] args)
	{
		String rank;
		int id;
		String name;
		double basic_salary;
		
		Scanner input = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		
		System.out.print("ENTER RANK OF EMPLOYEE:");
		rank = inputString.nextLine();
		
		System.out.print("ENTER ID:");
		id = input.nextInt();
		
		System.out.print("ENTER NAME:");
		name = inputString.nextLine();
		
		System.out.print("ENTER BASIC SALARY:");
		basic_salary = input.nextDouble();
		
		Employees e1 = new Employees(rank, id, name, basic_salary);
		
		e1.printEmployeeData();
	}
}
			