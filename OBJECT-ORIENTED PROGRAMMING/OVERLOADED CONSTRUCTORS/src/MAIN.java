public class MAIN {
    public static void main(String[] args)
    {
        Pizza pizza=new Pizza("thick crust","tomato","mozzeralla");
        System.out.println("HERE ARE THE INGREDIENTS FOR YOUR PIZA:");
        System.out.printf("%s\n",pizza.bread);
        System.out.printf("%s\n",pizza.sauce);
        System.out.printf("%s\n",pizza.cheese);
        System.out.printf("%s\n",pizza.topping);
    }
}
