import javax.swing.*;
import javax.swing.JLabel;
import java.awt.*;

public class MAIN {
    public static void main(String[] args)
    {
        ImageIcon imageIcon=new ImageIcon("src/thumbsup.jpeg");

        JLabel jLabel=new JLabel();
        jLabel.setText("Hi");
        jLabel.setIcon(imageIcon);
        jLabel.setLayout(null);


        JPanel redPanel=new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0,0,250,250);


        JPanel bluePanel=new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250,0,250,250);

        JPanel greenPanel=new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(new BorderLayout());

        JFrame jFrame=new JFrame();
        jFrame.setVisible(true);
        jFrame.setLayout(null);
        jFrame.setSize(650,650);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(redPanel);
        jFrame.add(bluePanel);
        jFrame.add(greenPanel);
        greenPanel.add(jLabel);
        bluePanel.add(jLabel);
        redPanel.add(jLabel);
    }
}
