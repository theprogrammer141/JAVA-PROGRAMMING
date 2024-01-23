import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MAIN {
    public static void main(String[] args)
    {
        try {
            FileReader reader=new FileReader("D:/GITHUB REPOS/JAVA-PROGRAMMING/OBJECT-ORIENTED PROGRAMMING/READ FROM A FILE/src/poem.txt");
            int data= 0;
            try {
                data = reader.read();
                while(data!=-1)
                {
                    System.out.print((char)data);
                    data=reader.read();
                }
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
