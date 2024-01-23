import java.util.Scanner;

public class MAIN {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        Animal animal;
        System.out.println("WHAT ANIMAL DO YOU WANT?");
        int choice=scanner.nextInt();

        if(choice==1)
        {
            animal=new Cat();
            animal.speak();
        } else if (choice==2) {
            animal=new Dog();
            animal.speak();
        }
        else
        {
            animal=new Animal();
            System.out.println("THAT'S AN INVALID CHOICE");
            animal.speak();
        }

    }
}
