import javax.swing.*;
import java.awt.*;
class Layout
{
   public static void main(String[] args)
   {
       JFrame f=new JFrame("layout");
       f.setLayout(new BorderLayout());
       JButton e=new JButton("East");
       JButton w=new JButton("West");
       JButton n=new JButton("North");
       JButton s=new JButton("South");
       f.add(e,BorderLayout.EAST);
       f.add(w,BorderLayout.WEST);
        f.add(n,BorderLayout.NORTH);
        f.add(s,BorderLayout.SOUTH);
       f.setSize(300,400);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setVisible(true);
    }
}