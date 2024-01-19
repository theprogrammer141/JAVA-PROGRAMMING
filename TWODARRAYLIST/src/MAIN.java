import java.util.*;
public class MAIN {
    public static void main(String[] args)
    {
        ArrayList<String> bakeryList=new ArrayList<>();
        bakeryList.add("PASTA");
        bakeryList.add("GARLIC BREAD");
        bakeryList.add("DONUTS");

        ArrayList<String> produceList=new ArrayList<>();
        produceList.add("TOMATOES");
        produceList.add("ZUCCHINI");
        produceList.add("PEPPERS");

        ArrayList<String> drinksList=new ArrayList<>();
        drinksList.add("SODA");
        drinksList.add("COFFEE");

        ArrayList<ArrayList<String>> groceryList=new ArrayList<>();
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList.get(1).get(0));
    }
}
