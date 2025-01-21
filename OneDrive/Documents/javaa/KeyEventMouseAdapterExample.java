import java.awt.event.*;

import javax.swing.*;

public class KeyEventMouseAdapterExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Adapter Example");

        // Create a label to display messages
        JLabel label = new JLabel("Press a key or click the mouse!");
        frame.add(label);

        // Add KeyListener using KeyAdapter
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                label.setText("Key Typed: " + e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                label.setText("Key Pressed: " + e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                label.setText("Key Released: " + e.getKeyChar());
            }
        });

        // Add MouseListener and MouseMotionListener using MouseAdapter
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                label.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                label.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setFocusable(true); // Make sure the frame is focusable to receive key events

        frame.setVisible(true);
    }
}