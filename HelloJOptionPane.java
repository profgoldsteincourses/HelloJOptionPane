import javax.swing.JOptionPane;

/**
 * A "Hello World" type program to demonstrate the basics of
 * the JOptionPane.
 * 
 * @author Jim Teresco
 * @version Spring 2022
 */

public class HelloJOptionPane {

    public static void main(String args[]) {

        String name = JOptionPane.showInputDialog("What's your name?");
        JOptionPane.showMessageDialog(null, "Hello, " + name);
    }
}
