import java.util.Random;

public class DiceRoller {

    //METHOD 2
    Random random;
    int number;
    DiceRoller()
    {
         random=new Random();
//        roll(random,number);
        roll();
    }

    void roll()
    {
        number=random.nextInt(6)+1;
        System.out.println(number);
    }


    //METHOD 1
//    void roll(Random random,int number)
//    {
//        number=random.nextInt(6)+1;
//        System.out.println(number);
//    }
}
