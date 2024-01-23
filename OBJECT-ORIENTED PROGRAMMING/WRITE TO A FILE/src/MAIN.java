import java.io.FileWriter;
import java.io.IOException;

public class MAIN {
    public static void main(String[] args)
    {
        FileWriter writer= null;
        try {
            writer = new FileWriter("poem.txt");
            writer.write("ROSES ARE RED\nVIOLETS ARE BLUE\n");
            writer.append("A POEM BY ME");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
