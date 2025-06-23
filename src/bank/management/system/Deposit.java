package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;

    JTextField textField1;

    JButton b1,b2;

    Deposit(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm8.jpg"));
        Image i2 =  i1.getImage().getScaledInstance(1550,1700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1500,1000);
        add(l3);

        JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT ");
        label1.setBounds(500,400,400,25);
        label1.setFont(new Font("System",Font.BOLD,14));
        l3.add(label1);

        textField1 = new JTextField();
        textField1.setBackground(Color.BLACK);
        textField1.setForeground(Color.white);
        textField1.setBounds(500,425,290,25);
        textField1.setFont(new Font("Raleway",Font.BOLD,16));
        l3.add(textField1);

        b1 = new JButton("DEPOSIT");
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

        getContentPane().setBackground(new Color(215,252,252));
        setSize(1550,1000);
        setLayout(null);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = textField1.getText();
            Date date = new Date();
            if(e.getSource()==b1){
                if(textField1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the Amount you want to Deposit");
                }else {
                    Connector c1 = new Connector();
                    c1.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "','Deposit','" + amount +"')");
                    JOptionPane.showMessageDialog(null,"Rs. "+amount+"  Deposit successfully");
                    setVisible(false);
                    new Main_Class(pin);
                }
            } else if (e.getSource()==b2) {
                  setVisible(false);
                  new Main_Class(pin);
              }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args){
         new Deposit(" ");
    }
}
