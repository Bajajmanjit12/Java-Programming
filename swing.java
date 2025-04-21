//write a program to implement GUI application using swing to perform various opertaion with database 

import javax.swing.*;
import java.awt.*;
public class swing{
    public static void main(String args[])
    {
        JFrame jf = new JFrame("Registration Form");
        Container c =jf.getContentPane();

        c.setBackground(Color.lightGray);

        JLabel l1 = new JLabel("Username");
        JTextField t1 = new JTextField(15);

        JLabel l4 = new JLabel("University Name");
        JTextField t4 = new JTextField(15);

        JLabel l5 = new JLabel("Department Name");
        JTextField t5 = new JTextField(15);

        JLabel l2 = new JLabel("email-ID");
        JTextField t2 = new JTextField(15);

        JLabel l3 = new JLabel("Password");
        JTextField t3 = new JTextField(15);

        JButton b1 = new JButton("Register");
        b1.setBackground(Color.green);

        c.setLayout(new FlowLayout());
        c.add(l1);
        c.add(t1);
        c.add(l2);
        c.add(t2);
        c.add(l3);
        c.add(t3);
        c.add(l4);
        c.add(t4);
        c.add(l5);
        c.add(t5);
        c.add(b1);
        jf.setSize(400,400);
        jf.setVisible(true);
    }
}