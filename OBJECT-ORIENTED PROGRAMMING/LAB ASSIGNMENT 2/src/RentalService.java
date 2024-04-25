import java.util.ArrayList;

public class RentalService {
    private ArrayList<Car> cars = new ArrayList<>();
    private ArrayList<Bike> bikes = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();

    public void addCar(Car car)
    {
        cars.add(car);
    }

    public void addBike(Bike bike)
    {
        bikes.add(bike);
    }

    public void addCustomer(Customer customer)
    {
        customers.add(customer);
    }

    public void rentCar(Car car, Customer customer)
    {
        if(!car.isAvailable())
        {
            System.out.println("Sorry! the car is not available right now!");
            return;
        }
        else if(car.isAvailable())
        {
            int rentalCost = car.getRentalPricePerDay();
            customer.addRentedVehicle(car);
            car.setAvailable(false);
            System.out.println("The car has been rented!");
            System.out.println("Rental Cost is : " + rentalCost);
        }
    }

    public void returnCar(Car car, Customer customer)
    {
        if(!customer.getRentedVehicles().contains(car))
        {
            System.out.println("This car is not rented by the customer!");
            return;
        }
        else if(customer.getRentedVehicles().contains(car))
        {
            int rentalCost = car.getRentalPricePerDay();
            customer.removeRentedVehicle(car);
            car.setAvailable(true);
            System.out.println("The car has been returned successfully!");
            System.out.println("Rental Cost was: " + rentalCost);
        }
    }
    public ArrayList<Car> getCars()
    {
        return cars;
    }

    public ArrayList<Customer> getCustomers()
    {
        return customers;
    }
    public void displayVehicles()
    {
        System.out.println();
        System.out.println("Cars Details:-");
        for(Car car : cars)
        {
            if(cars.isEmpty())
            {
                System.out.println("No car data available!");
                System.out.println();
                break;
            }
            else {
                System.out.println("Car ID: " + car.getVehicleID());
                System.out.println("Availability: " + car.isAvailable());
                System.out.println("Rental Price Per Day: " + car.getRentalPricePerDay());
                System.out.println("Body Style: " + car.getBodyStyle());
                System.out.println("Air Conditioning: " + car.isHasAirConditioning());
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("Bikes Details:-");
        for(Bike bike : bikes)
        {
            if(bikes.isEmpty())
            {
                System.out.println("No bike data available");
                System.out.println();
                break;
            }
            else {
                System.out.println("Bike ID: " + bike.getVehicleID());
                System.out.println("Availability: " + bike.isAvailable());
                System.out.println("Rental Price Per Day: " + bike.getRentalPricePerDay());
                System.out.println("Electric: " + bike.isElectric());
                System.out.println();
            }
        }
    }
    public void displayCustomers()
    {
        System.out.println();
        System.out.println("Customers Details:-");
        for(Customer customer : customers)
        {
            if(customers.isEmpty())
            {
                System.out.println("No customer data available!");
                System.out.println();
                break;
            }
            else {
                System.out.println("Customer ID: " + customer.getCustomerID());
                System.out.println("Customer Name: " + customer.getCustomerName());

                int numberOfRentedVehicles = customer.getRentedVehicles().size();

                System.out.println("Rented Vehicles: " + numberOfRentedVehicles);
                System.out.println();
            }
        }
        System.out.println();
    }
}
