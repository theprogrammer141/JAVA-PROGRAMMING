public class EmployeeTest
{
	public static void main(String [] args)
	{
		Date hireDate = new Date(12, 9, 2012);
		Date birthDate = new Date(15, 11, 2000);
		
		Employee emp = new Employee(101, "Malik", hireDate, birthDate);
		emp.printData();
	}
}