import java.util.ArrayList;
public class MAIN {
    public static void main(String[] args)
    {
        ArrayList<String> food=new ArrayList<String>();

        food.add("PIZZA");
        food.add("HAMBURGER");
        food.add("HOTDOG");

        food.set(0,"SUSHI");
        food.remove(2);
        food.clear();

        for(int i=0;i< food.size();i++)
        {
            System.out.println(food.get(i));
        }
    }

}
