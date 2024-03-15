import java.util.Scanner;

public class Task
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double final_exam, mid_term, assignments, quizes;
		
		double final_weightage = 50/100d;
		double mid_weightage = 25/100d;
		double assignments_weightage = 10/100d;
		double quizes_weightage = 15/100d;
		
		char grade;
		double total_marks = 0.0;
		
		System.out.println("PLEASE ENTER THE FOLLOWING SCORES:");
		System.out.print("FINAL EXAM MARKS(OUT OF 100):");
		final_exam = input.nextInt();
		
		System.out.print("MID TERM MARKS(OUT OF 100):");
		mid_term = input.nextInt();
		
		System.out.print("ASSIGNMENTS MARKS(OUT OF 100):");
		assignments = input.nextInt();
		
		System.out.print("QUIZES MARKS(OUT OF 100):");
		quizes = input.nextInt();
		
		total_marks = final_exam * final_weightage + mid_term * mid_weightage + assignments * assignments_weightage + quizes * quizes_weightage;
		System.out.println("TOTAL MARKS: " + total_marks);
		
		if(total_marks >= 90)
		{
			grade = 'A';
			System.out.print("GRADE IS: " + grade);
		}
		else if(total_marks >=80 && total_marks <=89)
		{
			grade = 'B';
			System.out.print("GRADE IS: " + grade);
		}
		else if(total_marks >=70 && total_marks <=79)
		{
			grade = 'C';
			System.out.print("GRADE IS: " + grade);
		}
		else if(total_marks >=60 && total_marks <=69)
		{
			grade = 'D';
			System.out.print("GRADE IS: " + grade);
		}
		else
		{
			grade = 'F';
			System.out.print("GRADE IS: " + grade);
		}
	}
}