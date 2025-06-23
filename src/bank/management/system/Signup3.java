package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4;

    JCheckBox c1,c2, c3,c4,c5,c6;

    JButton s,c;

    String formno;

    Signup3( String formno){
        this.formno = formno;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank 2.png"));
        Image i2 =  i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        JLabel l1 = new JLabel("Page 3 :-");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel l2 = new JLabel("Account Details :-");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(280,70,400,40);
        add(l2);

        JLabel l3 = new JLabel("Account Type :-");
        l3.setFont(new Font("Raleway",Font.BOLD,20));
        l3.setBounds(100,140,200,40);
        add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setBounds(100,190,200,40);
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(new Color(215,252,252));
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setBounds(350,190,300,40);
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(new Color(215,252,252));
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setBounds(100,230,200,40);
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(new Color(215,252,252));
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(new Color(215,252,252));
        r4.setBounds(350,230,300,40);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4 = new JLabel("Card Number :-");
        l4.setFont(new Font("Raleway",Font.BOLD,20));
        l4.setBounds(100,280,200,40);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Raleway",Font.BOLD,14));
        l5.setBounds(100,305,250,40);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway",Font.BOLD,20));
        l6.setBounds(350,280,300,40);
        add(l6);

        JLabel l7 = new JLabel("(It would appear on atm card/cheque Book and Statements )" );
        l7.setFont(new Font("Raleway",Font.BOLD,14));
        l7.setBounds(350,305,420,40);
        add(l7);

        JLabel l8 = new JLabel("PIN" );
        l8.setFont(new Font("Raleway",Font.BOLD,20));
        l8.setBounds(100,350,420,40);
        add(l8);

        JLabel l9 = new JLabel("XXXX" );
        l9.setFont(new Font("Raleway",Font.BOLD,20));
        l9.setBounds(350,350,420,40);
        add(l9);

        JLabel l10 = new JLabel("(4-digit Password)");
        l10.setFont(new Font("Raleway",Font.BOLD,14));
        l10.setBounds(100,370,250,40);
        add(l10);

        JLabel l11 = new JLabel("Services Required :-");
        l11.setFont(new Font("Raleway",Font.BOLD,20));
        l11.setBounds(100,420,250,40);
        add(l11);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(new Color(215,252,252));
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,470,250,40);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(215,252,252));
        c2.setFont(new Font("Raleway",Font.BOLD,18));
        c2.setBounds(350,470,250,40);
        add(c2);

        c3 = new JCheckBox("Mobil Banking");
        c3.setBackground(new Color(215,252,252));
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,520,250,40);
        add(c3);

        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(new Color(215,252,252));
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,520,250,40);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(215,252,252));
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,560,250,40);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(215,252,252));
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,560,250,40);
        add(c6);

        JCheckBox c7 = new JCheckBox("I here by decleares that the above entered details correct to the best of the best my knowledge.",true);
        c7.setBackground(new Color(215,252,252));
        c7.setFont(new Font("Raleway",Font.BOLD,14));
        c7.setBounds(100,630,800,40);
        add(c7);

        JLabel l12= new JLabel("From No :");
        l12.setFont(new Font("Raleway",Font.BOLD,16));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13= new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,20));
        l13.setBounds(760,10,100,30);
        add(l13);

        s = new JButton("Submit");
        s.setFont(new Font("Raleway",Font.BOLD,20));
        s.setBounds(250,700,100,30);
        s.setBackground(Color.BLACK);
        s.setForeground(Color.white);
        s.addActionListener(this);
        add(s);

        c = new JButton("Cancel");
        c.setFont(new Font("Raleway",Font.BOLD,20));
        c.setBounds(420,700,100,30);
        c.setBackground(Color.BLACK);
        c.setForeground(Color.white);
        c.addActionListener(this);
        add(c);

        getContentPane().setBackground(new Color(215,252,252));
        setSize(850,800);
        setLayout(null);
        setLocation(400,20);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

          String atype = null;
          if((r1.isSelected())){
             atype = "Saving Account";
         } else if ((r2.isSelected())) {
            atype = "Fixed Deposit Account";
         } else if ((r3.isSelected())) {
            atype = "Current Account";
         } else if ((r4.isSelected())) {
            atype = "Recurring Deposit Account";

         }
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L)+1409963000000000L;
        String cardno = ""+Math.abs(first7);

        long first3 = (ran.nextLong() %9000L)+1000L;
        String pin = ""+ Math.abs(first3);

        String fac = null;
        if((c1.isSelected())){
            fac = fac+"ATM CARD";
        } else if ((c2.isSelected())) {
            fac = fac+"Internet Banking";
        } else if ((c3.isSelected())) {
            fac = fac+"Mobil Banking";
        } else if ((c4.isSelected())) {
            fac= fac+"EMAIL Alerts";
        } else if ((c5.isSelected())) {
            fac = fac+"Cheque Book";
        } else if ((c6.isSelected())) {
            fac = fac+"E-Statement";

        }

        try {
            if (e.getSource() == s) {
                if (atype.equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the field");
                } else {
                    Connector conn1 = new Connector();
                    String q1 = "insert into signupthree values('" + formno + "','" + atype + "','" + cardno + "','" + pin + "','" + fac + "')";
                    String q2 = "insert into login values('" + formno + "','" + cardno + "','" + pin + "')";
                    conn1.statement.executeUpdate(q1);
                    conn1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number :" + cardno + "\n Pin :" + pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            } else if ((e.getSource() == c)) {
                System.exit(0);

            }


        }catch (Exception E){
            E.printStackTrace();
        }



    }
    public static void main(String[] args){
        new Signup3(" ");

    }
}
