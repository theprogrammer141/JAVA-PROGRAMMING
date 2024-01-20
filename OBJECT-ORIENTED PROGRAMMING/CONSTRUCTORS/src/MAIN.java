
public class MAIN {
    public static void main(String[] args) {
        HUMAN human1 = new HUMAN("rocky", 54, 60);
        HUMAN human2 = new HUMAN("morty", 45, 65);

//        System.out.println(human1.name);
//        System.out.println(human2.name);

        human1.eat();
        human2.drink();
        human1.age();
        human2.age();
        human1.weight();
        human2.weight();
    }

}
