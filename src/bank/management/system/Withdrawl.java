package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Iterator;

public class Withdrawl extends JFrame implements ActionListener {

    String pin;

    JTextField textField1;

    JButton b1, b2;

    Withdrawl(String pin) {
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm8.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 1700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1500, 1000);
        add(l3);

        JLabel label1 = new JLabel("MAXIMUM WITHDRAW IS 10,000 ");
        label1.setFont(new Font("System", Font.BOLD, 18));
        label1.setBounds(500, 400, 400, 25);
        label1.setForeground(Color.black);
        l3.add(label1);

        JLabel label2 = new JLabel("PLEASE ENTER YOUR AMOUNT ");
        label2.setBounds(500, 425, 400, 25);
        label2.setForeground(Color.black);
        label2.setFont(new Font("System", Font.BOLD, 18));
        l3.add(label2);

        textField1 = new JTextField();
        textField1.setBackground(Color.BLACK);
        textField1.setForeground(Color.white);
        textField1.setBounds(500, 450, 300, 25);
        textField1.setFont(new Font("Raleway", Font.BOLD, 16));
        l3.add(textField1);

        b1 = new JButton("WITHDRAWL");
        b1.setBounds(720, 535, 140, 25);
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(720, 565, 140, 25);
        b2.setFont(new Font("Raleway", Font.BOLD, 14));
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
        if(e.getSource()==b1) {
            try {
                String amount = textField1.getText();
                Date date = new Date();
                if (textField1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
                } else {
                    Connector c = new Connector();
                    ResultSet resultSet = c.statement.executeQuery("select *from bank where Pin_No ='" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("Type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("Amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("Amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }
                    c.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "','withdraw','" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                    setVisible(false);
                    new Main_Class(pin);
                }
            } catch (Exception E) {
                E.printStackTrace();
            }
        } else if (e.getSource()==b2) {
            setVisible(false);
            new Main_Class(pin);
            
        }
    }

        public static void main (String[] args){
            new Withdrawl("");
        }
    }


