import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingDemoApp{
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Swing Demo Application");

        // Create a JPanel to hold components
        JPanel panel = new JPanel();

        // Create a JLabel
        JLabel label = new JLabel("Enter your name:");

        // Create a JTextField for user input
        JTextField textField = new JTextField(20);

        // Create a JButton
        JButton submitButton = new JButton("Submit");

        // Add components to the panel
        panel.add(label);
        panel.add(textField);
        panel.add(submitButton);

        // Add an ActionListener to the submitButton
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the text from the textField
                String userName = textField.getText();

                // Show a message dialog with a greeting
                JOptionPane.showMessageDialog(frame, "Hello, " + userName + "!", "Greeting", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the layout manager for the frame
        frame.setLayout(new java.awt.FlowLayout());

        // Add the panel to the frame
        frame.add(panel);

        // Set the size of the frame
        frame.setSize(300, 150);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}