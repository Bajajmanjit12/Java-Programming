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
        JTextField t1 = new JTextField(10);

        JLabel l4 = new JLabel("University Name");
        JTextField t4 = new JTextField(10);

    
        JCheckBox c1 = new JCheckBox("Sanjivani University");
        JCheckBox c2 = new JCheckBox("MIT University");


        JLabel l5 = new JLabel("Department Name");
        JTextField t5 = new JTextField(10);

        JRadioButton r1 = new JRadioButton("FY");
        JRadioButton r2 = new JRadioButton("SY");
        JRadioButton r3 = new JRadioButton("TY");
        JRadioButton r4 = new JRadioButton("Btech");

        JLabel l2 = new JLabel("email-ID");
        JTextField t2 = new JTextField(15);

        JLabel l3 = new JLabel("Password");
        JTextField t3 = new JTextField(15);

        JButton b0 = new JButton("Clear");
      
        JButton b1 = new JButton("Register");
        b1.setBackground(Color.green);

        c.setLayout(new GridLayout(9,2,15,15));
        c.add(l1);
        c.add(t1);
        c.add(l2);
        c.add(t2);
        c.add(l3);
        c.add(t3);
        c.add(l4);
        c.add(t4);
        c.add(c1);
        c.add(c2);
        c.add(l5);
        c.add(t5);
        c.add(b0);
        c.add(b1);
        c.add(r1);
        c.add(r2);
        c.add(r3);
        c.add(r4);
        
        jf.setSize(400,400);
        jf.setVisible(true);
    }
}
