import  java.util.Scanner;
public class MainApp {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int number_of_students;
        int quizCount;

        System.out.print("Enter number of students:");
        number_of_students = input.nextInt();

        System.out.print("Enter number of quizes:");
        quizCount = input.nextInt();

        int[][] students = new int[number_of_students][quizCount];

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < quizCount; j++) {
                System.out.print("Enter marks of quiz{i}{j}:");
                students[i][j] = input.nextInt();
            }
        }

        for(int[] student : students)
        {
            for(int marks : student)
            {
                System.out.print(marks + " ");
            }
            System.out.println();
        }

    }
}
