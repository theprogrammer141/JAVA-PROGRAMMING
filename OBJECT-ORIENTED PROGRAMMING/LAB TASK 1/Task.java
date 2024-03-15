import java.util.Scanner;

public class Task
{
	public static void main(String[] args)
	{
		String dept;
		double units = 0.0d;
		final int additional_charges = 10000;
		double electricity_bill = 0.0d;
		double total_payable_bill = 0.0d;
		double temp_unit = 0.0d;
		double bill = 0.0d;
		
		Scanner input = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);


		int i = 1;
		do
		{
		
		System.out.printf("ENTER NAME OF DEPARTMENT [%d]: ", i);
		dept = inputString.nextLine();
		
		System.out.print("ENTER THE UNITS CONSUMED: ");
		units = input.nextInt();
		
		if(units >= 1 && units <=100)
		{
			units =  units * 50.5;
			electricity_bill = units + additional_charges;
			System.out.println("ELECTRICITY BILL = " + electricity_bill);
		}
		else if(units >=101 && units <=200)
		{
			temp_unit = units - 100;
			temp_unit = temp_unit * 64.5;
			bill = 100 * 50.5;
			bill = bill + temp_unit;
			electricity_bill = bill + additional_charges;
			System.out.println("ELECTRICITY BILL = " + electricity_bill);
		}
		else if(units > 200)
		{
			bill = (100 * 50.5) + (100 * 64.5);
			bill = bill + (units - 200) * 75.5;
			electricity_bill = bill + additional_charges;
			System.out.println("ELECTRICITY BILL = " + electricity_bill);
		}
		
		i++;
		total_payable_bill++;
		}while(i<=4);
	}
}