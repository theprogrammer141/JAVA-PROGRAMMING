public class FISH implements PREY,PREDATOR{

    @Override
    public void flee() {
        System.out.println("THE SMALLER FISH IS FLEEING FROM THE LARGER FISH");
    }

    @Override
    public void hunt() {
        System.out.println("THE BIGGER FISH IS HUNTING THE SMALLER FISH");
    }
}
