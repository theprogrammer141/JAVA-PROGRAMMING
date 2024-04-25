import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int id;
        String name;
        int number_of_addresses;
        String city;
        String country;

        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        int number_of_students;
        System.out.print("Enter number of students: ");
        number_of_students = input.nextInt();
        Student[] students = new Student[number_of_students];
        //Address[] addresses = new Address[0];

        for(int i = 0; i < students.length; i++)
        {
            students[i] = new Student();

            System.out.printf("Enter student[%d] id: ", i+1);
            id = input.nextInt();
            System.out.printf("Enter student[%d] name: ", i+1);
            name = inputString.nextLine();

            students[i].setId(id);
            students[i].setName(name);

            System.out.printf("Enter number of addresses of student[%d]: ", i+1);
            number_of_addresses = input.nextInt();
            
            Address addresses[] = new Address[number_of_addresses];

            for(int j = 0; j < addresses.length; j++)
            {
                addresses[j] = new Address();

                System.out.printf("Enter city[%d] of student[%d]: ",j+1, i+1);
                city = inputString.nextLine();
                System.out.printf("Enter country[%d] of student[%d]: ", j+1, i+1);
                country = inputString.nextLine();

                addresses[j].setCity(city);
                addresses[j].setCountry(country);
            }
            students[i].setAddresses(addresses);
        }
//        for (int i = 0; i < students.length; i++) {
//            System.out.println("ID: " + students[i].getId());
//            System.out.println("Name: " + students[i].getName());
//            for (int j = 0; j < students[i].getAddresses().length; j++) {
//                System.out.println("City: " + students[i].getAddresses()[j].getCity());
//                System.out.println("City: " + students[i].getAddresses()[j].getCountry());
//            }
//        }

        for (Student student : students) {
            System.out.println("Student Details:-");
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Address Details:");
            for (Address address : student.getAddresses()) {
                System.out.println("City: " + address.getCity());
                System.out.println("Country: " + address.getCountry());
            }
        }


    }
}