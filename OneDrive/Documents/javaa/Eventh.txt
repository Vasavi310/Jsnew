import java.awt.*;
import java.awt.event.*;
class Eventh extends Frame implements ActionListener
{
   TextField t;
   Eventh()
   {
      t=new TextField();
      t.setBounds(60,50,80,90);
      Button b=new Button("show");
      b.setBounds(130,60,80,30);
      b.addActionListener(this);
      add(b);
      add(t);
      setLayout(null);
      setSize(380,350);
      setVisible(true);
   }
   public void actionPerformed(ActionEvent a)
   {
       t.setText("Hi,Welcome!");
   }
   public static void main(String[] args)
   {
       new Eventh();
   }
}