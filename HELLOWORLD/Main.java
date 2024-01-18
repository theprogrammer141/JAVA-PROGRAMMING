import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args)
    {
        String name=JOptionPane.showInputDialog("ENTER YOUR NAME");
        JOptionPane.showMessageDialog(null,"HELLO "+name);

        //int age=Integer.parseInt(JOptionPane.showInputDialog("ENTER YOUR AGE:"));
        //JOptionPane.showMessageDialog(null,"YOU ARE "+age+"YEARS OLD");
    }

}