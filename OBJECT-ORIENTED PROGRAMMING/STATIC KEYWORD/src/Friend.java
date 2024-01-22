public class Friend {
    String name;
   static int numberoffriends;

    Friend(String name)
    {
        this.name=name;
        numberoffriends++;
    }

    static void displayfriends()
    {
        System.out.println("YOU HAVE "+numberoffriends+" FRIENDS");
    }
}
