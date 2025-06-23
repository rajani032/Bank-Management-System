package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Change_Pin extends JFrame implements ActionListener {

    JButton b1 ,b2;

    JPasswordField p1,p2;
    String pin;

    Change_Pin(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm8.jpg"));
        Image i2 =  i1.getImage().getScaledInstance(1550,1700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1500,1000);
        add(l3);

        JLabel label1 = new JLabel("CHANGE YOUR PIN");
        label1.setForeground(Color.black);
        label1.setBounds(470,410,400,25);
        label1.setFont(new Font("System",Font.BOLD,18));
        l3.add(label1);

        JLabel label2 = new JLabel("NEW PIN");
        label2.setForeground(Color.black);
        label2.setBounds(470,450,400,25);
        label2.setFont(new Font("System",Font.BOLD,14));
        l3.add(label2);

        p1 = new JPasswordField();
        p1.setBackground(Color.BLACK);
        p1.setForeground(Color.white);
        p1.setBounds(620, 450, 200, 25);
        p1.setFont(new Font("Raleway", Font.BOLD, 16));
        l3.add(p1);

        JLabel label3= new JLabel("RE-ENTER NEW PIN");
        label3.setForeground(Color.black);
        label3.setBounds(460,480,400,25);
        label3.setFont(new Font("System",Font.BOLD,14));
        l3.add(label3);

        p2 = new JPasswordField();
        p2.setBackground(Color.BLACK);
        p2.setForeground(Color.white);
        p2.setBounds(620, 480, 200, 25);
        p2.setFont(new Font("Raleway", Font.BOLD, 16));
        l3.add(p2);

        b1 = new JButton("CHANGE");
        b1.setBounds(750,535,100,25);
        b1.setFont(new Font("Raleway",Font.BOLD,14));
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(750,565,100,25);
        b2.setFont(new Font("Raleway",Font.BOLD,14));
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        b2.addActionListener(this);
        l3.add(b2);

        getContentPane().setBackground(new Color(215, 252, 252));
        setSize(1550, 1000);
        setLayout(null);
        setLocation(0, 0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            String pin1 = p1.getText();
            String pin2 = p2.getText();

            JOptionPane.showMessageDialog(null, pin);

            if (!pin1.equals(pin2)) {
                JOptionPane.showMessageDialog(null, "Entered Pin does not match");
                return;
            }
            if (e.getSource() == b1) {
                if (p1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter new Pin");
                    return;
                }
                if (p2.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "RE-ENTER PIN");
                }
                Connector c1 = new Connector();

                String q1 = "update login set Pin_No = '" +pin1+ "' where Pin_No = '" +pin+ "'";
                String q2 = "update bank set Pin_No = '" +pin1+ "' where Pin_No = '" +pin+ "'";
                String q3 = "update signupthree set Pin_No = '" +pin1+ "' where Pin_No = '" +pin+ "'";

                c1.statement.executeUpdate(q1);
                c1.statement.executeUpdate(q2);
                c1.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null,"Pin change successfully");
                setVisible(false);
                new Main_Class(pin);

            } else if (e.getSource()==b2) {
                new Main_Class(pin);
                setVisible(false);


            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args){
        new Change_Pin("");
    }
}
