import javax.swing.*;
import java.awt.*;

public class FrameDesign {
    public static void main(String[] args) {
        // Create a JFrame (a window)
        JFrame frame = new JFrame("Frame Design Example");

        // Set the size of the frame
        frame.setSize(400, 300);

        // Set the default close operation (what happens when the close button is clicked)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the location of the frame on the screen (centered)
        frame.setLocationRelativeTo(null);

        // Set the layout manager (how components are arranged within the frame)
        frame.setLayout(new FlowLayout());

        // Create a label
        JLabel label = new JLabel("Hello, Swing!");

        // Set the font and foreground color of the label
        label.setFont(new Font("Arial", Font.BOLD, 16));
        label.setForeground(Color.BLUE);

        // Add the label to the frame
        frame.add(label);

        // Make the frame visible
        frame.setVisible(true);
    }
}
