import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("blue", true,  4.78);
        shapes[1] = new Circle("yellow", true, 5.76);
        shapes[2] = new Rectangle("red", true, 4.5,5.6);
        shapes[3] = new Rectangle("green", true, 5.6,7.8);

        for (int i = 0; i < shapes.length; i++) {
            char option;
                System.out.println("Which shape object data do you want to change?");
                System.out.println("1.Circle");
                System.out.println("2.Rectangle");

                int choice;
                System.out.print("Enter your choice: ");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter radius: ");
                        double radius = input.nextDouble();
                        for(Shape shape : shapes)
                        {
                            if(shape instanceof Circle)
                            {
                                ((Circle) shape).setRadius(radius);
                            }
                        }
                        break;
                    case 2:
                        System.out.print("Enter length: ");
                        double length = input.nextDouble();
                        System.out.print("Enter width: ");
                        double width = input.nextDouble();
                        for(Shape shape : shapes)
                        {
                            if(shape instanceof Rectangle)
                            {
                                ((Rectangle) shape).setLength(length);
                                ((Rectangle) shape).setWidth(width);
                            }
                        }
                        break;
                    default:
                        System.out.println("Invalid Input!");
                }
                System.out.print("Do you want to change data of another shape(Y/y)?: ");
                option = input.next().charAt(0);

                if(option == 'N' || option == 'n')
                {
                    break;
                }
        }
        shapesSummary(shapes);
    }

    public static void shapesSummary(Shape[] s)
    {
        for(Shape shape : s)
        {
            System.out.println();
            System.out.println(shape.toString());
            System.out.println();
            System.out.println("Area = " + shape.getArea());
            System.out.println();
            System.out.println("Perimeter = " + shape.getPerimeter());
            System.out.println();
        }
    }
}
