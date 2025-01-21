import java.awt.*;
import java.awt.event.*;
class Mouselist extends MouseAdapter
{
   Frame f;
   Label l;
   Mouselist()
   {
      f=new Frame("mouse adapter");
      l=new Label();
      l.setBounds(30,120,260,320);
      f.add(l);
      f.addMouseListener(new MouseAdapter()
      {
          public void mouseEntered(MouseEvent e)
   {
       l.setText("mouse entered");
   }
       });
      
      f.setLayout(null);
      f.setSize(550,550);
      f.setVisible(true);
   }
   
   public static void main(String[] args)
   {
      new Mouselist();
   }
}
    