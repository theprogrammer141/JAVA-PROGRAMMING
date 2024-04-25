import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String courseCode;
        String courseTitle;
        int courseCreditHr;

        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        int number_of_courses;

        System.out.print("Enter number of courses: ");
        number_of_courses = input.nextInt();

        Course[] courses = new Course[number_of_courses];

        for (int i = 0; i < courses.length; i++) {
            courses[i] = new Course();
            System.out.printf("Enter courseCode of course[%d]: ", i+1);
            courseCode = inputString.nextLine();
            System.out.printf("Enter courseTitle of course[%d]: ", i+1);
            courseTitle = inputString.nextLine();
            System.out.printf("Enter course credit hours for course[%d]: ", i+1);
            courseCreditHr = input.nextInt();
            courses[i].setCourseCode(courseCode);
            courses[i].setCourseTitle(courseTitle);
            courses[i].setCourseCreditHr(courseCreditHr);
        }

        for (int i = 0; i < courses.length; i++) {
            System.out.printf("Course %d Data:", i+1);
            System.out.println();
            System.out.print("Course Title: " + courses[i].getCourseTitle());
            System.out.println();
            System.out.print("Course Code: " + courses[i].getCourseCode());
            System.out.println();
            System.out.print("Course Credit Hour: " + courses[i].getCourseCreditHr());
        }
    }
}