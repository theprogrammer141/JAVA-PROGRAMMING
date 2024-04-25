public class Square extends Shape{
    double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setLength(double side)
    {
        this.side = side;
    }

    public void setWidth(double side)
    {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public double computeArea() {
        System.out.println(getArea() + " " +units);
        return 0;
    }

    @Override
    public void reset() {
        side = 0;
    }
}
