import java.util.ArrayList;
public class MAIN {
    public static void main(String[] args)
    {
//        String[] animals={"cat","dog","rat","bird"};

        ArrayList<String> animals=new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        for(String i : animals)
        {
            System.out.println(i);
        }
    }
}
