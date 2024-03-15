public class EmployeeTest
{
	public static void main(String[] args)
	{
		Employee emp1 = new Employee();
		Employee emp2 = new Employee(34603, "Ali");
		Employee emp3 = new Employee(34603, "Ali", 50000);
		
		emp1.printData();
		emp2.printData();
		emp3.printData();
	}
}