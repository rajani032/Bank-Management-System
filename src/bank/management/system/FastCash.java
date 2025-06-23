package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Stack;

public class FastCash extends JFrame implements ActionListener {

      JButton b1, b2, b3, b4, b5, b6, b7;

      String pin;

      FastCash(String pin){
          this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm8.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 1700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1500, 1000);
        add(l3);

        JLabel label1 = new JLabel("SELECT WITHDRAWL AMOUNT");
        label1.setBounds(480, 420, 400, 22);
        label1.setForeground(Color.black);
        label1.setFont(new Font("System", Font.BOLD, 22));
        l3.add(label1);

        b1 = new JButton("Rs. 100");
        b1.setBounds(450, 477, 150, 25);
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("Rs. 500");
        b2.setBounds(670, 477, 190, 25);
        b2.setFont(new Font("Raleway", Font.BOLD, 14));
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("Rs. 1000");
        b3.setBounds(450, 509, 150, 25);
        b3.setFont(new Font("Raleway", Font.BOLD, 14));
        b3.setForeground(Color.white);
        b3.setBackground(Color.black);
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("Rs. 2000");
        b4.setBounds(670, 509, 190, 25);
        b4.setFont(new Font("Raleway", Font.BOLD, 14));
        b4.setForeground(Color.white);
        b4.setBackground(Color.black);
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("Rs. 5000");
        b5.setBounds(450, 540, 150, 25);
        b5.setFont(new Font("Raleway", Font.BOLD, 14));
        b5.setForeground(Color.white);
        b5.setBackground(Color.black);
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("Rs. 10000");
        b6.setBounds(670, 540, 190, 25);
        b6.setFont(new Font("Raleway", Font.BOLD, 14));
        b6.setForeground(Color.white);
        b6.setBackground(Color.black);
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("BACK" + "");
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
        if(e.getSource()==b7){
          setVisible(false);
          new Main_Class(pin);
        }else {
          String amount = ((JButton) e.getSource()).getText().substring(4);
          Connector c = new Connector();
          Date date = new Date();
          try {
            ResultSet resultSet = c.statement.executeQuery("select * from bank where Pin_No='" + pin + "'");
            int balance = 0;
            while (resultSet.next()) {
              if (resultSet.getString("Type").equals("Deposit")) {
                balance += Integer.parseInt(resultSet.getString("amount"));
              } else {
                balance -= Integer.parseInt(resultSet.getString("amount"));
              }
            }
            String num = "17";
            if (e.getSource() != b7 && balance < Integer.parseInt(amount)) {
              JOptionPane.showMessageDialog(null, "Insuffient Balance");
              return;
            }
              c.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "','withdrawl','" + amount + "')");
              JOptionPane.showMessageDialog(null, "Rs."+amount+" Debited Successfully");

            } catch(Exception E){
              E.printStackTrace();
            }
            setVisible(false);
            new Main_Class(pin);

          }





    }
    public static void main(String[] args){
        new FastCash("");

    }
}
