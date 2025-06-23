package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_Class extends JFrame implements ActionListener {
    JButton b1, b2, b3, b4, b5, b6, b7;

    String pin;

    Main_Class(String pin) {
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm8.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 1700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1500, 1000);
        add(l3);

        JLabel label1 = new JLabel("Please select your transaction");
        label1.setBounds(500, 410, 400, 25);
        label1.setForeground(Color.black);
        label1.setFont(new Font("System", Font.BOLD, 22));
        l3.add(label1);

        b1 = new JButton("DEPOSIT");
        b1.setBounds(450, 477, 150, 25);
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("CASH WITHDRAWL");
        b2.setBounds(670, 477, 190, 25);
        b2.setFont(new Font("Raleway", Font.BOLD, 14));
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("FASTCASH");
        b3.setBounds(450, 509, 150, 25);
        b3.setFont(new Font("Raleway", Font.BOLD, 14));
        b3.setForeground(Color.white);
        b3.setBackground(Color.black);
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("MINI STATEMENT");
        b4.setBounds(670, 509, 190, 25);
        b4.setFont(new Font("Raleway", Font.BOLD, 14));
        b4.setForeground(Color.white);
        b4.setBackground(Color.black);
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("PIN CHANGE");
        b5.setBounds(450, 540, 150, 25);
        b5.setFont(new Font("Raleway", Font.BOLD, 14));
        b5.setForeground(Color.white);
        b5.setBackground(Color.black);
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("BALANCE ENQUIRY");
        b6.setBounds(670, 540, 190, 25);
        b6.setFont(new Font("Raleway", Font.BOLD, 14));
        b6.setForeground(Color.white);
        b6.setBackground(Color.black);
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("EXIT");
        b7.setBounds(670, 570, 190, 25);
        b7.setFont(new Font("Raleway", Font.BOLD, 14));
        b7.setForeground(Color.white);
        b7.setBackground(Color.black);
        b7.addActionListener(this);
        l3.add(b7);

        getContentPane().setBackground(new Color(215, 252, 252));
        setSize(1550, 1000);
        setLayout(null);
        setLocation(0, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            new Deposit(pin);
            setVisible(false);
        } else if (e.getSource() == b7) {
            System.exit(0);
        } else if (e.getSource()==b2) {
            new Withdrawl(pin);
            setVisible(false);
            
        } else if (e.getSource()==b6) {
            new BalanceEnquiry(pin);
            setVisible(false);

        } else if (e.getSource()==b3) {
            new FastCash(pin);
            setVisible(false);

        } else if (e.getSource()==b5) {
            new Change_Pin(pin);
            setVisible(false);
            
        } else if (e.getSource()==b4) {
            new Mini_Statement(pin);
            setVisible(false);

        }
    }

        public static void main (String[]args){
            new Main_Class("");

        }
    }

