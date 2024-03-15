public class Circle
{
	double radius;
	
	Circle()
	{
		radius = 1;
	}
	
	Circle(double newRadius)
	{
		radius = newRadius;
	}
	
	double getArea()
	{
		return radius * radius * Math.PI;
	}
	
	double getPerimeter()
	{
		return 2 * Math.PI * radius;
	}
	
	void setRadius(double newRadius)
	{
		radius = newRadius;
	}
}