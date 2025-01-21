import javax.swing.*;
import java.awt.*;
class Frame1
{
   public static void main(String[] args)
   {
      JFrame f=new JFrame("Frame ex");
      f.setSize(500,500);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setLayout(new FlowLayout());
      JLabel l=new JLabel("Hi,I am frame");
      f.add(l);
      JButton b=new JButton("click on me");
      f.add(b);
      f.setVisible(true);
   }
}