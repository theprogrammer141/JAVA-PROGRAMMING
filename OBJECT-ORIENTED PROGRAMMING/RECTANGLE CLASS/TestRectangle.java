public class TestRectangle
{
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle();
		
		r1.length = 23.3;
		r1.width = 34.2;
		
		System.out.println("AREA OF RECTANGLE IS : " + r1.calculateArea());
		System.out.println("PERIMETER OF RECTANGLE IS : " + r1.calculatePerimeter());
	}
}