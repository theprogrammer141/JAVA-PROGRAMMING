import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        int vehicleID;
        boolean isAvailable;
        int rentalPricePerDay;
        String bodyStyle;
        boolean hasAirConditioning;
        boolean isElectric;
        int customerID;
        String customerName;

        RentalService rentalService = new RentalService();

        char option;

        do {
            System.out.println("Welcome to vehicle Rental System!");
            System.out.println("Please choose from the menu below:-");
            System.out.println("1.Add Car");
            System.out.println("2.Add bike");
            System.out.println("3.Add Customer");
            System.out.println("4.Rent a Car");
            System.out.println("5.Return a Car");
            System.out.println("6.Display Customers");
            System.out.println("7.Display Vehicles");
            System.out.println();

            int choice;
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Car Details:-");
                    System.out.print("Enter Car ID: ");
                    vehicleID = input.nextInt();

                    System.out.print("Enter availability status: ");
                    isAvailable = input.nextBoolean();

                    System.out.print("Enter rental price per day: ");
                    rentalPricePerDay = input.nextInt();

                    System.out.print("Enter body style: ");
                    bodyStyle = inputString.nextLine();

                    System.out.print("Enter air conditioning status: ");
                    hasAirConditioning = input.nextBoolean();

                    Car car = new Car(vehicleID, isAvailable, rentalPricePerDay, bodyStyle, hasAirConditioning);

                    rentalService.addCar(car);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter bike details:-");
                    System.out.print("Enter bike ID: ");
                    vehicleID = input.nextInt();

                    System.out.print("Enter availability status: ");
                    isAvailable = input.nextBoolean();

                    System.out.print("Enter rental price per day: ");
                    rentalPricePerDay = input.nextInt();

                    System.out.print("Enter electric status: ");
                    isElectric = input.nextBoolean();

                    Bike bike = new Bike(vehicleID, isAvailable, rentalPricePerDay, isElectric);

                    rentalService.addBike(bike);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter Customer Details:-");
                    System.out.print("enter customer ID: ");
                    customerID = input.nextInt();

                    System.out.print("Enter customer name: ");
                    customerName = inputString.nextLine();

                    System.out.println();

                    Customer customer = new Customer(customerID, customerName);

                    rentalService.addCustomer(customer);
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Rent a Car:-");
                    System.out.print("Enter Car ID: ");
                    vehicleID = input.nextInt();

                    System.out.print("Enter Customer ID: ");
                    customerID = input.nextInt();

                    Car carToRent = null;
                    Customer rentingCustomer = null;

                    for (Car c : rentalService.getCars()) {
                        if (c.getVehicleID() == vehicleID) {
                            carToRent = c;
                            break;
                        }
                    }

                    for (Customer customer1 : rentalService.getCustomers()) {
                        if (customer1.getCustomerID() == customerID) {
                            rentingCustomer = customer1;
                            break;
                        }
                    }

                    if (carToRent != null && rentingCustomer != null) {
                        rentalService.rentCar(carToRent, rentingCustomer);
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Car or Customer not found!");
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println();
                    System.out.println("Return a Car:-");
                    System.out.print("Enter car ID: ");
                    vehicleID = input.nextInt();

                    System.out.print("Enter customer ID: ");
                    customerID = input.nextInt();

                    Car carToReturn = null;
                    Customer returningCustomer = null;

                    for (Car car1 : rentalService.getCars()) {
                        if (car1.getVehicleID() == vehicleID) {
                            carToReturn = car1;
                            break;
                        }
                    }

                    for (Customer customer1 : rentalService.getCustomers()) {
                        if (customer1.getCustomerID() == customerID) {
                            returningCustomer = customer1;
                            break;
                        }
                    }

                    for (Car car2 : rentalService.getCars()) {
                        for (Customer customer2 : rentalService.getCustomers()) {
                            if (!customer2.getRentedVehicles().isEmpty()) {
                                System.out.println("This customer has not rented any vehicle");
                                break;
                            } else if (customer2.getRentedVehicles().contains(car2)) {
                                rentalService.returnCar(carToReturn, returningCustomer);
                                customer2.removeRentedVehicle(car2);
                                System.out.println("Returned car ID: " + car2.getVehicleID());
                                System.out.println();
                                break;
                            }
                        }
                    }
                    break;
                case 6:
                    rentalService.displayCustomers();
                    break;
                case 7:
                    rentalService.displayVehicles();
                    break;
                default:
                    System.out.println("Invalid input!");
            }
            System.out.print("Press (Y/y) to perform another operation: ");
            option = input.next().charAt(0);
        } while (option == 'Y' || option == 'y');
    }
}
