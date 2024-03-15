import java.util.Random;

public class AutomaticCar
{
	private String model;
	private int year;
	private double speed;
	private double gear;
	private double odometer;
	
	public AutomaticCar(String model, int year, double initialSpeed)
	{
		this.model = model;
		this.year = year;
		this.odometer = 0;
		if(initialSpeed < 0)
		{
			System.out.print("INITIAL SPEED CANNOT BE NEGATIVE!");
			this.speed = 0;
		}
		else
		{
			this.speed = initialSpeed;
		}
	}
	
	public String getModel()
	{
		return model;
	}
	
	public void setModel(String model)
	{
		this.model = model;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public double getSpeed()
	{
		return speed;
	}
	
	public void setSpeed(double newSpeed)
	{
		if(newSpeed < 0)
		{
			System.out.println("SPEED CANNOT BE NEGATIVE");
		}
		else if(newSpeed > speed)
		{
			speed += newSpeed;
		}
		else if(newSpeed < speed)
		{
			speed -= newSpeed;
		}
		setGear();
	}
	
	public double getGear()
	{
		return gear;
	}
	
	public void setGear()
	{
		if(speed == 0)
		{
			gear = 0;
		}
		else if(speed >= 1 && speed <= 100)
		{
			gear = 1;
		}
		else if(speed >= 101 && speed <= 200)
		{
			gear = 2;
		}
		else if(speed >= 201 && speed <= 300)
		{
			gear = 3;
		}
		else if(speed >= 301 && speed <= 400)
		{
			gear = 4;
		}
		else if(speed >= 401 && speed <= 500)
		{
			gear = 5;
		}
	}
	
	public double getOdoMeter()
	{
		return odometer;
	}
	
	public void setOdoMeter(double odometer)
	{
		this.odometer = odometer;
	}
	
	public double calculateAverageGear()
	{
		return (gear + 1) / 2.0;
	}
	
	public void updateGearForNextRound()
	{
		Random random = new Random();
		setSpeed(random.nextInt(500) + 1);
	}
}