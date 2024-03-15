public class TestCircle
{
	public static void main(String[] args)
	{
		Circle myCircle = new Circle(5.0);
		
		System.out.println("THE AREA OF CIRCLE OF RADIUS (" + myCircle.getRadius() + ")" 
		+ " IS : " + myCircle.getArea());
		
		myCircle.setRadius(9.0);
		
		System.out.println("THE AREA OF CIRCLE OF RADIUS (" + myCircle.getRadius() + ")" 
		+ " IS : " + myCircle.getArea());
		
		System.out.println("NUMBER OF OBJECTS CREATED: " + Circle.getNumberOfObjects());
	}
}