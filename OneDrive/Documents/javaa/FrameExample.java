import javax.swing.*;
import java.awt.*;

public class FrameExample {
    public static void main(String[] args) {
        // Create a JFrame instance
        JFrame frame = new JFrame("Frame Example");

        // Set the size of the frame
        frame.setSize(400, 300);

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the layout manager (optional)
        frame.setLayout(new FlowLayout());

        // Create a label and add it to the frame
        JLabel label = new JLabel("Hello, Java Swing!");
        frame.add(label);

        // Create a button and add it to the frame
        JButton button = new JButton("Click Me!");
        frame.add(button);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}