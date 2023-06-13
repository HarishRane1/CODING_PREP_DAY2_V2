import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FirstScreen extends JFrame implements ActionListener
{
    JLabel l;
    JTextField tf;
    JButton b1,b2;

    FirstScreen()
    {
        l = new JLabel("Your message!!");
        l.setLocation(50,30);
        l.setSize(200,30);
        add(l);

        tf = new JTextField();
        tf.setEditable(false);
        tf.setBackground(Color.RED);
        tf.setForeground(Color.YELLOW);
        tf.setSize(200, 30);
        tf.setLocation(230, 30);
        add(tf);

        b1= new JButton("Show");
        b1.addActionListener(this);

        Color c = new Color(29,157,112);
        b1.setBackground(c);
        b1.setForeground(Color.YELLOW);
        b1.setSize(100, 30);
        b1.setLocation(190, 80);
        add(b1);


        Icon icon = new ImageIcon("c.png");
        b2 = new JButton("Icon");
        b2.addActionListener(this);
        // b1.setBackground(c);
        // b1.setForeground(Color.YELLOW);
        b2.setSize(200, 50);
        b2.setLocation(190, 80);
        b2.setVisible(false);
        add(b2);

        setTitle("Developed by harish");
        setSize(500, 300);
        setLocation(500, 400);
        setResizable(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }




    public void actionPerformed(ActionEvent ae)
    {
         String s = (String) ae.getActionCommand();

         if(s.equals("Show"))
         {
            tf.setText("HELLLO WORLDDD");
            b2.setVisible(true);
            b1.setVisible(false);
         }

         if(s.equals("Clear"))
         {
            tf.setText("");
            b1.setVisible(true);
            b2.setVisible(false);
         }
    }


    public static void main(String args[])
    {
        FirstScreen  f = new FirstScreen();
    }
}