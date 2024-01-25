import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    JFrame jFrame=new JFrame();
    MyFrame() {
        this.setVisible(true);
        this.setSize(420, 420);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.gray);

        ImageIcon image = new ImageIcon("D:/GITHUB REPOS/JAVA-PROGRAMMING/OBJECT-ORIENTED PROGRAMMING/GUI FRAME/src/R.png");

        this.setIconImage(image.getImage());
    }
}
