import java.io.File;

public class MAIN {
    public static void main(String[] args)
    {
        File file=new File("D:/GITHUB REPOS/JAVA-PROGRAMMING/OBJECT-ORIENTED PROGRAMMING/FILE CLASS//src//secret.txt");
        if(file.exists())
        {
            System.out.println("THIS FILE EXISTS!");
        }
        else
        {
            System.out.println("THIS FILE DOESN'T EXIST");
        }

    }
}
