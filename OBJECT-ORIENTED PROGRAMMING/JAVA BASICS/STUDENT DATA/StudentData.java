public class StudentData
{
	public static void main(String[] args)
	{
		int id = 90;
		String name = "Abdullah";
		int marks = 89;
		float GPA = 3.51F;
		char section = 'C';
		boolean gender = true;
		
		System.out.printf("\nStudent Id = %d\n",id);
		System.out.printf("Student name = %s\n",name);
		System.out.printf("Student marks = %d\n",marks);
		System.out.printf("Student GPA = %f\n",GPA);
		System.out.printf("Student Section = %c\n",section);
		if(gender ==  true)
		{
			System.out.printf("Student Gender = Male\n");
		}
		else
		{
			System.out.printf("Student Gender = Female\n");
		}
	}
}