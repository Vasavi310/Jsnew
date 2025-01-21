import javax.swing.*;
import java.awt.event.*;
class Kmouse
{
   public static void main(String[] args)
   {
       JFrame f=new JFrame("keyboard and mouse properties");
       JLabel label=new JLabel("example");
       f.add(label);
       f.addKeyListener(new KeyAdapter()
       {
          public void keyTyped(KeyEvent e)
          {
              label.setText("typed "+e.getKeyChar());
          }
          public void keyPressed(KeyEvent e)
          {
              label.setText("pressed "+e.getKeyChar());
           }
          public void keyReleased(KeyEvent e)
          {
              label.setText("key released "+e.getKeyChar());
          }
       });
       f.addMouseListener(new MouseAdapter()
       {
           public void mouseClicked(MouseEvent e)
           {
               label.setText("mouse is clicked");
           }
          public void mousePressed(MouseEvent e)
          {
              label.setText("mouse pressed");
          }
         public void mouseReleased(MouseEvent e)
          {
              label.setText("mouse released");
          }
       });
       f.setSize(300,200);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setFocusable(true);
       f.setVisible(true);
     }
}