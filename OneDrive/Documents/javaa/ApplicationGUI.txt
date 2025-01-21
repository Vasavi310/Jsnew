import javax.swing.*;
import java.awt.event.*;
class ApplicationGUI
{
   public static void main(String[] args)
   {
       JFrame f=new JFrame("GUI Application");
       JPanel p=new JPanel();
       JLabel l=new JLabel("enter your name");
       JTextField t=new JTextField(10);
       JButton b=new JButton("finish");
       p.add(l);
       p.add(t);
       p.add(b);
       b.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
             String name=t.getText();
           JOptionPane.showMessageDialog(f," hello "+name);
            }
       });
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setLayout(new java.awt.FlowLayout());
       f.add(p);
       f.setSize(300,200);
       f.setVisible(true);
   }
}
       