public class TestCircle
{
	public static void main(String[] args)
	{
		Circle c1 = new Circle();
		Circle c2 = new Circle(25);
		Circle c3 = new Circle(125);
		Circle c4 = new Circle(150);
		
		System.out.println("THE AREA OF CIRCLE OF RADIUS " + c1.radius + " IS : " + c1.getArea());
		System.out.println("THE PERIMETER OF CIRCLE OF RADIUS " + c1.radius + " IS : " + c1.getPerimeter());
		
		System.out.println("THE AREA OF CIRCLE OF RADIUS " + c2.radius + " IS : " + c2.getArea());
		System.out.println("THE PERIMETER OF CIRCLE OF RADIUS " + c2.radius + " IS : " + c2.getPerimeter());
		
		System.out.println("THE AREA OF CIRCLE OF RADIUS " + c3.radius + " IS : " + c3.getArea());
		System.out.println("THE PERIMETER OF CIRCLE OF RADIUS " + c3.radius + " IS : " + c3.getPerimeter());
		
		System.out.println("THE AREA OF CIRCLE OF RADIUS " + c4.radius + " IS : " + c4.getArea());
		System.out.println("THE PERIMETER OF CIRCLE OF RADIUS " + c4.radius + " IS : " + c4.getPerimeter());
	}
}
	