public class program {
    public static void main(String[] args)
    {
        String x="hello";
        String y="world";

        System.out.println("x: "+x);
        System.out.println("y: "+y);

        String temp;
        temp=x;
        x=y;
        y=temp;

        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }   
}
