public class CircleTest
{
	public static void main(String[] args)
	{
		System.out.println("BEFORE CREATING OBJECTS:-");
		System.out.println("NUMBER OF OBJECTS ARE : " + Circle.numberOfObjects);
		
		Circle c1 = new Circle();
		
		System.out.println("AFTER CREATING FIRST OBJECT:-");
		System.out.println("THE RADIUS OF CIRCLE ONE IS : " + c1.radius +
		" AND NUMBER OF OBJECTS ARE NOW : " + c1.numberOfObjects);
		
		c1.radius = 9.0;
		
		Circle c2 = new Circle(5);
		
		System.out.println("AFTER CREATING SECOND OBJECT:-");
		System.out.println("THE RADIUS OF CIRCLE ONE IS : " + c1.radius +
		" AND RADIUS OF CIRCLE TWO IS : " + c2.radius + " AND NUMBER OF OBJECTS ARE NOW : " 
		+ c2.numberOfObjects);
		
	}
}
		
		
		