import java.awt.*;
import java.awt.event.*;
class Keylistener extends KeyAdapter
{
    Frame f;
    Label l;
    TextArea t;
    Keylistener()
    {
       f=new Frame();
       t=new TextArea();
       t.setBounds(30,80,110,145);
       f.add(t);
       l=new Label();
       l.setBounds(40,120,60,50);
       f.add(l);
       f.addKeyListener(new KeyAdapter()
       {
           public void keyReleased(KeyEvent e)
           {
               String text=t.getText();
               String words[]=text.split("");
               l.setText("Words= "+words.length+"characters ="+text.length());
           }
       });
       f.setLayout(null);
       f.setSize(400,400);
       f.setVisible(true);
   }
   public static void main(String[] args)
   {
       new Keylistener();
    }
}
       