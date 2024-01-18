import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args)
    {
        String name=JOptionPane.showInputDialog("ENTER YOUR NAME:");
        JOptionPane.showMessageDialog(null,"HELLO "+name);

        int age=Integer.parseInt(JOptionPane.showInputDialog("ENTER YOUR AGE:"));
        JOptionPane.showMessageDialog(null,"YOU ARE "+age+"YEARS OLD");

        double height=Double.parseDouble(JOptionPane.showInputDialog("ENTER YOUR HEIGHT:"));
        JOptionPane.showMessageDialog(null,"YOU ARE "+height+"CM TALL");
        
    }
}