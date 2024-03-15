public class Date
{
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public void setDay(int day)
	{
		if(day >= 1 && day <= 31)
		{
			this.day = day;
		}
		else
		{
			System.out.println("INVALID DAY INPUT!");
		}
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public void setMonth(int month)
	{
		if(month >= 1 && month <= 12)
		{
			this.month = month;
		}
		else
		{
			System.out.println("INVALID MONTH INPUT!");
		}
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setYear(int year)
	{
		if(year >= 1970 && year <= 2024)
		{
			this.year = year;
		}
		else
		{
			System.out.println("INVALID YEAR INPUT!");
		}
	}
}