import java.time.LocalDate;
import java.time.Period;

public class Person
{
	String name;
	int age = 65;
	private double height;
	private int weight;
	
	public LocalDate currentDate = LocalDate.now();
    public int birthYear = currentDate.getYear() - age;
	public LocalDate DateOfBirth = LocalDate.of(birthYear, 9, 15);
	
	public Person(String name, LocalDate DateOfBirth)
	{
		this.name = name;
		this.DateOfBirth = DateOfBirth;
	}
	
	public int getAge()
	{
		Period period = Period.between(DateOfBirth, currentDate);
		age = period.getYears();
		return age;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void setHeight(double height)
	{
		if(height > 0 && height <=300)
		{
		this.height = height;
		}
		else
		{
			System.out.println("INVALID INPUT! RANGE MUST BE(0-300CM)!");
		}
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	public void setWeight(int weight)
	{
		if(weight > 0 && weight <=500)
		{
			this.weight = weight;
		}
		else
		{
			System.out.println("INVALID INPUT! RANGE MUST BE(0-500KG)");
		}
	}
	
	public double getBMI()
	{
		double BMI = (weight / Math.pow(height, 2)) * 10000;
		return BMI;
	}
	
	public void getBMIHelp()
	{
		System.out.println("UNDER_WEIGHT = <18.5");
		System.out.println("NORMAL WEIGHT = 18.5-24.5");
		System.out.println("OVER_WEIGHT = 25-29.9");
		System.out.println("OBESITY = 30>");
	}
	
	public void printData()
	{
		System.out.print("\n\n");
		System.out.println("PERSON INFORMATION:-");
		System.out.println("NAME : " + name);
		System.out.println("AGE : " + getAge());
		System.out.println("HEIGHT : " + height);
		System.out.println("WEIGHT : " + weight);
		System.out.printf("BMI : %.2f", getBMI());
		System.out.print("\n\n");
	}
}