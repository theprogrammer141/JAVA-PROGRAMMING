public class MAIN {
    public static void main(String[] args)
    {
        //METHOD 1
//        Food[] refrigerator=new Food[3];

        Food food1=new Food("PIZZA");
        Food food2=new Food("HAMBURGER");
        Food food3=new Food("HOTDOG");

        //METHOD 2
        Food[] refrigerator={food1,food2,food3};

        refrigerator[0]=food1;
        refrigerator[1]=food2;
        refrigerator[2]=food3;

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
    }
}
