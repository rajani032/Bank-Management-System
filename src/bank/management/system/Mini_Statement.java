package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Mini_Statement extends JFrame implements ActionListener {

    String pin;

    JButton button1;

    Mini_Statement(String pin){
         this.pin = pin;

        getContentPane().setBackground(new Color(215,252,252));
        setSize(400,600);
        setLayout(null);
        setLocation(20,20);

        JLabel label1 = new JLabel();
        label1.setBounds(20,140,500,100);
        label1.setFont(new Font("System",Font.BOLD,15));
        add(label1);

        JLabel label2 = new JLabel("Rajani A.V");
        label2.setBounds(150,20,200,20);
        label2.setFont(new Font("System",Font.BOLD,15));
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20,80,300,20);
        label3.setFont(new Font("System",Font.BOLD,15));
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20,400,300,20);
        label4.setFont(new Font("System",Font.BOLD,15));
        add(label4);

        try{
            Connector c = new Connector();
            ResultSet resultSet = c.statement.executeQuery("select * from login where Pin_No = '"+pin+"'");

            while (resultSet.next()){
                label3.setText("Card Number: "+resultSet.getString("Card_No").substring(0,4)+"XXXXXXXXX"+resultSet.getString("Card_No").substring(12));
            }
        }catch (Exception E){
            E.printStackTrace();
        }

        try {
            int balance = 0;
            Connector c = new Connector();
            ResultSet resultSet1 = c.statement.executeQuery("select * from bank where Pin_No='" + pin + "'");
            while(resultSet1.next()) {
                label1.setText(label1.getText()+"<html>" +resultSet1.getString("Date")+"&nbsp;&nbsp;&nbsp;"+resultSet1.getString("Type")+"&nbsp;&nbsp;&nbsp;"+resultSet1.getString("Amount")+"<br><html>");
                if (resultSet1.getString("Type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet1.getString("Amount"));
                } else {
                    balance -= Integer.parseInt(resultSet1.getString("Amount"));
                }
            }
            label4.setText("your total balance is rs "+balance);
        }catch (Exception E){
            E.printStackTrace();
        }

        button1 = new JButton("EXIT");
        button1.setBounds(20,470,100,25);
        button1.addActionListener(this);
        add(button1);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Main_Class(pin);

    }

    public static void main(String[] args){
        new Mini_Statement("");
    }
}
