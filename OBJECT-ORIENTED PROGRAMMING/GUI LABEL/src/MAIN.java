import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MAIN {
    public static void main(String[] args)
    {
        ImageIcon imageicon=new ImageIcon("src/R.png");

        JLabel label=new JLabel();
        label.setText("BRO,DO YOU EVEN CODE?");
        label.setIcon(imageicon);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.black);
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        label.setIconTextGap(-390);
        label.setBackground(Color.black);
        label.setOpaque(true);

        Border border=BorderFactory.createLineBorder(Color.GREEN,3);

        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);



        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);
        frame.add(label);
        frame.pack();
    }
}
