import java.util.Scanner;
public class StudentTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        String name;
        String email;
        String cnic;
        String course1Code;
        String course1Title;
        String course2Code;
        String course2Title;
        String streetAddress;
        String town;
        String city;
        String country;
        String countryCode;
        String cityCode;
        String lineNumber;

        System.out.print("Enter name:");
        name = inputString.nextLine();

        System.out.print("Enter email:");
        email = inputString.nextLine();

        System.out.print("Enter cnic:");
        cnic = inputString.nextLine();

        System.out.print("Enter course 1 code:");
        course1Code = inputString.nextLine();

        System.out.print("Enter course 1 Title:");
        course1Title = inputString.nextLine();

        System.out.print("Enter course 2 code:");
        course2Code = inputString.nextLine();

        System.out.print("Enter course 2 Title:");
        course2Title = inputString.nextLine();

        System.out.print("Enter street Address:");
        streetAddress = inputString.nextLine();

        System.out.print("Enter town:");
        town = inputString.nextLine();

        System.out.print("Enter city:");
        city = inputString.nextLine();

        System.out.print("Enter country:");
        country = inputString.nextLine();

        System.out.print("Enter country code:");
        countryCode = inputString.nextLine();

        System.out.print("Enter city code:");
        cityCode = inputString.nextLine();

        System.out.print("Enter line number:");
        lineNumber = inputString.nextLine();

        Student student1 = new Student(cnic, name, new Address(streetAddress, town, city));
        student1.setEmail(email);
        student1.getPostalAddress().setCountry(country);

        Course course1 = new Course(course1Code, course1Title);
        Course course2 = new Course(course2Code, course2Title);

        student1.setCourse1(course1);
        student1.setCourse2(course2);

        PhoneNumber phoneNumber = new PhoneNumber(countryCode, cityCode, lineNumber);

        student1.setContactNumber(phoneNumber);

        System.out.println("\n");
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Cnic : " + cnic);
        System.out.println("Course 1 Code : " + student1.getCourse1().getCourseCode());
        System.out.println("Course 1 Title : " + student1.getCourse1().getCourseTitle());
        System.out.println("Course 2 Code : " + student1.getCourse2().getCourseCode());
        System.out.println("Course 2 Title : " + student1.getCourse2().getCourseTitle());
        System.out.println("\n");

        System.out.println("Address Details:-");
        System.out.println("Street Address : " + student1.getPostalAddress().getStreetAddress());
        System.out.println("Town : " + student1.getPostalAddress().getTown());
        System.out.println("City : " + student1.getPostalAddress().getCity());
        System.out.println("Country : " + student1.getPostalAddress().getCountry());
        System.out.println("\n");

        System.out.println("Phone Number Details:-");
        System.out.println("Country code: " + student1.getContactNumber().getCountryCode());
        System.out.println("City code: " + student1.getContactNumber().getCityCode());
        System.out.println("Line Number: " + student1.getContactNumber().getLineNumber());

    }
}
