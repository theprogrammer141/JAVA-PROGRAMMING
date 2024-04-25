import java.util.ArrayList;

public class TestStats {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape square = new Square();
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(square);

        int[] provincesAreas = new int[2];
        provincesAreas[0] = 25680;
        provincesAreas[1] = 23043;

        ArrayList<Integer> statesAreas = new ArrayList<>();
        statesAreas.add(45000);
        statesAreas.add(35000);
        statesAreas.add(25000);

        Country country = new Country("Pakistan", provincesAreas, statesAreas);

        for (Shape shape : shapes) {
            if(shape instanceof Rectangle) {
                printStats(shape);
            }
            else if(shape instanceof Square) {
                printStats(shape);
            }
        }

        printStats(country);
    }

    static void printStats(Stats i)
    {
        System.out.println("Total Area Of " + i.toString() + " = " + i.computeArea());
        i.reset();
    }

}
