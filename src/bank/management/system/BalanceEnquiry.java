package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {
    JLabel label2;

    String pin;

    JButton b1;

    BalanceEnquiry(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm8.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 1700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1500, 1000);
        add(l3);

        JLabel label1 = new JLabel("Your current balance is Rs. ");
        label1.setFont(new Font("System", Font.BOLD, 18));
        label1.setBounds(500, 400, 400, 25);
        label1.setForeground(Color.black);
        l3.add(label1);

         label2 = new JLabel(" ");
        label2.setBounds(500, 425, 400, 25);
        label2.setForeground(Color.black);
        label2.setFont(new Font("System", Font.BOLD, 18));
        l3.add(label2);

        b1 = new JButton("BACK");
        b1.setBounds(720, 535, 130, 25);
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b1.addActionListener(this);
        l3.add(b1);

        int balance =0;
        try{
            Connector c = new Connector();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where Pin_No='"+pin+"'");
            while (resultSet.next()){
                if (resultSet.getString("Type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("Amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("Amount"));
                }
            }
        }catch (Exception E){
            E.printStackTrace();
        }
        label2.setText(""+balance);

        getContentPane().setBackground(new Color(215, 252, 252));
        setSize(1550, 1000);
        setLayout(null);
        setLocation(0, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Main_Class(pin);

    }

    public static void main(String[] args){
       new  BalanceEnquiry("");

    }
}
