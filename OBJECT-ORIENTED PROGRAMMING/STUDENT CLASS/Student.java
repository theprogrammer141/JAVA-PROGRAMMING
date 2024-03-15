public class Student
{
	int id;
	String name;
	double marks1, marks2;
	
	public void CalculateAvgMarks()
	{
		double average = (marks1 + marks2) / 2;
		System.out.print("AVERAGE IS : " + average);
	}
}