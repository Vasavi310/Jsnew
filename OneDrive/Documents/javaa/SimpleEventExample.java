import javax.swing.*;
import java.awt.event.*;

class SimpleEventExample extends JFrame 
{
       SimpleEventExample() 
       {
        JLabel l=new JLabel("Mouse and Key adapters");
        l.setBounds(20,50,100,20);
        add(l);
        setLayout(null);
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(new MouseAdapter()
        {
            public void mouseEntered(MouseEvent a)
            {
                l.setText("mouse entered");
            }
            public void mouseExited(MouseEvent a)
            {
                l.setText("mouse exited");
            }
       });
       addKeyListener(new KeyAdapter()
       {
          public void keyTyped(KeyEvent a)
          {
              l.setText("key typed");
          }
       });
      }
      public static void main(String[] args)
      {
          new SimpleEventExample();
      }
}