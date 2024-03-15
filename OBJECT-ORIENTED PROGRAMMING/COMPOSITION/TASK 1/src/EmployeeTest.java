import  java.util.Scanner;
public class EmployeeTest {
    public static void main(String[] args) {
        int id;
        java.lang.String streetNumber;
        java.lang.String city;
        java.lang.String country;
        java.lang.String name;

        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        System.out.print("Enter employee 1 Id:");
        id = input.nextInt();

        System.out.print("Enter employee 1 name:");
        name = inputString.nextLine();

        System.out.print("Enter street number:");
        streetNumber = inputString.nextLine();

        System.out.print("Enter city:");
        city = inputString.nextLine();

        System.out.print("Enter country:");
        country = inputString.nextLine();

        Employee employee1 = new Employee(id, new Address());
        Employee employee2 = new Employee(102, new Address());

        employee1.getEmployeeAddress().setStreetNumber(streetNumber);
        employee1.getEmployeeAddress().setCity(city);
        employee1.getEmployeeAddress().setCountry(country);
        employee2.setEmployeeAddress(employee1.getEmployeeAddress());

        employee1.setEmployeeName(name);
        employee2.setEmployeeName("Ahmed");

        System.out.println("\n");
        System.out.println("Employee 1 id: " + employee1.getEmployeeID());
        System.out.println("Employee 1 name: " + employee1.getEmployeeName());
        System.out.println("Street Number: " +employee1.getEmployeeAddress().getStreetNumber());
        System.out.println("City: " + employee1.getEmployeeAddress().getCity());
        System.out.println("Country: " + employee1.getEmployeeAddress().getCountry());

        System.out.println("\n");

        System.out.println("Employee 2 id:" + employee2.getEmployeeID());
        System.out.println("Employee 2 name:" + employee2.getEmployeeName());
        System.out.println("Street Number:" + employee2.getEmployeeAddress().getStreetNumber() + "\n" +
                            "City:" + employee2.getEmployeeAddress().getCity() + "\n" +
                            "Country:" + employee2.getEmployeeAddress().getCountry());
    }
}
