import javax.swing.*;
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Create  new window(JFrame)
        JFrame frame = new JFrame("My First Gui");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        frame.setVisible(true);
    }
}
