import javax.swing.*;
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Create  new window(JFrame)
        JFrame frame = new JFrame("My First Gui");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        // Text Field
        JTextField textField = new JTextField();
        textField.setBounds(50, 20, 200, 30);
        
        // Button
        JButton button = new JButton("Click Me");
        button.setBounds(50, 70, 95, 30);

        // label
        JLabel label = new JLabel("Hello, World!");
        label.setBounds(150, 70, 100, 30);

        // Add components to the frame
        frame.add(textField);
        frame.add(button);
        frame.add(label);

        button.addActionListener(e -> {
            String name = textField.getText();
            label.setText("Hello, " + name + "!");
        });

        // Set the frame visibility to true
        frame.setVisible(true);
    }
}
