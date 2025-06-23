package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Signup extends JFrame implements ActionListener {

         JRadioButton r1,r2 ,m1,m2;
         JButton next;

        JTextField textField,textField1,textEmail,textFieldAdd,textFieldCity,textPin, textState;

        JDateChooser dateChooser;

        Random ran = new Random();

        long first4 = (ran.nextLong() %9000L)+1000L;

       String first = " "+ Math.abs(first4);

       Signup(){
           super("APPLICATION FORM");
           ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank 2.png"));
           Image i2 =  i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
           ImageIcon i3 = new ImageIcon(i2);
           JLabel image = new JLabel(i3);
           image.setBounds(25,10,100,100);
           add(image);
           
           JLabel label1 = new JLabel("APPLICATION FORM NO. "+first4);
           label1.setBounds(160,20,600,40);
           label1.setFont(new Font("Raleway",Font.BOLD,38));
           add(label1);

           JLabel label2 = new JLabel("Page 1");
           label2.setFont(new Font("Ralway",Font.BOLD,22));
           label2.setBounds(330,70,600,30);
           add(label2);

           JLabel label3 = new JLabel("Personal Details");
           label3.setFont(new Font("Raleway",Font.BOLD,22));
           label3.setBounds(290,100,600,30);
           add(label3);

           JLabel labelName = new JLabel("Name");
           labelName.setFont(new Font("Raleway",Font.BOLD,20));
           labelName.setBounds(100,150,100,30);
           add(labelName);

           textField = new JTextField();
           textField.setFont(new Font("Raleway",Font.BOLD,20));
           textField.setBounds(250,150,400,30);
           add(textField);

           JLabel labelName1 = new JLabel("Father's Name");
           labelName1.setFont(new Font("Raleway",Font.BOLD,20));
           labelName1.setBounds(100,200,150,30);
           add(labelName1);

           textField1 = new JTextField();
           textField1.setFont(new Font("Raleway",Font.BOLD,20));
           textField1.setBounds(250,200,400,30);
           add(textField1);

           JLabel DDB = new JLabel("Date Of Birth");
           DDB.setFont(new Font("Raleway",Font.BOLD,20));
           DDB.setBounds(100,250,150,30);
           add(DDB);

           dateChooser = new JDateChooser();
           dateChooser.setForeground(new Color(105,105,105));
           dateChooser.setBounds(250,250,400,30);
           add(dateChooser);

           JLabel labelG = new JLabel("Gender");
           labelG.setFont(new Font("Raleway",Font.BOLD,20));
           labelG.setBounds(100,300,150,30);
           add(labelG);

           r1 = new JRadioButton("Male");
           r1.setFont(new Font("Raleway",Font.BOLD,20));
           r1.setBackground(new Color(222,255,228));
           r1.setBounds(300,300,100,30);
           add(r1);

           r2 = new JRadioButton("Female");
           r2.setFont(new Font("Raleway",Font.BOLD,20));
           r2.setBackground(new Color(222,255,228));
           r2.setBounds(450,300,100,30);
           add(r2);

           JLabel labelEmail = new JLabel(("Email address "));
           labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
           labelEmail.setBounds(100,350,350,30);
           add(labelEmail);

           textEmail = new JTextField();
           textEmail.setFont(new Font("Raleway",Font.BOLD,20));
           textEmail.setBounds(250,350,400,30);
           add(textEmail);

           JLabel labelMs = new JLabel(("Marital Status "));
           labelMs.setFont(new Font("Raleway",Font.BOLD,20));
           labelMs.setBounds(100,400,350,30);
           add(labelMs);

           m1 = new JRadioButton("Married");
           m1.setBounds(300,400,100,30);
           m1.setFont(new Font("Raleway",Font.BOLD,20));
           m1.setBackground(new Color(222,255,228));
           add(m1);

           m2 = new JRadioButton("Unmarried");
           m2.setBounds(450,400,150,30);
           m2.setFont(new Font("Raleway",Font.BOLD,20));
           m2.setBackground(new Color(222,255,228));
           add(m2);

           JLabel labelAdd = new JLabel( ("Address "));
           labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
           labelAdd.setBounds(100,450,350,30);
           add(labelAdd);

           textFieldAdd = new JTextField();
           textFieldAdd.setFont(new Font("Raleway",Font.BOLD,20));
           textFieldAdd.setBounds(250,450,400,30);
           add(textFieldAdd);

           JLabel labelCity = new JLabel(("City "));
           labelCity.setFont(new Font("Raleway",Font.BOLD,20));
           labelCity.setBounds(100,500,350,30);
           add(labelCity);

           textFieldCity = new JTextField();
           textFieldCity.setFont(new Font("Raleway",Font.BOLD,20));
           textFieldCity.setBounds(250,500,400,30);
           add(textFieldCity);

           JLabel labelPin = new JLabel(("Pin Code "));
           labelPin.setFont(new Font("Raleway",Font.BOLD,20));
           labelPin.setBounds(100,550,350,30);
           add(labelPin);

           textPin = new JTextField();
           textPin.setFont(new Font("Raleway",Font.BOLD,20));
           textPin.setBounds(250,550,400,30);
           add(textPin);

           JLabel labelState = new JLabel(("State "));
           labelState.setFont(new Font("Raleway",Font.BOLD,20));
           labelState.setBounds(100,600,350,30);
           add(labelState);

           textState = new JTextField();
           textState.setFont(new Font("Raleway",Font.BOLD,20));
           textState.setBounds(250,600,400,30);
           add(textState);

           next =new JButton("Next");
           next.setFont(new Font("Raleway",Font.BOLD,20));
           next.setForeground(Color.BLACK);
           next.setBackground(Color.white);
           next.setBounds(550,650,100,30);
           next.addActionListener(this);
           add(next);

           ButtonGroup buttonGroup1 = new ButtonGroup();
           buttonGroup1.add(m1);
           buttonGroup1.add(m2);

           ButtonGroup buttonGroup = new ButtonGroup();
           buttonGroup.add(r1);
           buttonGroup.add(r2);

           getContentPane().setBackground(new Color(222,255,228));
            setLayout(null);
            setSize(850,800);
            setLocation(360,40);
            setVisible(true);
       }

    @Override
    public void actionPerformed(ActionEvent e) {
           String formno = first;
           String Name = textField.getText();
           String Fname = textField1.getText();
           String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
           String gender = null;
           if(r1.isSelected()){
               gender = "Male";
           } else if (r2.isSelected()) {
               gender = "Female";
           }
           String email = textEmail.getText();
           String marital = null;
           if(m1.isSelected()){
               marital = "Married";
           } else if (m2.isSelected()) {
               marital = "Unmarried";
           }
           String address = textFieldAdd.getText();
           String city = textFieldCity.getText();
           String pincode = textPin.getText();
           String state = textState.getText();

           try{
               if(textField.getText().equals("")){
                 JOptionPane.showMessageDialog(null,"Fill all the field");
               }else {
                   Connector connector1 = new Connector();
                   String q = "insert into signup values('"+formno+"','"+Name+"','"+Fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                   connector1.statement.executeUpdate(q);
                   JOptionPane.showMessageDialog(null, "Submitted");
                   new  Signup2(formno);
                   setVisible(false);
               }
           }catch (Exception E){
               E.printStackTrace();

           }


    }

    public static void main(String[] arg){
           new Signup();
    }
}
