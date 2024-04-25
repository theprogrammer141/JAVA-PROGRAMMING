import java.util.Scanner;

public class FacultyTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        int n;
        System.out.print("Enter size of array:");
        n = input.nextInt();
        Faculty[] arr = new Faculty[n];

        inputData(arr, input, inputString);
        outputData(arr);

    }

    public static void inputData(Faculty[] arr, Scanner input, Scanner inputString)
    {
        int id;
        String courseTitle;

        for(int i = 0; i < arr.length; i++)
        {
            System.out.printf("Enter details for faculty[%d]: ", i);
            System.out.println("\n");
            System.out.print("Enter id: ");
            id = input.nextInt();
            System.out.print("Enter course title: ");
            courseTitle = inputString.nextLine();
            Course course = new Course(courseTitle);
            arr[i] = new Faculty(id, course);
        }
    }

    public static void outputData(Faculty[] arr)
    {
        System.out.println("Faculty Details:-");
        System.out.println("\n");
        int index = 0;
        for(Faculty f : arr)
        {
            System.out.printf("Faculty[%d]:- ", index);
            System.out.print("\n");
            System.out.printf("ID[%d]: %d", index, f.getId());
            System.out.print("\n");
            System.out.printf("COURSE TITLE[%d]: %s", index, f.getCourse().getCourseTitle());
            System.out.print("\n\n");
        }
    }


}
