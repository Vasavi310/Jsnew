import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleSwingDemo {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("Simple Swing Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create JTextField
        JTextField textField = new JTextField();
        textField.setColumns(10);

        // Create JButton
        JButton button = new JButton("Click Me");

        // Create ActionListener for the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle button click event
                String inputText = textField.getText();
                JOptionPane.showMessageDialog(frame, "You clicked the button. Input: " + inputText);
            }
        });

        // Create JPanel and set layout
        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(button);

        // Add the panel to the frame
        frame.getContentPane().add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
